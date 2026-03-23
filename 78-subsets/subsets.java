class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ss(0,nums,ans,new ArrayList<>());
        return ans;
    }

    public void ss(int idx, int[] nums , List<List<Integer>> ans, List<Integer> ds){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        ss(idx+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        ss(idx+1,nums,ans,ds);
    }
}