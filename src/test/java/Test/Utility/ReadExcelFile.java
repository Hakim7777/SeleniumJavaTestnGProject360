package Test.Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

    public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo) {
        String cellValue = "";
        try (FileInputStream inputStream = new FileInputStream(fileName);
             XSSFWorkbook workBook = new XSSFWorkbook(inputStream)) {

            XSSFSheet excelSheet = workBook.getSheet(sheetName);
            if (excelSheet == null) {
                return "";
            }

            XSSFRow row = excelSheet.getRow(rowNo);
            if (row == null) {
                return "";
            }

            XSSFCell cell = row.getCell(cellNo);
            if (cell == null) {
                return "";
            }

            switch (cell.getCellType()) {
                case STRING:
                    cellValue = cell.getStringCellValue();
                    break;

                case NUMERIC:
                    if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
                        java.util.Date date = cell.getDateCellValue();
                        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("MM/yy");
                        cellValue = dateFormat.format(date);
                    } else {
                        // Pour éviter les valeurs avec .0 inutiles
                        double num = cell.getNumericCellValue();
                        if (num == (long) num) {
                            cellValue = String.valueOf((long) num);
                        } else {
                            cellValue = String.valueOf(num);
                        }
                    }
                    break;

                case BOOLEAN:
                    cellValue = String.valueOf(cell.getBooleanCellValue());
                    break;

                case FORMULA:
                    // On peut ici récupérer la valeur de la formule si besoin
                    try {
                        cellValue = cell.getStringCellValue();
                    } catch (IllegalStateException e) {
                        double val = cell.getNumericCellValue();
                        cellValue = String.valueOf(val);
                    }
                    break;

                case BLANK:
                    cellValue = "";
                    break;

                default:
                    cellValue = "";
            }

        } catch (Exception e) {
            e.printStackTrace();
            cellValue = "";
        }
        return cellValue;
    }

    public static int getRowCount(String fileName, String sheetName) {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             XSSFWorkbook workBook = new XSSFWorkbook(inputStream)) {

            XSSFSheet excelSheet = workBook.getSheet(sheetName);
            if (excelSheet == null) {
                return 0;
            }

            return excelSheet.getLastRowNum() + 1;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getColCount(String fileName, String sheetName) {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             XSSFWorkbook workBook = new XSSFWorkbook(inputStream)) {

            XSSFSheet excelSheet = workBook.getSheet(sheetName);
            if (excelSheet == null) {
                return 0;
            }

            XSSFRow firstRow = excelSheet.getRow(0);
            if (firstRow == null) {
                return 0;
            }

            return firstRow.getLastCellNum();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
