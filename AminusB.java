import java.util.Scanner;

public class AminusB {
    
    // 접근 제어자가 공통인 static 메모리에 붙인다 반환타입이 void 아무것도 없는 main 메소드에 String문자열 매개변수를 선언하고 그것을 args 이름을 붙인다.
    public static void main(String [] args){
        
        //Scanner라는 데이터 타입의 로봇의 이름(참조변수를)sc라고 붙이고 new 인스턴스화 생성을 하고 거기서 스캐너 로봇에 입력받는 기능까지 더한다.
        Scanner sc = new Scanner(System.in);

        // 로봇이름 참조변수 sc에서 nextInt() 정수형으로 달라고 요청을 한다.
        int A = sc.nextInt();

        // 로봇이름 참조변수 sc에서 nextInt() 두번째 정수형으로 달라고 요청을 한다.
        int B = sc.nextInt();

        // println에서 ln은 개행을 한다.
        System.out.println(A-B);
    }
}
