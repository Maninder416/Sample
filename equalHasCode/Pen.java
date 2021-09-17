package RandomTesting;
import java.util.*;

public class Pen {
    String color;
    int price;
    Pen(String color, int price){
         this.color=color;
         this.price=price;
    }
     @Override
    public boolean equals(Object obj){
         Pen that= (Pen) obj;
         boolean isEqual= this.price== that.price && this.color== that.color;
         return isEqual;
    }
    @Override
    public int hashCode(){
         return price+color.hashCode();
    }
    public static void main(String[] args) {
         Pen pen1= new Pen("blue",10);
         Pen pen2= new Pen("blue",10);
         Set<Pen> test= new HashSet<>();
         test.add(pen1);
         test.add(pen2);
         System.out.println(test);
         System.out.println(pen1.equals(pen2));
     }}
