class Solution {
    public int lastStoneWeight(int[] stones) {

        int temp;

    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    for(int n: stones){
        pq.offer(n);
    }

    while(pq.size()>1){
        temp = pq.poll() - pq.poll();

        if(temp>0){
            pq.offer(temp);
        }
    }
        return pq.size()>0? pq.peek() : 0;
    }

  
}
