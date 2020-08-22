package doubleCompetation.Competation33;

public class Question5479 {
    public static String thousandSeparator(int n) {
        String str = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1;i>=0;i--){
            if ((str.length()-i)%3==0&&i!=0){
                result.append(str.charAt(i));
                result.append('.');
            }
            else {
                result.append(str.charAt(i));
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(thousandSeparator(123456789));
    }
}
