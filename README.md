# Selenium Java TestNG Project 360

## Description

Ce projet est un framework de test automatisé utilisant Selenium WebDriver avec TestNG en Java.  
Il permet d’automatiser les tests fonctionnels d’une application web, notamment le login, la navigation sur le dashboard, et la simulation de paiement.

## Technologies et outils utilisés

- Java 20
- Selenium WebDriver 4.11.0
- TestNG 7.8.0
- Maven (pour la gestion des dépendances)
- Apache POI (pour lire les données depuis Excel)
- Apache Commons IO (pour la gestion des fichiers)
- Page Object Model (POM) pour une meilleure organisation du code
- Log4j2 (configuration minimale, peut être améliorée)
  
## Structure du projet
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Test/
│   │   │   │   ├── cases/           # Cas de tests
│   │   │   │   ├── pages/           # Pages de l'application
│   │   │   │   └── Utility/         # Utilitaires (ex : lecture Excel)
│   │   └── resources/
│   │       ├── TestData/            # Données de tests (Excel)
│   │       └── config.properties    # Configuration du projet
├── pom.xml                          # Dépendances et configuration Maven
└── README.md                        # Documentation du projet

## Configuration

- Modifier le fichier `config.properties` dans `src/main/resources` pour définir :  
  - le navigateur (ex: chrome)  
  - l’URL de l’application à tester  

- Placer les fichiers Excel avec les données de test dans `TestData` (ex: `TestInfo.xlsx`)

## Comment lancer les tests

1. Cloner le projet  
2. Ouvrir le projet dans un IDE (IntelliJ IDEA, Eclipse, etc.)  
3. Lancer la classe `Test.cases.PaymentTestCase` via TestNG (Run as TestNG Test)  
4. Observer les résultats dans la console et les rapports TestNG générés  

## Points importants

- Le framework utilise la lecture des données de test dans Excel via Apache POI  
- Utilisation du pattern Page Object Model pour la maintenance facilitée  
- Gestion du navigateur via une classe utilitaire `BrowserFactory`  
- Captures d’écran automatiques possibles à l’échec des tests (fonction `captureScreenShot` dans BaseTest)  

## Conseils

- Mettre à jour les dépendances Selenium et TestNG régulièrement  
- Ajouter la dépendance `log4j-core` pour supprimer les warnings liés au logging  
- Gérer les éléments « stale element » avec des attentes explicites (WebDriverWait)  
- Organiser les tests en suites TestNG si plusieurs cas à exécuter ensemble  

---

Pour toute question, n’hésitez pas à me contacter. LinkedIn Hakim Alaoui Sahraoui

---

