import java.util.Scanner;

public class T10810{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 바구니 갯수 N, 공을 몇번 넣을건지 M
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 바구니를 하나의 배열로 생각함
        int arr[] = new int[N];

        // 공을 몇번 넣을 건지 반복함
        // i부터 j번까지 k번 공을 넣는다.
        for(int c = 0; c < M; c++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            // 반복문을 위해 새로 x를 선언과 초기화
            for(int x = i-1; x < j; x++){
                arr[x] = k;
            }

            
        }

        // 배열을 출력
        for(int x = 0; x < N; x++){
            System.out.print(arr[x] + " ");
        }

        
    }
}