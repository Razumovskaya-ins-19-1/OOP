import java.util.ArrayList;
import java.util.Scanner;

public class My_Task {

	public static void DoTask()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		for(int i=0; i<N; i++)
		{
			System.out.print("������� ����� "+ String.valueOf(i+1) + " > ");
			 a=sc.nextDouble();
			    aa.add(a);
		}
		double  srarif =0;
		double sum =0;
		System.out.println("������� ��������������: ");
		for (int i=0; i<N; i++)
		{
			sum +=aa.get(i); 
		}
		srarif = sum/N;
		System.out.println(srarif);
		sc.close();
	}
}
