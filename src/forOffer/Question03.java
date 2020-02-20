package forOffer;
//替换空格
public class Question03 {
    //我的解法，用substring
    public String replaceSpace(String s) {
        int i=0;
        while (i<s.length()){//指针越界停止
            if (s.charAt(i)==' '){
                s = s.substring(0,i) + "%20" + s.substring(i+1);
                i=i+3;
            }
            else {
                i++;
            }
        }
        return s;
    }
    //字符数组
    //我感觉内存太浪费了
    public String replaceSpace02(String s) {
        int length = s.length();
        char[] array = new char[length * 3];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else {
                array[size++] = c;
            }
        }
        String newStr = new String(array, 0, size);
        return newStr;
    }
    //运用StringBuilder
    public String replaceSpace03(String s) {
        StringBuilder res = new StringBuilder();
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

}
