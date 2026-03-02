
import java.util.Scanner;

public class T9086_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // 테스트 케이스를 입력 받는데
        // int형으로 몇번 반복할지 정수형으로 입력 받는다.
        int T = sc.nextInt();
        int count = 0;
        //int B = 0;
        
        // String배열 선언과 초기화
        String arr[] = new String[4];


        arr[4] = sc.next();

        System.out.print(arr[4]);


        
        
        

        
        //메모리 누수 및 중복 실행 방지
        sc.close();

        
    }
}





