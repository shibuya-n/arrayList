import java.util.*;

public class returnInput {
    static ArrayList<Integer> userInput = new ArrayList<Integer>();
    public static ArrayList<Integer> returnArray(){
        boolean isQ = false;
        while (!isQ){
            System.out.println("Please enter anything: ");
            String input = Main.getInput();
            if (input.equals("q")){
                isQ = true;
            }
            else{
                try {
                    userInput.add(Integer.parseInt(input));
                } catch (Exception e){
                    System.out.println("Was not number, passed");
                }
            }
        }
        double toReturn = 0;
        for (int i = 0; i < userInput.size(); i++){
            toReturn += userInput.get(i);

        }
        Collections.sort(userInput);
        return userInput;
    }

    }

