package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;
import modelo.Autor;
import modelo.Canton;
import modelo.Pais;
import modelo.Provincia;
import modelo.Revista;

public class GestionDatosPais {
	private List<Pais> paises;
	private List<Provincia> provincias;
	private List<Canton> cantones;
private String pathPersona="TrabajoGrupal/Datos/Pais.txt";

public GestionDatosPais(List<Pais> paises, List<Provincia> provincias, List<Canton> cantones, String pathPersona) {
	super();
	this.paises = paises;
	this.provincias = provincias;
	this.cantones = cantones;
	this.pathPersona = pathPersona;
}

public GestionDatosPais() {
	paises = new ArrayList<Pais>();
	provincias = new ArrayList<Provincia>();
	cantones = new ArrayList<Canton>();
}

public void newPais(String pais,String idioma,String provincia,String canton,String alcalde) throws IOException{
	Pais re=new Pais();
re.setNombre(pais);
	re.setIdoma(idioma);
		
	Provincia ar=new Provincia();
	ar.setNombre(provincia);;
	provincias.add(ar);
    re.setProvincias(ar);

    Canton au=new Canton();
    au.setNombre(canton);
    au.setAlcalde(alcalde);
    cantones.add(au);
	ar.setCanton(au);
	
	paises.add(re);
	
try{
		
		FileWriter file=new FileWriter(pathPersona,true);
		BufferedWriter out=new BufferedWriter(file);
		String registro=pais+";"+idioma+";"+provincia+";"+canton+";"+alcalde;
		
		out.append(registro+"\n");
		out.close();
		file.close();
		
	}catch(IOException e){
		e.printStackTrace();    
	}

}

public String leerArchivos() throws Exception {
	
	FileReader arc = new FileReader(pathPersona);
	BufferedReader lectura = new BufferedReader(arc);
		String linea = "";
		
		while(linea != null) {
			linea = lectura.readLine();
			System.out.println(linea);
			return linea;
		}
		lectura.close();
	
		String dir1 = pathPersona;
		File txt = new File(dir1);
		boolean existencia = txt.exists();
		if (existencia == false) {
			throw new Exception("El archivo no existe");
		}
	
	return null;
}

public List<Pais> getPais(){
	return paises;
	
}
}
