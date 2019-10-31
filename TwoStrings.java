import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(twoStrings(s1, s2) == "YES");
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character> s1Store = createSetFromString(s1);

        boolean shareCommonSubString = false;
        
        for (int i = 0; i < s2.length(); i++) {
            if (s1Store.contains(s2.charAt(i))) {
                shareCommonSubString = true;
                break;
            }
        }
        
        return shareCommonSubString ? "YES" : "NO";
    }

    static Set<Character> createSetFromString(String s) {
        Set<Character> store = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            store.add(c);
        }

        return store;
    }
}