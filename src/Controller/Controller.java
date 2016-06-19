package Controller;

import Model.Carrier;
import Model.Marine;

public class Controller {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Carrier c1 = new Carrier();
		
		m1.attack(m2);
		System.out.println("Marine HP");
		System.out.println(m2.hp);
		
		c1.attack(m2);
		System.out.println(m2.hp);
		
		m1.attack(c1);
		System.out.println("Carrier HP");
		System.out.println(c1.hp);
		
		if (m2.hp <= 0) {
			
		
		System.out.println("Marine2 is Die");
		}
		
		if (c1.hp <= 0) {
			System.out.println("Carrier is Die");
		}
		}
		
		
		
		
		
	}

