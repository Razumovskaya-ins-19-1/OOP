package individual_work;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Данные мои_данные = Данные.Инициализация();	
		System.out.println("Здравствуйте, введите свое ФИО > ");
		String fio = sc.nextLine();
		Menu.Choose(мои_данные, sc, fio);
		sc.close();
		System.out.println("Работа завершена");
	}

}
