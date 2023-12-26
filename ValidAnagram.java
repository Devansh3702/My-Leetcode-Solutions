// Not Optimized
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();

        for (int i = 0; i < t.length(); i++) {
            int index = findElement(sArray, t.charAt(i));
            if (index == -1) {
                return false;
            }
            sArray[index] = '-';
        }
        for(char y: sArray){
            if(y != '-'){
                return false;
            }
        }
        return true;
    }

    public static int findElement(char[] array, char value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
}