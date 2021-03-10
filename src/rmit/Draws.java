// This part was done by Dang Khoi (s3694603) and Dong Vu Minh Phuc (s3700622)
// Pair Programming

package rmit;

import java.util.Arrays;

public class Draws {
    public static void draw(int numbers){
        long count = 0; //Number of lotteries generated
        int times_won = 0; //Number of times won

        for (int i = 0; i < 5; i++) {   //Looping the draw 5 times
            int[] origArray = arrayGen(numbers);   //Generating the winning numbers
//        System.out.println(Arrays.toString(origArray));
            int[] newArray = new int[6];    //Generating user lottery numbers
            while (!Arrays.equals(origArray, newArray)) {
//            System.out.println(Arrays.toString(newArray));
                count++;    //Increasing count
                newArray = arrayGen(numbers);  //Generating new numbers
            }
            times_won++;    //Once loop is completed, increases the times won by 1
            System.out.println("The winning numbers were:");
            System.out.println(Arrays.toString(origArray)); //Prints the winning numbers
        }
        System.out.println("Lottery was drawn " + times_won + " times");
        System.out.println("On average, one must buy " + count + " times in order to win");
        System.out.println();
    }

    public static int[] arrayGen(int numbers){
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * numbers);
        }
        return array;
    }
}
