package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, Integer> tablo = new HashMap<>();
        tablo.put("Динамо", 23);
        tablo.put("ЦСК", 15);
        tablo.put("Спартак", 38);
        tablo.put("Динамо", 10 + tablo.get("Динамо"));

//        System.out.println(tablo);


        //Проход по map ( С помощью keySet)
        for (String comand : tablo.keySet()) {
            System.out.println(comand + " - " + tablo.get(comand));
        }

        for (Map.Entry<String, Integer> couple : tablo.entrySet()) {
            System.out.println(couple.getKey() + " - " +couple.getValue());
        }


    }
}
