import java.util.Scanner;
public class ex3 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i;
        for(i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("A");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();



    }
}
