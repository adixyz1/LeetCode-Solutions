class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int total = n*m;
        int count = 0;
        List<Integer> ans = new ArrayList<>();

        int rowStart = 0;
        int colStart = 0;
        int rowEnd = n-1;
        int colEnd = m-1;

        while(count<total){

            // rowStart , colStart -> colEnd
            for(int i = colStart;i<=colEnd;i++){
                ans.add(matrix[rowStart][i]);
                count ++;
            }
            rowStart++;

            if(count == total){
                break;
            }

            // colEnd , rowStart -> rowEnd
            for(int i= rowStart;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
                count++;
            }
            colEnd--;

            if(count == total){
                break;
            }

            // rowEnd , colEnd -> colstart

            for(int i=colEnd;i>=colStart;i--){
                ans.add(matrix[rowEnd][i]);
                count++;
            }
            rowEnd--;

            if(count == total){
                break;
            }

            // colStart, rowEnd -> rowStart
            for(int i = rowEnd;i>=rowStart;i--){
                ans.add(matrix[i][colStart]);
                count++;
            }
            colStart++;

        }
        return ans;
    }
}