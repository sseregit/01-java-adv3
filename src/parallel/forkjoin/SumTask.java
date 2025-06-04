package parallel.forkjoin;

import static util.MyLogger.*;

import java.util.List;
import java.util.concurrent.RecursiveTask;

import parallel.HeavyJob;

public class SumTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 4; // 임계값

    private final List<Integer> list;

    public SumTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() <= THRESHOLD) {
            log("[처리 시작] " + list);
            int sum = list.stream()
                .mapToInt(HeavyJob::heavyTask)
                .sum();
            log("[처리 완료] " + list + " -> sum: " + sum);
            return sum;
        } else {
            int mid = list.size() / 2;
            List<Integer> leftList = list.subList(0, mid);
            List<Integer> rightList = list.subList(mid, list.size());
            log("[분할] " + list + " -> LEFT " + leftList + " -> RIGHT " + rightList);

            SumTask leftTask = new SumTask(leftList);
            SumTask rightTask = new SumTask(rightList);

            leftTask.fork();
            Integer rightResult = rightTask.compute();

            Integer leftResult = leftTask.join();
            int joinSum = leftResult + rightResult;
            log("LEFT[ " + leftResult + "] + RIGHT[" + rightResult + "] -> sum: " + joinSum);
            return joinSum;
        }
    }
}
