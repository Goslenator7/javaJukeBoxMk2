public class Song {

    private String songTitle;
    private String artistName;

    public Song () {}

    public Song (String aSongTitle, String anArtistName) {
        this.songTitle = aSongTitle;
        this.artistName = anArtistName;
    }

    // Getters and Setters
    public String getSongTitle() {
        return this.songTitle;
    }

    public void setSongTitle(String aSongTitle) {
        this.songTitle = songTitle;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String aName) {
        this.artistName = aName;
    }
}
