public class Main {
    public static void main(String[] args) {
        // cycle sort
//        Intro
        /*
            The basic idea behind cycle sort is to divide the input array into cycles, where each cycle consists of elements that belong to the same position in the sorted output array. The algorithm then performs a series of swaps to place each element in its correct position within its cycle, until all cycles are complete and the array is sorted.
         */

//        Algorithm
        /*
           1. Start with an unsorted array of n elements.
           2. Initialize a variable, cycleStart, to 0.
           3. For each element in the array, compare it with every other element to its right. If there are any elements that are smaller than the current element, increment cycleStart.
           4. If cycleStart is still 0 after comparing the first element with all other elements, move to the next element and repeat step 3.
           5. Once a smaller element is found, swap the current element with the first element in its cycle. The cycle is then continued until the current element returns to its original position.
         */



    }
}