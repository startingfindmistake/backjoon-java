import java.util.Scanner;
import java.util.ArrayList;


public class T10871_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

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
                list.add(arr[i]); // 조건에 맞을 때만 리스트에 추가
            }
            // else의 경우 아무것도 안하므로 출력도 안함
        }
        // 출력
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
