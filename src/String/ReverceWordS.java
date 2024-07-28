package String;


public class ReverceWordS {
    public static void main(String[] args) {
        String s = "a good   example";
        String answer = Solution.reverceWordinString(s);
        System.out.println(answer);
    }

    private class Solution{

        public static String reverceWordinString(String s) {
            s = s.trim();
            String[] splitSentenceInWord  = s.split("\\s+");
            StringBuffer reverse = new StringBuffer();
            for(int i=splitSentenceInWord.length-1; i>=0; i--){
                reverse.append(splitSentenceInWord[i]);
                if(i>0){
                    reverse.append(" ");
                }
            }
            return reverse.toString();
        }
    }

}

