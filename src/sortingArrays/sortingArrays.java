package sortingArrays;

import java.util.Arrays;
import java.util.Random;

public class sortingArrays {

    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort() {
        int nums[] = new int[50];
        int a = 0;
        for (int index = 0; index < nums.length; index++) {
            nums[index] = new Random().nextInt(0, 1000);
        }
        System.out.println("not sort:" + Arrays.toString(nums));
        for (int stopCount = 0; stopCount != nums.length - 1;) {
            stopCount = 0;
            for (int compareIndex = 0; compareIndex < nums.length; compareIndex++) {
                if (compareIndex == nums.length - 1) {
                    break;
                } else if (nums[compareIndex] > nums[compareIndex + 1]) {
                    a = nums[compareIndex];
                    nums[compareIndex] = nums[compareIndex + 1];
                    nums[compareIndex + 1] = a;
                } else {
                    stopCount++;
                }
            }
        }
        System.out.println("Bubble sort:" + Arrays.toString(nums));
    }
}

