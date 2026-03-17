import java.util.Scanner;

public class T3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 배열을 통해 입력을 받기 때문에 배열을 선언해 준다.
        int[] arr = new int[6]; 

        // 미리 정해진 배열도 준비해준다.
        int[] prearr = {1,1,2,2,2,8};
        
        // 체스 갯수이기 때문에 정수형 배열을 공백을 기준으로 입력받는다.
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }

        // if문을 사용해서 배열을 비교해야 한다.
        // 기준점이 prearr배열이 되야 한다.
        for(int k = 0; k < 6; k++){
            if((prearr[k] - arr[k]) != 0){
                // 기존에서 얼마가 차이나는지 확인한다.
                int result = prearr[k] - arr[k];
                // 차이나는 값을 배열에 다시 집어 넣는다.
                arr[k] = result;
            } else {
                // 0일 경우 서로 같이 같은 값이기 때문에 0으로 변경해준다.
                arr[k] = 0;
            }
        }

        // 반복문을 통해서 배열 값을 출력
        for(int j = 0; j < 6; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
