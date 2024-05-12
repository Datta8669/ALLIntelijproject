import java.util.*;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String str="abcdanabcde";
        char ch2[] =str.toCharArray();
        char c;
        Map<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<ch2.length;i++){
               c=ch2[i];
            if(mp.containsKey(c)){   //agar contain hai to ...badha do na bhai......
                mp.put( c, mp.get(c)+1);
            }
            else{
                //contain hai... to usko ek hi dedo... not i..
                mp.put(c, 1);

            }
        }
       System.out.println(mp);    //{a=3, b=2, c=2, d=2, e=1, n=1}  // simple count of each character in a word
    }
   }

