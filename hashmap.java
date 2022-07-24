import java.util.HashMap;

public class Main {

     public static void main(String[] args) {
         HashMap<String,String> dictionary = new HashMap<String,String>();

         dictionary.put("computer","bilgisayar");
         dictionary.put("country","ulke");
         dictionary.put("city","sehir");

         System.out.println(dictionary.size());

         for( String item: dictionary.keySet()){
             System.out.println("Value: "+item+" Correspondence: "+dictionary.get(item));
         }

         dictionary.remove("country"); //delete the country value
         dictionary.clear(); //delete the dictionary completely
         System.out.println(dictionary.get("table"));
     }
}