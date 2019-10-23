private static List<String> generatePhrases(List<String> inputs) {
    List<String> ans = new ArrayList<>();
    Map<String, List<Integer>> map = new HashMap<>();
    for(int i=0; i<inputs.size(); i++) {
        String str = inputs.get(i);
        String fw = str.split("\\s+")[0];
        if(!map.containsKey(fw))
            map.put(fw,new ArrayList<>());
        map.get(fw).add(i);
    }



    for(int i=0; i<inputs.size(); i++) {
        String str = inputs.get(i);
        String lw = new ArrayDeque<>(Arrays.asList(str.split("\\s+"))).getLast();
        if(map.containsKey(lw)) {
            List<Integer> temp = map.get(lw);
            for(Integer t : temp) {
                if(i != t) {
                    String s = inputs.get(t);
                    result.add(str + s.substring(s.indexOf(' ')));
                }
            }
        }
    }
    return ans;
}