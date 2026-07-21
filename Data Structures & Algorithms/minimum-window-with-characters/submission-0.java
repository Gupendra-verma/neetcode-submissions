class Solution {
    public String minWindow(String s, String t) {

        int [] chars = new int[128];
        int missing = t.length();
        int low=0, minLen = Integer.MAX_VALUE, bestStart=0;

        if(s.length()==0 || t.length()==0) return new String("");

        for(char c: t.toCharArray()){
            chars[c]++;
        } 

        for(int high=0; high<s.length(); high++){
            char a = s.charAt(high);
            if(chars[a]>0){
                missing--;
            }
            chars[a]--;

            while(missing==0){
                if(high-low+1<minLen){
                    minLen = high-low+1;
                    bestStart = low;
                }
               char b = s.charAt(low);
               chars[b]++;
               if(chars[b]>0) missing++;
               low++;
            }

        }

        return Integer.MAX_VALUE==minLen?"": s.substring(bestStart, bestStart+minLen);
        
    }
}
