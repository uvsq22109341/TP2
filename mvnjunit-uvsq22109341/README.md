# TP Maven-JUnit
# SEDJAL
# ABDELGHANI
# Groupe1
Pour cet exercice, on veut implémenter une classe immuable Fraction qui représente un nombre rationnel.
Un exemple d’interface pour une telle classe est donné par la classe [`Fraction`](https://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](https://commons.apache.org/proper/commons-math/).

La classe fournira l’interface suivante :
*   initialisation avec (i) un numérateur et un dénominateur, (ii) juste avec le numérateur (dénominateur égal à 1) ou (iii) sans argument (numérateur égal 0 et dénominateur égal à 1),
*   conversion en chaîne de caractères ([`toString`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#toString())),
*   les constantes ZERO (0, 1) et UN (1, 1),
*   consultation du numérateur et du dénominateur,
*   consultation de la valeur sous la forme d’un nombre en virgule flottante (double) (`toDouble`),
*   addition de deux fractions (`add`),
*   test d’égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) ([`equals`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object)) et [`hashCode`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Object.html#hashCode())),
*   comparaison de fractions selon l’ordre naturel ([`compareTo`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Comparable.html)).

De plus, le projet sera géré avec [Maven](https://maven.apache.org/) et vous utiliserez une approche pilotée par les tests pour la réalisation, i.e. écrivez toujours un test avant le code et pensez au refactoring.
Le framework de tests devra être [JUnit 4](https://junit.org/junit4/) (ou [5](https://junit.org/junit5/) si vous préférez).
Vous rédigerez votre code source en respectant les [conventions de codage](https://google.github.io/styleguide/javaguide.html) proposées par _Google_.
Enfin, la prise en compte des contraintes se fera par de la gestion d’erreurs et des exceptions.


Il pourra éventuellement être nécessaire de [configurer le proxy](http://maven.apache.org/guides/mini/guide-proxies.html) (http://wwwcache.uvsq.fr:3128) pour accéder au dépôt Maven.

À chaque étape, validez vos modifications avec `git` et si nécessaire, exécutez le cycle maven adapté pour vérifier vos manipulations.

1. Quelles conventions utilise Maven pour l’arborescence des répertoires ?
    Où se trouvent les sources de l'application et les sources des tests ?
    - 
2. Examinez le projet Maven ainsi que le fichier de description et répondez aux questions suivantes :
    1.  Dans quel répertoire se trouvent les fichiers sources du projet ? Les sources des tests ?
        > Les fichiers sources se trouvent dans le répertoire "src", les sources de tests quand à eux se trouvent dans le
        sous répertoire "test" se trouvant a l'intérieur de "src".
    1. Quelles sont les coordonnées du projet ?
        > Ci-joint les coordonnees du projet : 
           - GroupId : fr.uvsq.cprog
           - artifactID : mvnjunit
           - version : 1.0-SNAPSHOT
           - Packaging : Ce projet utilise le packaging par default de Maven , le "JAR".
    1. À quoi sert la propriété `project.build.sourceEncoding` ?
        > la propriete sert au codage de caractères, des schemas tel que ASCII, UTF-8 ou UTF-16 peuvent être choisi pour être utilisé pour la lecture et l'écriture de caracteres dans les fichiers.
    1. Quelles versions des sources et de la JVM sont utilisés ?
        > 1.7
    1. Quelle version de JUnit est configurée ? À quoi sert la balise `scope` ?
        > version Junit : 4.11 . la balise scope permets d'identifier et specifier le reperoire des test , "test" dans notre cas.
    1. À quoi sert la section `pluginManagement` ?
        > Contient la liste des plugins utilisées dans le projet avec leurs configurations.
3. Modifiez la configuration du projet de la façon suivante :
    1.  fixez la version des sources et des .class pour utiliser la version 11 de Java
    1.  utilisez la dernière version stable de JUnit 4 (cf. [MVNRepository](https://mvnrepository.com/))
4. Ajoutez un fichier `.gitignore` adapté aux projets Maven (cf. [A collection of .gitignore templates](https://github.com/github/gitignore)) et ajoutez-y les fichiers et répertoires de votre IDE.
5. Quelle commande Maven permet de :
    1.  créer un `jar` du projet ?
        > la commande est la suivante : java -jar target/${project.build.finalName}.jar
    1. lancer les tests ?
        > mvn test
    1. supprimer tous les fichiers issus de la compilation ?
        > mvn clean
6. Ajoutez une classe `Fraction` et une classe `FractionTest` dans les répertoires et packages appropriés.
    Supprimez les classes d'exemple `App` et `AppTest`.
7. Énumérez une liste de cas de tests à réaliser en n'oubliant pas les cas d'erreur.
    > tester que Zero est reellement egale a "0" et que UN est egale a "1"
      tester que la fraction initialisee sans arguemnt est egale a 0.
      tester que la fraction initialisee sans avec un seul arguement est egale au nominateur.
      tester que le denominateur de la fraction n'est pas nul.
      tester l'operation d'addition de deux fractions.
      tester l'egalite de deux fractions ainsi que la comparaison.
     
8. Pour chaque cas de test,
    1. écrivez le test JUnit correspondant dans la classe de test,
    1. vérifiez qu’il échoue,
    1. implémentez la fonctionnalité dans la classe,
    1. vérifiez que le test passe,
    1. appliquez une étape de refactoring sur les tests et la classe si nécessaire.
9. Modifiez le POM pour intégrer la vérification des conventions de codage avec [`checkstyle`](http://maven.apache.org/plugins/maven-checkstyle-plugin/) en utilisant les conventions _Google_.
10. Ajoutez une méthode `main` qui démontre quelques fonctionnalités de la classe, puis modifiez le POM pour que le jar généré soit exécutable (cf. [Apache Maven JAR Plugin](https://maven.apache.org/plugins/maven-jar-plugin/index.html))
11. Modifiez la méthode `main` pour que les différents affichages se fassent à l'aide de la bibliothèque de logging [`SLF4J`](http://www.slf4j.org/)
12. En utilisant le plugin [assembly](https://maven.apache.org/plugins/maven-assembly-plugin/) (ou le plugin [shade](https://maven.apache.org/plugins/maven-shade-plugin/)), générez une archive du projet contenant ses dépendances mvn 
