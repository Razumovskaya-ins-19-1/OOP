import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zarplata extends BankCard {

	float zarp;
	
	public Zarplata (String e, String number, GregorianCalendar date, String n,
			float m, float z)
	{
		super(e, number, date, n, m);
		zarp = z;
	}
	
	@Override 
	public String toString()
	{
		return super.toString() + 
				"\n Зарплата: " + String.valueOf(zarp) + "\n";
	}
	
	public void Nachisl_zarp (GregorianCalendar op)
	{
		 int kol = (op.get(Calendar.YEAR)-date_op.lastElement().get(Calendar.YEAR))*12 + op.get(Calendar.MONTH)-date_op.lastElement().get(Calendar.MONTH);
		 for (int i=0; i<kol; i++)
			 money+=zarp;
	}
	
	
	@Override
	public void Plus(float summa, GregorianCalendar d_op)
	{
		Nachisl_zarp(d_op);
		super.Plus(summa, d_op);
	}
	
	@Override
	public void Minus(float summa, GregorianCalendar d_op)
	{
		Nachisl_zarp(d_op);
		super.Minus(summa, d_op);
	}
	
}
