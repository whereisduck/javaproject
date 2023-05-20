package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class GenericDemo {
    public static List<Integer>  withErasure (List<Integer> list) {
        return list.stream().collect(Collectors.toList());
    }

    public static <T extends Number> List<T> typeSafeWithBound(List<T> list) {
        return list.stream().collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Double(1.0));
        list.add(new Integer(2));
        List<Double> s = new ArrayList<>();
        s.add(1.0);
        s.add(2.0);
        //List<Integer> result = withErasure(list);
        /*List result = withErasure(s);

        //List resultRaw = withErasure(list);
        //double d = result.get(0);
        //int d = resultRaw.get(0);
        //Object d = result.get(1);
        //int d = result.get(1);

        System.out.println(result.size());
        System.out.println(result.get(0));
        System.out.println(result);
        //System.out.println(d);



        List list2 = new ArrayList();
        list2.add(new Double(1.0));
        list2 .add(new Integer(2));
        List<Number> result2 = typeSafeWithBound(list2);
        System.out.println(result2.get(0));
        System.out.println(result2);
        List result2Raw = typeSafeWithBound(list2);
        //Integer d = result2.get(1);
        //Double d = result2Raw.get(0);
        //int d = result2.get(0);
        //System.out.println(d);












    }

         */

}}


