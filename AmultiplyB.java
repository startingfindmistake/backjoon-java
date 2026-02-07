import java.util.Scanner;

// 접근제어가 열려있는 클래스
public class AmultiplyB {
    //접근 제어자가 public 공식적이고 static 메모리에 붙이고 void 반환타입이 없는 main 메소드에 매개변수가 string문자열이고 그 이름을 args라고 붙임
    public static void main(String[] args){

        // Scanner라는 데이터타입에서 sc라는 이름을 붙이고 new 인스턴스화 해서 데이터타입 로못에 System.in 키보드 입력 기능을 추가한다.
        Scanner sc = new Scanner(System.in);

        // sc라고 이름을 붙인 즉 Scanner(System.in)기능을 하는 곳에서 nextInt() 정수형을 하나 요청한다.
        int A = sc.nextInt();
        
        // sc라고 이름을 붙인 즉 Scanner(System.in)기능을 하는 곳에서 nextInt() 정수형을 하나 더 요청한다.
        int B = sc.nextInt();

        // println에서 ln은 개행을 의미한다. 즉 출력하고 개행한다는 뜻이다.
        System.out.println(A * B);
    }
}