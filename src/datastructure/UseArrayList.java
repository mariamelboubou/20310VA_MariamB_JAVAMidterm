package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> pizza = new ArrayList<>();


        pizza.add("Veggie Pizza");  // --> true
        pizza.add("Cheese Pizza");  // --> true
        pizza.add("Pepporoni Pizza"); // --> true
        pizza.add("Buffalo Chicken Pizza"); // --> true
        pizza.add("Meat Lover's Pizza"); // --> true
        pizza.add("Ham Pizza");

        pizza.remove(2);
        System.out.println(pizza);

        System.out.println(pizza.contains("Cheese Pizza"));
        System.out.println(pizza.get(0));









    }

}
