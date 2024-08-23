package array_String.Hard;

import java.util.ArrayList;
import java.util.List;

public class Justification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int numOfLetters = 0;

        for (String word : words) {
            int baba = numOfLetters + word.length() + currentLine.size();
            // Check if adding the next word exceeds the maxWidth
            if (numOfLetters + word.length() + currentLine.size() > maxWidth) {
                // Distribute spaces
                for (int i = 0; i < maxWidth - numOfLetters; i++) {
                    int index = (currentLine.size() - 1 == 0) ? 0 : i % (currentLine.size() - 1);
                    currentLine.set(index, currentLine.get(index) + " ");
                }
                
                res.add(String.join("", currentLine));
                currentLine.clear();
                numOfLetters = 0;
            }
            currentLine.add(word);
            numOfLetters += word.length();
        }

        // Handle the last line (left-justified)
        StringBuilder lastLine = new StringBuilder(String.join(" ", currentLine));
        while (lastLine.length() < maxWidth) {
            lastLine.append(" ");
        }
        res.add(lastLine.toString());

        return res;
    }

    // words = ["This", "is", "an", "example", "of", "text", "justification."],
    // maxWidth = 16
    public static void main(String a[]) {
        String[] word = { "This", "is", "an", "example", "of", "text", "justification." };
        int maxWidth = 18;
        Justification tj = new Justification();
        List<String> ans = tj.fullJustify(word, maxWidth);
        for (String ele : ans) {
            System.out.println(ele);
        }
        System.out.println(ans);
    }
}