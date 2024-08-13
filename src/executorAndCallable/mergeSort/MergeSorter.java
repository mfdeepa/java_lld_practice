//package executorAndCallable.mergeSort;
//
//import java.util.List;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//
//public class MergeSorter implements Callable {
//
//    List<Integer> arrayToSort;
//    ExecutorService executorService;
//
//    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService){
//        this.arrayToSort = arrayToSort;
//        this.executorService = executorService;
//    }
//
//    @Override
//    public Object call() throws Exception {
//
//
//        //logic of merge sort
//        int N = arrayToSort.size();
//        int[] anss = mergeSort(arrayToSort, 0, N - 1);
//        //return ans;
//
//        public static int[] mergeSort(int[] A, int low, int high){
//            if (low == high) {
//                int[] ans = new int[1];
//                ans[0] = A[low];
//
//            }
//            int mid = (low + high) / 2;
//            int[] left = mergeSort(A, low, mid);
//            int[] right = mergeSort(A, mid + 1, high);
//            int[] ans = mergeSortedArray(left, right);
//            return ans;
//        }
//        public static int[] mergeSortedArray(int B[], int C[]){
//            int N = B.length;
//            int M = C.length;
//            int[] D = new int[N + M];
//
//            int p1 = 0, p2 = 0, p3 = 0;
//            while (p1 < N && p2 < M) {
//                if (B[p1] <= C[p2]) {
//                    D[p3] = B[p1];
//                    p3++;
//                    p1++;
//                } else if (C[p2] <= B[p1]) {
//                    D[p3] = C[p2];
//                    p3++;
//                    p2++;
//                }
//            }
//            while (p1 < N) {
//                D[p3] = B[p1];
//                p3++;
//                p1++;
//            }
//            while (p2 < M) {
//                D[p3] = C[p2];
//                p3++;
//                p2++;
//            }
//            return D;
//        }
//
//    }
//}
