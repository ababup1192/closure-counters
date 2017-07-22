import java.util.function.*;
import java.util.stream.IntStream;

public class Counter {
    public static void main(String ...args) {
        final Supplier<IntSupplier> createCounter = () -> {
            final Integer[] count = {0};

            return () -> {
                count[0]++;
                return count[0];
            };
        };

        IntSupplier counter = createCounter.get();
        IntStream.rangeClosed(1, 10).forEach(i -> {
            System.out.println(counter.getAsInt());
        });
    }
}
