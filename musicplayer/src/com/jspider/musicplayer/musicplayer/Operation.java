package com.jspider.musicplayer.operation;
import com.jspider.musicplayer.song.*;
import java.util.Random;
import java.util.ArrayList;


public class Operation {
	ArrayList<Song> songList = new ArrayList<Song>();

	// Add a song to the list

    public void addSong(Song song) {
        songList.add(song);
        System.out.println("Song added successfully.");
    }

    // Remove a song from the list
    public void removeSong(int id) {
        boolean removed = false;
        for (Song song : songList) {
            if (song.getId() == id) {
                songList.remove(song);
                removed = true;
                System.out.println("Song removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Song not found with id " + id);
        }
    }

    // Print all songs in the list
    public void displaySongs() {
        for (Song song : songList) {
            System.out.println(song);
        }
    }

    // Play all songs in the list
    public void playAllSongs() {
        for (Song song : songList) {
            System.out.println("Now playing: " + song.getName());
        }
    }
	 
    // Play random song in the list
    public void playRandomSong() {
        Random rand = new Random();
        Song song = songList.get(rand.nextInt(songList.size()));
        System.out.println("Now playing: " + song.getName());
    }

	// Choose to Play
    public void playSelectedSong(int id) {
        boolean found = false;
        for (Song song : songList) {
            if (song.getId() == id) {
                System.out.println("Now playing: " + song.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found with id " + id);
        }
    }

}


