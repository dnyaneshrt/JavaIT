package collection;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack elements=new Stack();
        elements.push(50);//push is used to add element into stack
        elements.push(150);
        elements.push(560);
        elements.push(508);
        elements.push(450);

        System.out.println("peek element:   "+ elements.peek());

        elements.pop();//to remove an elemnt we use pop

        System.out.println("peek element:   "+ elements.peek());
        System.out.println(elements);

        System.out.println("using for each loop");
        for(Object s:elements)
        {
            System.out.println(s);
        }
        System.out.println("using iterrator");
        Iterator itr=elements.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("total elements are: "+elements.size());



    }
}
