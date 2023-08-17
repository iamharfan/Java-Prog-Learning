import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0, b=1, count =2;
        int temp=0;
        while (count<=n){
            temp=a+b;
            a=b;
            b=temp;
            count++;
        }
        System.out.println(temp);
    }
}
