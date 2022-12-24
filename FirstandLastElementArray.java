package interviewbasedquestion;

import java.util.ArrayList;

public class FirstandLastElementArray {

	public static void main(String[] args) {
		 ArrayList<Integer> al=new ArrayList<>();
	      {
	        al.add(5);
	        al.add(3);
	        al.add(4);
	        al.add(5);
	        al.add(1);
	        al.add(3);
	        System.out.println("Elements in an arraylist :"+ al);
	int first=al.get(0);
	int last = al.get(al.size()-1);
	        System.out.println("First Elements in an arraylist :"+ first);
	        System.out.println("Last Elements in an arraylist :"+ last);
	      }

	}

}
