# MergeSort Readme

## Introduction
This is a Java implementation of the Merge Sort algorithm. Merge Sort is a popular and efficient sorting algorithm known for its stability and ability to handle large data sets. It operates by dividing an unsorted list into smaller sublists, sorting them, and then merging them back together.

## Code Overview
The code consists of a single Java class named `MergeSort`. This class contains the following methods:

### `public static List<Integer> mergeSort(List<Integer> list)`
This method is the entry point for the Merge Sort algorithm. It takes an unsorted list of integers as input and returns a new list containing the sorted integers. If the input list has one or zero elements, it is considered already sorted, and the original list is returned. Otherwise, the list is recursively divided into smaller sublists until it is small enough to be merged.

### `private static List<Integer> merge(List<Integer> left, List<Integer> right)`
This private method is used by `mergeSort` to merge two sorted sublists, `left` and `right`, into a single sorted list. It iterates through the sublists, comparing the elements and adding them to the result list in ascending order.

### `public static void main(String[] args)`
The `main` method is used to demonstrate the functionality of the Merge Sort algorithm. It creates an unsorted list of integers, sorts it using `mergeSort`, and then prints both the unsorted and sorted lists to the console.

## Usage
To use this code in your Java project, follow these steps:

1. Copy the `MergeSort.java` file into your project directory.

2. Import the necessary Java libraries if not already imported:

   ```java
   import java.util.List;
   import java.util.ArrayList;
   ```

3. Create an instance of the `MergeSort` class or use its static methods directly.

   ```java
   MergeSort sorter = new MergeSort();
   List<Integer> unsortedList = new ArrayList<>();
   // Add integers to the unsortedList
   List<Integer> sortedList = sorter.mergeSort(unsortedList);
   ```

4. Run your program, and the `mergeSort` method will return a sorted list.

## Example
Here's a simple example of how to use the `MergeSort` class:

```java
public static void main(String[] args) {
    List<Integer> unsortedList = new ArrayList<>();
    unsortedList.add(50);
    unsortedList.add(150);
    unsortedList add(100);
    unsortedList.add(200);
    unsortedList.add(300);
    unsortedList.add(250);

    System.out.println("Unsorted List: " + unsortedList);

    MergeSort sorter = new MergeSort();
    List<Integer> sortedList = sorter.mergeSort(unsortedList);

    System.out.println("Sorted List: " + sortedList);
}
```

This will output:

```
Unsorted List: [50, 150, 100, 200, 300, 250]
Sorted List: [50, 100, 150, 200, 250, 300]
```

## Conclusion
The Merge Sort algorithm is a powerful and efficient way to sort lists of data. The `MergeSort` class provided in this code can be integrated into your Java projects to sort lists of integers. Enjoy using this code for your sorting needs!
