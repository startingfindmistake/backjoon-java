import java.util.Scanner;



public class T5622 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 첫번째 문자열을 입력받습니다.
        String A = sc.next();
        // 총 시간을 저장할 변수를 0으로 초기화 합니다
        int total_count = 0;

        String[] str = {"","","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ",};


        //문자열에서 각 문자를 꺼내기 위해서 A의 길이만큼 반복하는 for문을 만든다. (i = 0 부터 A.length()까지)
            // 3. A.charAt(i)를 사용해 현재 순서의 문자를 꺼낸다
        for(int i = 0; i < A.length(); i++){
            char initial_A = A.charAt(i);
            // 배열 str를 탐색하는 두번째 for문을 만든다.
            for (int k = 0; k < str.length; k++){
                // 1. 현재 탐색 중인 문자열(str[k])에 initial_A가 포함되어 있는지 확인한다.
                if(str[k].indexOf(initial_A) != -1){
                    // 2. 포함되어 있다면, 인덱스 k(걸리는 시간)만큼 total_count에 더한다.
                    total_count += k;

                    // 3. 문자를 찾았으니 더 이상 str 배열을 뒤질 필요가 없으므로 내부 for문을 마친다.
                    break;
                }

            }

        }
        System.out.println(total_count);
    }
}