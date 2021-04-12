package com.info.model;

import java.util.Date;

public class Result {
    public String wrapperType;
    public String description;
    public String kind;
    public int artistId;
    public int collectionId;
    public int trackId;
    public String artistName;
    public String collectionName;
    public String trackName;
    public String collectionCensoredName;
    public String trackCensoredName;
    public String artistViewUrl;
    public String collectionViewUrl;
    public String trackViewUrl;
    public String previewUrl;
    public String artworkUrl30;
    public String artworkUrl60;
    public String artworkUrl100;
    public double collectionPrice;
    public double trackPrice;
    public Date releaseDate;
    public String collectionExplicitness;
    public String trackExplicitness;
    public int discCount;
    public int discNumber;
    public int trackCount;
    public int trackNumber;
    public int trackTimeMillis;
    public String country;
    public String currency;
    public String primaryGenreName;
    public boolean isStreamable;
    public String collectionArtistName;
    public String copyright;

    @Override
    public String toString() {
       return  "Artist Name = " + this.artistName + " Artist Id = " + this.artistId + "\n";
    }
}