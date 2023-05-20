package array;

public class Sorting {

    class QuickSort {
        private int partition(int[] arr, int low, int hight) {
            int pivolt = arr[(hight - low) / 3];
            int i = low;

            for (int j = low; j < hight; j++) {
                if (arr[j] < arr[hight]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }


            }
            int temp = arr[i];
            arr[i] = arr[hight];
            arr[hight] = temp;
            return i;

        }

        private void quickSort(int[] arr, int low, int hight) {
            if (low < hight) {


                int pi = partition(arr, low, hight);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, hight);


            }
        }

        public int[] sortArray(int[] nums) {


            quickSort(nums, 0, nums.length - 1);
            return nums;

        }
    }

    class MergeSort {
        private void merge(int[] arr, int left, int right, int mid, int[] tempArr) {
            int start1 = left;
            int start2 = mid + 1;
            int s1 = mid - left + 1;
            int s2 = right - mid;
            for (int i = left; i <= right; i++) {
                tempArr[i] = arr[i];
            }
            int i = 0, j = 0, k = left;
            while (i < s1 && j < s2) {
                if (tempArr[start1 + i] <= tempArr[start2 + j]) {
                    arr[k] = tempArr[start1 + i];
                    i += 1;
                } else {
                    arr[k] = tempArr[start2 + j];
                    j += 1;
                }
                k += 1;
            }

            // Copy remaining elements
            while (i < s1) {
                arr[k] = tempArr[start1 + i];
                i += 1;
                k += 1;
            }
            while (j < s2) {
                arr[k] = tempArr[start2 + j];
                j += 1;
                k += 1;
            }
        }

        /*
        int i=0, j=0;
        while (i<s1 && j<s2) {
            if (tempArr[start1+i] > tempArr [start2 + j]){
                arr[start1 + i] = tempArr[start2 + j];
                j+=1; i+=1; } else {
                i+=1;
                }
        }
        while (i<s1){
            arr[start1 +i] = tempArr[start1 + i];
            i+=1;
        }
        while (j<s2){
            arr[start1+i] = tempArr[start2 + j];
            j+=1;
            i++;
        }



        }
        */
        private void mergeSort(int[] arr, int left, int right, int[] tempArr) {
            if (left >= right) {
                return;
            }
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, tempArr);
            mergeSort(arr, mid + 1, right, tempArr);
            merge(arr, left, right, mid, tempArr);

        }

        public int[] sortArray(int[] nums) {

            int[] temArr = new int[nums.length];
            mergeSort(nums, 0, nums.length - 1, temArr);
            return nums;

        }
    }

    class BubbleSort {

        public int[] sortArray(int[] nums) {
            boolean hasSwapp = true;
            while (hasSwapp) {
                hasSwapp = false;
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                        hasSwapp = true;
                    }

                }
            }
            return nums;

        }
    }
}

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
   /* class InsertSort {
        public ListNode insertionSortList(ListNode head) {
            ListNode temp = new ListNode();
            ListNode curr = head;
            while (curr != null){
                ListNode prev = temp;
                while (prev.next != null && prev.next.val <= curr.val){
                    prev = prev.next;
                }
                ListNode next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
                curr = next;

            }
            return temp.next;
        }
    }
    public static void main(String[] args) {

    }
}

    */
