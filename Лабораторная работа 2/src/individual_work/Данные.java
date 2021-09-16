package individual_work;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class Данные {

	Hashtable<Meneger, Vector<Клиент>> таблица = 
			new Hashtable<Meneger, Vector<Клиент>>();
	private Данные() { }
	public static Данные Инициализация() 
	{
		Данные data = new Данные();
		
		Meneger новый = new Meneger();
		новый.код = "001";
		новый.fio = "Мещеряков А. А.";
		новый.volume = 100;
		новый.cash = 150;
		новый.debit = 800;
		новый.оценка = Оценка_клиентов.Удовлетворительно;
		новый.team = Команда.Замечательно;
		новый.состояние = Состояние.Свободен;
		data.таблица.put(новый, new Vector<>());
		
		новый = new Meneger();
		новый.код = "002";
		новый.fio = "Черных Ф. С.";
		новый.volume = 200;
		новый.cash = 350;
		новый.debit = 100;
		новый.оценка = Оценка_клиентов.Замечательно;
		новый.team = Команда.Замечательно;
		новый.состояние = Состояние.Свободен;
		data.таблица.put(новый, new Vector<>());
		
		новый = new Meneger();
		новый.код = "003";
		новый.fio = "Муромов И. П.";
		новый.volume = 50;
		новый.cash = 100;
		новый.debit = 300;
		новый.оценка = Оценка_клиентов.Удовлетворительно;
		новый.team = Команда.Плохо;
		новый.состояние = Состояние.Свободен;
		data.таблица.put(новый, new Vector<>());
		return data;
	}
	public void Список()
	{
		таблица.entrySet().stream().forEach(e->{
			Meneger worker = e.getKey();
			System.out.println( worker.код  + "\n" + worker.fio + "\n");
		});
	}
	public void Info(String code)
	{
		Optional<Entry<Meneger, Vector<Клиент>>> find = таблица.entrySet().stream()
				.filter(e->e.getKey().код.equals(code)).findFirst();
		if (find.isPresent())
		{
			System.out.println("ФИО: " + find.get().getKey().fio + "\n" +
					"Объем продаж: " + String.valueOf(find.get().getKey().volume) + "\n" + 
					"Поступление средств: " + String.valueOf(find.get().getKey().cash) + "\n" +
					"Дебиторская задолженность: " + String.valueOf(find.get().getKey().debit) + "\n" +
					"Общая оценка клиентов: " + String.valueOf(find.get().getKey().оценка) + "\n" +
					"Способность работать в команде: " + String.valueOf(find.get().getKey().team) + "\n" +
					"Наличие клиентов на данный момент: " + String.valueOf(find.get().getKey().состояние) + "\n");
		}
		else 
		{
			System.out.println("Специалиста с таким номером нет");
		}}
		public void Подача_заявки(String код_менеджера, Клиент клиент)
		{
			Optional<Entry<Meneger, Vector<Клиент>>> find = таблица.entrySet().stream()
					.filter(e->e.getKey().код.equals(код_менеджера)).findFirst();
			if (find.isPresent())
			{
				if(find.get().getKey().состояние == Состояние.Свободен)
				{
					find.get().getKey().состояние = Состояние.Есть_клиент;
					find.get().getValue().add(клиент);
					System.out.println("Ваша заявка принята");
				}
				else System.out.println("Специалиста занят, подождите пока он освободится \n или выберите другого");}
			else 
			
				System.out.println("Специалиста с таким номером нет");
			
		}
	}

