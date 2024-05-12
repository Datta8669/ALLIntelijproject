import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "ababc";
        char ch2[] = str.toCharArray();
        int len=0;
        char c;
        Map<Character, Integer> mp = new LinkedHashMap<>();
        for (int i = 0; i < ch2.length; i++) {
            c = ch2[i];
            if(! (mp.containsKey(c))) {
                mp.put(c, i);   //
            }else{
                i=mp.get(c);
                mp.clear();
            }
            if(mp.size()>len){
                len=mp.size();
            }
        }
        System.out.println(len);
        System.out.println(mp.keySet().toString());
    }
}