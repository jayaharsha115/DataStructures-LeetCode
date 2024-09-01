class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        List<Integer> row = null;
        List<Integer> preRow = null;
        for(int i=0;i<=rowIndex;i++){
            row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    row.add(preRow.get(j-1)+preRow.get(j));
                }
            }
            preRow=row;
            result.add(row);
        }
        return result.get(rowIndex);
    }
}