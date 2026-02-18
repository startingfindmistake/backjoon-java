// N에 0을 대입했을 때 예외 처리 적용한 코드
import java.util.Scanner;

public class T10818_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // 1. 입력받기
        int N = sc.nextInt();
        int arr[] = new int[N];

        // 2. 배열 채우기
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // 3. 예외 처리 시작
        try {
            // 위험구역
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

            // 에러가 안 났다면 정상 출력
            System.out.print(min + " " + max);

        } catch (ArrayIndexOutOfBoundsException e) {
            // [수습 구역]
            // try 안에서 '인덱스 범위를 벗어남' 에러가 나면 즉시 이곳으로 점프한다.
            System.out.println("예외 발생! 배열에 데이터가 없습니다");
            e.printStackTrace(); //에러의 상세 내용 출력
        }

    }
}
