import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'maxSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String maxSubstring(String s) {
    // Write your code here
    int i=0, c=0, j=1;
       while(j<s.length()){
           if(s.charAt(j)>s.charAt(c)){
               while(s.charAt(j)>s.charAt(c)) 
                    i = c = j-(c-i);
           }
           else if (s.charAt(j)<s.charAt(c))
               c = i;
           else if(s.charAt(j)==s.charAt(c))
               c++;
           j++;
       }
       return s.substring(i,j);
    }

}
public class Solution {