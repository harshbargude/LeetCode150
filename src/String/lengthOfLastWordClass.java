package String;

public class lengthOfLastWordClass {
    public static void main(String[] args) {
        
        String s = "Hello World";
        int length = lengthOfLastWord(s);
        System.out.println(length);
    }
    static int lengthOfLastWord(String s){
        String[] arrString = s.split("\\s+");
        String last = arrString[arrString.length-1];
        
        return last.length();
    }
}
