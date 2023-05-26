package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String name=null, price=null;
		int num=0;
		
		while(true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.println(">>>");
			num = scan.nextInt();
			
			if(num == 1) {
				System.out.println("메뉴입력: ");
				name = scan.next();
				if(map.containsKey(name) == false) {
					System.out.println("가격입력: ");
					price = scan.next();
					map.put(name, price);
					System.out.println("등록되었습니다");
				}else {
					System.out.println("존재하는 메뉴입니다");
				}
			}
			else if(num == 2) {
				Iterator<String> it = map.keySet().iterator();
				while(it.hasNext()) {
					name = (String)it.next();
					System.out.println(name+" : "+map.get(name));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				System.out.println(">>>");
				int choice = scan.nextInt();
				if(choice == 1) {
					System.out.println("변경할 메뉴 이름: ");
					name = scan.next();
					if(map.containsKey(name)) {
						System.out.println("가격 수정: ");
						int newPrice = scan.nextInt();
						System.out.println(map.get(name)+"->"+newPrice);
						System.out.println("변경되었습니다");
					}else {
						System.out.println("메뉴가없습니다");
					}
				}else if(choice == 2) {
					System.out.println("삭제 메뉴: ");
					name = scan.next();
					if(map.containsKey(name)) {
						map.remove(name);
						System.out.println(name+"삭제되었습니다");
					}else {System.out.println(name+"없는 이름입니다");}
				}
			}
			else break;
			}
		}
}
