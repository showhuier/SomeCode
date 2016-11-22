/**
 * Created by z.xiaohui02 on 2016/11/10.
 */
public class MatrixRotationInPlace {
    public static void retateMatrix(int[][] input){
        int n=input.length;
        if(n<=1)
            return;

        for(int i=0;i<n/2;i++){   //由外向里一层一层旋转

            for(int j=i;j<n-i-1;j++){
                int temp =input[i][j];
                input[i][j]=input[n-1-j][i];
                input[n - j - 1][i] = input[n - 1 - i][n - 1 - j];
                input[n - 1 - i][n - 1 - j] = input[j][n - 1 - i];
                input[j][n - 1 - i] = temp;
            }
        }
    }
}
