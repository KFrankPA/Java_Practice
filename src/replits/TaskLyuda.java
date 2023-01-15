package replits;

public class TaskLyuda {
    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();
        while (num != 0) {
            int remainder = num % 10;
            result += Math.pow(remainder, n);
            num /= 10;
        }
        if (result == originalNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isArmstrongNumber(153);
    }
}
