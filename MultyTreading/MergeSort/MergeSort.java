package MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSort(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {

        System.out.println("New Thread: " + arrayToSort + " Name: " + Thread.currentThread().getName());

        // break condition

        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        // find the mid of the array

        int mid = arrayToSort.size() / 2;

        // create left array

        // Create right array

        List<Integer> leftArray = new ArrayList<>(arrayToSort.subList(0, mid));
        List<Integer> rightArray = new ArrayList<>(arrayToSort.subList(mid, arrayToSort.size()));

       /**
         * Now Left and Right SubArrays Are Created...
         * You would want the Merge-Sort to run on those Left and Right Sub Arrays.
         */

        MergeSort leftSort = new MergeSort(leftArray, executorService);
        MergeSort rightSort = new MergeSort(rightArray, executorService);

        // calling the self func again...

        Future<List<Integer>> leftSortedArr = executorService.submit(leftSort);
        Future<List<Integer>> rightSortArr = executorService.submit(rightSort);

        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        
        /**
         * Now we would need the arrays .... because we want to merge them.
         *
         * from here... will that be multi threaded... no it will be single threaded.
         */

        List<Integer> leftSortedFinalArr = leftSortedArr.get();
        List<Integer> rightSortedFinalArr = rightSortArr.get();

        // compairing left and right arrays

        while (i < leftSortedFinalArr.size() && j < rightSortedFinalArr.size()) {

            if (leftSortedFinalArr.get(i) < rightSortedFinalArr.get(j)) {
                ans.add(leftSortedFinalArr.get(i));
                ++i;

            } else {
                ans.add(rightSortedFinalArr.get(j));
                ++j;
            }

        }

        // adding remaining elements

        while (i < leftSortedFinalArr.size()) {
            ans.add(leftSortedFinalArr.get(i));
            ++i;
        }

        while (j < rightSortedFinalArr.size()) {
            ans.add(rightSortedFinalArr.get(j));
            ++j;
        }

        return ans;

    }

}
