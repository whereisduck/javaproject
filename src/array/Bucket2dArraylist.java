package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Bucket2dArraylist {
    /* public static int[] bucketSort(int[] arr, int k){
         int minval = Arrays.stream(arr).min().getAsInt();
         int maxval = Arrays.stream(arr).max().getAsInt();

         List<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>(k+1);
         //List<List<Integer>> bucket = new ArrayList<>(k+1);
         int size = (maxval - minval) / k;
         if (size ==0){
             size = 1;
         }
         List<Integer> result = new ArrayList(arr.length);
         for (int elem : arr){
             int index = (elem-minval)/size;
             //bucket.get(index).add(elem);

         }
         for (int i = 0; i <=k; i++){
             Collections.sort(bucket.get(i));
             result.addAll(bucket.get(i));
         }
         for (int i = 0; i< arr.length; i++){
             arr[i]= result.get(i);
         }
         return arr;}

     */
    public int[] bucketSort(final int[] arr, int k) {
        int minval = Arrays.stream(arr).min().getAsInt();
        int maxval = Arrays.stream(arr).max().getAsInt();

        List<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>(k + 1);
        for (int i = 0; i < k + 1; i++) {
            bucket.add(new ArrayList());
        }
        //List<List<Integer>> bucket = new ArrayList<>(k+1);
        int size = (maxval - minval) / k;
        if (size == 0) {
            size = 1;
        }
        List<Integer> result = new ArrayList(arr.length);
        for (int elem : arr) {
            int index = (elem - minval) / size;
            bucket.get(index).add(elem);

        }
        for (int i = 0; i <= k ; i++) {
            Collections.sort(bucket.get(i));
            result.addAll(bucket.get(i));
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        final int[] nums = {2, 4, 5, 7, 8, 0, 4, 0, 12, 89};
        new Bucket2dArraylist().bucketSort(nums,5);
        for (int num : nums) {System.out.print(" " + num);}




    }
}
/*
    // create an empty array list with an initial capacity
            ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

            // use add() method to add elements in the list
            arrlist.add(10);
            arrlist.add(22);
            arrlist.add(30);
            arrlist.add(40);

            // adding element 35 at fourth position
            arrlist.add(3, 35);

            // let us print all the elements available in list
            for (Integer number : arrlist) {
                System.out.println("Number = " + number);
            }
        }

 */


