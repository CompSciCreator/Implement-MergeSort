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
    public static void main(String[] args) throws Exception {
        int [] array = createRandomArray(10);

        writeArrayToFile(array, "array.txt");
        System.out.println(isSorted(array));
        System.out.println(Arrays.toString(array));

       // We now have a method recalling itself again and again = recursion. ^ 
       
        bubbleSort(array); 
        writeArrayToFile(array, "sorted_array.txt");
        System.out.println(isSorted(array));
        System.out.println(Arrays.toString(array));

    }
    
    public static boolean isSorted(int[] array) { 
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false; 

            }
        return true;
    }

    public static void writeArrayToFile(int[] array, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
            for (int i = 0; i < array.length; i++) {

        }
        fileWriter.close();
    }

    public static int[] readArrayFromFile(String fileName) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(new File(fileName));

        ArrayList<Integer> arrayList = new ArrayList< >();
        while (scanner.hasNextLine()); { 
            arrayList.add(scanner.nextInt());

        }
        scanner.close();
        int [] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    
    }


    public static int[] createRandomArray(int length) {
        int[] array = new int[length];
        Random Random = new Random(length);
        for (int i = 0; i < array.length; i++) {
            array[i] = Random.nextInt(100);

        }
        return array; 

    }
    










}








