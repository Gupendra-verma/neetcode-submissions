class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> hm = new HashMap<>();
        char [] sc = s.toCharArray();

        for(int i=0; i<sc.length; i++){
            hm.merge(sc[i], 1, Integer::sum);
        }

        for(int i=0; i<t.length(); i++){
           
           if(!hm.containsKey(t.charAt(i))){
           return false;
           }

         hm.merge(t.charAt(i), -1, Integer::sum);
          
           if(hm.get(t.charAt(i)) == 0 ){
            hm.remove(t.charAt(i));

           }
            
        }

        return hm.isEmpty();
       
        }

    
}
