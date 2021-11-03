import java.util.Calendar;
import java.util.GregorianCalendar;

public class Credit_card extends BankCard{
	
	float pr; // процент по кредиту
	int srok; // срок выплаты в месяцах (не больше года)
	float perev;
	
	public Credit_card (String e, String number, GregorianCalendar date, String n, 
			float m, float ppr, int s) 
	{
		super(e,number, date, n, m); // Здесь money - сумма взятая в банке
		pr =ppr;
		srok = s;
		perev=0;
	}
	
	private float Every_m ()
	{
		return (money/srok)+money*pr*0.01f;
	}
	
	@Override
	 public void Plus (float summa, GregorianCalendar d_op)
	 {
		summa+=perev;
		if ((d_op.get(Calendar.MONTH)-date_op.lastElement().get(Calendar.MONTH))>1)
		{
				System.out.print("Просрочка!!!");
		}
		
		if (summa>Every_m())
		{
			money-=Every_m();
			perev = summa - Every_m();
		}		
	 }
	
	
	@Override
	 public void Minus (float summa, GregorianCalendar d_op)
	 {
		System.out.println("С этой карты нельзя снимать средства!!!");
	 }
}
