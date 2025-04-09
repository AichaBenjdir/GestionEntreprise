 ﻿# Mon projet GestionEntreprise
✍️ Ce projet Java contient des classes pour apprendre à manipuler les objets, l’héritage et les collections (List) dans un contexte de gestion d’entreprise, avec les classes Personne, Employe et Directeur.

##  🎯  Objectifs du projet

1) Créer des classes telles que Personne, Employe et Directeur

2) Ajouter une liste d’employés à un directeur à l’aide des collections (List)

3) Comprendre et appliquer les principes d’encapsulation et d’héritage en Java

  ##  🛠️ Technologies
- Java 
- IDE : Visual Studio Code 

##  📁 Structure du projet

src/
├── personne/         → Classe de base Personne
├── employe/          → Classe Employe (hérite de Personne)
├── directeur/        → Classe Directeur (hérite de Personne + List<Employe>)
└── Main.java         → Classe principale

##  🚀 Exécution du projet

1. Cloner le dépôt
2. Compiler les fichiers :
   
   javac -d bin src/personne/*.java src/employe/*.java src/directeur/*.java src/Main.java
3. Exécuter :
java -cp bin Main

 ## 📚 À propos

Projet réalisé par Aïcha Benjdir dans le cadre de sa formation Fullstack Web/Mobile avec **10.000 Codeurs**.

🔗 [Mon profil LinkedIn](https://www.linkedin.com/in/a%C3%AFcha-benjdir/)




