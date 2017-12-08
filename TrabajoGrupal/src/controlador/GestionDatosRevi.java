package controlador;

import java.util.ArrayList;
import java.util.List;

import modelo.Articulo;
import modelo.Atleta;
import modelo.Empresa;
import modelo.FichaInscripcion;
import modelo.Medico;
import modelo.Pais;
import modelo.Revista;

public class GestionDatosRevi {
	private List<Revista> revistas;
	private List<Pais> paises;
	private List<Empresa> empresas;
	private List<Atleta> atletas;
	private List<FichaInscripcion> fichas;
	private List<Medico> medicos;

	public GestionDatosRevi() {
		
	}
	
	public GestionDatosRevi(List<Revista> revistas, List<Pais> paises, List<Empresa> empresas, List<Atleta> atletas,
			List<FichaInscripcion> fichas, List<Medico> medicos) {
		super();
		this.revistas = revistas;
		this.paises = paises;
		this.empresas = empresas;
		this.atletas = atletas;
		this.fichas = fichas;
		this.medicos = medicos;
	}
	
	
	
}