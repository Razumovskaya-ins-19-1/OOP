
import java.util.GregorianCalendar;

public class Platezh extends BankCard {

float pr; // процент %
	
	public Platezh (String e, String number, GregorianCalendar  date, String n, float m, float ppr ) 
	{
		super(e,number, date, n, m);
		pr =ppr;
	}
	
	@Override 
	public String toString()
	{
		return super.toString() + 
				"\n Процент кэшбека: " + String.valueOf(pr) + "\n";
	}
	
	public float CashBack(float Pok)
	{
		float bonus=Pok*(pr*0.01f);
		return bonus;
	}
	
	@Override
	public void Minus (float summa, GregorianCalendar d_op)
	{
		super.Minus(summa, d_op);
		money+=CashBack(summa);
	}
}
