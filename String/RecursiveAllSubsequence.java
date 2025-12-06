package String;

import java.util.ArrayList;
import java.util.List;

public class RecursiveAllSubsequence {
    static List<String> al = new ArrayList<>();
    public static void main(String[] args)
    {
        String s = "abcd";
        findSubsequences(s);
        System.out.println(al);
    }
    private static void findSubsequences(String s) {
        if (s.isEmpty()) {
            return;
        }
        findSubsequences(s.substring(1));
        String fir = String.valueOf(s.charAt(0));
        List<String> copied = new ArrayList<>(al);
        for (String e : copied) {
            al.add(fir + e);
        }
        al.add(fir);
    }
}
