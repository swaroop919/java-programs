package swa;



	import java.util.Comparator;

	public class SongRatingComparator implements Comparator {
		@Override
		public int compare(Object o1, Object o2) {
			if(o1 instanceof Song && o2 instanceof Song)
			{
				Song s1 = (Song) o1;
				Song s2 = (Song) o2;
				
				if(s1.getRating() > s2.getRating())
					return +1;
				else
					if(s1.getRating() < s2.getRating())
						return -1;
					else
						return 0;
			}
			else
				throw new IllegalArgumentException("only songs can be compared");
		}
	}



