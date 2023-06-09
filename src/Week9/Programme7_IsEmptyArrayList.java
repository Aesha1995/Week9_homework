package Week9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not
 */
public class Programme7_IsEmptyArrayList {
    public static void main(String[] args)
    {
        Programme7_IsEmptyArrayList obj = new Programme7_IsEmptyArrayList(); //instance obj created for instance method
        obj.empty(); //instance method calling
    }
    public void empty()
    {
        ArrayList days = new ArrayList(); //obj created for arraylist
        //Add obj into days collection
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        for (Object a : days) // foreach loop
        {
            System.out.println(a);
        }
        System.out.println(days.isEmpty()); //check whether Arraylist is empty or not
    }
}
