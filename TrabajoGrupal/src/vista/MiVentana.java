package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import controlador.GestionDatosRevi;

public class MiVentana extends JFrame implements ActionListener {

	private JDesktopPane escritorio;
	private GestionDatosRevi gd;
	
	JMenu mnInscripciones;
	JMenuItem Formulario;
	JMenuItem listarInscripciones;
	
	JMenu mnBusqueda;
	JMenuItem BusquedaEstudiante;
	JMenuItem mnCarrera;
	
	JMenu mnRevista;
	JMenuItem agregarR;
	JMenuItem listarR;
	
	JMenu fichaInscripcione;

	JMenuItem ingresarFichas;
	JMenuItem listarfichas;
	
	JMenu medico;
	JMenuItem ingresarMedico;
	JMenuItem listarMedico;
	
	JMenu Atleta;
	JMenuItem ingresarAtleta;
	JMenuItem listarAtleta;
	
	public MiVentana() {
		this.gd = new GestionDatosRevi();
		
		initComponents();
	}
	
	private void initComponents() {

		setSize(950,460);
		setTitle("Gestion de Datos");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		escritorio = new JDesktopPane();
		c.add(escritorio, BorderLayout.CENTER);
		
		JMenuBar barMenu = new JMenuBar();
		
		mnInscripciones = new JMenu("Pais");
		Formulario = new JMenuItem("Ingresar pais");
		Formulario.addActionListener(this);
		Formulario.setActionCommand("mnFor");
		
		listarInscripciones = new JMenuItem("Listar pais");
		listarInscripciones.addActionListener(this);
		listarInscripciones.setActionCommand("mnFor");
		mnInscripciones.add(Formulario);
		mnInscripciones.add(listarInscripciones);

		
		mnBusqueda = new JMenu("Empresa");
		BusquedaEstudiante = new JMenuItem("Ingresar Empresas");
		BusquedaEstudiante.addActionListener(this);
		BusquedaEstudiante.setActionCommand("mnEst");
		mnCarrera = new JMenuItem("Listar empresas");
		mnCarrera.addActionListener(this);
		mnCarrera.setActionCommand("mnCar");
		mnBusqueda.add(BusquedaEstudiante);
		mnBusqueda.add(mnCarrera);
		
		mnRevista  = new JMenu("Revista");
		agregarR = new JMenuItem("Ingresar Revista");
		listarR = new JMenuItem("Listar Revista");
		agregarR.addActionListener(this);
		agregarR.setActionCommand("mnEsp");
		listarR.addActionListener(this);
		listarR.setActionCommand("mnIng");
		mnRevista.add(listarR);
		mnRevista.add(agregarR);
		
		fichaInscripcione  = new JMenu("Ingresar fichas");
		ingresarFichas = new JMenuItem("Agregar Ficha");
		listarfichas = new JMenuItem("Listar Fichas");
		ingresarFichas.addActionListener(this);
		ingresarFichas.setActionCommand("mnEsp");
		listarfichas.addActionListener(this);
		listarfichas.setActionCommand("mnIng");
		fichaInscripcione.add(listarfichas);
		fichaInscripcione.add(ingresarFichas);
		
		medico  = new JMenu("Medico");
		ingresarMedico = new JMenuItem("Agregar Medico");
		listarMedico = new JMenuItem("Listar Medico");
		ingresarMedico.addActionListener(this);
		ingresarMedico.setActionCommand("mnEsp");
		listarMedico.addActionListener(this);
		listarMedico.setActionCommand("mnIng");
		medico.add(listarMedico);
		medico.add(ingresarMedico);
		
		Atleta  = new JMenu("Atleta");
		ingresarAtleta = new JMenuItem("Agregar Atleta");
		listarAtleta = new JMenuItem("Listar Atleta");
		ingresarAtleta.addActionListener(this);
		ingresarAtleta.setActionCommand("mnEsp");
		listarAtleta.addActionListener(this);
		listarAtleta.setActionCommand("mnIng");
		Atleta.add(listarAtleta);
		Atleta.add(ingresarAtleta);
		
		barMenu.add(mnRevista);
		barMenu.add(mnInscripciones);
		barMenu.add(mnBusqueda);
		barMenu.add(fichaInscripcione);
		barMenu.add(medico);
		barMenu.add(Atleta);
		
		setJMenuBar(barMenu);
		
		//datos universiadaes a las que se puede inscribir
				JPanel pnlDatos = new JPanel();
				pnlDatos.setLayout(new GridBagLayout());
				pnlDatos.setBorder(BorderFactory.createTitledBorder("Universidades"));
				
				GridBagConstraints gb = new GridBagConstraints();
				gb.gridx = 0;
				gb.gridy = 0;
				pnlDatos.add(new JLabel("Universidad de Cuenca"), gb);
				
				gb = new GridBagConstraints();
				gb.gridy = 1;
				gb.gridx = 0;
				pnlDatos.add(new JLabel("\n-Arquitectura"), gb);
				
				gb = new GridBagConstraints();
				gb.gridy = 2;
				gb.gridx = 0;
				pnlDatos.add(new JLabel("-Medicina Veterinaria"), gb);
				
				gb = new GridBagConstraints();
				gb.gridy = 3;
				gb.gridx = 0;
				pnlDatos.add(new JLabel("-Gastronomía"), gb);
				
				gb = new GridBagConstraints();
				gb.gridy = 4;
				gb.gridx = 0;
				pnlDatos.add(new JLabel("-Economía"), gb);
				
				c.add(pnlDatos,BorderLayout.EAST);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		Formulario f = new Formulario(gd);
//		Buscar2 bc = new Buscar2(gd);
//		Buscar be = new Buscar(gd);
		
		String comando = e.getActionCommand();
		
		switch(comando){
		case "mnFor":
//			escritorio.removeAll();
//			f.setVisible(true);
//			escritorio.add(f);
			break;
		case "mnEst":
//			escritorio.removeAll();
//			be.setVisible(true);
//			escritorio.add(be);
			break;
		case "mnCar":
//			escritorio.removeAll();
//			bc.setVisible(true);
//			escritorio.add(bc);
			break;
		
		default:
			break;
		}
		
	}

}
