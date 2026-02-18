import java.util.Scanner;

public class T10818 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        // 숫자를 N번 받을지 입력을 받는다.
        int N = sc.nextInt();
        // 이렇게 하면은 음수일 경우 대비를 하지 못한다.
        int max = 0;

        int arr[] = new int[N];

        for(int i = 0; i < N; i ++){
            int A = sc.nextInt();
            arr[i] = A;
        }
        

        for(int i = 0; i < N; i++){
            if (arr[i] > arr[i+1]){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
