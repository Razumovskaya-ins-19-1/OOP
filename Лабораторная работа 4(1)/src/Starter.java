import java.util.Vector;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		
		Vector<BankCard> cards= new Vector<BankCard>();
		cards.add(new Nacopit("***", "123456", new GregorianCalendar(2021, 0, 21), "Катберт Энн",
			12000, 2));
		cards.add(new Zarplata("***", "654321", new GregorianCalendar(2021, 1, 18), "Катберт Энн",
			5400, 40000));
		cards.add(new Overdraft("***", "987456", new GregorianCalendar(2021, 3, 7), "Катберт Энн",
				14000, 0.4f, 8000, 8.6f));
		cards.add(new Credit_card("***", "987456", new GregorianCalendar(2021, 3, 7), "Катберт Энн",
				14000, 12, 10));
		Scanner sc = new Scanner(System.in);
		int z1;
		BankCard e;
		System.out.println("Выберите карту: \n"
								+ "1 - Накопительная \n"
								+ "2 - Зарплатная \n"
								+ "3 - Овердрафт \n "
								+ "4 - Кредитная \n");
		 z1 = sc.nextInt();


		switch(z1)
		{
		case 1: e= cards.elementAt(0); e= (Nacopit)e;  break;
		case 2: e= cards.elementAt(1); e= (Zarplata)e; break;
		case 3: e= cards.elementAt(2); e= (Overdraft)e; break;
		default: e= cards.elementAt(3); e= (Credit_card)e; break;
		}
		System.out.println(e.toString());
		
		System.out.println("Выберите операцию: \n"
				+ "1 - Положить на счёт \n"
				+ "2 - Снять со счёта \n");
		
		int z2 = sc.nextInt();
		System.out.println("введите сумму >");
		float summa1 = sc.nextFloat();
		GregorianCalendar dt =  new GregorianCalendar(2021, 5, 16);
		switch(z2)
		{
		case 1:  e.Plus(summa1, dt); break;
		case 2:	 e.Minus(summa1, dt); break;
		}
		System.out.println(e.toString());
		switch(z1)
		{
		case 1: cards.insertElementAt(e, 0);  break;
		case 2: cards.insertElementAt(e, 1); break;
		case 3: cards.insertElementAt(e, 2); break;
		default: cards.insertElementAt(e, 3);break;
		}


	}}

