class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        for(String s : strs){
            char [] sortS = s.toCharArray();
            Arrays.sort(sortS);
            String skey = new String(sortS);   
            res.putIfAbsent(skey, new ArrayList<>());
            res.get(skey).add(s);

        }

       return new ArrayList<>(res.values()); 
        
    }
}
