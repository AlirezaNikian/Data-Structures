//*************************************************
// Author: Alireza Nikian
// Faculty of Computer Engineering
// Islamic Azad University, Najafabad Branch
//
// class SortingAlgorithmsTest
//*************************************************

public class SortingAlgorithmsTest {
    public static void main(String[] args) throws EmptyMaxHeapException {
//        final int SIZE=100_000; // input size (problem size)
//        final int SIZE=200_000;
//        final int SIZE=1_000_000;
        final int SIZE=100_000_000;

        int[] a=new int[SIZE];

        for (int i = 0; i < a.length; i++) {
            a[i]=randomInteger(1,SIZE);
        }

        long start=System.currentTimeMillis();
        System.out.println("Please wait...");

//        heapSort(a);
//        exchangeSort(a);
//        bubbleSort(a);
//        selectionSort(a);
//        insertionSort(a);
//        java.util.Arrays.sort(a);
        java.util.Arrays.parallelSort(a);

        long end=System.currentTimeMillis();
        double elapsedTime=(end-start)/1000.0;
        System.out.println("Elapsed time (Sorting time): " + elapsedTime + " seconds");

    }

    public static int randomInteger(int min,int max) { // min<=max
        return min+(int)((max+1-min)*Math.random());
    }

    // Linearithmic or superlinear or log-linear algorithm (T(n)=O(nlogn))
    // O(nlogn)-time algorithm
    public static void heapSort(int[] a) throws EmptyMaxHeapException {
        MaxHeap heap=new MaxHeap();
        for (int i = 0; i < a.length; i++)
            heap.add(a[i]);
        for (int i = a.length-1; i >= 0 ; i--)
            a[i]=heap.removeMax();
    }

    // Quadratic or quadratic-time algorithm (T(n)=(n*(n-1))/2=O(n^2))
    // O(n^2)-time algorithm
    public static void exchangeSort(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            for (int j = i+1; j < a.length; j++)
                if(a[i]>a[j]) { // basic operation
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
    }

    public static void bubbleSort(int[] a) {
        for (int pass = 0; pass < a.length-1; pass++)
            for (int i = 0; i < a.length-1-pass; i++)
                if(a[i]>a[i+1]) {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int j = i;
            for (int k = i + 1; k < a.length; k++)
                if (a[k] < a[j])
                    j = k;
            if (i != j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

   public static void insertionSort(int[] a) {
        int i,j,next;
        for (i = 1; i < a.length; i++) {
            next=a[i];
            for (j = i - 1; j >= 0 && next < a[j]; j--)
                a[j+1] = a[j];
            a[j+1] = next;
        }
    }

}

/*

Quadratic Sorts --> Exchange Sort, Bubble Sort, Selection Sort, Insertion Sort

1 < logn < n < nlogn < n^2 < n^3 < 2^n
("<" is to be read as "is asymptotically smaller than")

*/
