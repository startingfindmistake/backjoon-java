import java.util.Scanner;

public class T2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 배열초기화
        int arr[] = new int[10];

        // 데이터 배열에 넣고
        for (int i = 1; i < 10; i++){
            arr[i] = sc.nextInt();
            
        }
        for (int i = 1; i < 10; i++) {
            System.out.print(arr[i]);
        }
        // 반복문을 통해 비교 조건을 하여 몇번째 인덱스 인지 확인
    }
}
