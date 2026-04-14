class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            List<Integer> ans=new ArrayList<>();
            int result=1;
            ans.add(result);
            for(int col=1;col<row;col++){
                result=result*(row-col);
                result=result/col;
                ans.add(result);
            }
           res.add(ans);

        }
        return res;
    }
}