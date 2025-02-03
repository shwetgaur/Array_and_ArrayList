package ArrayFunctions;
import java.util.ArrayList;

public class ArrayFunctions {
    public void DisplayArray(ArrayList<Integer> arr) {
        System.out.println("Array elements are: " + arr);
    }

    public void Distribute() {
        UserInput in = new UserInput();
        int[] arr = in.arrayInput();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        DisplayArray(evenList);
        DisplayArray(oddList);
    }

    public int Difference() {
        UserInput in = new UserInput();
        int[] arr = in.arrayInput();
        ArrayList<Integer> al = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            al.add(diff);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        DisplayArray(al);
        return minIndex;
    }

    
}
