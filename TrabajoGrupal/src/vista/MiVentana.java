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
import controlador.GestionDatosR;

public class MiVentana extends JFrame implements ActionListener {

	private JDesktopPane escritorio;
	private GestionDatosR gd;
	
	JMenu mnInscripciones;
	JMenuItem Formulario;
	
	JMenu mnBusqueda;
	JMenuItem BusquedaEstudiante;
	JMenuItem mnCarrera;
	
	JMenu mnRevista;
	JMenuItem agregar;
	JMenuItem buscarR;
	
	JMenu fichaInscripcione;
	JMenuItem fichas;
	JMenuItem ingresarFichas;
	JMenuItem buscarfichas;
	
	JMenu medico;
	JMenuItem ingresarMedico;
	
	JMenu Atleta;
	JMenuItem ingresarAtleta;
	
	public MiVentana() {
		this.gd = new GestionDatosR();
		
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
		mnInscripciones.add(Formulario);
		
		mnBusqueda = new JMenu("Empresa");
		BusquedaEstudiante = new JMenuItem("Buscar Empresas");
		BusquedaEstudiante.addActionListener(this);
		BusquedaEstudiante.setActionCommand("mnEst");
		mnCarrera = new JMenuItem("Listar empresas");
		mnCarrera.addActionListener(this);
		mnCarrera.setActionCommand("mnCar");
		mnBusqueda.add(BusquedaEstudiante);
		mnBusqueda.add(mnCarrera);
		
		mnRevista  = new JMenu("Revista");
		agregar = new JMenuItem("Agregar");
		buscarR = new JMenuItem("Buscar");
		agregar.addActionListener(this);
		agregar.setActionCommand("mnEsp");
		buscarR.addActionListener(this);
		buscarR.setActionCommand("mnIng");
		mnRevista.add(buscarR);
		mnRevista.add(agregar);
		
		fichaInscripcione  = new JMenu("Revista");
		agregar = new JMenuItem("Agregar");
		buscarR = new JMenuItem("Buscar");
		agregar.addActionListener(this);
		agregar.setActionCommand("mnEsp");
		buscarR.addActionListener(this);
		buscarR.setActionCommand("mnIng");
		mnRevista.add(buscarR);
		mnRevista.add(agregar);
		
		barMenu.add(mnRevista);
		barMenu.add(mnInscripciones);
		barMenu.add(mnBusqueda);
		
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
