import java.util.Arrays;

public class Z_Algorithm {
    public static int[] Z_Algo(String s) {
        int n = s.length();
        int[] Z = new int[n];
        Z[0] = 0;
        int left = 0;
        int right = 0;
        for (int i=1; i<n; i++) {
            if (i>=right) {
                left = i;
                right = i;
                while (right < n && s.charAt(right) == s.charAt(right - left)) {
                    right += 1;
                }  
                Z[i] = right-left;
                right -= 1;
            }
            else {
                if (Z[i-left] < right-i+1) {
                    Z[i] = Z[i-left];
                }
                else {
                    left = i;
                    while (right<n && s.charAt(right) == s.charAt(right - left)) {
                        right += 1;
                    }
                    Z[i] = right-left;
                    right -= 1;
                }
            }
        }
        // return Arrays.toString(Z); //change the return type before using this
        return Z;
    }
    public static void main(String[] arg){
        String s = "xxyaxxyazxxyaxxyaxz";
        System.out.println(Arrays.toString(Z_Algo(s)));
    }
}
