import java.util.GregorianCalendar;

public class Overdraft extends Platezh {

	float dolg;
	float limit; 
	float pr_credit;
	public Overdraft (String e, String number, GregorianCalendar  date, String n, 
			float m, float ppr, float lim, float p)
	{
		super(e, number, date, n, m, ppr);
		limit = lim;
		pr_credit = p;
		dolg =0;
	}
	
	@Override 
	public String toString()
	{
		return super.toString() + "\n Лимит: " +  String.valueOf(limit) + 
				"\n Процентная ставка долга: " + String.valueOf(pr_credit) + 
				"\n Долг: " + String.valueOf(dolg) + "\n" ;
	}
	
	public void Dolg (float sum)
	{
		if(limit>=sum) 
			{
				dolg = sum* (1+pr_credit *0.01f);
			}
	}
	
	@Override 
	public void Minus (float summa, GregorianCalendar d_op)
	{
		if ((summa>money) && (dolg==0))
		{
			Dolg(summa-money);
			money=0;
		}
		else super.Minus(summa, d_op);
	}
	
	@Override 
	public void Plus (float summa, GregorianCalendar d_op)
	{
		if (dolg!=0)
		{
			if (summa>=dolg)
			{
				money+=summa-dolg;
				dolg = 0;
			}
			else dolg-=summa;
			
		}
		else super.Plus(summa, d_op);
	}
}
