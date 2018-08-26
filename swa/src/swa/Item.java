package swa;

public class Item {



			private String name;
			private double price;
			
			public Item() {
				// TODO Auto-generated constructor stub
			}
			
			public Item(String name, double price) {
				super();
				this.name = name;
				this.price = price;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			
			public boolean equals(Object o)
			{
				if(o instanceof Item)
				{
					Item it = (Item) o;
					if(this.name.equals(it.name) && this.price == it.price)
							return true;
					else
						return false;
				}
				else
					return false;
			}
			
			@Override
			public String toString() {
				
				return name+price;
			}
}

			
		
	


