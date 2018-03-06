package calculoImpuestos;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDescuentos extends JPanel{
	
	//ATRIBUTOS
	private JCheckBox cbPPago;
	private JCheckBox cbSPublico;
	private JCheckBox cbTCuenta;
	
	
	public PanelDescuentos()
	{
		setLayout( new GridLayout(2,2));
		
		TitledBorder border = BorderFactory.createTitledBorder("Descuentos");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		cbPPago = new JCheckBox( "Pronto pago" );
		cbSPublico = new JCheckBox ("Servicio P�blico" );
		cbTCuenta = new JCheckBox ("Traslado de cuenta" );
		
		add(cbPPago);
		add(cbSPublico);
		add(cbTCuenta);
		
	}


	public boolean hayDescuentoProntoPago() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean hayDescuentoServicioPublico() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean hayDescuentoTrasladoCuenta() {
		// TODO Auto-generated method stub
		return false;
	}

}
