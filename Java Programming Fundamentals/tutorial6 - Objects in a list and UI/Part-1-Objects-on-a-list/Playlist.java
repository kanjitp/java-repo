import java.util.*;

public class Playlist {
    private ArrayList<String> songs;
    
    public Playlist() {
        this.songs = new ArrayList<>();
    }
    public void addSong(String song) {
        this.songs.add(song);
    }
    public void removeSOng(String song) {
        this.songs.remove(song);
    }
    public void printSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }

    
}
