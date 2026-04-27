import java.util.Arrays;

public class Experiment {
    private Sorter sorter= new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr,String type){
        int[] copy= Arrays.copyOf(arr,arr.length);
        long startTime = System.nanoTime();
        if(type.equalsIgnoreCase("basic")){
            sorter.basicSort(copy);
        }
        else{
            sorter.advancedSort(copy);
        }

        return System.nanoTime() - startTime;
    }

    public long measureSearchTime(int[] arr,int target){
        long startTime = System.nanoTime();
        searcher.search(arr,target);
        return System.nanoTime() - startTime;
    }

    public void runAllExperiments(){
        int[] sizes = {10,100,1000};
        System.out.println("Size\tType\t\tBasic(ns)\tAdvanced(ns)\tSearch(ns)");
        for(int size : sizes){
            int[] randomArr = sorter.generateRandomArray(size);

            //Measure Sorting
            long basicTime = measureSortTime(randomArr,"basic");
            long advancedTime = measureSortTime(randomArr,"advanced");

            //Sort array for valid Binary Search measurement
            int[] sortedArr = Arrays.copyOf(randomArr,randomArr.length);
            Arrays.sort(sortedArr);
            long searchTime = measureSearchTime(sortedArr,sortedArr[size/2]);

            System.out.printf("%d\tRandom\t\t%d\t\t%d\t\t%d\n",size,basicTime,advancedTime,searchTime);
        }
    }
}
