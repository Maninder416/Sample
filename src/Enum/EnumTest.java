package Enum;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day=day;
    }

    public void TestingMethod(){
        switch (day){
            case MONDAY:
                System.out.println("Today is Monday. Boring day");
                break;
            case TUESDAY:
                System.out.println("Tuesday is good");
                break;
            default:
                System.out.println("These days are not good");
        }
    }

    public static void main(String[] args) {
        EnumTest enumTest= new EnumTest(Day.MONDAY);
        enumTest.TestingMethod();
    }

}
