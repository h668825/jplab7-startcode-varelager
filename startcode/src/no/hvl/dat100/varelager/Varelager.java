package no.hvl.dat100.varelager;

public class Varelager {

	protected Vare[] varer;
	protected int antall;
	
	public Varelager(int n) {
		
		varer = new Vare[n];
		antall = 0;

	}
	
	public Vare[] getVarer() {
		
		return this.varer;

	}
	
	public boolean leggTilVare(Vare v) {
		if (!(antall < varer.length)) {
			return false;
		}
		
		varer[antall] = v;
		antall++;
		return true;

	}
	
	public boolean leggTil(int varenr, String navn, double pris) {
		
		Vare v = new Vare(varenr, navn, pris);
		return (leggTilVare(v));

	}
	
	public Vare finnVare(int varenr) {
			
		for (Vare v : varer) {
			if (v.getVarenr() == varenr) {
				return v;
			}
		}
		return null;
		

	}
	
	private String SEP = "==============================";
	
	public void printVarelager() {
				
		System.out.println(SEP);
		for (int i=0; i < antall; i++) {
			System.out.print(varer[i].toString());
		}
		System.out.println(SEP);

	}
	
}
