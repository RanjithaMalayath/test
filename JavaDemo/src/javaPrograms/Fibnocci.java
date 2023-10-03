package javaPrograms;

public class Fibnocci {

	public static void main(String[] args) {
		int n = 7;
		int f=1,s=1,t;
		System.out.println(f);
		System.out.println(s);
		t=f+s;
		System.out.println(t);
		
		for(int i =4;i<=n;i++)
		{
			f=s;
			s=t;
			t=f+s;
			System.out.println(t);
		}

	}

}
