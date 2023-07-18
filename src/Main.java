import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
        System.out.println();
/* В данном случае программа выбирает из потока числа, пока они меньше нуля. Консольный вывод программы:
-3
-2
-1 */
        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers2.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
        System.out.println();
        // Консольный вывод программы:
        //
        // -5
        // -4
        // -3
        // -2
        // -1


        Stream<Integer> numbers3 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers3.sorted().dropWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
        System.out.println();
        // Консольный вывод программы:
        //
        // 0
        // 1
        // 2
        // 3


        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(n -> System.out.println(n));
        System.out.println();
        // Консольный вывод:
        //
        // Tom
        // Bob
        // Sam
        // Alice
        // Kate
        // Sam


        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p -> System.out.println(p));
        // Консольный вывод:
        //
        // Tom
        // Bob
        // Sam
        // Alice
        // Kate
    }
}