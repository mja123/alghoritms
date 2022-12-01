package codeSignal.companyChallenges.datto;

import java.util.*;

//37
public class ConcurrentBackup {
    static int solution(int threads, int[] documents) {
        OptionalInt sum = Arrays.stream(documents).reduce(Integer::sum);

        return sum.isEmpty() ? 0
                : documents.length <= threads ? Arrays.stream(documents).max().getAsInt()
                : sum.getAsInt() % threads == 0 ? sum.getAsInt() / threads
                : sum.getAsInt() / threads + 1;

//        if (documents.length == 0) {
//            return 0;
//        }

//        Map<Integer, Integer> threadTime = new HashMap<>();
//        Arrays.sort(documents);
//
//        int countOfThreads = 1;
//        while (countOfThreads != threads) {
//            threadTime.put(countOfThreads++, 0);
//        }
//
//        //Adding the thread reference with more time [0] and the current time [1]
//        int[] maxTime = {1, documents[documents.length - 1]};
//        int threadReference = 1;
//        for (int i = documents.length - 1; i >= 0; i--) {
//            if (threadReference <= threads) {
//                //Adding the biggest elements at the beginning
//                threadTime.put(threadReference++, documents[i]);
//                continue;
//            }
//            threadReference--;
//
//            threadTime.put(threadReference, threadTime.get(threadReference) + documents[i]);
//            int currentThreadTime = threadTime.get(threadReference);
//
//            if (currentThreadTime > maxTime[1]) {
//                maxTime[1] = currentThreadTime;
//            }
//        }
//
//        return maxTime[1];
    }

    public static void main(String[] args) {
        int threads = 2;
        int[] documents = {};

        System.out.println(solution(threads, documents));
    }
}
