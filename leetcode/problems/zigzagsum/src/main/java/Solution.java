/**
 * Created by ashwani on 12/16/16.
 */
public class Solution {

 /*       public static String convert(String s, int nRows) {
            char[] c = s.toCharArray();
            int len = c.length;
            StringBuffer[] sb = new StringBuffer[nRows];
            for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

            int i = 0;
            while (i < len) {
                for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                    sb[idx].append(c[i++]);
                for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                    sb[idx].append(c[i++]);
            }
            for (int idx = 1; idx < sb.length; idx++)
                sb[0].append(sb[idx]);
            return sb[0].toString();

    }*/

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
    public static String convert(String s, int nRows) {
    char[] charArray= s.toCharArray();
    int length = s.length();
    StringBuffer[] stringBuffers = new StringBuffer[nRows];
        for(int counter=0;counter<nRows;counter++)
        {
            stringBuffers[counter]= new StringBuffer();
        }
    int i=0;
        while(i<length)
        {
            for(int index =0;index<nRows&&i<length;index++)
            {
                stringBuffers[index].append(charArray[i++]);
            }
            for(int index=nRows-2;index>=1&&i<length;index--)
            {
                stringBuffers[index].append(charArray[i++]);
            }
        }
        for(int ij=1;ij<nRows;ij++)
        {
            stringBuffers[0].append(stringBuffers[ij]);
        }
        return stringBuffers[0].toString();
    }


}
