class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts){
            q.offer(i);
        }
        long ans=0;
        while(k>0){
            int a=q.poll();
            q.offer((int)Math.sqrt(a));
            k--;
        }
        while(q.size()!=0){
            ans+=q.poll();
        }
        return ans;
    }
}