package randomtesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass implements Comparable<ComparableClass>{
    String laptopName;
    int ram;
    double price;

    public ComparableClass(String laptopName, int ram, double price){
        this.laptopName =laptopName;
        this.price=price;
        this.ram=ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(ComparableClass obj){
       if(this.getPrice()<obj.getPrice()){
           return 1;
       }else {
           return -1;
       }
    }

    @Override
    public boolean equals(Object obj){
        ComparableClass that= (ComparableClass) obj;
        boolean temp= this.getPrice()>that.getPrice();
        return temp;
    }
    @Override
    public String toString() {
        return "RandomTesting.ComparableClass{" +
                "laptop_name='" + laptopName + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        List<ComparableClass> testing= new ArrayList<>();

        testing.add(new ComparableClass("Dell",2,800.00));
        testing.add(new ComparableClass("hp",4,200.00));
        testing.add(new ComparableClass("Sony",8,100.00));
        Collections.sort(testing);
        for(ComparableClass l: testing){
            System.out.println(l);
        }

    }


}
