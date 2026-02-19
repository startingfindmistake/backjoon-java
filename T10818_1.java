import java.util.Scanner;

public class T10818_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // 1. 입력받기
        int N = sc.nextInt();
        int arr[] = new int[N];

        // 2. 배열 채우기
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }



        // 3. 방어 코드 시작
            if (N > 0) {
            int max = arr[0];
            int min = arr[0];

            for(int i = 0; i < N; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
        
            
            System.out.print(min + " " + max);
        } else {
            System.out.print("0은 입력이 안됩니다.");
        }
    }
}
