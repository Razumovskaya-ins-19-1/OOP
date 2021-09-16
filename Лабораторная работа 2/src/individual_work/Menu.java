package individual_work;

import java.util.Scanner;
public class Menu {

	
	public static void Hi(String fio)
	{
		System.out.println("Пожалуйста, " + fio + ", для просмотра информации о менеджерах фирмы ***"
				+ "выберите действие: \n"
				+ "1 - Список менеджеров \n"
				+ "2 - Информация о менеджере \n"
				+ "3 - Отправить заявку \n"
				+ "4 - Выход \n");
	}
	public static void Choose(Данные data, Scanner sc, String fio_client)
	{   int операция = 4;
		do {
			Hi(fio_client);
			операция = sc.nextInt();
		switch (операция)
		{
		case 1: data.Список(); break;
		case 2: System.out.println("Введите идентификационный номер специалиста"); 
		String code1 =  sc.next();
		data.Info(code1); break;
		case 3: System.out.println("Введите идентификационный номер специалиста"); 
		String code2 =  sc.next(); 
		Клиент новый = new Клиент(fio_client);
		data.Подача_заявки(code2, новый); break;
		default: break;}
		} while(операция !=4);
	}
}
