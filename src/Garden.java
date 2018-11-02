import java.util.Scanner;

public class Garden {

    corn corn = new corn();
    potatoes potatoes = new potatoes();

    private float total;

    private char[] garden = {'_', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
    private char[] gardenOrder = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    Scanner usrInput = new Scanner(System.in);

    public void start() {
        showGarden();
        System.out.println("\n\n    For now we have an empty garden...Hmm..~_~.Not very interesting. But how about we plant something?\n" +
                "   Then we can sell all our harvest...and we will be rich!!! We have potatoes and corn seed...You can\nchose which of" +
                "the cultures you want to plan and where on the filed.\n   First you will have to chose on which of the portion of the\n" +
                "field you want to plant by choosing a number from 0 to 9 and the you choose what you want to plant by choosing\n" +
                "typing \'p\' for patatos and \'c\' for corn.\n\nOk so let\'s get started. Shall we partner...!?\n\'y\' is for Yes and \'n\' is fo No.\n");

        String yesOrNo = usrInput.next();
        switch (yesOrNo) {
            case "y": {
                requestInput();
                break;
            }
            case "n": {
                System.out.println("OK....BYE BYE you lazy bone!");
                break;
            }
            default:
                System.err.println("Please input a valid character...");
        }
    }

  private void requestInput(){

     for(;;) {
         System.out.println("\nWhere to plant?");
         int where = usrInput.nextInt();
         System.out.println("\nWhat? 1.corn, 2.potato");
         int what = usrInput.nextInt();

         if(garden[where]=='_') {
            if (what == 1) garden[where] = 'c';
            if (what == 2) garden[where] = 'p';
         }else{
             System.out.println("This spot is already occupied!! Chose another place.");
             showGarden();
             requestInput();
         }

         showGarden();

         System.out.println("\nWant to plant more? \'y\' for Yes and \'n\' for No.");
         String plantMore = usrInput.next();

         switch (plantMore) {
             case "y": {
                 requestInput();
                 break;
             }case "n":{
                 System.out.println("OK...so let\'s see what is our income!");
                 calculateTotalIncome();
                 break;
             }default:
                System.err.println("Please input a valid character...");
                requestInput();
         }
        if(plantMore.equals("n"))break;
     }

  }

  private void showGarden(){
      System.out.println("   * The Garden *   ");
      for(int i=0; i<garden.length; i++){
         System.out.print(garden[i]);
         System.out.print(" ");
      }

      System.out.println("");

      for(int i=0; i<gardenOrder.length; i++){
          System.out.print(gardenOrder[i]);
          System.out.print(" ");
      }
  }

  private void calculateTotalIncome() {
       for (char c : garden) {
           if (c == 'p') total += potatoes.PRICE_POTATO;
           if (c == 'c') total += corn.PRICE_CORN;
       }
      System.out.println("Our total income is: " + total + " $\n" + "Congrats!! Partner..");
  }

}
