package com.prabhjot.questions.cses.weird_algorithm;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringBuilder sb = new StringBuilder();
        long n = sc.nextInt();
        while (n != 1) {
            sb.append(n).append(" ");
            n = (n % 2) == 0 ? n / 2 : n * 3 + 1;
        }
        sb.append(1);
        out.println(sb);
        out.flush();
    }
}
