package Activities;
import java.util.Arrays;
public class Activity4 {
    static void ascendingSort(int array[]) {
            int size = array.length, i;

            for (i = 1; i < size; i++) {
                int k = array[i];
                int j = i - 1;

                while (j >= 0 && k < array[j]) {
                    array[j + 1] = array[j];
                    --j;
                }
                array[j + 1] = k;
            }
        }

        public static void main(String args[]) {
            int[] data = { 6,5,2,8,1 };
            ascendingSort(data);
            System.out.println("Sorted Array in Ascending Order: ");
            System.out.println(Arrays.toString(data));
        }

}
