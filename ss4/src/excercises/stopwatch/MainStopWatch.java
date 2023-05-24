package excercises.stopwatch;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.sort(arr);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime()+ " millisecond");

    }
}
