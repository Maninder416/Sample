package Enum;

enum Dirrection{
    NORTH,SOUTH,EAST,WEST
}

public class PracticeEnum {
    Dirrection dirrection;

    public PracticeEnum(Dirrection dirrection){
        this.dirrection= dirrection;
    }

    public void TestingDirrection(){
        switch (dirrection){
            case EAST:
                System.out.println("Dirrection is east");
                break;
            case NORTH:
                System.out.println("North dirrection");
            case SOUTH:
                System.out.println("South dirrection");
            case WEST:
                System.out.println("West dirrection");
                break;
        }
    }

    public static void main(String[] args) {
        PracticeEnum practiceEnum= new PracticeEnum(Dirrection.EAST);
        practiceEnum.TestingDirrection();
    }
}
