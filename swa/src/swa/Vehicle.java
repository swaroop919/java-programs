package swa;


public class Vehicle implements Comparable<Vehicle>
{
		private String name;
		private int capacity;
		public Vehicle(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + capacity;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Vehicle other = (Vehicle) obj;
			if (capacity != other.capacity)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		public String toString()
		{
			return "vehicle="+ name+" " +"capacity="+capacity;
		}

		
		@Override
		public int compareTo(Vehicle o) 
		{
			//return this.capacity-o.capacity;
			//return this.name.compareTo(o.name);
			
			//return (this.name+this.capacity).compareTo(o.name+o.capacity);
			return this.toString().compareTo(o.toString());
		}
		
		

	}





