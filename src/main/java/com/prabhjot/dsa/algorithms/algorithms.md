# 📚 Algorithms Documentation

This document serves as a growing repository of algorithms implemented as part of the data structures and algorithms project. It will be updated regularly as new algorithms are added. 🚀

---

## 1. 🔍 Linear Search

### 📝 Description
Linear Search is a simple search algorithm that checks every element in a list sequentially until the desired element is found or the list ends.

### 🛠️ Algorithm Steps
1. Start from the first element of the list.
2. Compare the current element with the target element.
3. If the current element matches the target, return its index.
4. If the target is not found by the end of the list, return -1.

### ⏱️ Time Complexity
- **Best Case:** O(1) (🎯 Target is the first element)
- **Worst Case:** O(n) (🔚 Target is the last element or not present)

### 💾 Space Complexity
- O(1) (No additional space is used)

### 💻 Implementation (Java)
```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // 🎯 Target found, return index
            }
        }
        return -1; // ❌ Target not found
    }
}
```

---

## 2. 🚴‍♂️ Cycle Sort

### 📝 Description
Cycle Sort is an in-place sorting algorithm that minimizes the number of writes to the array. It places each element at its correct position by cycling through the elements.

### 🛠️ Algorithm Steps
1. Loop through the array to place each element at its correct position.
2. If an element is not in its correct position, swap it with the element at its target position.
3. Continue until all elements are in their correct positions.

### ⏱️ Time Complexity
- **Best Case:** O(n^2) (Few cycles)
- **Worst Case:** O(n^2) (Many cycles)

### 💾 Space Complexity
- O(1) (In-place sorting)

### 💻 Implementation (Java)
```java
public class CycleSort {
    public int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
```

---

## 3. 🔢 Leetcode Problems Using Cycle Sort

### 3.1 Set Mismatch (Leetcode 645)
Find the duplicate and missing numbers in an array.
- **Implementation:** `SetMismatch.java`

### 3.2 Missing Number (Leetcode 268)
Find the missing number in an array of size `n` containing numbers from `0` to `n`.
- **Implementation:** `MissingNumber.java`

### 3.3 Duplicate Numbers
Find all duplicate numbers in an array.
- **Implementation:** `DuplicateNumbers.java`

### 3.4 Duplicate Number
Find the single duplicate number in an array.
- **Implementation:** `DuplicateNumber.java`

### 3.5 Disappeared Numbers (Leetcode 448)
Find all numbers that are missing from an array.
- **Implementation:** `DisappearedNumbers.java`

---

## 4. 🔢 Sorting Algorithms

### 4.1 Bubble Sort
Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
- **Time Complexity:** O(n^2)
- **Space Complexity:** O(1)
- **Implementation:** `BubbleSort.java`

### 4.2 Selection Sort
Selection Sort divides the array into a sorted and unsorted region, repeatedly selecting the smallest element from the unsorted region.
- **Time Complexity:** O(n^2)
- **Space Complexity:** O(1)
- **Implementation:** `SelectionSort.java`

### 4.3 Insertion Sort
Insertion Sort builds the sorted array one element at a time by repeatedly picking the next element and inserting it into its correct position.
- **Time Complexity:** O(n^2)
- **Space Complexity:** O(1)
- **Implementation:** `InsertionSort.java`

### 4.4 Merge Sort
Merge Sort is a divide-and-conquer algorithm that splits the array into halves, sorts each half, and then merges them.
- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n)
- **Implementation:** `MergeSort.java`

### 4.5 Quick Sort
Quick Sort is a divide-and-conquer algorithm that selects a pivot and partitions the array around the pivot.
- **Time Complexity:** O(n log n) (average case)
- **Space Complexity:** O(log n)
- **Implementation:** `QuickSort.java`

---

## 5. 🔍 Binary Search

### 📝 Description
Binary Search is an efficient algorithm for finding an item from a sorted list of items by repeatedly dividing the search interval in half.

### 🛠️ Algorithm Steps
1. Start with the middle element of the sorted array.
2. If the target matches the middle element, return its index.
3. If the target is smaller, search the left half; otherwise, search the right half.
4. Repeat until the target is found or the interval is empty.

### ⏱️ Time Complexity
- **Best Case:** O(1) (🎯 Target is the middle element)
- **Worst Case:** O(log n)

### 💾 Space Complexity
- O(1) (Iterative approach)

### 💻 Implementation (Java)
```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid; // 🎯 Target found
            } else if (arr[mid] < target) {
                start = mid + 1; // 🔍 Search right half
            } else {
                end = mid - 1; // 🔍 Search left half
            }
        }
        return -1; // ❌ Target not found
    }
}
```

### 5.1 Variants of Binary Search
- **First Occurrence:** Find the first occurrence of a target in a sorted array.
- **Last Occurrence:** Find the last occurrence of a target in a sorted array.
- **Implementation:** `BinarySearchVariants.java`