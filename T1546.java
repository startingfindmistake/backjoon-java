import java.util.Scanner;

public class T1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 과목의 갯수 입력받기
        int N = sc.nextInt();

        // 배열 만들기
        double arr[] = new double[N];

        // 최댓값을 저장할 변수를 선언하고 초기화
        double M = 0;

        // 배열에 값 넣기
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();

            //배열에서 최대값 찾기
            if(M < arr[i]){
                M = arr[i];
            }
        }

        // int M 변수가 최댓값이다.
        // 최댓값으로 각 값 수정하기
        for(int i = 0; i < N; i++){
            arr[i] = arr[i]/M*100;
        }

        // 수정한 값으로 다시 평균 구하는데 소수점까지 구하기

        // 평균을 저장할 변수 선언과 동시에 초기화
        double average = 0;

        for(int i = 0; i < N; i++){
            average += arr[i];
        }

        System.out.println(average/N);

        




        /* 
        //테스트코드 출력
        for(int i = 0; i < N; i++){
            System.out.print(arr[i] +" ");
        }
        /*
        System.out.println(x);
        */

        



        


        // 수정한 값으로 다시 평균 구하는데 소수점까지 구하기


        //출력하기


        //메모리 누수 및 파일 잠금 방지
        sc.close();

    }
}
