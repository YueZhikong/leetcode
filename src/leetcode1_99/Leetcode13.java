package leetcode1_99;

public class Leetcode13 {
    //近似枚举，速度慢了
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            int value = 0;
            if (i < s.length() - 1) {
                value = valueOfStr(s.substring(i, i + 2));
                if (value == 0) {
                    value = valueOfChar(s.charAt(i));
                    i++;
                }
                else {
                    i=i+2;
                }
            } else {
                value = valueOfChar(s.charAt(i));
                i++;
            }
            sum = sum + value;
        }
        return sum;
    }


    private int valueOfChar(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    private int valueOfStr(String s) {
        switch (s) {
            case "IV":
                return 4;
            case "IX":
                return 9;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "CD":
                return 400;
            case "CM":
                return 900;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Leetcode13 leetcode = new Leetcode13();
        System.out.println(leetcode.romanToInt("MCMXCIV"));
    }
}
