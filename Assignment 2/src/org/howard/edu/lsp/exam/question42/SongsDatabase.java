package org.howard.edu.lsp.exam.question42;
import java.util.*;
/**
 * 
 * @author Darryle Mensah
 *
 */

public class SongsDatabase {
    private Map<String,Set<String>> map = new HashMap<String,Set<String>>();
    
    
    /**
     * 
     * @param genre                  string variable containing the genre of music
     * 
     * 
     * @param songTitle              string variable containing the song title
     */    
    public void addSong(String genre,String songTitle){
        Set<String> songs_list = map.getOrDefault(genre,new HashSet<String>());
        songs_list.add(songTitle);
        map.put(genre,songs_list);
        System.out.println("Song " + songTitle + " has been added into " + genre);
    }
    
    /**
     * 
     * @param genre                  string variable containing the genre of music
     * 
     * 
     * @return						 set of songs mapped to the genre and creates
     *                               a new key if the genre isn't present
     */
    public Set<String> getSongs(String genre){
        return map.getOrDefault(genre,new HashSet<String>());
    }
    
    
    /**
     * 
     * @param songTitle              string variable containing the song title
     * 
     * 
     * @return                       the genre of the song title selected
     */
    public String getGenreOfSong(String songTitle){
       String song_genre= "";
        for(String genre : map.keySet()){
            if(map.get(genre).contains(songTitle)){
            	song_genre =  genre;
                break;
            }
        }
        return song_genre;
    }
}
