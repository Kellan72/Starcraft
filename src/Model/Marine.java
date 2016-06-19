package Model;

public class Marine extends Unit  {

	public int hp;
	public Marine(){
		super(100);
	}
	public void attack (Unit unit){
		System.out.println("공격");
		System.out.println("방어");
		}
	}
