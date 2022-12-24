package interviewbasedquestion;

import java.util.ArrayList;
import java.util.HashSet;

public class AverageOfNumericElementInSet {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(9);
		hs.add(7);
		hs.add(5);
		hs.add(1);
		hs.add(2);
		hs.add(4);
		System.out.println("element in set:"+hs);
		int sum=0;
		ArrayList<Integer> al=new ArrayList<>();
		al.addAll(hs);
		for(int i=0;i<hs.size();i++)
		{
		sum=sum+al.get(i);	
		}
System.out.println("The average of set is:"+sum/hs.size());
	}

}
