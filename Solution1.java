import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int n1 = 19;
        System.out.println("isHappy(" + n1 + "): " + solution.isHappy(n1));

        int n2 = 2;
        System.out.println("isHappy(" + n2 + "): " + solution.isHappy(n2));

        int n3 = 7;
        System.out.println("isHappy(" + n3 + "): " + solution.isHappy(n3));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
