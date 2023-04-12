package com.jspider.musicplayer.musicplayer;
import com .jspider.musicplayer.operation.Operation;
import java.util.Scanner;

import com.jspider.musicplayer.song.*;


public class Musicplayer {
public static void main(String[] args) {
		
		Operation operations = new Operation();
		Scanner scanner = new Scanner (System.in);

		// Add some sample songs		
		Song song1 = new Song("Song 1", "Album 1", "Singer 1", 180, 1);
        Song song2 = new Song("Song 2", "Album 1", "Singer 2", 210, 2);
        Song song3 = new Song("Song 3", "Album 2", "Singer 3", 300, 3);
        operations.addSong(song1);
        operations.addSong(song2);
        operations.addSong(song3);

		while (true)
		{
			// Display menu
			System.out.println(":::::::: Music Player ::::::::");		
			System.out.println("========== Menu	==========");
			System.out.println("1. Play songs");
			System.out.println("2. Add/remove songs");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");


		// Get user choice
		int choice = scanner.nextInt();
        switch (choice)
			{
			case 1:
				// Display play songs menu
				System.out.println(" ");
				System.out.println("========== Play Songs ==========");
				System.out.println("1. Play all songs");
				System.out.println("2. Play a random song");
				System.out.println("3. Play a selected song");
				System.out.println("4. Go back to main menu");
				System.out.print("Enter your choice: ");

				// Get user choice
				int playChoice = scanner.nextInt();

				switch (playChoice) {

					// Play all songs
					case 1:
						operations.playAllSongs();
					break;

					// Play a random song            
					case 2:
						operations.playRandomSong();
					break;

					// Play a selected song
					case 3:
						operations.displaySongs();
						System.out.print("Enter song id: ");
						int id = scanner.nextInt();
						operations.playSelectedSong(id);
					break;

					// Go back to main menu
					case 4:
					break;

					default:
						System.out.println("Invalid choice. Please try again.");
					break;
				} 
				break;

			case 2:
				// Display add/remove songs menu
				System.out.println(" ");
				System.out.println("========== Add/Remove Songs ==========");
				System.out.println("1. Add a song");
				System.out.println("2. Remove a song");
				System.out.println("3. Go back to main menu");
				System.out.print("Enter your choice: ");

				// Get user choice
				int arChoice = scanner.nextInt();

				switch (arChoice) {
					case 1:
					    // Add a song
					    System.out.println("Enter song details:");
					    System.out.print("Name: ");
					    String name = scanner.nextLine();
					    System.out.println();
						scanner.nextLine();						
						
					    System.out.print("Album: ");
					    String album = scanner.nextLine();
					    
					    
					    System.out.print("Singer: ");
					    String singer = scanner.nextLine();    
					    				    

					    System.out.print("Duration (in seconds): ");
					    int duration = scanner.nextInt();
					    scanner.nextLine();

						System.out.print("Song ID: ");
					    int id = scanner.nextInt();
					    Song song = new Song(name, album, singer, duration, id);
					    operations.addSong(song);
						operations.displaySongs();						
					    break;
					    
					case 2:
					    // Remove a song
						operations.displaySongs();
					    System.out.print("Enter song ID to remove: ");
					    int songId = scanner.nextInt();
					    scanner.nextLine();
					    operations.removeSong(songId);
					    break;
					case 3:
					    // Go back to main menu						
					    break;
					default:
						System.out.println("Invalid choice. Please try again.");
						break;
				}
			case 3:
				// Exit the program
				System.out.println("Exiting program. Goodbye!");
			break;

			    default:
					System.out.println("Invalid choice. Please try again.");
				break;
			}

		
		 // prompt the user to either perform another action or exit the program
            System.out.println("\nDo you want to use the Music player ?");
            System.out.println("1. Yes");
            System.out.println("2. No\n");

            int continueChoice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (continueChoice == 2) {
                System.out.println("Thank you for using Music Player!");
                break; // exit the loop and terminate the program
            }
		}		
		
	}
	

}


