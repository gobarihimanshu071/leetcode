class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            q.offer(stone);
        }
        while(q.size()>1){
            int y=q.poll();
            int x=q.poll();
            int z=y-x;
            if(z!=0)q.offer(z);

        }
        if(q.size()==0)return 0;
        return(q.poll());
    }
}