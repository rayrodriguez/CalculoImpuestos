package calculoImpuestos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelVehiculo extends JPanel implements ActionListener{
	//ATRIBUTOS
	
	//private InterfazImpuestosCarro principal;
	
	private JTextField txtMarca;
	private JTextField txtLinea;
	private JTextField txtModelo;
	private JTextField txtValor;
	private JButton butBuscar;
	private JLabel labMarca;
	private JLabel labLinea;
	private JLabel labModelo;
	private JLabel labValor;
	
	//CONSTANTES
	public final static String BUSCAR = "Buscar";
	
	public PanelVehiculo ( /*InterfazImpuestosCarro v*/)
	{
		//principal = v;
		setLayout (new GridLayout(5,2) );
		setPreferredSize(new Dimension (0,130));
		
		TitledBorder border = BorderFactory.createTitledBorder("Datos del vehículo");
		border.setTitleColor(Color.BLUE);
		setBorder( border );
		
		labMarca = new JLabel("Marca");
		labLinea = new JLabel("Línea");
		labModelo = new JLabel("Modelo");
		labValor = new JLabel("Valor");
		butBuscar = new JButton ("Buscar");
		txtMarca = new JTextField();
		txtLinea = new JTextField();
		txtModelo = new JTextField();
		txtValor = new JTextField( "$ 0" );
		
		txtValor.setEditable(false);
		txtValor.setForeground(Color.BLUE);
		txtValor.setBackground(Color.WHITE);
		
		add(labMarca);
		add(txtMarca);
		add(labLinea);
		add(txtLinea);
		add(labModelo);
		add(txtModelo);
		add(labValor);
		add(txtValor);
		add(new JLabel(""));
		add(butBuscar);
		
		butBuscar.setActionCommand(BUSCAR);
		butBuscar.addActionListener(this);
		
	}
	public void actionPerformed (ActionEvent evento)
	{
		String comando = evento.getActionCommand();
		
		if (comando.equals(BUSCAR))
		{
			JOptionPane.showMessageDialog(this, "Precionó botón Buscar");
			
		}
	}
	
	//Método de refresco
	public void refrescarPrecio (double precio)
	{
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###,###.");
		txtValor.setText(df.format(precio));
	}
	
	//Método de acceso a la información
	public String darMarca()
	{
		return txtMarca.getText();
	}
	public String darLinea()
	{
		return txtLinea.getText();
	}
	public String darModelo()
	{
		return txtModelo.getText();
	}
	/*try 
	{
		String strModelo = txtModelo.getText();
		int nModelo = Integer.parseInt(strModelo);
	}
	catch (Exception e)
	{
		txtModelo.setText( "" );
		
		System.out.println("Modelo no admitido");
	}*/
}
