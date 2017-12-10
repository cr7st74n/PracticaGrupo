package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.table.AbstractTableModel;

import modelo.FichaInscripcion;
import modelo.Revista;

public class ModelInscripcionFich extends AbstractTableModel {
	

	
	public String[] columnas = {"Costo", "Nombre Equipo","Nombre Capitan ","Nombre Jugador","Apellido Jugador"};
	public Class[] columnasTipos = {String.class, String.class,String.class,String.class,String.class};
	
	private List<FichaInscripcion> datos;
	
	public ModelInscripcionFich() {
		super();
		datos = new ArrayList<FichaInscripcion>();
	}
	
	public ModelInscripcionFich(List<FichaInscripcion> datos) {
		super();
		if (datos == null)
			this.datos = new ArrayList<FichaInscripcion>();
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
		
		FichaInscripcion dato = (FichaInscripcion) (datos.get(row));
		
		switch(col) {
		case 0:
			return dato.getCosto();
		case 1:
			return dato.getEquipos().getNombre();
		case 2:
			return dato.getEquipos().getCapitan();
		case 3:
			return dato.getEquipos().getJugadores().getNombre();
		case 4:
			return dato.getEquipos().getJugadores().getApellido();
		default:
			break;
		}
		return new String();
	}

	
}
