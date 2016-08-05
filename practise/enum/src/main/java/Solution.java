/**
 * Created by ashwani_arora on 7/22/2016.
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(SingleEnum.APPLE);
        System.out.println(DoubleEnum.Apple);
        System.out.println(ParentEnum.ChildEnum.values()[0].getValue());
        System.out.println(SingleParamEnum.Apple);
    }
}
