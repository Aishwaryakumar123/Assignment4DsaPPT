
public class question7 {
    public static void main(String[] args) {
        int m=3; int n=3;
        int [][]ops={{2,2,},{3,3}};
        if (ops.length==0)
            System.out.println( m*n);
        int row=Integer.MAX_VALUE, col=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++) {
            row = Math.min(row,ops[i][0]);
            col = Math.min(col,ops[i][1]);
        }
        System.out.println( row*col);
    }
}
