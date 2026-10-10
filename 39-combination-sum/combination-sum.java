class Solution{
    public List<List<Integer>> combinationSum(int [] candidates , int target){
        List<List<Integer>> Result = new ArrayList<>();

        backtrack(0,  candidates,  target, new ArrayList<>(), Result);
        return Result;
    }
    public void backtrack(
        int start,
        int [] candidates,
        int target,
        List<Integer> current ,
        List<List<Integer>> Result
    ){
        if (target==0){
            Result.add(new ArrayList<>(current));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start ; i < candidates.length ; i++){
            current.add(candidates[i]);

            backtrack(i, candidates , target-candidates[i] , current, Result);
            current.remove(current.size()-1);
        }
    }
}