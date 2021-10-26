import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class HeapSort {
    public static void main(String[] args) throws FileNotFoundException {
        final long startRunRec = System.currentTimeMillis();

        FileHandler fileData = new FileHandler(); // create obj from file handler/import its arrayList
        ArrayList<Integer> data = fileData.getData(); // get array from file handler

        SortHeap(data); // run the sorting algorithm

        final long calcRunRec = (System.currentTimeMillis() - startRunRec);
        System.out.println("\n>>> Finished with a runtime of " + calcRunRec + "ms");

    }

    public static void SortHeap(ArrayList<Integer> array) {
        // method for building heap using MaxHeapify
        System.out.println("\n>>> Sorting Heap...");

        MaxHeapify heapify = new MaxHeapify(); // create heapify object
        int size = array.size();

        //debug - before
        System.out.println("Array before: " + array);
        // loop for building heap
        for (int i = size / 2; i >= 0; i--) {
            //process the array using maxHeapify
            heapify.Process(array, size, i);
        }
        // extract max elem from heap and replaces with
        // last elem of the array;
        for (int i = size - 1; i >= 0; i--) {
            // use swap to switch
            // >> may not work;
            Collections.swap(array, 0, i);

            // call max heapify once again
            // (on the updated heap);
            heapify.Process(array, i, 0);
        }
        //debug - after
        System.out.println("Array after:  " + array +
                "\nDone! ");

    }
}