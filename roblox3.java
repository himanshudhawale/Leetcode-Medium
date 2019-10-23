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
     * Complete the 'segment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER x
     *  2. INTEGER_ARRAY arr
     */

    public static int segment(int x, List<Integer> arr) {
    // Write your code here
    int size = arr.size();
    if (size*x == 0) 
        return 0;
    if (x == 1) 
        return Collections.max(arr);

    List<Integer> ans = new ArrayList<>();
    int [] dp1 = new int[size];
    dp1[0] = arr.get(0);
    int [] dp2 = new int[size];
    dp2[size - 1] = arr.get(size - 1);
    for (int i = 1; i < size; i++) {
      if (i % x == 0) 
            dp1[i] = arr.get(i);  
      else dp1[i] = Math.min(dp1[i - 1], arr.get(i));

      int j = size - i - 1;
      if ((j + 1) % x == 0) 
            dp2[j] = arr.get(j);  
      else dp2[j] = Math.min(dp2[j + 1], arr.get(j));
    }

    for (int i = 0; i < size - x + 1; i++)
    {
      ans.add(Math.min(dp1[i + x - 1], dp2[i]));
    }


    return Collections.max(ans);
    }

}

public class Solution {