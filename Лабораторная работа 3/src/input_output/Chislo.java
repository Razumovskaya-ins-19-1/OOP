package input_output;

public class Chislo {

	public int chislitel;
	public int znamenatel;
	
	public Chislo() {}
	
	public Chislo(String s1)
	{
		String [] drob;
		drob=s1.split("/");
		chislitel = Integer.valueOf(drob[0]);
		znamenatel=Integer.valueOf(drob[1]);
	}

	  String Smesh()
	 {
		if (chislitel>znamenatel) 
		{
			int Z, C;
			Z = chislitel / znamenatel;
			C= chislitel % znamenatel; 
			if (C!=0)
			return " = (" + String.valueOf(Z) + ")" + String.valueOf(C) + "/" + String.valueOf(znamenatel) + " = ";
			else return " = " + String.valueOf(Z) + " = ";
		}
		else
			return " = ";
	}
	  String drob_dec()
	  {
		  float c = chislitel;
		  float z = znamenatel;
		  return String.valueOf(c/z);
	  }
	public  void Sokr()
	  {
		  int min = Math.min(chislitel, znamenatel);
			while (min !=1)
			{
				if ((chislitel % min == 0) & (znamenatel % min == 0))
				{
					chislitel = chislitel/min;
					znamenatel = znamenatel/min;
				}
				min-=1;
			}	
	  }
}
