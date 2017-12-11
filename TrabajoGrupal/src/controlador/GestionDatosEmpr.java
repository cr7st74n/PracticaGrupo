package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Empleado;
import modelo.Empresa;
import modelo.Provincia;
import modelo.Competencia;
import modelo.Departamento;

public class GestionDatosEmpr {
	private List<Empresa> empresas;
	private List<Departamento> departamentos;
	private List<Empleado> empleados;
private String pathPersona="TrabajoGrupal/Datos/Empresa.txt";

public GestionDatosEmpr(List<Empresa> empresas, List<Departamento> departamentos, List<Empleado> empleados, String pathPersona) {
	super();
	this.empresas = empresas;
	this.departamentos = departamentos;
	this.empleados = empleados;
	this.pathPersona = pathPersona;
}

public GestionDatosEmpr() {
	empresas = new ArrayList<Empresa>();
	departamentos = new ArrayList<Departamento>();
	empleados = new ArrayList<Empleado>();
}

public void newEmpresa(String nombreE,String presidente,String cajera,String nombreEm,String apellidoEm) throws IOException{
	Empresa re=new Empresa();
    re.setNombre(nombreE);
    re.setPresidente(presidente);
	
		
	Departamento ar=new Departamento();
	ar.setCajera(cajera);
	departamentos.add(ar);
    re.setDepartamentos(ar);

    Empleado au=new Empleado();
    au.setNombre(nombreEm);
    au.setApellido(apellidoEm);
    empleados.add(au);
	ar.setEmpleados(au);
	
	empresas.add(re);
	
try{
		
		FileWriter file=new FileWriter(pathPersona,true);
		BufferedWriter out=new BufferedWriter(file);
		String registro=nombreE+";"+presidente+";"+cajera+";"+nombreEm+";"+apellidoEm;
		
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
public int buscarEmpresa(String nombreEm){
	
	for (int i = 0; i < empresas.size(); i++) {
		Empresa car = empresas.get(i);
		Departamento dep = departamentos.get(i);
		if (car.getNombre().equals(nombreEm)) {
			
					return 0;
	}
	}
	return 1;
}
public String buscarEmpleado(String nombre,String apellido) {
String valorC="tRue";
		for (int i = 0; i < empleados.size(); i++) {
			Empleado car = empleados.get(i);
			if (car.getNombre().equals(nombre)&&car.getApellido().equals(apellido)) {
				valorC = null;
			}
		}
		return valorC;
	}

public List<Empresa> getEmpresas(){
	return empresas;
	
}
}
