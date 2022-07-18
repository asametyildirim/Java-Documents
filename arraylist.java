import java.util.*;
public class Main {

    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara");

        // System.out.println(numbers.size()); //write the size of the numbers collection to the screen
        // numbers.set(0,100); //0. Set the value of the element to 100.
        // numbers.remove(0); //0. Destroy the element. As such, element 1 becomes element 0.
        // numbers.clear(); //delete all numbers library.
        // System.out.println(numbers.get(0));

        for(Object i : numbers){
            System.out.println(i);
        }

    }
}