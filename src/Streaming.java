//The streams operations can be further classified as:
//filtering
//slicing
//mapping
//matching and finding
//reduction
//collect

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streaming {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(6);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Dave", 23));
        personList.add(new Person("Joe", 18));
        personList.add(new Person("Ryan", 54));
        personList.add(new Person("Iyan", 5));
        personList.add(new Person("Ray", 63));
        int[] arr = {1, 12, 4, 6};
        Stream<Integer> integerStream = list.stream().filter(p -> p>12 );
        System.out.println("=====integer filter ===");
        integerStream.forEach(System.out::println);
        System.out.println("=====before filter ===");
        list.forEach(System.out::println);
        System.out.println("=====primitive intstream filter =====");
        IntStream intStream = Arrays.stream(arr).filter(p -> p>4);
        intStream.forEach(System.out::println);
        System.out.println("=====person object age >18  filter =====");
        personList.stream().filter(p -> p.age>18).forEach(System.out::println);
        System.out.println("=====person object age >18 and age <60 chain filter =====");
        personList.stream().filter(p -> p.age>18).filter(p -> p.getAge() < 60).forEach(System.out::println);










    }
}


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

