import java.util.Random;
public class Tools {
    /**
     * This function will return a sorted version of a list using Bubble Sort
     * @return
     */
    public static int[] bubbleSort(int[] lst){
        long startTime = System.currentTimeMillis();
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
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        return lst;
    }
    public static int[] randomListGenerator(int length, int min, int max){
        Random rand = new Random();
        int[] lst = new int[length];
        for(int i = 0; i < lst.length; i++){
            lst[i] = rand.nextInt(max-min+1)+min;
        }
        return lst;
    }
}
