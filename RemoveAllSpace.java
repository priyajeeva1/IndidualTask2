package interviewbasedquestion;

public class RemoveAllSpace {

	public static void main(String[] args) {
		String s="I am a Programer";
		char c[]=new char[s.length()];
		for(int i=0; i<c.length;i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
				System.out.print(c[i]);
			}
		}
		

	}

}
