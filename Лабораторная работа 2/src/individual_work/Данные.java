package individual_work;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class ������ {

	Hashtable<Meneger, Vector<������>> ������� = 
			new Hashtable<Meneger, Vector<������>>();
	private ������() { }
	public static ������ �������������() 
	{
		������ data = new ������();
		
		Meneger ����� = new Meneger();
		�����.��� = "001";
		�����.fio = "��������� �. �.";
		�����.volume = 100;
		�����.cash = 150;
		�����.debit = 800;
		�����.������ = ������_��������.�����������������;
		�����.team = �������.������������;
		�����.��������� = ���������.��������;
		data.�������.put(�����, new Vector<>());
		
		����� = new Meneger();
		�����.��� = "002";
		�����.fio = "������ �. �.";
		�����.volume = 200;
		�����.cash = 350;
		�����.debit = 100;
		�����.������ = ������_��������.������������;
		�����.team = �������.������������;
		�����.��������� = ���������.��������;
		data.�������.put(�����, new Vector<>());
		
		����� = new Meneger();
		�����.��� = "003";
		�����.fio = "������� �. �.";
		�����.volume = 50;
		�����.cash = 100;
		�����.debit = 300;
		�����.������ = ������_��������.�����������������;
		�����.team = �������.�����;
		�����.��������� = ���������.��������;
		data.�������.put(�����, new Vector<>());
		return data;
	}
	public void ������()
	{
		�������.entrySet().stream().forEach(e->{
			Meneger worker = e.getKey();
			System.out.println( worker.���  + "\n" + worker.fio + "\n");
		});
	}
	public void Info(String code)
	{
		Optional<Entry<Meneger, Vector<������>>> find = �������.entrySet().stream()
				.filter(e->e.getKey().���.equals(code)).findFirst();
		if (find.isPresent())
		{
			System.out.println("���: " + find.get().getKey().fio + "\n" +
					"����� ������: " + String.valueOf(find.get().getKey().volume) + "\n" + 
					"����������� �������: " + String.valueOf(find.get().getKey().cash) + "\n" +
					"����������� �������������: " + String.valueOf(find.get().getKey().debit) + "\n" +
					"����� ������ ��������: " + String.valueOf(find.get().getKey().������) + "\n" +
					"����������� �������� � �������: " + String.valueOf(find.get().getKey().team) + "\n" +
					"������� �������� �� ������ ������: " + String.valueOf(find.get().getKey().���������) + "\n");
		}
		else 
		{
			System.out.println("����������� � ����� ������� ���");
		}}
		public void ������_������(String ���_���������, ������ ������)
		{
			Optional<Entry<Meneger, Vector<������>>> find = �������.entrySet().stream()
					.filter(e->e.getKey().���.equals(���_���������)).findFirst();
			if (find.isPresent())
			{
				if(find.get().getKey().��������� == ���������.��������)
				{
					find.get().getKey().��������� = ���������.����_������;
					find.get().getValue().add(������);
					System.out.println("���� ������ �������");
				}
				else System.out.println("����������� �����, ��������� ���� �� ����������� \n ��� �������� �������");}
			else 
			
				System.out.println("����������� � ����� ������� ���");
			
		}
	}

