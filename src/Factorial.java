import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();
        System.out.println(findFactorial(input));
    }
    public static int findFactorial(int input)
    {
        int result;
        if(input==1)
        {
            result=1;
        }
        else {
            result= findFactorial(input-1)*input;}
        return result;
    }
}
