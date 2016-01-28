package pkgClasesGranja;

import java.util.ArrayList;

public class Granja {
	private ArrayList<Pato> patos;
	
	public ArrayList<Pato> getPatos() {
		return patos;
	}

	public void setPatos(ArrayList<Pato> patos) {
		this.patos = patos;
	}

	@SuppressWarnings("unchecked")
	public Granja(ArrayList<Pato> patos)
	{
		this.patos=(ArrayList<Pato>)patos.clone();
	}
	
	public Granja()
	{
		this.patos=new ArrayList<Pato>();
	}
	
	public Granja(Pato[] patos)
	{
		this.patos=new ArrayList<Pato>();
		for (Pato pato : patos) {
			this.patos.add(pato);
		}
	}
	
	public void AnnadirPato(Pato pato)
	{
		this.patos.add(pato);
	}
}
