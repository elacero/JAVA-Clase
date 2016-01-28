package pkgEjecutame;

import java.util.ArrayList;

import pkgClasesGranja.Granja;
import pkgClasesGranja.Pato;

public class CrearPatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato mipato=new Pato(8);
		mipato.setSexo("H");
		mipato.AndarAdelante(3);
		System.out.println("La posición del pato es "+mipato.DimePosicion());
		ArrayList<Pato> patos=new ArrayList<Pato>();
		patos.add(mipato);
		Granja gallinero=new Granja(patos);
		
	}

}
