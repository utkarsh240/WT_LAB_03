import java.util.Scanner;
public class Q2
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[10];
            int even = 0, odd = 0;
            for(int i = 0; i < 10; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
        }
    }
}
