import java.util.Scanner;

public class test_1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[N];
        
        // 배열의 값 받기
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int result[] = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] < X){
                result[count] = arr[i];
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}