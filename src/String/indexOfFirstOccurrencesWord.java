package String;

public class indexOfFirstOccurrencesWord {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sadr" ; 

        if (haystack.indexOf(needle) != -1) {
            System.out.println("Present at ="+ haystack.indexOf(needle));
        }else{
            System.out.println("-1");
        }
    }
}
