class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();

        // Arrays.sort(str1);
        // Arrays.sort(str2);

        // for(int i=0; i<s.length(); i++){
        //     if(str1[i]!=str2[i]){
        //         return false;
        //     }
        // }

        // return true;

        Map<Character, Integer> mp = new HashMap<>();

        for(char c:s.toCharArray()){
            mp.merge(c,1, Integer::sum);
        }

        for(char c: t.toCharArray()){
            if(!mp.containsKey(c)) return false;

            mp.merge(c, -1, Integer::sum);
            if(mp.get(c)==0) mp.remove(c);
        }

return mp.isEmpty();
    }
}
