package winterbepractise;

/**
 * Created by ashwani_arora on 11/14/2016.
 */
@FunctionalInterface
public interface IntegerConverterFunctionalInterface<F,T> {

    T convert(F from);


}
