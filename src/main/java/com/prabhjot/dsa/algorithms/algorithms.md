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