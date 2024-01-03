
import java.util.*;

class Prog22a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(countD(arr));
    }

    public static int countD(String[] arr) {
        HashSet<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        return set.size();
    }
}