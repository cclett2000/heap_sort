import java.util.ArrayList;
import java.util.Collections;

public class MaxHeapify {
    MaxHeapify(){
        System.out.println("Running MaxHeapify...");
    }

    // convert array to maxHeap? --kinda
     void Process(ArrayList<Integer> array, int size, int index){
        /*
         * This sorts each node set within the heap?
         * Guess this is the first sorting step, will probably
         * join each node set later and sort that way?
         *
         * index should be the parent, left and right should be the children
         *
         * I assume that the array is partitioned into sets of three (if able) where:
         *  - 1st = parent
         *  - 2nd = L. child
         *  - 3rd = R. child
         *
         * then each set is sorted so that the parent is the largest value?
         *  ^probably wrong, need to check later
         * MAXHEAP = each parent node must be larger than its respective child nodes
         * MAXHEAPIFY = organizes the array so the MAXHEAP rule isn't violated
         */

        // heap tree positions
        // https://www.educative.io/edpresso/how-to-build-a-heap-from-an-array
        int PARENT = index; // largest root init? largest index
        int LEFT = 2 * index + 1;
        int RIGHT = 2 * index + 2;

        // Select largest index in comparison to LEFT?
        // sets largest (parent) to left child if left > root
        if (LEFT <= size - 1 && array.get(LEFT) > array.get(PARENT)){
            PARENT = LEFT;
        }

        // select RIGHT as largest index if true
        // sets parent to right child if right > root
        if (RIGHT <= size - 1 && array.get(RIGHT) > array.get(PARENT)){
            PARENT = RIGHT;
        }

        // debugging (largest|index)
        // System.out.println(PARENT + "|" + index);

        // replace index with largest value
        // swap largest ind and selected ind
        // if any of the ifs are triggered
        if (PARENT != index){
            // exchange largest value and index
            Collections.swap(array, index, PARENT); //completes exchange between largest index and index
            Process(array, size, PARENT); // call heapify method again

        }



    }
}
