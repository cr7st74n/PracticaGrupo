package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import controlador.GestionDatosRevi;

public class Formulario extends JInternalFrame implements ActionListener {
	
	private GestionDatosRevi gd;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JTextField txtDireccion;
	private JTextField txtApellidoAu;

	public Formulario(GestionDatosRevi gd) {
		this.gd = gd;
		setSize(750, 400);
		setVisible(true);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel pnlIns = new JPanel();
		pnlIns.setLayout(new GridBagLayout());
		pnlIns.setBorder(BorderFactory.createTitledBorder("Ingresar datos"));

		GridBagConstraints gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 0;
		pnlIns.add(new JLabel("Nombre de la revista"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 0;
		gb.gridwidth = 2;
		gb.fill = 2;
		txtNombre = new JTextField(20);
		pnlIns.add(txtNombre, gb);

		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 1;
		pnlIns.add(new JLabel("Idioma"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 1;
		gb.gridwidth = 2;
		gb.fill = 2;
		txtApellido = new JTextField(20);
		pnlIns.add(txtApellido, gb);

		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 2;
		pnlIns.add(new JLabel("Titulo del articulo"), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 2;
		gb.gridwidth = 5;
		gb.fill = 5;
		txtDireccion = new JTextField(20);
		pnlIns.add(txtDireccion, gb);

		
		

		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 5;
		pnlIns.add(new JLabel("Nombre del Autor "), gb);

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 5;
		gb.fill = 1;
		txtCedula = new JTextField(20);
		pnlIns.add(txtCedula, gb);

		

		gb = new GridBagConstraints();
		gb.gridx = 0;
		gb.gridy = 7;
		pnlIns.add(new JLabel("Apellido del autor"), gb);

		

		gb = new GridBagConstraints();
		gb.gridx = 1;
		gb.gridy = 7;
		gb.fill = 1;
		txtApellidoAu = new JTextField(20);
		pnlIns.add(txtApellidoAu, gb);

		
		

		JPanel pnlBot = new JPanel();
		JButton btnGuardar = new JButton("Guardar");
		
		btnGuardar.addActionListener(this);
		btnGuardar.setActionCommand("btnGuardar");
		
		pnlBot.add(btnGuardar);

		c.add(pnlIns, BorderLayout.CENTER);
		c.add(pnlBot, BorderLayout.SOUTH);

	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();

		switch (comando) {
		case "btnGuardar":
		
			txtNombre.setText("");
			txtApellido.setText("");
			txtDireccion.setText("");
			txtCedula.setText("");
			break;
		default:
			break;
		}
	}
	
public void guardarDatosR(){
	
}

}
