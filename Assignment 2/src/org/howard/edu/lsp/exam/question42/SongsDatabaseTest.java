package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class SongsDatabaseTest {

	@Test
	@DisplayName("Tests .addSong(String genre,String songTitle)")
	void test_addSong() {
		SongsDatabase test  = new SongsDatabase();
		test.addSong("Jazz", "Take The A Train");
		test.addSong("Gospel", "No Weapon");
		test.addSong("R&B", "Mercy Mercy Me");
		
		System.out.println(test);
	}
	
	@Test
	@DisplayName("Tests getSongs(String genre)")
	void test_getSongs() {
		SongsDatabase test1  = new SongsDatabase();
		test1.addSong("Gospel", "Break Every Chain");
		test1.addSong("Gospel", "No Weapon");
		test1.addSong("Gospel", "Without You");
		test1.addSong("Gospel", "I Came To Magnify the Lord");
		test1.addSong("R&B", "Mercy Mercy Me");
		test1.addSong("R&B", "Isn't She Lovely");
		test1.addSong("R&B", "End of the Road");
		test1.addSong("R&B", "Remember the Time");
		
		Set<String> gospel_songs = test1.getSongs("Gospel");
		Set<String> rb_songs = test1.getSongs("R&B");
		
		System.out.println(gospel_songs);
		System.out.println(rb_songs);
	}
	
	@Test
	@DisplayName("Tests getGenreOfSong(String songTitle)")
	void test_getGenreOfSong() {
		SongsDatabase test2  = new SongsDatabase();
		test2.addSong("Jazz", "Take The A Train");
		test2.addSong("Gospel", "No Weapon");
		test2.addSong("R&B", "Mercy Mercy Me");
		test2.addSong("Classical", "Clair De Lune");
	
		System.out.println(test2.getGenreOfSong("Take The A Train"));
		System.out.println(test2.getGenreOfSong("No Weapon"));
		System.out.println(test2.getGenreOfSong("Mercy Mercy Me"));
		System.out.println(test2.getGenreOfSong("Clair De Lune"));
	}

}
