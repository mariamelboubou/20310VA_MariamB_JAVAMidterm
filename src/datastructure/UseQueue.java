package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> pizza = new LinkedList<>();

        // Add elements to the Queue ---> referenceName.add
        // Add elements to the Queue

        pizza.add("Veggie Pizza");  // --> true
        pizza.add("Cheese Pizza");  // --> true
        pizza.add("Pepporoni Pizza"); // --> true
        pizza.add("Buffalo Chicken Pizza"); // --> true
        pizza.add("Meat Lover's Pizza"); // --> true
        pizza.add("Ham Pizza");

        // Display the queue

        System.out.println(" The first queue is : " + pizza);

        // create an iterator for the queue -- using iterator method

        Iterator<String> dominos = pizza.iterator();

        // Display the values after iteration -- through thelist
        System.out.println(" \n The iterator values " + " of queue are : ");
        {

        } while (dominos.hasNext()) { // return true or false
            System.out.println(dominos.next());
        }
        String hungry[] = {" Eat "," Dominos "," Live "," Better "};
        for (String fatBoy : hungry){
            System.out.print(fatBoy);

        }
        {
            System.out.println("****************************************************");
            pizza.poll();
            System.out.println(" \n Queue after poll " + pizza);
            pizza.remove();
            System.out.println(" \n Queue after remove : "+pizza);
            pizza.peek();
            System.out.println("\nPeek method display : "+pizza.peek());
            pizza.element();
           System.out.println("\nPeek method display : "+ pizza.element());
           System.out.println("\nDoes the queue contain this element? "+pizza.contains("Buffalo Chicken Pizza"));



        }
    }
}
