package stream;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Dave", 23,20000));
        list.add(new Employee("Joe", 18,40000));
        list.add(new Employee("Ryan", 54,100000));
        list.add(new Employee("Iyan", 5,34000));
        list.add(new Employee("Ray", 63,54000));
/*
        Instant start1 = Instant.now();
        int salaryTotal1 = list.stream().mapToInt(p -> p.getSalary()).sum();
        System.out.println("The total salary is " + salaryTotal1);

        Instant finish1 = Instant.now();
        long timeElapsed1 = Duration.between(start1, finish1).toMillis();
        System.out.println("the int stream sum runtime is  "+ timeElapsed1 + " MillisSeconds");

        Instant start2 = Instant.now();
        // CODE HERE
        Optional<Integer> salaryTotal = list.stream().map(p -> p.getSalary()).reduce((p,q) -> p+q);
        if (salaryTotal.isPresent()){
            System.out.println("the sum of salaries is " + salaryTotal.get());

        }

        Instant finish2 = Instant.now();
        long timeElapsed = Duration.between(start2, finish2).toMillis();
        System.out.println("the reduce runtime is  "+ timeElapsed + " MillisSeconds");
*/
        Instant start3 = Instant.now();

        Optional<Integer> salaryTotal3 = Optional.ofNullable(list.parallelStream().map(p -> {System.out.println(Thread.currentThread().getName());return p.getSalary();}).reduce(0, (p, q) -> p + q, Integer::sum));
        if (salaryTotal3.isPresent()){
            System.out.println("total sum of salary is " + salaryTotal3.get());
        }
        Instant finish3 = Instant.now();
        long timeElapsed3 = Duration.between(start3, finish3).toMillis();
        System.out.println("the parallel stream sum runtime is  "+ timeElapsed3 + " MillisSeconds");
/*
        Optional<Integer> maxSalary = list.stream().map(p -> p.getSalary()).max(Comparator.naturalOrder());

        System.out.println("total max salary is " + maxSalary.get());*/



    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}