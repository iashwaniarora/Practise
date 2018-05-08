/**
 * Created by ashwani_arora on 7/22/2016.
 */
public enum DoubleEnum {

    Apple(1, "APPLE","Banana");
    private int key;
    private String value1;
    private String value2;

    DoubleEnum(int key, String value1,String value2) {
        this.key = key;
        this.value1 = value1;
        this.value2 = value2;
    }
}
