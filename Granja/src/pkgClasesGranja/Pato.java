package pkgClasesGranja;

public class Pato {
	
	//Propiedades del pato
	private int Posicion;
	
	//Constructor
	public Pato(int p)
	{
		this.Posicion=p;
	}
	
	//M�todos
	public int AndarAdelante(int pasos)
	{
		return this.Posicion+=pasos;
	}
	
	public int AndarAtras(int pasos)
	{
		return this.Posicion-=pasos;
	}
	
	public int DimePosicion()
	{
		return this.Posicion;
	}

}
