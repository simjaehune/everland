package myever;

import java.util.Scanner;

public class everland {
	
	public static void main(String arg[]) {
		
		everpro pro = new everpro();
		int type;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("이용 날짜를 입력하세요. (ex 210624)");
			int date = scan.nextInt();
			
			pro.tick(date);
			
			System.out.println("이용 고객의 나이를 입력하세요. (ex 0~100) ");
			int user_id = scan.nextInt();
			
			pro.age(user_id);
			
			System.out.println("사려는 티켓 갯수를 입력하세요");
			int ea = scan.nextInt();
			
			System.out.println("우대사항을 입력하세요. \r\n"
					+ "1. 없음 \r\n"
					+ "2. 장애인\r\n"
					+ "3. 국가유공자\r\n"
					+ "4. 다자녀\r\n"
					+ "5. 임산부");
			int discount = scan.nextInt();
		
			pro.woo(discount, ea);
		
			pro.arrpro();
			
		System.out.println("추가입력하시겠습니까 (1. 추가, 2. 종료) : ");
		type = scan.nextInt();
		pro.ordercount++;
	    } while(type == 1);
		System.out.println("가격은 " + pro.result + "원 입니다");
		System.out.println("감사합니다.");
		System.out.println("================== 에버랜드 ===================");
		
		pro.print();
}
}
