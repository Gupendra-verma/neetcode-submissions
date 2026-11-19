class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s :strs){
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> res = new ArrayList<>();

        int i=0;
        while(i<str.length()){
            int hasIndex = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i,hasIndex));
            i = hasIndex+1;
            res.add(str.substring(i,i+length));
            i += length;
        }

    return res;
    }
}
