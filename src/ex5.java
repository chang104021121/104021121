import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i;
        int j;

        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
