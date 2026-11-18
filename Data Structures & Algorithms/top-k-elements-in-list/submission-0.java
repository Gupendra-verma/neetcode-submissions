class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)-> freq.get(a)-freq.get(b)
        );
        
        for(int n:nums){
            freq.merge(n, 1, Integer:: sum);
        }

        for(int key:freq.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
    
        return pq.stream()
                 .mapToInt(Integer::intValue)
                 .toArray();

       
    }
}
