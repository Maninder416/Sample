package Generics;

public class GenericClass <E,D>{
    private E a;
    private D b;

    public void SetValue(E a,D b){
        this.a= a;
        this.b=b;
    }

    public E GetValue(){
        return this.a;
    }

    public D GetValueD(){
        return this.b;
    }

    public static void main(String[] args) {
        GenericClass<Integer,Integer> testIntger= new GenericClass<Integer,Integer>();
        GenericClass<String,String> testString= new GenericClass<String,String>();

        testIntger.SetValue(10,20);
        testString.SetValue("Maninder Singh","Gurjeet Kaur");
        System.out.println(testIntger.GetValue());
        System.out.println(testString.GetValue());
        System.out.println(testString.GetValueD());

    }

}
