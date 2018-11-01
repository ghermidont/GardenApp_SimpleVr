import java.util.Scanner;

public class GardenApp {
    //HW transform the app so it will ahve 4 classes
    // Application(main)
    //Garden <<< array[] // include show();
    //Land, Corn, Potato <<<< Thing is the superclass for Land, Corn, Potato
    //Get the same result but using calsses and objects.
    //Garden g = new Garden(20); // this.array = new Thing[20];
    // g.show()
    //Corn -> object - > quantity
    //g.plant(where - int, what - Potato )
    public static void main(String[] args) {
        // '.' - land
        // 'Y' - corn
        //'o' - potato

        final float PRICE_CORN = 50.00F;
        final float PRICE_POTATO = 10.00F;
        float total = 00.00F;

        Scanner in = new Scanner(System.in);

        System.out.println("Where to?");
            int where = in.nextInt();
        System.out.println("What?");
            int what = in.nextInt();

        char[] garden = {'.','.','.','Y','Y','Y','o','o','o','o'};

        if ( what == '1' ) garden[ where ] = '0';
        if ( what == '2' ) garden[ where ] = 'Y';

        for(char c : garden){

            if(c=='Y')total+=PRICE_CORN;
            else if (c=='.')total+=PRICE_POTATO;
            System.out.print(total);
        }
    }

}
