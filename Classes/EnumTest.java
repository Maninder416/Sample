package Classes;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSSDAY,FRIDAY,SATURDAY
}

public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day=day;
    }

    public void WeekMethod(){
        switch (day){
            case SUNDAY:
                System.out.println("Day is sunday");
                break;
            case MONDAY:case TUESDAY:case WEDNESDAY:case THURSSDAY:case FRIDAY:
                System.out.println("weekdays");
                break;
            case SATURDAY:
                System.out.println("Day is Saturday");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest t1=new EnumTest(Day.MONDAY);
        t1.WeekMethod();
        EnumTest t7= new EnumTest(Day.SATURDAY);
        t7.WeekMethod();
    }
}
