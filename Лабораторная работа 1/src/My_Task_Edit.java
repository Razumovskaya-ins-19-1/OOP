
import java.util.ArrayList;
import java.util.Scanner;

public class My_Task_Edit {

	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	
	public void InputArray()
	{
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел > ");
		N = sc.nextInt();
		
		double a;
		for (int i=0; i<N; i++)
		{
			System.out.print("Введите число " + String.valueOf(i+1) + " > ");
			a=sc.nextDouble();
			aa.add(a);
		}
		sc.close();
	}
	
	public void PrintResult()
	{
		double  srarif =0;
		double sum =0;
		System.out.println("Среднее арифметическое: ");
		for (int i=0; i<N; i++)
		{
			sum +=aa.get(i); 
		}
		srarif = sum/N;
		System.out.println(srarif);
	}
}
