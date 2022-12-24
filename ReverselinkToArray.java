package interviewbasedquestion;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverselinkToArray {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(9);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(6);
		list.add(8);
		ArrayList<Integer>reversedList=new ArrayList<>();
		for(int i=list.size()-1;i>=0;i--)
		{
			reversedList.add(list.get(i));
		}
		System.out.println(reversedList);
	}

}
