package lesson16_home;

public class Main2 {
    public static void main(String[] args) {

        StringUtilImpl stringUtil1 = new StringUtilImpl();
        System.out.println(stringUtil1.div("232", "988"));


        try {
            stringUtil1.findNumbers("1J30243r34fem...243146t5kyk065023fjldkkjhgk");
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
}
