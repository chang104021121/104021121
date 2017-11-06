import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int i ;
        int sum=0;
        if(a<b){
            for(i=a;i<=b;i++) {
                sum = sum + i;
            }System.out.print(sum);
            }else{
             for(i=b;i<=a;i++){
                 sum=sum+i;

             }System.out.print(sum);
        }
        System.out.println();
    }
}
