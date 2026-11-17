class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        
        // brute force approach
        // for(String s : strs){
        //     char [] sortS = s.toCharArray();
        //     Arrays.sort(sortS);
        //     String skey = new String(sortS);   
        //     res.putIfAbsent(skey, new ArrayList<>());
        //     res.get(skey).add(s);

        // }

        // optimize solution using array frequency

        for(String s : strs){
            int [] count = new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }

            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

       return new ArrayList<>(res.values()); 
        
    }
}
