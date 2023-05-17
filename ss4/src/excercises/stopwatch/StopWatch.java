package excercises.stopwatch;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();

    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }

    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx]) min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
//        for (int j : arr) System.out.print(j + " ");
//        System.out.println();
    }
}
