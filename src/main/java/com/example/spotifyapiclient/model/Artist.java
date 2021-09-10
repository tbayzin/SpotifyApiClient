package com.example.spotifyapiclient.model;

public class Artist {

    private String name;
    private Integer popularity;
    private String artist;
    private  String uri;


    public Artist(String name, Integer popularity, String artist, String uri) {
        this.name = name;
        this.popularity = popularity;
        this.artist = artist;
        this.uri = uri;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
