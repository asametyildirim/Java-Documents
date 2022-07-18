import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("İzmir");
        cities.add("Adama");

        Collections.sort(cities);

        for(String i: cities){
            System.out.println();
        }
    }
}
