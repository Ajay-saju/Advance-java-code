package MergeSort;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {

        List<Integer> list = List.of(7, 3, 4, 5, 8, 1, 9);

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        MergeSort mergeSort = new MergeSort(list, executorService);

        // executorService.submit(doTask);

        Future<List<Integer>> sortedList = executorService.submit(mergeSort);
        List<Integer> ans = sortedList.get();

        // List<Integer>sortedList = doTask.call();

        System.out.println(ans);
        executorService.shutdown();

    }

}
