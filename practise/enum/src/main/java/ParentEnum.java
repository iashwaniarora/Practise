/**
 * Created by ashwani_arora on 7/22/2016.
 */
public class ParentEnum {

    int dummyField;

    public enum ChildEnum{

        Apple("APPLE");

        public String getValue() {
            return value;
        }

        private String value;
        ChildEnum(String value)
        {
            this.value= value;
        }

    }
}
