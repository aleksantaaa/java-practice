import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class Song {

    String title;
    String artist;


    Song (String title, String artist) {

        this.title = title;
        this.artist = artist;
    }
}

class Playlist {

    Playlist() {}

    ArrayList<Song> songs = new ArrayList<>();

    void addSong(String title, String artist) {

        Song s = new Song(title, artist);
        songs.add(s);
    }

    void playAll() {

        for (int i=0; i < songs.size(); i++) {

            System.out.println( songs.get(i).title + " - " + songs.get(i).artist );
        }
    }

    void saveToFile (String filename) {

        try {

            FileWriter writer = new FileWriter(filename);

            for (int i = 0; i < songs.size(); i++) {

                writer.write ( songs.get(i).title + ";" + songs.get(i).artist + "\n" );
            }

            writer. close();

        } catch (IOException e) {

            System.out.println( "There is a failure while saving the file: " + e.getMessage());

        }
    }


    void loadFromFile (String filename) {

        try {

            File file = new File(filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {

                String line = sc.nextLine();

                String[] parts = line.split(";");

                Song newSong = new Song(parts [0], parts [1]);
                songs.add(newSong);

            }
        } catch (IOException e) {

            System.out.println ( "There is an issue which appeared while loading the file: " + e.getMessage());

        }
    }





}

public class Songs {

    public static void main(String[] args) {

        Playlist p = new Playlist();
        p.addSong("Love", "Ariana");
        p.addSong("Hate", "Perry");
        p.playAll();
    }
}