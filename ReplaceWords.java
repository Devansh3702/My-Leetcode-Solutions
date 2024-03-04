import java.util.List;
import java.util.TreeSet;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        TreeSet<String> set = new TreeSet<>();
        for (String s : dictionary) {
            set.add(s);
        }

        String[] words = sentence.split(" ");
        String retVal = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String subString = "";

            for (int j = 0; j < word.length(); j++) {
                subString += word.charAt(j);

                if (set.contains(subString)) {
                    words[i] = subString;
                    j = word.length();
                }
            }

            if (i != words.length - 1) {
                retVal += (words[i] + " ");
            }
            else {
                retVal += (words[i]);
            }
        }

        return retVal;
    }
}