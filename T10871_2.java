


import java.util.Scanner;

public class T10871_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        int N = sc.nextInt();
        int X = sc.nextInt();

        int A[] = new int[N];
        
        // 배열 입력 받기
        for(int i = 0; i < N; i++) {
            
        }
        

        int count = 0; //결과 배열의 위치를 가리킬 변수

        // 반복문을 통해 배열을 만들었다.
        for(int i = 0; i < N; i++) {
            if (A[i] < X){
                B[count] = A[i];
                count++;
            }
            
            
        }
        // 두번째 입력받은 값의 해당 값을 비교하여 작은 값을 추출한다.
        for(int i = 0; i < N; i++){
            System.out.println(B[i] + " ");
            // else의 경우 아무것도 안하므로 출력도 안함
        }
        
    }
}
