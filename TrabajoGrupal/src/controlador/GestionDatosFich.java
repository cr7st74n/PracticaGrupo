package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.FichaInscripcion;
import modelo.Equipo;
import modelo.Jugador;

public class GestionDatosFich {
	private List<FichaInscripcion> fichas;
	private List<Equipo> equipos;
	private List<Jugador> jugadores;
private String pathPersona="C:/Users/edwin/git/PracticaGrupo/TrabajoGrupal/Datos/Ficha Inscripcion.txt";

public GestionDatosFich(List<FichaInscripcion> fichas, List<Equipo> equipos, List<Jugador> jugadores, String pathPersona) {
	super();
	this.fichas = fichas;
	this.equipos = equipos;
	this.jugadores = jugadores;
	this.pathPersona = pathPersona;
}

public GestionDatosFich() {
	fichas = new ArrayList<FichaInscripcion>();
	equipos = new ArrayList<Equipo>();
	jugadores = new ArrayList<Jugador>();
}


public void newFicha(String costo,String nombreEq,String nombreCap,String apellidoJu,String nombreJu) throws IOException{
	
	FichaInscripcion re=new FichaInscripcion();	
  re.setCosto(costo);
	
		
	Equipo ar=new Equipo();
ar.setNombre(nombreEq);
ar.setCapitan(nombreCap);
	equipos.add(ar);
  re.setEquipos(ar);

    Jugador au=new Jugador();
au.setNombre(nombreJu);
au.setApellido(apellidoJu);

    jugadores.add(au);
	ar.setJugadores(au);
	
	fichas.add(re);
	
try{
		
		FileWriter file=new FileWriter(pathPersona,true);
		BufferedWriter out=new BufferedWriter(file);
		String registro=costo+";"+nombreEq+";"+nombreCap+";"+nombreJu+";"+apellidoJu;
		
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

public List<FichaInscripcion> getFichas(){
	return fichas;
	
}
}
