package swa;


	import java.util.Comparator;

	public class SongDurationComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Song && o2 instanceof Song)
			{
				Song s1 = (Song) o1;
				Song s2 = (Song) o2;
				
				return s1.getDuration() - s2.getDuration();
			}
			else
				throw new IllegalArgumentException("only songs can be compared");
		}
	}






