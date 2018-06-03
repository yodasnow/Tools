import java.util.Arrays;

public class ToolsTester {
    public static void main(String[] args) {
        //Bubble sort & Random list generator
        System.out.println("Bubble sort & Random list generator");
        int[] testArr = Tools.randomListGenerator(20, 1, 1000);
        System.out.println(Arrays.toString(testArr));
        Tools.bubbleSort(testArr);
        System.out.println(Arrays.toString(testArr));
        System.out.println("------------------------------------");

        //Selection sort & Random list generator
        System.out.println("Selection sort & Random list generator");
        testArr = Tools.randomListGenerator(20, 1, 1000);
        System.out.println(Arrays.toString(testArr));
        Tools.selectionSort(testArr);
        System.out.println(Arrays.toString(testArr));
        System.out.println("------------------------------------");

        //Insertion sort & Random list generator
        System.out.println("Insertion sort & Random list generator");
        testArr = Tools.randomListGenerator(20, 1, 1000);
        System.out.println(Arrays.toString(testArr));
        Tools.insertionSort(testArr, testArr.length-1);
        System.out.println(Arrays.toString(testArr));
        System.out.println("------------------------------------");

        //Merge sort & Random list generator
        System.out.println("Merge sort & Random list generator");
        testArr = Tools.randomListGenerator(20, 1, 1000);
        System.out.println(Arrays.toString(testArr));
        testArr = Tools.mergeSort(testArr);
        System.out.println(Arrays.toString(testArr));
        System.out.println("------------------------------------");

        //Palindrome
        System.out.println("Palindrome");
        System.out.println(Tools.isPalindrome("racecar"));
        System.out.println(Tools.isPalindrome("tree"));
        System.out.println(Tools.isPalindrome("neveroddoreven")); //Never odd or even
        System.out.println("------------------------------------");

        //Linear search
        System.out.println("Linear search");
        int[] searchArr = {1, 2, 3, 4, 5, 6, 7, 9, 754, 45, 754, 342, 534, 756, 234, 675, 34, 654, 432};
        System.out.println(Tools.linearSearch(searchArr, 45));
        System.out.println(Tools.linearSearch(searchArr, 72));
        System.out.println("------------------------------------");

        //Binary search & Merge sort
        System.out.println("Binary search & Merge sort");
        searchArr = Tools.mergeSort(searchArr);
        System.out.println(Arrays.toString(searchArr));
        System.out.println(Tools.binarySearch(searchArr, 36));
        System.out.println(Tools.binarySearch(searchArr, 234));
        System.out.println("------------------------------------");
    }
}