import java.util.Scanner;
public class ex4 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i;
        int j;
        int k=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                k=k+1;
                System.out.print(k);
            }
            System.out.println();
        }





    }
}
