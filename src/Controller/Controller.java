package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Firebet;
import Model.Marine;
import Model.Unit;

public class Controller {

	public static void main(String[] args) {
		List <Unit> list = new ArrayList <Unit>();
		List<Unit> unitList = new ArrayList<Unit>();
		Scanner scanner = null;
		while(true) {
			System.out.println("���� ���� : 1");
			System.out.println("���̾�� ���� : 2");
			System.out.println("��Ȳ ���� : 3");
			System.out.println("���� �����ϱ� : 4");
			System.out.println("�� ��: ����");
			
			int input = scanner.nextInt();
			switch(input) {
			
			case 1:
				System.out.println("�̸��� �Է����ּ���");
				String marineName = scanner.next();	
				Marine marine = new Marine(marineName, input) {
				list.add(marine);
				break;
				
			case 2:
				System.out.println("�̸��� �Է����ּ���");
				String firebetName = scanner.next();
				Firebet firebet = new Firebet(firebetName);
				list.add(firebet);
				System.out.println();	
				break;
					
			case 3:
				System.out.println(list.size() + "����");
				for(int i=0; i<list.size(); i++) {
					Unit unit = list.get(i);
					if(list.size() <= 0)
					System.out.println("������ �����ϴ�");
				}
				break; 
				
			case 4:
				System.out.println("1. �����ϱ�");
				System.out.println("2. �̵��ϱ�");
				List<Unit> attack = new ArrayList<Unit>();
				break;
			}							
		}
	}
	

	

