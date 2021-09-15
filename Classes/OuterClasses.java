package Classes;

public class OuterClasses{
    private String outerField= "Outer Field";
    static String staticouterField= "Static outer field";

    class InnerClass{
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticouterField);
        }
    }

    static class StaticNestedClass{
        void accessMembers(OuterClasses outer){
            System.out.println(outer.outerField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner Classes");
        System.out.println("--------------");
        OuterClasses outerClasses= new OuterClasses();
        OuterClasses.InnerClass innerClass= outerClasses.new InnerClass();
        innerClass.accessMembers();

        System.out.println("\n.static nested class");
        System.out.println("---------------------");
        StaticNestedClass staticNestedClass= new StaticNestedClass();
        staticNestedClass.accessMembers(outerClasses);
    }
}
