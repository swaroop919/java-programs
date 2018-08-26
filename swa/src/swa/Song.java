
package swa;

	public class Song implements Comparable<Song>
	{
		
		private String name;
		private int duration;
		private double rating;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDuration() {
			return duration;
		}
		public void setDuration(int duration) {
			this.duration = duration;
		}
		public double getRating() {
			return rating;
		}
		public void setRating(double rating) {
			this.rating = rating;
		}
		public Song(String name, int duration, double rating) {
			//super();
			this.name = name;
			this.duration = duration;
			this.rating = rating;
		}
		
		public Song() {
			// TODO Auto-generated constructor stub
		}
		
		/*@Override
		public int compareTo(Object o) {
			if(o instanceof Song)
			{
				Song s = (Song) o;
				
				
				return this.name.compareTo(s.name);
			}
			else
				throw new IllegalArgumentException("only songs can be compared");
		}*/
		
		@Override
		public int hashCode() {
			return (name + rating + duration).hashCode();
		}
		@Override
		public String toString() {
			return "Song - n:"+name+",r:"+rating+",d:"+duration;
		}
		
		public boolean equals(Object o)
		{
			if(o instanceof Song)
			{
				Song s = (Song) o;
				if(this.name.equals(s.name) && this.duration == s.duration && this.rating == s.rating)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		@Override
		public int compareTo(Song o) {

			return this.name.compareTo(o.name);
		}
		
	}

