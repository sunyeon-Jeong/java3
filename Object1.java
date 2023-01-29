import javax.xml.crypto.Data;

// 객체 생성과 사용
class Tv { // class Tv의 객체들
    // class Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // class Tv의 메서드
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class Object1_1 {
    public static void main(String[] args) {
        Tv t; // Tv인스턴스를 참조하기 위한 참조변수 t선언
        t = new Tv(); // Tv인스턴스 생성

        t.channel = 7; // Tv인스턴스 멤버변수 channel값 7로 초기화
        t.channelDown(); // Tv인스턴스 메서드 호출 (--channel)
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

// 같은 클래스로부터 생성된 각 인스턴트
class Object1_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // Tv인스턴스 참조하기 위한 참조변수 t1
        Tv t2 = new Tv(); // Tv인스턴스 참조하기 위한 참조변수 t2
        // 인스턴스 속성(멤버변수) 초기화 값 출력
        System.out.println("t1의 channel 값 : " + t1.channel); // 참조변수.멤버변수
        System.out.println("t2의 channel 값 : " + t2.channel);

        // 인스턴스 속성(멤버변수) 값 지정
        t1.channel = 7;
        System.out.println("t1의 channel 값이 7로 변경되었습니다.");

        // 최종 인스턴스 속성(멤버변수) 값 출력
        System.out.println("t1의 channel 값 : " + t1.channel);
        System.out.println("t2의 channel 값 : " + t2.channel);
    }
}

// 클래스 정의_클래스 사용 X
class Object1_3 {
    public static void main(String[] args) {
        // 총 3명의 시간을 '변수'로 관리
        int hour1, hour2, hour3;
        int minute1, minute2, minute3;
        int second1, second2, second3;

        // 총 3명의 시간을 '배열'로 관리
        int[] hour = new int[3]; // 길이가 3 (범위0~2)
        int[] minute = new int[3];
        int[] second = new int[3];
    }
}

// 클래스 정의_클래스 사용 O
class Time{
    int hour; // Time 클래스의 속성(멤버변수)
    int minute;
    int second;
}
class Object1_4 {
    public static void main(String[] args) {
        // 총 3명의 시간을 객체로 관리
        Object1_4 t1 = new Object1_4();
        Object1_4 t2 = new Object1_4();
        Object1_4 t3 = new Object1_4();

        // 총 3명의 시간을 객체 배열로 관리
        Object1_4[] timeArr = new Object1_4[3];
        timeArr[0] = new Object1_4();
        timeArr[1] = new Object1_4();
        timeArr[2] = new Object1_4();
    }
}

// 변수의 종류
class Variable {
    // 인스턴스 변수 ; 객체 생성 시 만들어짐, 인스턴트마다 별도의 저장공간
    int iv;
    // 클래스 변수 ; 클래스 영역, 모든 인스턴스가 공통된 값 공유.
    static int cv;

    // 지역변수 ; 메서드내에 선언, 메서드내에서만 사용
    void method() {
        int lv;
        lv = 30; // 지역변수는 자동 초기화 X. 수동 초기화 필요
        System.out.println("lv 지역변수 : " + lv);
    }
}
class  Object1_5 {
    public static void main(String[] args) {
        // 클래스 변수 접근 및 사용
        // 접근방법 : 클래스명.클래스변수이름
        Variable.cv = 10;
        System.out.println("Variable.cv 클래스 변수 = " + Variable.cv);

        // 인스턴스 변수 생성 및 사용
        // Variable.iv = 20; // Error, 인스턴스를 통해서만 생성 및 사용 가능
        Variable objVar = new Variable();
        objVar.iv = 20;
        System.out.println("objVar.iv 인스턴스 변수 = " + objVar.iv);

        // 지역 변수 생성 및 사용
        // objVar.lv // Error, 인스턴스로 지역 변수 바로 접근 불가능
        objVar.method(); // 메서드 호출 시 지역 변수 생성
        // 메서드 종료시 지역 변수 삭제
    }
}

// 클래스 변수와 인스턴스 변수
class Card {
    // 멤버변수_인스턴스변수
    String kind;
    int number;

    // 멤버변수_클래스변수
    static int width = 100;
    static int height = 250;
}
class Object1_6 {
    public static void main(String[] args) {
        // 클래스변수 ; 객체생성 없이 '클래스이름.클래스변수'로 사용가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        // 객체생성
        Card c1 = new Card(); // c1 -> 인스턴스(객체)
        c1.kind = "Heart"; // '객체.멤버변수' -> 값 초기화
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade"; // 인스턴스 변수 ; 인스턴스마다 다른값 유지 가능
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}

// 메서드
class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(double a, double b) {return a / b;}
}
class Object1_7 {
    public static void main(String[] args) {
        // 인스턴스(객체) 생성
        MyMath mm = new MyMath();

        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

// 기본형 매개변수
class Data1 {
    int x; // 멤버변수 선언
}
class Object1_8 {
    public static void main(String[] args) {
        Data1 d = new Data1(); // 인스턴스 d 생성
        d.x = 10; // 객체.멤버변수 -> 값 초기화
        System.out.println("main() : x = " + d.x);

        change(d.x); // 인스턴트 변수 값 자체가 복사되어 전달
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x); // 복사본이 변경 된 것이라 원본에 아무 영향X
    }
    static void change(int x) { // 기본형 매개변수
        x = 1000; // d.x의 값이 변경X, change메서드 매개변수 x의 값이 변경 된 것
        System.out.println("change() : x = " + x);
    }
}

// 참조형 매개변수
class Data2 {
    int x; // 멤버변수 선언
}
class Object1_9 {
    public static void main(String[] args) {
        Data2 d = new Data2(); // 인스턴스 d 생성(Data1 d != Data2 d)
        d.x = 10; // 객체.멤버변수 -> 값 초기화
        System.out.println("main() : x = " + d.x);

        change(d); // 인스턴스 d 주소값 전달
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data2 d) { // 참조형 매개변수
        d.x = 1000; // main(), change()가 같은 d 객체를 가리킴 -> 해당객체의 요소값 변경가능
        System.out.println("change() : x = " + d.x);
    }
}

// 참조형 반환타입
class Data3 {
    int x;
}
class Object1_10 {
    public static void main(String[] args) {
        Data3 d = new Data3(); // 인스턴스 생성
        d.x = 10; // 객체.멤버변수 -> 값 초기화

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }
    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3(); // 메서드안에서 새로운 인스턴스 생성
        tmp.x = d.x; // d객체의 멤버변수값 -> tmp객체의 멤버변수 복사!
        return tmp; // 복사한 객체의 주소값를 반환
    }
}

// static 메서드와 인스턴트 메서드
class MyMath2 {
    long a, b; // 멤버 변수(인스턴스)

    // 인스턴스 메서드
    // 호출 ; 객체생성 후, 멤버변수만 이용해서 작업하므로 매개변수 필요없음
    long add() {return a + b;} // a, b -> 인스턴스 변수
    long subtract() {return a - b;}
    long multiply() {return a * b;}
    double divide() {return a / b;}

    // 클래스 메서드
    // 객체 생성 없이 '클래스이름.메서드이름'으로 바로 호출가능. 매개변수만으로 작업 가능
    static long add(long a, long b) {return a + b;} // a, b -> 지역변수
    static long subtract(long a, long b) {return a - b;}
    static long multiply(long a, long b) {return a * b;}
    static double divide(long a, long b) {return a / (double) b;}
}
class Object1_11 {
    public static void main(String[] args) {
        // 클래스 메서드 호출. 인스턴스 생성 X
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subtract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        // 인스턴스 메서드 호출. 선 인스턴스(객체) 생성
        MyMath2 mm = new MyMath2(); // 객체 mm 생성
        mm.a = 200L; // 인스턴스.클래스 멤버변수
        mm.b = 100L;
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}

// 오버로딩
class MyMath3 {
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }

}
class Object1_12 {
    public static void main(String[] args) {
        MyMath3 test = new MyMath3();
        System.out.println(test.add(10, 20));
        System.out.println(test.add(13L, 17L));
        System.out.println(test.add(5L, 10));
        System.out.println(test.add(12, 23L));

        System.out.println();
    }
}

// 생성자_기본생성자
class Data_4 {
    int value; // 멤버변수 생성
}
class Data_5 {
    int value; // 멤버변수 생성
    Data_5(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}
class Object1_13 {
    public static void main(String[] args) {
        Data_4 d1 = new Data_4(); // 객체 생성
        // Data_5 d2 = new Data_5(); -> Error!

        // 1. 변수초기화를 위해 매개변수에 값을 전달한다
        // Data_5 d2 = new Data_5(10);
        // 2. 기본생성자 추가 정의 (class Data_5에)
        // Data_5()
    }
}

// 생성자_매개변수생성자
class Car{
    // 멤버변수 생성
    String color; // 색상
    String gearType; // 변속기종류(auto or manual)
    int door; // 문 개수

    // 기본생성자
    Car() {}

    // 매개변수생성자 -> 인스턴스 생성과 동시에 값 초기화
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}
class Object1_14 {
    public static void main(String[] args) {
        Car c1 = new Car(); // 인스턴스 c1 생성
        c1.color = "white"; // 값초기화
        c1.gearType = "auto";
        c1.door = 4;

        // 매개변수생성자 -> 인스턴스 생성 + 초기화
        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}

// 생성자에서 다른 생성자 호출하기_this()
class Car2 {
    // 멤버변수 생성
    String color;
    String gearType;
    int door;

    // 생성자
    Car2() {
        this("white", "auto", 4); // 마지막 생성자 호출
    }

    Car2(String color) { // 매개변수생성자 -> color값
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) { // 매개변수생성자
        this.color = color; // 입력받은 값 this.color에 저장
        this.gearType = gearType;
        this.door = door;
    }
}
class Object1_15 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue"); // 두번째 생산자로 감

        System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
    }
}