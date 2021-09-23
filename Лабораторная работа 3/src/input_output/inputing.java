package input_output;

import java.util.Scanner;
import action.Operation;
public class inputing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое слагаемое >");
		String stroka1 = sc.nextLine();
		Chislo ch1 = new Chislo(stroka1);
		System.out.println("Введите второе слагаемое >");
		String stroka2 = sc.next();
		Chislo ch2 = new Chislo(stroka2);
		Chislo ch3 = Operation.plus(ch1, ch2);
		System.out.println("Ответ: " + stroka1 + " + " + stroka2
		+ " = " + ch3.chislitel + "/" + ch3.znamenatel 
		+ ch3.Smesh() + ch3.drob_dec());
	}

}
