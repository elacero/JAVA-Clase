package pkgEjecutame;

import pkgClasesGranja.Pato;

public class CrearPatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato mipato=new Pato(8);
		mipato.AndarAdelante(3);
		System.out.println("La posici�n del pato es "+mipato.DimePosicion());
	}

}
