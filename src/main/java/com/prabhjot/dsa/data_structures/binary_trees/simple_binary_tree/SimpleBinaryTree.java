package com.prabhjot.dsa.data_structures.binary_trees.simple_binary_tree;

import java.util.Scanner;

class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

}

public class SimpleBinaryTree {

    Node root;

    public void display() {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-->" + node.val);
        } else {
            System.out.println(node.val);
        }
        display(node.left, level + 1);
    }


    public void populate(Scanner scanner) {
        System.out.println("Enter the root node.");
        int rootVal = scanner.nextInt();
        root = new Node(rootVal);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {
        System.out.print("Do you want to enter the left Node of " + node.val + " or -1 if none: ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.print("Enter the value of left of " + node.val + " : ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.print("Do you want to enter the right Node of " + node.val + "-1 if none : ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.print("Enter the value of right of " + node.val + " : ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

}
