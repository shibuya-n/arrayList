import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static boolean done = false;
    public static void main(String[] args) {
        while (!done) {



            System.out.println("What do you want to do?");
            System.out.println("1. Reverse Contents");
            System.out.println("2. Taking User Input until end is entered");
            System.out.println("3. Record user inputted numbers and output the sorted version");
            System.out.println("ENTER ANYTHING TO QUIT");

            String response = getInput();

            if (response.equals("1")){
                reverseArray.fillArray();
                reverseArray.reverse();
            }
            else if (response.equals("2")){
                System.out.println(averageIntegers.takeInput());

            }
            else if (response.equals("3")){
                System.out.println(returnInput.returnArray());




            }


            else {
                done = true;
                System.out.println("Good bye!");
            }
        }
    }


    public static String getInput(){
        Scanner x = new Scanner(System.in);
        return x.nextLine().toLowerCase().strip();
    }
}