package clases;

public class Pato {
	
	private int Posición;
	
	public Pato(int p)
	{
		this.Posición=p;
	}
	
	public int AndarAdelante(int pasos)
	{
		this.Posición+=pasos;
		return this.Posición;
	}

	public int AndarAtras(int pasos)
	{
		this.Posición-=pasos;
		return this.Posición;
	}
	
	public int DamePosicion()
	{
		return this.Posición;
	}
	
}
