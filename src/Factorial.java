import java.util.Scanner;

public class Factorial {
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        return factorial(num-1)*num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=sc.nextInt();
        int val=factorial(num);
        System.out.println("The value is :"+val);
    }
}