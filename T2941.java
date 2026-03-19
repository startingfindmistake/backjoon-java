import java.util.Scanner;

public class T2941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // charAt()메서드 자체가 하나의 긴 `string`안에서 특정 위치(인덱스)의 글자를 하나씩 빼오기 때문에 배열이 필요없음
        String text = sc.next();

        // 반복문을 통해 하나씩 비교를 해보자
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'c') {
                if(text.charAt(i+1) == '=' || text.charAt(i+1) == '-'){
                    // 맞다면 다음 글자로 숫자 카운트를 하고 그것을 건너띄어야 한다.
                    i += 2;
                    // 이렇게 하면 if문을 나오면 어디로 가지?

                }
            } else if (text.charAt(i))
        }




    }
}
