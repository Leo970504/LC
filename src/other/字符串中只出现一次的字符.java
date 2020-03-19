package other;

/*
题目描述
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */

import java.util.HashMap;

public class 字符串中只出现一次的字符 {
    public int FirstNotRepeatingChar(String str) {
        if(str == null && str == "") {
            return -1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            if(map.keySet().contains(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }
        for(int i=0; i<str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
