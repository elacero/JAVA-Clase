package clases;

public class Pato {
	
	private int Posici�n;
	
	public Pato(int p)
	{
		this.Posici�n=p;
	}
	
	public int AndarAdelante(int pasos)
	{
		this.Posici�n+=pasos;
		return this.Posici�n;
	}

	public int AndarAtras(int pasos)
	{
		this.Posici�n-=pasos;
		return this.Posici�n;
	}
	
	public int DamePosicion()
	{
		return this.Posici�n;
	}
	
}
