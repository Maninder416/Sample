package Classes;

public class ShadowingClass {
    int a=10;
    class InnerClass{
        int a=100;

    }
    public static void main(String[] args) {
        ShadowingClass shadowingClass= new ShadowingClass();
        ShadowingClass.InnerClass innerClass= shadowingClass.new InnerClass();
        System.out.println(shadowingClass.a);
        System.out.println(innerClass.a);

    }
}
