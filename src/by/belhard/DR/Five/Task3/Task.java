package by.belhard.DR.Five.Task3;
import java.util.HashMap;

public class Task {
    public static void main(String[] args) {
        String s = "AA,aa";
        String[] ch = s.split("");
        HashMap<String, Integer> keyValue = new HashMap<String, Integer>();
        for (int i = 0; i <= ch.length - 1; i++) {
            if (keyValue.containsKey(ch[i])) {
                int num = keyValue.get(ch[i]);
                keyValue.put(ch[i], num + 1);
            } else {
                keyValue.put(ch[i], 1);
            }
        }
        System.out.println(keyValue);
    }
}