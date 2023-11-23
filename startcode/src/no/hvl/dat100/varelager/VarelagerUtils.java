package no.hvl.dat100.varelager;

public class VarelagerUtils {

	public static Vare finnBilligste(Vare[] varer) {
		Vare billigste = new Vare(-1, null, Double.MAX_VALUE);
		for (Vare v : varer) {
			if (v.getPris() < billigste.getPris()) {
				billigste = v;
			}
		}
		return billigste;
	}
	
	public static double totalPris(Vare[] varer) {		
		double sum = 0;
		for (Vare v : varer) {
			sum += v.getPris();
		}
		return sum;
	}
	
	public static int[] finnVarenr(Vare[] varer) {
		int[] varenr = new int[varer.length];
		for (int i = 0; i < varenr.length; i++) {
			varenr[i] = varer[i].getVarenr();
		}
		return varenr;
	}
	
	public static double[] finnPrisDifferanser(Vare[] varer) {
		double[] differanse = new double[varer.length - 1];
		for (int i = 0; i < differanse.length; i++) {
			differanse[i] = varer[i+1].getPris() - varer[i].getPris();
		}
		return differanse;
	}
}
