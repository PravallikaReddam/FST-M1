package Activities;
import java.util.*;

public class Activity2 {

    public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));

        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 10) {
                sum = sum + numArr[i];
            }

        }
        if (sum == 30) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}