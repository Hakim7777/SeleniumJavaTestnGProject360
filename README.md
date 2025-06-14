
Selenium Java TestNG Project 360

Description
Ce projet est un framework de test automatisé basé sur Selenium WebDriver avec TestNG en Java.
Il permet de simuler des tests fonctionnels sur une application web, incluant l'authentification, la navigation sur le tableau de bord, et la simulation de paiement à l'aide de données issues d'un fichier Excel.

Technologies et outils utilisés
Java 20

Selenium WebDriver 4.11.0

TestNG 7.8.0

Maven (gestion des dépendances)

Apache POI (lecture de données Excel)

Apache Commons IO (gestion de fichiers)

Log4j2 (Logs)

Page Object Model (POM)

Structure du projet
bash
Copier
Modifier
.
├── pom.xml                      # Dépendances et configuration Maven
├── README.md                    # Documentation du projet
└── src/
    ├── main/
    │   ├── java/
    │   │   └── Test/
    │   │       ├── cases/       # Cas de test automatisés
    │   │       ├── pages/       # Représentation des pages (POM)
    │   │       └── Utility/     # Outils : lecture Excel, navigateur, etc.
    │   └── resources/
    │       ├── TestData/        # Données de test (Excel)
    │       └── config.properties # Configuration de base
Configuration
Avant d'exécuter les tests :

Modifier le fichier config.properties dans src/main/resources/ :

ini
Copier
Modifier
browser=chrome
url=https://exemple.com
Ajouter les données de test dans un fichier Excel (ex: TestInfo.xlsx) à placer dans TestData.

Exécution des tests
Cloner ce dépôt Git.

Importer le projet dans un IDE comme IntelliJ IDEA ou Eclipse.

Vérifier le fichier pom.xml et télécharger les dépendances Maven.

Exécuter la classe PaymentTestCase dans Test.cases en tant que TestNG Test.

Consulter la console et les rapports générés.

Fonctionnalités principales
Lecture des données depuis Excel via Apache POI.

Organisation du code avec le modèle Page Object.

Capture automatique d’écran en cas d’échec de test.

Centralisation de la configuration via un fichier .properties.

Gestion du navigateur via BrowserFactory.

Préparation à l’intégration future avec Jenkins.

Améliorations possibles
Ajouter une gestion des logs complète avec log4j-core.

Ajouter une gestion des attentes explicites (WebDriverWait) pour éviter les erreurs de type "StaleElementReferenceException".

Implémenter des suites de tests via un fichier XML TestNG (testng.xml).

Intégration continue avec Jenkins (pipeline de test automatisé).

Génération de rapports avancés avec Allure ou ExtentReports.

Ajouter un fichier .env pour la gestion sécurisée des credentials.

Ajout d’un fichier CONTRIBUTING.md pour les contributions externes.

Optimisation du temps d’exécution des tests avec parallélisation.

Auteur
Hakim Alaoui Sahraoui
https://www.linkedin.com/in/hakim-alaoui-sahraoui-5a397a169/
