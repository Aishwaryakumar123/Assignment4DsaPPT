
public class question3 {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{1,4,5}};

        int m= matrix.length;
        int n=matrix[0].length;
        int[][]result= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[i][j]= matrix[j][i];
            }
        }

       // return result;
    }
}
