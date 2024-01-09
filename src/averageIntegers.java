import java.util.ArrayList;

public class averageIntegers {

    static ArrayList<Integer> userInput = new ArrayList<>();

    public static double takeInput(){

        boolean isEnd = false;
        while (!isEnd){
            System.out.println("Please enter anything:  (q to quit)" ) ;
            String input = Main.getInput();
            if (input.equals("end")){
                isEnd = true;
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
        return (toReturn/userInput.size());
    }


}
