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
			System.out.println("마린 생성 : 1");
			System.out.println("파이어뱃 생성 : 2");
			System.out.println("현황 보기 : 3");
			System.out.println("유닛 선택하기 : 4");
			System.out.println("그 외: 종료");
			
			int input = scanner.nextInt();
			switch(input) {
			
			case 1:
				System.out.println("이름을 입력해주세요");
				String marineName = scanner.next();	
				Marine marine = new Marine(marineName, input) {
				list.add(marine);
				break;
				
			case 2:
				System.out.println("이름을 입력해주세요");
				String firebetName = scanner.next();
				Firebet firebet = new Firebet(firebetName);
				list.add(firebet);
				System.out.println();	
				break;
					
			case 3:
				System.out.println(list.size() + "마리");
				for(int i=0; i<list.size(); i++) {
					Unit unit = list.get(i);
					if(list.size() <= 0)
					System.out.println("유닛이 없습니다");
				}
				break; 
				
			case 4:
				System.out.println("1. 공격하기");
				System.out.println("2. 이동하기");
				List<Unit> attack = new ArrayList<Unit>();
				break;
			}							
		}
	}
	

	

