import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);

        //List<String> word = new ArrayList<>();
        System.out.println("please type the para or line u want to find from");
        String input1= sc.nextLine();
        System.out.println("please type the word u want to find");
        String input2 = sc.nextLine();
        int count =0;
        String[] wordsArray = input1.split("\\s+");
        for(int i =0; i< wordsArray.length;i++){
            if(wordsArray[i].equalsIgnoreCase(input2))
            {
                //System.out.println("string is found on position: ");
                count++;
            }

        }
        if(count == 0){
            throw new CustomException("string not found");
        }
        System.out.println("found with count value:" + count);


    }
}