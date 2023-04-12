package com.jspider.musicplayer.song;

public class Song {
	private String name ;
	private String album ;
	private String singer ;
	private int duration ;
	private int id ;

	// demo variable for count song 
	int countId = 0;

	// Constructor		
	public Song(String name, String album, String singer, int duration, int id) {
		this.name = name;
		this.album = album;
		this.singer = singer ;
		this.duration = duration ;
		this.id = id;
	}

	// Getter methods
    public String getName() {
        return name;
    }
    public String getAlbum() {
        return album;
    }
    public String getSinger() {
        return singer;
    }
    public double getDuration() {
        return duration;
    }
    public int getId() {
        return id;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id No : "+ id+" - Name : "+name+ ", Album : "+ album +", Singer : "+ singer +", Duration : "+ duration;
	}
		

}

