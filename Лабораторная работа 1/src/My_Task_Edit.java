
import java.util.ArrayList;
import java.util.Scanner;

public class My_Task_Edit {

	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	
	public void InputArray()
	{
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		N = sc.nextInt();
		
		double a;
		for (int i=0; i<N; i++)
		{
			System.out.print("������� ����� " + String.valueOf(i+1) + " > ");
			a=sc.nextDouble();
			aa.add(a);
		}
		sc.close();
	}
	
	public void PrintResult()
	{
		double  srarif =0;
		double sum =0;
		System.out.println("������� ��������������: ");
		for (int i=0; i<N; i++)
		{
			sum +=aa.get(i); 
		}
		srarif = sum/N;
		System.out.println(srarif);
	}
}
