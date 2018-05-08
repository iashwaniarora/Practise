/**
 * Created by ashwani on 12/16/16.
 */
public class Solution {

    public static int reverse(int x) {
       String num="";
        if(x<0)
            x=x+Math.abs(x)+Math.abs(x);
       while((x>=1)||(x<0))
       {

           num=num+(x%10);
           x=x/10;

       }
       if(x==0)
       {
           return new Integer(0);
       }
       if(x>0)
       {
       return new Integer(num);}
       else
       {
           return  new Integer("-"+num);
       }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1));
    }
}
