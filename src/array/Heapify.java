package array;

import java.util.Arrays;

public class Heapify {

  public static void main(String[] args) {




    int[] arr = {1, 4, 7, 12, 15, 14, 9, 2, 3, 16 };
    int node = (arr.length-1) / 2;
    new Heapify().maxHeapipy(arr, node);
    System.out.println(Arrays.toString(arr));

  }




        public void maxHeapipy (int[] arr, int node){
            //if (arr !=null && arr !=[]){

            if (node<0){
                return;
            }

            //int index = node;

                int left = 2 * node + 1;
                int right = 2 * node + 2;
                int heapSize = arr.length;
                if (left < heapSize && arr[left] > arr[node]) {
                    int temp = arr[left];
                    arr[left] = arr[node];
                    arr[node] = temp;
                }
                if (right < heapSize && arr[right] > arr[node]) {
                    int temp = arr[right];
                    arr[right] = arr[node];
                    arr[node] = temp;
                }
                maxHeapipy(arr, node - 1);






        }



}
/*
Before heapify: [1, 4, 7, 12, 15, 14, 9, 2, 3, 16]
After heapify: [16, 15, 14, 12, 4, 7, 9, 2, 3, 1]
After heapify: [16, 1, 14, 12, 4, 7, 9, 2, 3, 15]

 */