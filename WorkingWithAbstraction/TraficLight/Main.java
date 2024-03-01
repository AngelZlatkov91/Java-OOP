package WorkingWithAbstraction.TraficLight;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Signal[] signal = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Signal::valueOf)
                .toArray(Signal[]:: new);
        int nUpdates = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nUpdates; i++) {
          updateSignals(signal);
          printSignals(signal);
        }
    }
    private static void printSignals(Signal[] signal) {
        for (Signal si : signal) {
            System.out.print(si + " ");
        }
        System.out.println();
    }
    private static void updateSignals(Signal[] signal) {
        for (int i = 0; i < signal.length; i++) {
            switch (signal[i]) {
                case RED:
                    signal[i] = Signal.GREEN;
                    break;
                case GREEN:
                    signal[i] = Signal.YELLOW;
                    break;
                case YELLOW:
                    signal[i] = Signal.RED;
                    break;
            }
        }
    }
}
