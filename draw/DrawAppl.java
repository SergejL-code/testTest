
import java.util.Random;
import java.util.stream.Stream;

public class DrawAppl {

    private static final int MIN = 1;
    private static final int MAX = 5;
    private static final int N_NUMBERS = 4;

    public static void main(String[] args) {

        Stream<Integer> draw = getRandomNumbers(MIN, MAX, N_NUMBERS)
                .distinct()
                .limit(4);

        draw.forEach(System.out::println);

    }

    private static Stream<Integer> getRandomNumbers(int min, int max, int nNumbers) {
        return new Random()
                .ints(nNumbers, min, max)
                .boxed();
    }

//    Методы .ints(), .doubles(), и аналогичные в классе java.util.Random используются для генерации потоков случайных чисел различных типов, таких как int, double, и long. Эти методы полезны для получения последовательностей случайных чисел, которые можно обработать как потоки (Stream), что особенно удобно для работы с большими наборами данных.

//    private static Stream<Integer> getRandomNumbers(int min, int max) {
//        return new Random()
//                .ints(min, max)
//                .boxed();
//    }

}
