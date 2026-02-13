import java.util.Scanner;

public class T10871 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int arr[] = new int[N];
        int result[] = new int[N];
        
        // 반복문을 통해 배열을 만들었다.
        for(int i = 0; i < N; i++) {
            int C = sc.nextInt();
            arr[i] = C;
        }

        // 두번째 입력받은 값의 해당 값을 비교하여 작은 값을 추출한다.
        for(int i = 0; i < N; i++){
            if ((arr[i]< X)){
                System.out.print(arr[i] + " ");
            }
            else{

            }
        }

        for (int i= 0; i < N; i++){
            System.out.print(result[i]);
        }
    }
}
