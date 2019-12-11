class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new MyComparator());
        // int r = intervals.length; 
        // int c = intervals[0].length;
        // int i=0;
        List<int[]> list= new ArrayList<>();
        for(int[] x: intervals){
            list.add(x);
        }
        int n = list.size();
        for(int i = 1; i < n; i++){
            if(list.get(i)[0]<=list.get(i-1)[1]){
                list.get(i)[0] = list.get(i-1)[0];
                if(list.get(i)[1]<list.get(i-1)[1])
                   list.get(i)[1] =  list.get(i-1)[1];
                list.get(i-1)[0] = list.get(i-1)[1] =Integer.MAX_VALUE;
            }
        }
//         for(int[] interval : intervals)
//         {
//             if(i==0 || ans[i-1][1]<interval[0])
//             {
//                 list.get()
                
//                 ans[i][0] = interval[0];
//                 ans[i][1] = interval[1];
//                 i++;
//             }
//             else
//             {
//                 ans[i-1][1] = Math.max(ans[i-1][1],interval[1]);
//             }
//         }
        Iterator<int[]> iter = list.iterator();        
        while(iter.hasNext()){
            if((iter.next())[0] == Integer.MAX_VALUE)
               iter.remove(); 
        }        
        return list.toArray(new int[list.size()][2]);
       }
    
    public class MyComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2)
        {
            return o1[0]-o2[0];
            // return o1[0]<o2[0] ? -1 : o1[0]==o2[0] ? 0 : 1;
        }
    }
}