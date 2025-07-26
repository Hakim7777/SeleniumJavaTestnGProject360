# SeleniumJavaTestnGProject360

[![Java](https://img.shields.io/badge/Java-20-red)](#)
[![Selenium WebDriver](https://img.shields.io/badge/Selenium-4.11-blue)](#)
[![TestNG](https://img.shields.io/badge/TestNG-7.8-green)](#)
[![Maven](https://img.shields.io/badge/Maven-Project-orange)](#)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

## 🛠️ Présentation

**SeleniumJavaTestnGProject360** est un framework d’automatisation de tests End‑to‑End, conçu en **Java**, **Selenium WebDriver** et **TestNG**, avec une architecture **POM** (Page Object Model) robuste pour garantir la maintenabilité, la réutilisabilité et l’intégration continue.

### Caractéristiques clés

* **Page Object Model (POM)** : séparation des locators et des actions métiers pour chaque page.
* **Data‑Driven Testing** : lecture dynamique des données depuis Excel via Apache POI.
* **Rapports détaillés** : génération de rapports TestNG et captures d’écran automatiques en cas d’échec.
* **Logging avancé** : logs techniques centralisés avec Log4j2.
* **Gestion de configuration** : fichier `config.properties` pour paramétrer navigateur, URL et chemins de données.
* **Maven** : gestion des dépendances et build.
* **Extensible** : options pour Allure, Jenkins, parallélisation et API mocks.

## 📁 Structure du projet

```text
SeleniumJavaTestnGProject360/
├── pom.xml                     # Dépendances Maven
├── README.md                   # Documentation
├── LICENSE                     # Licence MIT
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/project/
    │   │       ├── pages/       # Page Objects
    │   │       ├── testcases/   # Classes de tests TestNG
    │   │       └── utils/       # ExcelReader, BrowserFactory, Logger
    │   └── resources/
    │       ├── TestData/        # Fichiers Excel
    │       └── config.properties# Paramètres (browser, URL)
    └── test-output/            # Rapports TestNG et captures
```

## ⚙️ Configuration

1. **Cloner le dépôt** :

   ```bash
   ```

git clone [https://github.com/Hakim7777/SeleniumJavaTestnGProject360.git](https://github.com/Hakim7777/SeleniumJavaTestnGProject360.git)
cd SeleniumJavaTestnGProject360

````
2. **Configurer** `src/main/resources/config.properties` :
   ```properties
browser=chrome
url=https://exemple.com
testData=src/main/resources/TestData/TestInfo.xlsx
````

3. **Installer les dépendances Maven** :

   ```bash
   ```

mvn clean install

````

## ▶️ Exécution des tests

- **Via IDE** : exécuter les classes `*TestCase.java` en tant que TestNG Test.
- **Via Maven** :
  ```bash
mvn test
````

## 📊 Rapports & Logs

* Rapports TestNG générés dans `test-output/`
* Captures d’écran en cas d’échec dans `test-output/screenshots/`
* Logs détaillés dans `logs/` via Log4j2.

## 🌟 Fonctionnalités

* Lecture des données Excel (Apache POI)
* Gestion centralisée du navigateur (BrowserFactory)
* Captures dynamiques et reporting automatique
* Extensible pour CI/CD (Jenkins, GitHub Actions)

## 🚀 Roadmap

* ✅ Intégration continue avec Jenkins
* ⚙️ Migration vers Allure Reports
* 🚀 Parallélisation des tests TestNG
* 🔒 Sécurisation des credentials (.env ou Vault)
* 🤝 Rédaction de CONTRIBUTING.md

## 📄 Licence

Ce projet est sous licence **MIT**. Voir [LICENSE](LICENSE).

## 📬 Contact

Hakim Sahraoui – [hakimsahraoui.de@gmail.com](mailto:hakimsahraoui.de@gmail.com)
