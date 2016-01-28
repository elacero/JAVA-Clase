package pkgClasesGranja;

public class Pato {
	
	//Propiedades del pato
	private int Posicion;
	private String Sexo;
	
	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	//Constructor
	public Pato(int p)
	{
		this.Posicion=p;
	}
	
	//Métodos
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
