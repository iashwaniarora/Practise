import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ashwani on 12/22/16.
 */
public class Solution {

    public int myAtoi(String str) {

        if (str == null) {
            return 0;
        }
        String regex = "(^\\s*)(-|\\+){2}(\\d+)(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(str);
        if (!m.find())
            return 0;
        else {

            try {
                return new Integer(m.group(2) + m.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.myAtoi("   010"));
    }

}
