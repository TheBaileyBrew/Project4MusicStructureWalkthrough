package com.thebaileybrew.project4musicstructurewalkthrough;

public class song {

    private final String artistName;
    private final String artistSong;
    private final int artistImage;
    private final String artistFeatured;

    public song (String artistName, String artistSong, int artistImage, String artistFeatured) {
        this.artistName = artistName;
        this.artistSong = artistSong;
        this.artistImage = artistImage;
        this.artistFeatured = artistFeatured;
    }

    public String getArtistName() {
        return artistName;
    }
    public String getArtistSong() {
        return artistSong;
    }
    public int getArtistImage() {
        return artistImage;
    }
    public String getArtistFeatured() {
        return artistFeatured;
    }
}
