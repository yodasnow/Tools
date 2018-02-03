import java.util.Random;
public class Tools {
    /**
     * This function will sort a list using Bubble Sort (left to right normal method)
     * @param lst
     */
    public static void bubbleSort(int[] lst){
        int holder = 0;
        for(int k = 0; k < lst.length-1; k++){
            for(int i = 0; i < lst.length-1; i++){
                if(lst[i+1] < lst[i]){
                    holder = lst[i+1];
                    lst[i+1] = lst[i];
                    lst[i] = holder;
                }
            }
        }
    }

    /**
     * This function will sort a list using Selection Sort (right to left)
     * @param lst
     */
    public static void selectionSort(int[] lst){
        for(int i = lst.length-1; i >= 0; i--){
            int largestIndex = 0;
            int max = lst[0];
            for(int j = 0; j <= i; j++){
                if(lst[j] >= max){
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
     * This function will randomly make a list with the 3 specified values
     * @param length
     * @param min
     * @param max
     * @return
     */
    public static int[] randomListGenerator(int length, int min, int max){
        Random rand = new Random();
        int[] lst = new int[length];
        for(int i = 0; i < lst.length; i++){
            lst[i] = rand.nextInt(max-min+1)+min;
        }
        return lst;
    }
}
