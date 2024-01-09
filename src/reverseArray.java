import java.util.ArrayList;

public class reverseArray {

    static ArrayList<String> userInputs = new ArrayList<>();
    static int num = 0;
    public static void fillArray(){
        System.out.println("How many items in your array?");
        num = Integer.parseInt(Main.getInput());

        for (int i = 0; i < num; i++){
            System.out.println("What would you like to add?");
            String x = Main.getInput();
            userInputs.add(x);
        }
    }

    public static void reverse(){
        ArrayList<String> newInput = new ArrayList<>();
        for (int i = userInputs.size() -1 ; i >= 0; i--){
            String temp = userInputs.get(i);
            newInput.add(temp);
        }
       System.out.println(newInput);

    }
}
