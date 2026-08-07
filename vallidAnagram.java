class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars1=s.toCharArray();
        Arrays.sort(chars1);
        String len1=new String(chars1);
        char[] chars2=t.toCharArray();
        Arrays.sort(chars2);
        String len2=new String(chars2);
        if(len1.equals(len2)){
            return true;
        }
        else{
            return false;
        }
    }
}
