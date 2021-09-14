package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {
        Employee employee= new Employee("Maninder",28);
        Employee employee1= new Employee("Gurjeet",29);
        Employee employee2= new Employee("Deep",26);
        Employee employee3= new Employee("Sandeep",30);

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

       // Collections.sort(employeeList,(employee4,employee5)->employee4.getName().compareTo(employee5.getName()));

        for(Employee employ: employeeList){
            System.out.println(employ.getName());
        }
        UpperConcat uc= (s1,s2)->s1.toUpperCase()+" "+s2.toUpperCase();
        String sillyString= doStringStuff(uc,employeeList.get(2).getName(),employeeList.get(1).getName());
        System.out.println(sillyString);

    }
    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
    }
}


class Employee{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat{
    public String upperAndConcat(String s1,String s2);
}

