import java.util.ArrayList;
import java.util.Random;

public class Tools {
    /**
     * This function will sort a list using Bubble Sort (left to right normal method)
     *
     * @param lst
     */
    public static void bubbleSort(int[] lst) {
        int holder = 0;
        for (int k = 0; k < lst.length - 1; k++) {
            for (int i = 0; i < lst.length - 1; i++) {
                if (lst[i + 1] < lst[i]) {
                    holder = lst[i + 1];
                    lst[i + 1] = lst[i];
                    lst[i] = holder;
                }
            }
        }
    }

    /**
     * This function will sort a list using Selection Sort (right to left)
     *
     * @param lst
     */
    public static void selectionSort(int[] lst) {
        for (int i = lst.length - 1; i >= 0; i--) {
            int largestIndex = 0;
            int max = lst[0];
            for (int j = 0; j <= i; j++) {
                if (lst[j] >= max) {
                    max = lst[j];
                    largestIndex = j;
                }
            }
            int temp = lst[i];
            lst[i] = max;
            lst[largestIndex] = temp;
        }
    }

    /**
     * This function will sort a list using Merge Sort. Has the best time complexity of any simple algorithm
     * @param lst
     * @return
     */
    public static int[] mergeSort(int[] lst){
        if(lst.length <= 1) return(lst);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for(int i = 0; i < lst.length; i++){
            if(i < (lst.length)/2){
                left.add(lst[i]);
            }
            else{
                right.add(lst[i]);
            }
        }

        int[] leftReg = arrayListToIntegerArray(left);
        leftReg = mergeSort(leftReg);
        left = integerArrayToArrayList(leftReg);

        int[] rightReg = arrayListToIntegerArray(right);
        rightReg = mergeSort(rightReg);
        right = integerArrayToArrayList(rightReg);

        return(merge(left, right));

    }

    /**
     * Helper for merge sort algorithm
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<>();

        while(left.size() != 0 && right.size() != 0){
            if(left.get(0) <= right.get(0)){
                result.add(left.get(0));
                left = restEnd(left);
            }
            else{
                result.add(right.get(0));
                right = restEnd(right);
            }
        }
        while(left.size() != 0){
            result.add(left.get(0));
            left = restEnd(left);
        }
        while(right.size() != 0){
            result.add(right.get(0));
            right = restEnd(right);
        }
        return(arrayListToIntegerArray(result));
    }

    /**
     * Sorts the array using the insertion sort method. The value of n in the initial call should be "arr.length-1"
     * @param arr
     * @param n
     */
    public static void insertionSort(int[] arr, int n){
        if(n>0){
            insertionSort(arr, n-1);
            int x = arr[n];
            int j = n-1;
            while(j >= 0 && arr[j] > x){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }

    /**
     * This function will randomly make a list with the 3 specified values
     *
     * @param length
     * @param min
     * @param max
     * @return
     */
    public static int[] randomListGenerator(int length, int min, int max) {
        Random rand = new Random();
        int[] lst = new int[length];
        for (int i = 0; i < lst.length; i++) {
            lst[i] = rand.nextInt(max - min + 1) + min;
        }
        return lst;
    }

    /**
     * This function will return a boolean stating whether the entered string is a palindrome or not
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        String reverse = reverse(str);
        if (reverse.equals(str)) return (true);
        return (false);
    }

    /**
     * Will return the index of the value if found otherwise will return -1. Searches using the linear search method
     *
     * @param arr
     * @param value
     * @return
     */
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    /**
     * Will return the index of the value if found otherwise will return -1. Searches using the binary search method. Array MUST be sorted
     * @param arr
     * @param value
     * @return
     */
    public static int binarySearch(int[] arr, int value) {
        int low = 0, high = arr.length-1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] == value) return mid;
            if (arr[mid] < value) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    /**
     * Will return a reversed string
     * @param str
     * @return
     */
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return(reverse);
    }

    /**
     * Casts an ArrayList<Integer> to an integer array
     * @param al
     * @return
     */
    public static int[] arrayListToIntegerArray(ArrayList<Integer> al){
        int[] lst = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            lst[i] = al.get(i);
        }
        return(lst);
    }

    /**
     * Casts an integer array to an ArrayList<Integer>
     * @param lst
     * @return
     */
    public static ArrayList<Integer> integerArrayToArrayList(int[] lst){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < lst.length; i++){
            al.add(lst[i]);
        }
        return(al);
    }

    /**
     * Returns an ArrayList with indexes 1:end
     * @param al
     * @return
     */
    public static ArrayList<Integer> restEnd(ArrayList<Integer> al){
        ArrayList<Integer> newAL = new ArrayList<>();
        for(int i = 1; i < al.size(); i++){
            newAL.add(al.get(i));
        }
        return(newAL);
    }
}
