package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


import controlador.GestionDatosFich;

public class FormularioFich extends JInternalFrame implements ActionListener {
	
	private GestionDatosFich gf;
	private JTextField costo;
	private JTextField nombreEquipo;
	private JTextField capitan;
	private JTextField nombreJugador;
	private JTextField apellidoJugador;
	private JTable tblinscripciones;

	public FormularioFich(GestionDatosFich gf) {
		this.gf = gf;
		setSize(950, 700);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		tblinscripciones = new JTable();
		tblinscripciones.setModel(new ModelInscripcionFich());
		JScrollPane scrollinscripciones = new JScrollPane(tblinscripciones);
		
		JPanel scrollPane = new JPanel();
		scrollPane.setLayout(new GridLayout(1, 1));
		scrollPane.add(scrollinscripciones);

		JPanel pnlIns = new JPanel();
		pnlIns.setLayout(new GridBagLayout());
		pnlIns.setBorder(BorderFactory.createTitledBorder("Ingresar datos"));

		GridBagConstraints gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 0;
		pnlIns.add(new JLabel("Costo Inscripcion"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 0;
		gb.gridwidth = 2;
		gb.fill = 2;
		costo = new JTextField(20);
		pnlIns.add(costo, gb);

		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 1;
		pnlIns.add(new JLabel("Nombre del Equipo"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 1;
		gb.gridwidth = 2;
		gb.fill = 2;
		nombreEquipo = new JTextField(20);
		pnlIns.add(nombreEquipo, gb);
		
		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 2;
		pnlIns.add(new JLabel("Nombre Jugador"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 2;
		//gb.gridwidth = 5;
		gb.fill = 5;
		nombreJugador = new JTextField(20);
		pnlIns.add(nombreJugador, gb);		

		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 5;
		pnlIns.add(new JLabel("Apellido Jugador"), gb);

		

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 5;
		gb.fill = 1;
		apellidoJugador = new JTextField(20);
		pnlIns.add(apellidoJugador, gb);
		
		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 7;
		pnlIns.add(new JLabel("Nombre del Capitan"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 7;
		gb.fill = 1;
		capitan = new JTextField(20);
		pnlIns.add(capitan, gb);
		
		

		JPanel pnlBot = new JPanel();
		JButton btnGuardar = new JButton("Guardar");
		
		btnGuardar.addActionListener(this);
		btnGuardar.setActionCommand("btnGuardar");
		
		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 9;
		gb.fill = 1;
		pnlIns.add(btnGuardar, gb);
		
		//pnlBot.add(btnGuardar);
		pnlIns.add(pnlBot);
		c.add(pnlIns, BorderLayout.CENTER);
		c.add(scrollPane, BorderLayout.SOUTH);

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		switch (comando) {
		case "btnGuardar":
			try {
				guardarDatosR();
			} catch (IOException e1) {
				System.out.println("Aki");
				e1.printStackTrace();
			}
			costo.setText("");
			nombreEquipo.setText("");
			nombreJugador.setText("");
			capitan.setText("");
			apellidoJugador.setText("");
			cargarDatos();
			break;
		default:
			break;
		}
	}
	
public void guardarDatosR() throws IOException {
	
	gf.newFicha(costo.getText().toString(),nombreEquipo.getText().toString() , capitan.getText().toString(), 
			nombreJugador.getText().toString(), apellidoJugador.getText().toString());

}

public void cargarDatos(){
	
	tblinscripciones.setModel(new ModelInscripcionFich(gf.getFichas()));
}	

}
