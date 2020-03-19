package other;

import java.util.ArrayList;
import java.util.HashMap;

public class 字符流中首个不重复的字符 {
    HashMap<Character, Integer> map = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        }else {
            map.put(ch, 1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        Character res = '#';
        for(char c : list) {
            if(map.get(c) == 1) {
                return c;
            }
        }
        return res;
    }
}
