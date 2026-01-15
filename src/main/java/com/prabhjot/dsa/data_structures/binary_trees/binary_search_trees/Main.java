package com.prabhjot.dsa.data_structures.binary_trees.binary_search_trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = {15, 10, 20, 5, 12};
        bst.populate(nums);
        bst.display();
        bst.preOrder();
        System.out.println();
        bst.inOrder();
    }
}
