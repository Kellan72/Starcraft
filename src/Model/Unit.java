package Model;

public class Unit {
	protected int hp;
	
	public Unit(int hp) {
		this.hp = hp;
}

	public void inform(){
		System.out.println(hp);
	}
}