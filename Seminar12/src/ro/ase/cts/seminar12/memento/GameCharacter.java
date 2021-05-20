package ro.ase.cts.seminar12.memento;

public class GameCharacter {
	
	String name;
	int hitPoints;
	public GameCharacter(String name, int hitPoints) {
		super();
		this.name = name;
		this.hitPoints = hitPoints;
	}
	
	//public saveState()

	public CharacterMemento generateMemento()
	{
		return new CharacterMemento(this.name, this.hitPoints);
	}
	
	public void setMemento(CharacterMemento memento)
	{
		this.name=memento.name;
		this.hitPoints=memento.hitPoints;
	}
	
	public void bleed()
	{
		this.hitPoints-=10;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}
	
	
}
