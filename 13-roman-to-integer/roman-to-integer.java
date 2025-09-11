import java.util.HashMap;
//  solve
class Solution {
    public int romanToInt(String s) {
        return romanToInteger(s);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));  // use charAt, not CharAt

        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result -= hm.get(s.charAt(i));
            } else {
                result += hm.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "III";  // Example input
        int integerValue = solution.romanToInt(s);
        System.out.println("Roman: " + s + " → Integer: " + integerValue);
    }
}
