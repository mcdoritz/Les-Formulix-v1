## Les Formulix V1.0

**Reprendre les fonctionnalités et specs du PoC :**
 - Système de register/login ✅
 - Intégration des pilotes et circuits de la saison
 - Métier : gestion des pronos et résultats
 - Gestion session ✅
Ne pas reprendre :
 - Blog (sert à rien pour l'instant)

**V1.0 :**
 - Passer l'app sur Spring Boot + Thymeleaf
 - Faire une maquette
 - Mobile-first
 - Gestion des erreurs
 - Validation des données formulaires front et back
 - Gestion de plusieurs leagues
 - Modifier mon profil
 - Contact dev
 - Modifs à faire selon retours users


### Build de tailwind :
npx tailwindcss -i src/main/resources/static/css/input.css -o src/main/resources/static/css/output.css --watch

### Thymeleaf :
Utilisation de Thymeleaf Layout Dialect

### Validation de formulaire :
REGEX email : ^[\w\.-]+@[a-zA-Z\d\.-]+\.[a-zA-Z]{2,}$

## Avancées au 7/5/24:

➕ Login OK


## Avancées au 4/6/24:
Tentative de CI/CD avec Github Actions et AWS CodePipeline

## Avancées au 5/6/24:
Déploiement avec un fichier war importé, OK
Echec déploiement via pipeline github actions

## Avancées au 8/8/24:
Mise à jour Gradle