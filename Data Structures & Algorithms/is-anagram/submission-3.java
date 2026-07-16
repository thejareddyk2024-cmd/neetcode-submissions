/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] array=new int[s.length()];
        char[] sarr=s.toCharArray();
        char[] tarr=t.toCharArray();
        for(int i=0;i<s.length();i++){
            int n=0;
            for(int j=0;j<s.length();j++){
                if(sarr[i]==sarr[j]){
                    n++;
                }
            }
            array[i]=n;
        }
        for(int i=0;i<s.length();i++){
            int n=0;
            for(int j=0;j<t.length();j++){
                if(sarr[i]==tarr[j]){
                    n++;
                }
            }
            if(n!=array[i]){
                return false;
            }
        }
        return true;
    }
}
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int c : count) {
            if (c != 0) return false;
        }
        
        return true;
    }
}