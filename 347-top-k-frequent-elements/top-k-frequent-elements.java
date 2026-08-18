class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(
            (n1,n2)->map.get(n1)-map.get(n2)
        );
        for(int n:map.keySet()){
            q.add(n);
            if(q.size()>k)q.poll();
        }

        int[] top = new int[k];
        for(int i=k-1;i>=0;--i){
            top[i]=q.poll();
        }
        return top;


    }
}