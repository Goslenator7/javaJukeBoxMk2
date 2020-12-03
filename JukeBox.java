import javax.swing.*;
import java.util.*;

public class JukeBox {

    private ArrayList <Song> playlist = new ArrayList<>();

    public void addSong(Song song) {
        this.playlist.add(song);
    }

    public void play() {
        String playingMessage = "Now playing: "+playlist.get(0).getSongTitle()+" by: "+playlist.get(0).getArtistName();
        JOptionPane.showMessageDialog(null, playingMessage);
        playlist.remove(0);
    }

    public void printPlaylist() {
        for (Song tempSong : playlist) {
            JOptionPane.showMessageDialog(null, tempSong.getSongTitle() + "/t" + tempSong.getArtistName());
        }
    }

    public void size() {
        String sizeMessage = "The number of songs in the playlist is: "+playlist.size()+".";
        JOptionPane.showMessageDialog(null, sizeMessage);
    }

    public void sortPlaylist() {
        // Compare the song title of an object in the list with another to sort the playlist
        playlist.sort((o1, o2) -> o1.getSongTitle().compareTo(o2.getSongTitle()));

        // For each song in the sorted playlist, print display the song title
        String songs = "";

        for (Song song : playlist) {
            songs = songs + song.getSongTitle() + "\n";
        }
            JOptionPane.showMessageDialog(null, songs, "Playlist (Alphabetical)", JOptionPane.PLAIN_MESSAGE);
    }

    public void reverseSort() {
        // Compare the song title of an object in the list with another to sort the playlist, same as before
        playlist.sort((o1, o2) -> o1.getSongTitle().compareTo(o2.getSongTitle()));

        // Reverse the order of sorted playlist
        Collections.reverse(playlist);

        // For each song in the sorted playlist, print display the song title
        String songs = "";

        for (Song song : playlist) {
            songs = songs + song.getSongTitle() + "\n";
        }
        JOptionPane.showMessageDialog(null, songs, "Playlist (Reverse Alphabetical)", JOptionPane.PLAIN_MESSAGE);
    }

    public void addSongs(Collection<Song> playlist) {
        playlist.addAll(playlist);
    }
}
