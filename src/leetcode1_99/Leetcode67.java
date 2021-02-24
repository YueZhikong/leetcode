package leetcode1_99;

public class Leetcode67 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int p = a.length();
        int q = b.length();
        while(p>0||q>0){
            if(p<=0){
                result.append((carry+Integer.parseInt(b.substring(q-1,q)))%2);
                carry = (carry+Integer.parseInt(b.substring(q-1,q)))/2;
                q--;
            }
            else if(q<=0){
                result.append((carry+Integer.parseInt(a.substring(p-1,p)))%2);
                carry = (carry+Integer.parseInt(a.substring(p-1,p)))/2;
                p--;
            }
            else{
                result.append((carry+Integer.parseInt(a.substring(p-1,p))+Integer.parseInt(b.substring(q-1,q)))%2);
                carry = (carry+Integer.parseInt(a.substring(p-1,p))+Integer.parseInt(b.substring(q-1,q)))/2;
                p--;
                q--;
            }
        }
        while(carry>0){
            result.append(carry%2);
            carry=carry/2;
        }
        return result.reverse().toString();
    }
}
