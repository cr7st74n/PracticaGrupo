package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import modelo.Pais;
import modelo.Revista;

public class ModelInscripcionP extends AbstractTableModel {
	

	
	public String[] columnas = {"Nombre Pais", "Idioma","Nombre Provincia ","Nombre Canton","Alcalde"};
	public Class[] columnasTipos = {String.class, String.class,String.class,String.class,String.class};
	
	private List<Pais> datos;
	
	public ModelInscripcionP() {
		super();
		datos = new ArrayList<Pais>();
	}
	
	public ModelInscripcionP(List<Pais> datos) {
		super();
		if (datos == null)
			this.datos = new ArrayList<Pais>();
		else
			this.datos = datos;
	}
	
	public int getColumnCount() {
		return columnas.length;
	}

	
	public int getRowCount() {
		return datos.size();
	}

	public String getColumnName(int col) {
		return columnas[col];
	}
	
	public Class getColumnClass(int col) {
		return columnasTipos[col];
	}
	
	public Object getValueAt(int row, int col) {
		
		Pais dato = (Pais) (datos.get(row));
		
		switch(col) {
		case 0:
			return dato.getNombre();
		case 1:
			return dato.getIdoma();
		case 2:
			return dato.getProvincias().getNombre();
		case 3:
			return dato.getProvincias().getCanton().getNombre();
		case 4:
			return dato.getProvincias().getCanton().getAlcalde();
		default:
			break;
		}
		return new String();
	}

	
}
