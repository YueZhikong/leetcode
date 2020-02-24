package leetcode200_299;
//单词规律
public class Leetcode290 {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.length()==0){
            return false;
        }
        if (str.length()==0){
            return false;
        }
        String[] strings = str.split(" ");
        if (pattern.length()!=strings.length){
            return false;
        }
        int hash1=0;
        int[] hashs1=new int[pattern.length()];
        for (int i=0;i<pattern.length();i++){
            if (hashs1[i]==0){
                hash1++;
                for (int j=i;j<pattern.length();j++){
                    if (pattern.charAt(i)==pattern.charAt(j)){
                        hashs1[j]=hash1;
                    }
                }
            }
        }
        int hash2=0;
        int[] hashs2=new int[strings.length];
        for (int i=0;i<strings.length;i++){
            if (hashs2[i]==0){
                hash2++;
                for (int j=i;j<strings.length;j++){
                    if (strings[i].equals(strings[j])){
                        hashs2[j]=hash2;
                    }
                }
            }
        }
        for (int i=0;i<pattern.length();i++){
            if (hashs1[i]!=hashs2[i]){
                return false;
            }
        }
        return true;
    }
}
