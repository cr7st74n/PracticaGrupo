package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import modelo.Revista;

public class GestionDatosRevi {
private String pathPersona="Datos/Revistas.txt";
	public GestionDatosRevi() {
		
	}
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
}