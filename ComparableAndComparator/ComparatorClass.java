package randomtesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {
    String laptopName;
    int ram;
    double price;

    public ComparatorClass(String laptopName, int ram, double price) {
        this.laptopName = laptopName;
        this.ram = ram;
        this.price = price;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComparatorClass{" +
                "laptop_name='" + laptopName + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args) {
        List<ComparatorClass> demo= new ArrayList<>();
        demo.add(new ComparatorClass("dell",14,1000.00));
        demo.add(new ComparatorClass("hp",6,200.00));
        demo.add(new ComparatorClass("sony",10,300));

        Comparator<ComparatorClass> dataguise= new Comparator<ComparatorClass>() {
            @Override
            public int compare(ComparatorClass o1, ComparatorClass o2) {
                if(o1.getRam()>o2.getRam())
                    return 1;
                else {
                    return -1;
                }
            }
        };

        Collections.sort(demo,dataguise);
        for(ComparatorClass i: demo){
            System.out.println(i);
        }

    }
}
