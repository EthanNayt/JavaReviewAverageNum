import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        //numbers
//        int[] nums = {8, 8 ,10};
//
//        float sum = 0;
//
//        //compute sum
//        int i=0;
//        while(i < nums.length) {
//            sum += nums[i];
//            i++;
//        }
//
//        float average = (sum / nums.length);
//
//        System.out.println("Average : "+average);

        int firstNum;
        int secondNum;
        int thirdNum;

        System.out.println("Enter a number: ");
        Scanner firstNumInput = new Scanner(System.in);
        firstNum = Integer.parseInt(firstNumInput.nextLine());
        secondNum = Integer.parseInt(firstNumInput.nextLine());
        thirdNum = Integer.parseInt(firstNumInput.nextLine());

        int finalNum = (firstNum + secondNum + thirdNum)/3;
        
        System.out.println(finalNum);


        }

}
