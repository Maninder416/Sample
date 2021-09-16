package serialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SerilizationExample {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.setName("Gurjeet");
        emp.setId(100);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/manindersingh/Downloads/testing11.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(emp);
            System.out.println("Serilization Done");
            outputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
