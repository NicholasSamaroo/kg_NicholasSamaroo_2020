import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        
        char[] string1 = args[0].toCharArray();
        char[] string2 = args[1].toCharArray();
        boolean result = map(string1, string2);
        System.out.print(result);
    }

    public static boolean map(char[] s1, char[] s2) {
        HashSet<Character> compareCharacters = new HashSet<Character>();
        
        /*
            We cannot map a character to an empty symbol and vice versa
            so, we check the lengths with this if statement
        */
        if((s1.length > s2.length) || (s1.length < s2.length)){
            return false;
        }

        /*
            The main string we are looking at is s1 since the mapping of that
            string affects the result. Input the characters of s1 into a HashSet
            and check if the HashSet already has that character. If it does, that means
            we have a double mapping, which is not allowed, and we return false. If the loop
            finishes, no double mappings have been found, and we return true. 
        */
        for(int i = 0; i < s1.length;i++) {
            if(compareCharacters.contains(s1[i])){
                return false;
            }
            compareCharacters.add(s1[i]);
        }
        return true;
    }
}




