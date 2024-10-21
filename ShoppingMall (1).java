import java.util.Scanner;

public class ShoppingMall {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("연락처를 입력하세요 : ");
		String phone = sc.next();
		System.out.println("-------------------------------");
		System.out.println("Welcome to Shopping Mall");
		System.out.println("Welcome to Book Market!");
		System.out.println("-------------------------------");
		int choiceNum = 0;
		while (choiceNum != 8) {
			System.out.println("1. 고객정보 확인하기\t\t 4. 장바구니에 항목 추가하기");
			System.out.println("2. 장바구니 확인하기\t\t 5. 장바구니에 항목 줄이기");
			System.out.println("3. 장바구니  비우기\t\t 6. 장바구니에 항목 삭제하기");
			System.out.println("7. 영수증  표시하기\t\t 8. 종료");
			System.out.println("-------------------------------");
			System.out.print("메뉴 번호를 선택하세요 : ");
			choiceNum = sc.nextInt();			
			switch (choiceNum) {
			case 1:  // 1. 고객정보 확인하기	
				System.out.println("이름:"+name+" 연락처:"+phone);
				break;
			case 2:				
				break;
			case 3:				
				break;
			case 4:				
				break;
			case 5:				
				break;
			case 6:				
				break;
			case 7:				
				break;			
			default:
				break;
			}
		}
		
		

	}

}
