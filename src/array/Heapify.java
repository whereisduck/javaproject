package array;

import java.util.Arrays;

public class Heapify {

    public static void main(String[] args) {


        int arr[] = {1, 4, 7, 12, 15, 14, 9, 2, 3, 16};
        //int node = arr.length / 2 - 1;
        int N= arr.length ;
        for (int i = (N / 2) - 1; i >=0; i--){
        new Heapify().maxHeapipy(arr, i, N);}
        System.out.println(Arrays.toString(arr));

    }







    public void maxHeapipy(int arr[], int node, int N)
    {
        //if (arr !=null && arr !=[]){


        //while(node <= arr.length / 2 -1)  {

            //int index = node;

            int left = 2 * node + 1;
            int right = 2 * node + 2;
            int large = node;
            //int heapSize = arr.length;
            if (left < N && arr[left] > arr[large]) {
                large = left;

            }
            if (right < N && arr[right] > arr[large]) {
                large = right;
            }
            if (large != node) {
                int temp = arr[node];
                arr[node] = arr[large];
                arr[large] = temp;
                //node = largest;
                maxHeapipy(arr, large, N);
            }

        }

    
}
/*
Before heapify: [1, 4, 7, 12, 15, 14, 9, 2, 3, 16]
After heapify: [16, 15, 14, 12, 4, 7, 9, 2, 3, 1]
After heapify: [16, 1, 14, 12, 4, 7, 9, 2, 3, 15]

 */