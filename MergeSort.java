import java.util.List;
import java.util.ArrayList;

public class MergeSort { 
    public static List<Integer> mergeSort(List<Integer> list) { 
        if (list.size() <= 1) { 
            return list; 
        }

        int middle = list.size() / 2; 
        List<Integer> left = new ArrayList<>(list.subList(0, middle));
        List<Integer> right = new ArrayList<>(list.subList(middle, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left , right);

    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) { 
        List<Integer> result = new ArrayList<>();
        int leftIndex = 0 , rightIndex = 0; 

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if(left.get(leftIndex) < right.get(rightIndex)) { 
                result.add(left.get(leftIndex));
                leftIndex++;
            } else { 
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        result.addAll(left.subList(leftIndex, left.size()));
        result.addAll(right.subList(rightIndex, right.size()));

        return result; 

    }
    public static void main (String[] args ) {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(50);
        unsortedList.add(150);
        unsortedList.add(100);
        unsortedList.add(200);
        unsortedList.add(300);
        unsortedList.add(250);
        System.out.println("Unsorted List: " + unsortedList);
        List<Integer> sortedList = mergeSort(unsortedList);
        System.out.println("Sorted List: " + sortedList);
    }

    /* 

    Bubble Sort appears to be a much more detailed function.
    We first need to import some important utilities/packages to ensure that bubblesort will work properly.
    Also we bubblesort we are creating seperate int(s) where as with Mergsort we are grouping everything into a list.
    Also with bubblesort we use other various methods like boolean isSorted to confirm if the array is sorted or not. 
    Mergesort is also good for creating arrays dealing with huge numbers and is very fast at doing so.
    Below I copied in some of my code from the last assignment to compare. 

    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileWriter;  
     
    public class BubbleSort {

        public static void swap(int[] array, int i, int j) { 
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    
        }
    
        public static void bubbleSort(int[] array) {
            bubbleSort(array, 0, array.length);
        }
    
        // 2 methods within the same class but with different parameter lists = overloading ^
        // the method name has been used multiple times.
    
        public static void bubbleSort(int[] array, int start, int end) {
            if (end - start <= 1 ) 
                return;
    
            for (int i = start; i < end - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            
            bubbleSort(array, start, end - 1);
    
    
    
        }


    }
    */






}