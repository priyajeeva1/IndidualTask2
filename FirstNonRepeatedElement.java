package priya;

import java.util.ArrayList;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(9);

        int firstNonRepeatedElement = getFirstNonRepeatedElement(list);
        System.out.println("First non-repeated element in the list is: " + firstNonRepeatedElement);
    }

   public static int getFirstNonRepeatedElement(ArrayList<Integer> list) {
        int firstNonRepeatedElement = 0;
        for (int i = 0; i < list.size(); i++) 
        {
            int element = list.get(i);
            int count = 0;
            for (int j = 0; j < list.size(); j++) 
            {
                if (element == list.get(j)) 
                {
                    count++;
                }
            }
            if (count == 1) 
            {
                firstNonRepeatedElement = element;
                break;
            }
        }
        return firstNonRepeatedElement;
    }
}
