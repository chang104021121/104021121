import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i,j,k;
        for(i = 1 ; i<=n ; i++)//層數的for迴圈
        {
            for( j = 1 ; j <=n-i ; j++)//根據外層行號，輸出星號左邊空格
                System.out.print(" ");
            for(k = 1 ; k <=2*i-1 ; k++)//根據外層行號，輸出星號個數
                System.out.print("*");
            System.out.println();
        }
    }
}
