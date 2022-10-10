//Longest Sub-String without repeating character

import java.util.HashMap;
import java.util.HashSet;

public class LSSWRC {

    static void Check(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int n = s.length();
        char ch[];
        String str = "", max = "";
        ch = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (!hs.contains(ch[i])) {
                hs.add(ch[i]);
                str += ch[i];
            } else {
                System.out.println("!@ "+str);
                str="";
                hs.clear();
               if(i>2)
                i-=2;
               else --i;
            }
            if (str.length() > max.length())
                max = str;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
       // Check("dvdf");
        //Check("abcabcbb");
        Check("dvfder");
    }


    }

