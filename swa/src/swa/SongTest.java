package swa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SongTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		
		
		

		List songs = new ArrayList();
		Song s1 = new Song("dilse",5,6);
		Song s2 = new Song("humdildechukesanam",10,5);
		Song s3 = new Song("chaiyachaiya",4,7);
		Song s4 = new Song("jaiho",4,8);
		Song s5 = new Song("yappayappa",7,8);
		Song s6 = new Song("dilse",5,6);
		
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);
		songs.add(s4);
		songs.add(s5);
		songs.add(s6);
		
		System.out.println("songs = "+songs);
		throw new SongNotFoundException("please enter the vvalid song");
		/*Set s = new TreeSet(songs);
		System.out.println("treset = "+s);
		Collections.sort(songs);
		System.out.println("songs = "+songs);
		
		SongDurationComparator comp1 = new SongDurationComparator();
		Collections.sort(songs,comp1);
		System.out.println("songs c1 = "+songs);
	
		SongRatingComparator comp2 = new SongRatingComparator();
		Collections.sort(songs,comp2);
		System.out.println("songs c2 = "+songs);
*/

}
}