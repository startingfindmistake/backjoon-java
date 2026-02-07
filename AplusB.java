import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {


        // Scanner 데이터 타입의 이름을 sc라고 정하고 Scanner 데이터 타입에 System.in 기능이 있는것을 추가해서 new 생성해줘
        Scanner sc = new Scanner(System.in);


        // sc.nextInt() sc 참조변수에 해당하는 Scanner에서 정수 형태를 달라고해서 int A에 넣어둔다.
        int A = sc.nextInt();
        // Sc.nextInt() sc 참조변수에 두번째 해당하는 Scanner에서 정수 형태를 달라고해서 int B에 넣어둔다.
        int B = sc.nextInt();

        // 출력을 A+B로 하고 println이기 때문에 ln으로 개행을 한번 한다.
        System.out.println(A + B);
    }

}
