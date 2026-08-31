import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        btk(n, m , new ArrayList<>(), 1);
    }

    private static void btk(int n, int m, List<Integer> box, int start) {
        if(box.size() == m) {
            for(int i : box) {
                System.out.print(i + " ");
            }
            System.out.println();
        } 

        for(int i = start ; i <= n ; i++) {
            box.add(i);
            btk(n, m , box, i + 1);
            box.remove(box.size() - 1);
        }
    }
}