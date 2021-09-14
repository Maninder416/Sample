package RandomPractice;

public class PracticeSession1 {
    public static void test(){
    try{
        test2();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void test2(){
    test3();
    }

    public static void test3(){
        int i=100;
        int j=i/0;
    }

    public static void main(String[] args) {
        test3();


    }
}
