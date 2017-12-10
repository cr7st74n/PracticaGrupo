package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;
import modelo.Autor;
import modelo.Revista;

public class GestionDatosRevi {
	private List<Revista> revistas;
	private List<Autor> autores;
	private List<Articulo> articulos;
private String pathPersona="Datos/Revistas.txt";
	
public GestionDatosRevi() {
		
	}
Revista ar=new Revista();
public void guardarPersona(Revista r){
	try{
		
		FileWriter file=new FileWriter(pathPersona,true);
		BufferedWriter out=new BufferedWriter(file);
		String registro=r.getNombre()+";"+r.getArticulos().getNumeroP();
		
		out.append(registro+"\n");
		out.close();
		file.close();
		
	}catch(IOException e){
		e.printStackTrace();    
	}
	
}
public void newRevista(String nombreR,String idoma,String titulo,String nombreAu,String apellidoAu){
	
	ar.setNombre(nombreR);
	
	Articulo ar=new Articulo();
	ar.setTitulo(titulo);
	articulos.add(ar);

	Autor au=new Autor();
    au.setNombre(nombreAu);
    au.setApellido(apellidoAu);
    autores.add(au);
	
}
}