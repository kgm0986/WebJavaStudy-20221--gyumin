package j06_조건;

import java.util.Scanner;

public class Conditon4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selected = 0;

        System.out.println("[선택 프로그램]");
        System.out.println("a.메뉴1");
        System.out.println("a.메뉴2");
        System.out.println("a.메뉴3");
        System.out.println("a.메뉴4");
        System.out.println("a.메뉴5");
        System.out.print("실행할 명령을 선택하세요");
        selected = scanner.nextInt();

        switch (selected) {
            case 1:
                System.out.println("메뉴1을 선택하셨습니다");
                break;
            case 2:
                System.out.println("메뉴2을 선택하셨습니다");
                break;
            case 3:
                System.out.println("메뉴3을 선택하셨습니다");
                break;
            case 4:
                System.out.println("메뉴4을 선택하셨습니다");
                break;
            case 5:
                System.out.println("메뉴5을 선택하셨습니다");
                break;
            default://else와 같이 위 에 캐이스에 해당하는게 없을시 실행됨
                System.out.println("해당번호는 선택하실수없습니다");

        }


    }
}
