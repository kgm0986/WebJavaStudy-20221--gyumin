package j08_메소드;

import java.util.Random;

public class RandomNumber {
    public static int/*return되는 값의 자료형지정,반환자료형*/ calcRandom(int m) {
        Random random = new Random();
        int result = random.nextInt(10)*1000+m;
        return result;

    }
    public static void main(String[] args) {
        /*Random random = new Random();*/

        int money = 5000;


        /*int a = random.nextInt(10)*1000+money;
        System.out.println(a);
        int b = random.nextInt(10)*1000+money;
        System.out.println(b);
        int c = random.nextInt(10)*1000+money;
        System.out.println(c);
        int d = random.nextInt(10)*1000+money;
        System.out.println(d);
        System.out.println(a+b+c+d);*/



       /* for (int i = 0; i < 10; i++) {
        int randomNum = random.nextInt(100)+100;
            System.out.println(randomNum);

        }*/
        System.out.println(calcRandom(money));//코드의 재사용  메소드 정의
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        int r = calcRandom(money);
        System.out.println(r+100);
        System.out.println(r+1000);
        System.out.println(r+10000);
        System.out.println(r+100000);
    }
}
