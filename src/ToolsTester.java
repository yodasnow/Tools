import java.util.Arrays;
public class ToolsTester {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            Arrays.toString(Tools.bubbleSort(Tools.randomListGenerator(100000, 0, 1000)));
            //System.out.println(Arrays.toString(Tools.bubbleSort(Tools.randomListGenerator(1000, 0, 1000))));
        }
    }
}