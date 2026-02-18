import java.util.Scanner;
import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int X = sc.nextInt();
            A.add(i);
        }

        for (int i = 0; i < A.size(); i++) {
            System.out.print(A.get(i) + " ");
        }


        System.out.println(A.size());


    }
}
