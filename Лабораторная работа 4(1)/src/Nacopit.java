
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Nacopit extends BankCard {
	 
	float pr1; //процент накопления
	
	public Nacopit (String e, String number, GregorianCalendar date, String n,
			float m, float ppr1) 
	{
		super(e,number, date, n, m);
		pr1 =ppr1;
	}
	
	@Override 
	public String toString()
	{
		return super.toString() + 
				"\n Процент накопления: " + String.valueOf(pr1) + "\n";
	}
	
	
	 private void Nachisl_pr(GregorianCalendar op)
	 {
		 int kol = (op.get(Calendar.YEAR)-date_op.lastElement().get(Calendar.YEAR))*12 + op.get(Calendar.MONTH)-date_op.lastElement().get(Calendar.MONTH);
		 for (int i=0; i<kol; i++)
		 {
			 money+= money*pr1*0.01f; 
		 }

	 }
	 
	 
	 @Override
		public void Plus (float sum, GregorianCalendar d)
		{
		 this.Nachisl_pr(d);
		 super.Plus(sum, d);
		}
		

	@Override
	public void Minus (float sum, GregorianCalendar d)
	{
		this.Nachisl_pr(d);
		super.Minus(sum, d); 
	}
}
