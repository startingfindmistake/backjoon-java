import java.util.Scanner;

public class T10818 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        // 숫자를 N번 받을지 입력을 받는다.
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0; i < N; i ++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        

        for(int i = 0; i < N; i++){
            if (max < arr[i]){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }

            
        }
        System.out.print(min + " " + max);

    }
}
