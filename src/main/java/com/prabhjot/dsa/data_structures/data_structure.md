# 🚀 Data Structures Overview

Welcome to the **Data Structures Playground**! 🎉 This document provides an overview of the data structures implemented in this project and their awesome functionalities. Let's dive in! 🌊

## 🔗 Linked List
A **Linked List** is a linear data structure where elements (nodes) are connected using pointers. It comes in two main types: **Singly Linked List** and **Doubly Linked List**.

### 🔗 Singly Linked List
A **Singly Linked List** is a linear data structure where each element (node) points to the next node in the sequence. It's perfect for dynamic memory allocation and efficient insertion/deletion operations. 🛠️

#### 🌟 Features Implemented
- **Insertion** ➕
  - At the beginning of the list. 🏁
  - At the end of the list. 🏁
  - At a specific position in the list. 📍
- **Deletion** ❌
  - From the beginning of the list. 🏁
  - From the end of the list. 🏁
  - From a specific position in the list. 📍
- **Searching** 🔍
  - Find the index of the first occurrence of a value. 🧐
- **Reversal** 🔄
  - Reverse the entire list in place. 🔃
- **Utility** 🛠️
  - Check if the list is empty. ❓
  - Display the elements of the list. 👀
  - Retrieve the size of the list. 📏

---

### 🔗 Doubly Linked List
A **Doubly Linked List** is a linear data structure where each node contains references to both the previous and the next node. This allows traversal in both directions. 🔄

#### 🌟 Features Implemented
- **Insertion** ➕
  - At the beginning of the list. 🏁
  - At the end of the list. 🏁
  - At a specific position in the list. 📍
- **Deletion** ❌
  - From the beginning of the list. 🏁
  - From the end of the list. 🏁
  - From a specific position in the list. 📍
- **Reversal** 🔄
  - Reverse the entire list in place. 🔃
- **Utility** 🛠️
  - Display the elements of the list. 👀
  - Retrieve the size of the list. 📏

#### ⏱️ Time and Space Complexities
| Operation            | Time Complexity | Space Complexity |
|----------------------|-----------------|------------------|
| Insertion at Head    | O(1)            | O(1)             |
| Insertion at Tail    | O(1)            | O(1)             |
| Insertion at Position| O(n)            | O(1)             |
| Deletion at Head     | O(1)            | O(1)             |
| Deletion at Tail     | O(1)            | O(1)             |
| Deletion at Position | O(n)            | O(1)             |
| Reversal             | O(n)            | O(1)             |
| Search               | O(n)            | O(1)             |
| Display              | O(n)            | O(1)             |
| Get Size             | O(1)            | O(1)             |

#### 💡 Usage
- **Bidirectional Traversal**: Nodes can be traversed in both forward and backward directions. 🔄
- **Efficient Operations**: Insertion and deletion operations are efficient compared to arrays, especially for large datasets. ⚡

#### 📝 Example
```java
DoublyLinkedList dl = new DoublyLinkedList();
dl.insertAtFirst(10);
dl.insertAtLast(20);
dl.insertAt(15, 1);
dl.display(); // Output: HEAD <-> 10 <-> 15 <-> 20 <-> TAIL
dl.reverse();
dl.display(); // Output: HEAD <-> 20 <-> 15 <-> 10 <-> TAIL
```

---

### 🔗 Circular Linked List
A **Circular Linked List** is a linear data structure where the last node points back to the first node, forming a circle. This allows continuous traversal of the list.

#### 🌟 Features Implemented
- **Insertion** ➕
  - At the beginning of the list. 🏁
  - At the end of the list. 🏁
- **Deletion** ❌
  - From the beginning of the list. 🏁
  - From the end of the list. 🏁
- **Searching** 🔍
  - Check if a value exists in the list. 🧐
- **Utility** 🛠️
  - Display the elements of the list. 👀
  - Retrieve the size of the list. 📏

#### ⏱️ Time and Space Complexities
| Operation            | Time Complexity | Space Complexity |
|----------------------|-----------------|------------------|
| Insertion at Head    | O(1)            | O(1)             |
| Insertion at Tail    | O(1)            | O(1)             |
| Deletion at Head     | O(1)            | O(1)             |
| Deletion at Tail     | O(n)            | O(1)             |
| Search               | O(n)            | O(1)             |
| Display              | O(n)            | O(1)             |
| Get Size             | O(n)            | O(1)             |

#### 💡 Usage
- **Continuous Traversal**: The circular nature allows traversal to loop back to the start. 🔄
- **Efficient Operations**: Insertion and deletion at the head are efficient. ⚡

#### 📝 Example
```java
CircularLinkedList cl = new CircularLinkedList();
cl.insertAtFirst(10);
cl.insertLast(20);
cl.insertAtFirst(5);
cl.display(); // Output: Head -> 5 -> 10 -> 20 -> Head (circular)
cl.deleteFirst();
cl.deleteLast();
cl.display(); // Output: Head -> 10 -> Head (circular)
```

---

## 🔮 Future Enhancements
- Explore other data structures like **Stacks** 📚, **Queues** 🛤️, **Trees** 🌳, and **Graphs** 🗺️.
- Optimize algorithms for better performance. 🚀

---

🎯 **Keep Learning, Keep Growing!** 🌱
