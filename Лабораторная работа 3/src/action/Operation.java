package action;

import input_output.Chislo;
public class Operation {

	
	private static int ob_znamenatel (int a, int b) {
		int max, min, oz;
		max = Math.max(a, b);
		min = Math.min(a, b);
		oz=max;
		while((oz % min !=0) | (oz % max !=0))
		{
			oz+=1;
		}
		return oz;
	}
	public static Chislo plus(Chislo aa, Chislo bb)
	{
		Chislo cc = new Chislo();
		cc.znamenatel = Operation.ob_znamenatel(aa.znamenatel, bb.znamenatel ); 
		cc.chislitel = (cc.znamenatel/aa.znamenatel)*aa.chislitel + (cc.znamenatel/bb.znamenatel)*bb.chislitel;
		cc.Sokr();
		return cc;
	}
	
}
