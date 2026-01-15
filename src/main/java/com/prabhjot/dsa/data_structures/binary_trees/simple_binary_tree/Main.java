package com.prabhjot.dsa.data_structures.binary_trees.simple_binary_tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleBinaryTree bt = new SimpleBinaryTree();
        Scanner scanner = new Scanner(System.in);
        bt.populate(scanner);
        bt.display();
    }
}
