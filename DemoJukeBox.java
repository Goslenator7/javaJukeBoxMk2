import java.util.ArrayList;

public class DemoJukeBox {
    public static void main(String[] args) {

        JukeBox myPlaylist = new JukeBox();

        Song s1 = new Song("Back In Black", "AC/DC");
        Song s2 = new Song ("On The Luna", "Foals");
        Song s3 = new Song ("The Consolations Of Philosophy", "Max Richter");
        Song s4 = new Song ("Out Of The North", "Jesper Kyd");
        Song s5 = new Song ("Love It If We Made It", "The 1975");

        myPlaylist.addSong(s1);
        myPlaylist.addSong(s2);
        myPlaylist.addSong(s3);
        myPlaylist.addSong(s4);
        myPlaylist.addSong(s5);

        myPlaylist.sortPlaylist();
        myPlaylist.reverseSort();
    }
}
