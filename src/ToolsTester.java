public class ToolsTester {
    public static void main(String[] args) {
        int[] lengths = {10, 100, 1000, 10000, 100000, 1000000, 1000000000};
        int[] possibleNumbers = {10, 100, 1000, 10000, 100000, 1000000, 1000000000};
        int numOfTestCases = 20;
        long[] averageHolder = new long[numOfTestCases];
        int average = 0;
        for(int i = 0; i < lengths.length-2; i ++){ //Different length test cases and max value
            System.out.println("Doing array length " + lengths[i] + " test cases.");
            for(int j = 0; j < 1; j++){ //Sorting method
                System.out.println("Doing sorting method " + j + ".");
                for(int k = 0; k < numOfTestCases; k++){ // Amount of runs
                    long startTime = System.currentTimeMillis();
                    int nums[] = new int[lengths[i]];
                    nums = Tools.randomListGenerator(lengths[i], 0, possibleNumbers[i]);

                    if(j == 0) Tools.bubbleSort(nums);

                    long endTime = System.currentTimeMillis();
                    averageHolder[k] = endTime-startTime;
                }
                for(int k = 0; k < numOfTestCases; k++){
                    average += averageHolder[k];
                }
                average /= numOfTestCases;
                System.out.println(average);
                average = 0;
                averageHolder = new long[numOfTestCases];
            }
        }
    }
}