package j13_추상화.인터페이스;
/*
* interface(인터페이스)
* 1.기본적으로 모든 메소드가 추상메소드로 정의된다
* 2.일반 메소드를 정의하기위해서는 default 키워드를 사용해야한다
* 3.생성자 정의는 불가능하다
* 4.일반 변수 선언 불가능하다
* 5.상수는 선언할수있다.(접근지정자 public사용)
* */
public interface Press {
    public final String NAME = "button";//[상수선언 ,초기화]private는안됨
    //private String name;[변수선언]
    public void onPressed();//abstract키우드 셍략
//    public Button({[생성자]
//
//    })
//    public default void pop(){[일반메소드]
//
//    }
}
