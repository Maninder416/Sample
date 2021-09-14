package Map;

public class TwoArray {

    public void test() {
        int[][] temp = {{10, 20, 30}, {40, 50, 60}};
        for(int y=0;y< temp.length;y++){
            System.out.println();
            for(int z=0;z<temp[y].length;z++){
                System.out.print(" "+temp[y][z]);
            }
        }
    }
    public static void main(String[] args) {
        TwoArray twoArray= new TwoArray();
        twoArray.test();


    }
}
