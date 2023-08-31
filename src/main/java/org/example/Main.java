package org.example;

/*
Erstellt euch ein neues Java-Projekt in IntelliJ (bitte nur eine Backend-Anwendung) und implementiert folgende Schritte:

Schritt 1: Definiert ein Interface 'Playable', das eine Methode 'play' ohne Implementierung enthält.
Schritt 2: Erstellt eine Klasse 'MusicPlayer', die das 'Playable'-Interface implementiert.
           Implementiert die 'play'-Methode, um einen Song abzuspielen.
Schritt 3: Erstellt eine Klasse 'VideoPlayer', die ebenfalls das 'Playable'-Interface implementiert.
           Implementiert die 'play'-Methode, um ein Video abzuspielen.
Schritt 4: Erstellt eine Klasse 'MediaController', die eine Methode 'playMedia' enthält.
           Diese Methode soll ein 'Playable'-Objekt als Parameter akzeptieren und die 'play'-Methode aufrufen.
Schritt 5.1: In der 'main'-Methode erstellt ein Objekt der Klasse 'MediaController' und nutzt es,
             um sowohl einen Song als auch ein Video abzuspielen.
Schritt 5.2: In der 'main'-Methode initialisiert jeweils ein Objekt der Klasse 'MusicPlayer' und
             'VideoPlayer' mit dem Interface 'Playable' (Polymorphismus).
 */

public class Main {
    public static void main(String[] args) {

        // Instantiate a MediaController
        MediaController myController = new MediaController();

        // Make the MediaController play a Song
        myController.playMedia(new MusicPlayer());
        // Make the MediaController play a Video
        myController.playMedia(new VideoPlayer());

        // Polymorphism example
        Playable myMusicPlayer = new MusicPlayer();
        myController.playMedia(myMusicPlayer);

    }
}
