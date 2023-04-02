package Week9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme5_IteratorArrayList {
    public static void main(String[] args)
    {
        value();
    }
    public static void value()
    {
        ArrayList <String> days = new ArrayList(); //obj created for arraylist
        //Add obj into days collection
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        Iterator list = days.iterator();
        while(list.hasNext()) //check whether value is in arraylist or not
        {
            System.out.println(list.next()); //passing the next element value and check again
        }
    }
}
