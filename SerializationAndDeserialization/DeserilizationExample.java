package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserilizationExample {
    public static void main(String[] args) {
        Employee employee= new Employee();
        try{
            FileInputStream inputStream= new FileInputStream("/Users/manindersingh/Downloads/testing11.txt");
            ObjectInputStream objectInputStream= new ObjectInputStream(inputStream);
            employee= (Employee) objectInputStream.readObject();
            objectInputStream.close();
            inputStream.close();
            System.out.println("Deserialization is Done");
            System.out.println("Employee name is: "+employee.getName());
            System.out.println("Id is: "+employee.getId());

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
