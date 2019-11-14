# OSP_Lehrerkalender

## Einleitung
Dieses Projekt wurde im Rahmen des Oberstufenprojekts 2019 auf der Georg-Simon-Ohm Berufsschule ins Leben gerufen.
Das Ziel dieses Projekts ist der Bau eines "Digitalen Lehrerkalenders", welches als Webapplikation realisiert wird.

## Allgemeine Informationen
Klasse FIA71 - Oberstufenprojekt 2019 - Gruppe 2

Autoren:
 - Alexander Goujov
 - Janik Schaaf
 - Lisa Maria Schmitz
 - Marvin Sulianto
 - Jonas Florian Küpper

Backend Technologien: Java Spring Boot

Frontend Technologien: HTML, CSS, SCSS, JavaScript, React (Material-UI)

Datenbank: SQLite

Architektur: Single Page Application (SPA), REST API

Design: Mockups

Unterlagen zum Projektmanagements: https://drive.google.com/drive/folders/18iG0YqTESmPxqKFTXdxahboOC2LEki7t

## Installation
Für die Installation des Projekts werden diverse Technologien verwendet:
- Java, yarn, make, npm, maven, git

Um das Projekt zu installieren, werden folgende Schritte befolgt:

1. Projekt klonen
    - git clone git@gitlab.com:rohrkrepierer/osp_lehrerkalender.git
2. Dependencies installieren oder updaten
    - make build
3. React App und REST API starten
    - make start

## Git Workflow
Als Integrationsbranch nutzen wir den master.

1. Neuen Branch vom master abzweigen
    - git checkout -b [BRANCHNAME]
2. Änderungen hinzufügen, committen und pushen
3. Merge Request erstellen und einem anderen Enwickler in GitLab zuweisen
    - [SOURCE:BRANCHNAME] -> [TARGET:MASTER]
