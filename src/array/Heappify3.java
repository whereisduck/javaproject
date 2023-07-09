package array;

import java.util.Arrays;

public class Heappify3 {

    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 12, 15, 14, 9, 2, 3, 16};
        int N = arr.length;
        for (int i = (N/2) -1; i>=0; i--){
            new Heappify3().heapify(arr, i, N);
        }
        System.out.println(Arrays.toString((arr)));


    }
/*
    public void heapify(int arr[], int i, int N)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, largest, N);
        }
        //else return;
    }

 */


     public void heapify(int arr[], int i, int heapSize){
        int left = 2 * i +1;
        int right = 2* i + 2;
        int large = i ;
        if (left < heapSize && arr[left] > arr[large]){
            large = left;
        }
        if (right < heapSize && arr[right] > arr[large]){
            large = right;
        }
        if (large !=i){
            int temp = arr[i];
            arr[i] = arr[large];
            arr[large] = temp;
            heapify(arr, large, heapSize);
        }


    }
    static void heap(int[] arr, int rootIndex, int size){
         int left = 2 * rootIndex +1;
         int right = 2 * rootIndex + 2;
         int root = arr[rootIndex];
         int large = rootIndex;
         if (left < size && arr[left] > arr[rootIndex]){
             int temp = arr[rootIndex];
             arr[rootIndex] = arr[left];
             arr[left] = temp;
             large = left;

         }
         if (right < size && arr[right]> arr[rootIndex]){
             int temp = arr[rootIndex];
             arr[rootIndex] = arr[right];
             arr[right] = temp;
             large = right;
         }
         if (arr[rootIndex] != root){
             heap(arr, large, size);

         }
    }


}
