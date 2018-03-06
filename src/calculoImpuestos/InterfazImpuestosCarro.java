package calculoImpuestos;
import java.awt.*;
import javax.swing.*;

/**
 * Interfaz de calculo de impuestos de vehículo
 * **/
public class InterfazImpuestosCarro extends JFrame{
	
	private CalculadorImpuestos calculador;
	
	private PanelVehiculo panelVehiculo;
	private PanelResultados panelResultados;
	private PanelDescuentos panelDescuentos;
	
	public InterfazImpuestosCarro( ) throws Exception
	{
		//calculador = new CalculadorImpuestos("");
		
		setTitle ("Cálculo impuestos");
		setSize ( 290 , 300 );
		setResizable ( true );
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		
		setLayout( new BorderLayout( ) );
		
		panelVehiculo = new PanelVehiculo();
		add( panelVehiculo, BorderLayout.NORTH );
		
		panelDescuentos = new PanelDescuentos();
		add( panelDescuentos, BorderLayout.CENTER);
		
		panelResultados = new PanelResultados();
		add( panelResultados, BorderLayout.SOUTH);
	}
	
public static void main(String[] args) throws Exception{
		
		InterfazImpuestosCarro ventana = new InterfazImpuestosCarro();
		//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);
		
		String clave =JOptionPane.showInputDialog("De su clave");
		//byte c=(byte) 1234;
		if(clave != null )
		{
			
		}
			
	}

public void CalcularPrecioVehiculo() throws Exception
{
	String unaMarca = panelVehiculo.darMarca();
	String unaLinea = panelVehiculo.darLinea();
	String unModelo = panelVehiculo.darModelo();
	
	double precio = calculador.buscarAvaluoVehiculo(unaMarca, unaLinea, unModelo);
	panelVehiculo.refrescarPrecio(precio);
	
}

public void calcularImpuestos() throws Exception 
{
	String unaMarca = panelVehiculo.darMarca();
	String unaLinea = panelVehiculo.darLinea();
	String unModelo = panelVehiculo.darModelo();
	
	boolean descProntoPago = panelDescuentos.hayDescuentoProntoPago();
	boolean descServicioPublico =panelDescuentos.hayDescuentoServicioPublico();
	boolean descTrasladoCuenta = panelDescuentos.hayDescuentoTrasladoCuenta();
	
	double pago = calculador.calcularPago(unaMarca, unaLinea, unModelo, descProntoPago, descServicioPublico, descTrasladoCuenta);
	
	panelResultados.refrescarPago(pago);
	
}

}
