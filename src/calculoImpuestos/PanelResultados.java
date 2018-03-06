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

public class PanelResultados extends JPanel implements ActionListener{
	
	//private InterfazImpuestosCarro principal ;
	//ATRIBUTOS
	private JLabel labTotal;
	private JTextField txtTotal;
	private JButton butLimpiar;
	private JButton butCalcular;
	
	//CONSTANTES
	public final static String LIMPIAR = "Limpiar";
	public final static String CALCULAR = "Calcular";
	
	public PanelResultados ( /*InterfazImpuestosCarro v*/)
	{
		//principal= v;
		setLayout (new GridLayout(2,3));
		setPreferredSize(new Dimension(0,65));
		setForeground(Color.RED);
		setBackground(Color.WHITE);
		
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.RED);
		setBorder(border);
		
		labTotal = new JLabel("Total a pagar");
		txtTotal = new JTextField("$ 0");
		butLimpiar = new JButton ("Limpiar");
		butCalcular = new JButton ("Calcular");
		
		txtTotal.setEditable(false);
		txtTotal.setBackground(Color.BLUE);
		txtTotal.setBackground(Color.WHITE);
		
		add(new JLabel(""));
		add(new JLabel(""));
		add(butLimpiar);
		add(labTotal);
		add(txtTotal);
		add(butCalcular);
		
		butLimpiar.setActionCommand(LIMPIAR);
		butCalcular.setActionCommand(CALCULAR);
		
		butLimpiar.addActionListener(this);
		butCalcular.addActionListener(this);
			
	}
	public void refrescarPago(double pago) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###,###.##");
		txtTotal.setText(df.format(pago));
	}
	
	public void actionPerformed (ActionEvent evento)
	{
		String comando = evento.getActionCommand();
		
		if (comando.equals(LIMPIAR))
		{
			JOptionPane.showMessageDialog(this, "Precionó botón Limpiar");
			//System.out.println("Precionó botón Limpiar");
			
		}else if (comando.equals(CALCULAR))
		{
			JOptionPane.showMessageDialog(this, "Precionó botón Calcular");
			//System.out.println("Precionó botón Calcular");
		}
	}
}
