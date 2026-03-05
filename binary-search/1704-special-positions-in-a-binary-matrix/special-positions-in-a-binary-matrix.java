class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1 && checkRow(i,j,mat) && checkColumn(i,j,mat)){
                    count++;
                }
            }
        }
        return count;
    }
    boolean checkRow(int x, int y,int [][] mat){
        for(int i = 0;i<mat.length;i++){
            if(i == x) continue;
            if(mat[i][y] == 1){
                return false;
            }
        }
        return true;

    }
    boolean checkColumn(int x, int y, int [][] mat){
        for(int j = 0;j<mat[0].length;j++){
            if(j == y) continue;
            if(mat[x][j] == 1){
                return false;
            }
        }
        return true;
    }
}