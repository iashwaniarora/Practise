package winterbepractise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ashwani_arora on 11/14/2016.
 */
public class Lambdapractise {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","ashwani","rohit");

       /* Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        for (String name :names)
        {
            System.out.println(name);
        }

        //Java 8
        Collections.sort(names,(String a, String b)->{return a.compareTo(b);});

        for (String name :names)
        {
            System.out.println(name);
        }

        //
        IntegerConverterFunctionalInterface<String,Integer> integerConverterFunctionalInterface = from -> Integer.valueOf(from);
        Integer converted = integerConverterFunctionalInterface.convert("123");
        System.out.println(converted);


    }


}
