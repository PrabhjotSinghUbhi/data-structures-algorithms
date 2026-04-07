package com.prabhjot.dsa.questions.cses.movie_festival_2;

import java.util.*;

public class Solution {

    static void movieFestivalII(int n, int k, List<long[]> a) {

        // Sort by END time
        a.sort(Comparator.comparingLong(x -> x[1]));

        TreeMap<Long, Integer> map = new TreeMap<>();

        // Initially all k watchers are free at time 0
        map.put(0L, k);

        int ans = 0;

        for (long[] movie : a) {
            long start = movie[0];
            long end = movie[1];

            // Find watcher available before or at start
            Long available = map.floorKey(start);

            if (available != null) {
                ans++;

                // Remove one watcher from that time
                int count = map.get(available);
                if (count == 1) map.remove(available);
                else map.put(available, count - 1);

                // Add watcher with new end time
                map.put(end, map.getOrDefault(end, 0) + 1);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 5, k = 2;

        List<long[]> a = Arrays.asList(
                new long[]{1, 5},
                new long[]{8, 10},
                new long[]{3, 6},
                new long[]{2, 5},
                new long[]{6, 9}
        );

        movieFestivalII(n, k, a);
    }
}