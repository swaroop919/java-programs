package swa;
public class Actor {

	private String name;
	private int numHits;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumHits() {
		return numHits;
	}
	public void setNumHits(int numHits) {
		this.numHits = numHits;
	}
	public Actor() {
	}
	public Actor(String name, int numHits) {
		super();
		this.name = name;
		this.numHits = numHits;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in Actor->equals()");
		if(obj instanceof Actor)
		{
			Actor a = (Actor) obj;
			if(this.name.equals(a.name) && this.numHits == a.numHits)
				return true;
			else
				return false;
		}
		else
			return false;
		
	}
}