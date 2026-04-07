package com.prabhjot.dsa.questions.gfg.stack.knapsack_problem_1_0;

public class BruteForce {
    public static void main(String[] args) {
        int w = 4;
        int[] p = {1, 2, 3};
        int[] wt = {4, 5, 1};

        int ans = knapsack(w, p, wt, 3);
        System.out.println(ans);
    }

    private static int knapsack(int W, int[] p, int[] wt, int n) {

        // length or weight is zero => return 0.
        //No items left OR
        //No capacity left
        if (n == 0 || W == 0)
            return 0;

        // if wt can be added => 1. add it, 2. don't add it.
        // take the maximum of those values.
        if (wt[n - 1] <= W) {
            return Math.max(
                    p[n - 1] +
                            knapsack(W - wt[n - 1], p, wt, n - 1), //take it
                    knapsack(W, p, wt, n - 1) //skip it.
            );
        } else {
//           If weight exceeds capacity → only option is to skip.
            return knapsack(W, p, wt, n - 1);
        }

    }
}
