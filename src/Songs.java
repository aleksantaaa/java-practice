import java.util.ArrayList;

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
}

public class Songs {

    public static void main(String[] args) {

        Playlist p = new Playlist();
        p.addSong("Love", "Ariana");
        p.addSong("Hate", "Perry");
        p.playAll();
    }
}