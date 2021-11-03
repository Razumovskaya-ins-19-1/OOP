import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

public class BankCard {

	protected String emmitent;
	protected String number_card; 
	protected GregorianCalendar date_start; 
	protected String name;
	protected float money;
	protected Vector<GregorianCalendar> date_op; // ������ ��� ��������
	
	public BankCard() {}
	public BankCard (String e, String number, GregorianCalendar date, String n, float m)
	{
		emmitent = e;
		number_card = number;
		date_start = date;
		name = n;
		money = m;
		date_op= new Vector<GregorianCalendar>();
		date_op.add(date);
	}
	
	@Override 
	public String toString()
	{
		return "�����: \n ��������: " + emmitent + "\n ����� �����: " + number_card + 
				"\n ���� ����������� �����: " +  String.valueOf(date_start.getTime())
				+ "\n ��� ���������: "
				+ name + "\n ����: " + String.valueOf(money) + "\n" +  String.valueOf(date_op.lastElement().getTime());
	}
	
	public void Plus (float summa, GregorianCalendar d_op)
	{
		money+=summa;
		date_op.add(d_op);
		
	}
	
	public void Minus (float summa, GregorianCalendar d_op)
	{
		money-=summa;
		date_op.add(d_op);
	}
}
