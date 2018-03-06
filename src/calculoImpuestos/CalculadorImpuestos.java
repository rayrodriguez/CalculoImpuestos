package calculoImpuestos;

public class CalculadorImpuestos {
	
	//M�TODO CONSTRUCTOR
	/**
	 *Crea un calculador de impuestos, cargando la informaci�n de dos archivos
	 *
	 *<b>pre:</b> la informaci�n en los archivos relacionados con las marcas, l�neas y modelos de los veh�culos es correcta. 
	 *Tambi�n es correcta la informaci�n relacionada con los ragos de impuestos.
	 *
	 *<b>post:</b> se ley� la informaci�n de los veh�culos y los impuestos y se inicializaron los datos correctamente.
	 *
	 *@throws Exception error al tratar de leer los archivos
	 *
	 *
	 ***/
	public CalculadorImpuestos()  throws Exception
	{ }
	
	CalculadorImpuestos calculador = new CalculadorImpuestos();
	
	//AVAL�O DE UN VEH�CULO
	/**
	 *Retorna el valor del aval�o de un veh�culo de la marca, l�nea y modelo dados.
	 *
	 *<b>pre:</b> La informaci�n de las marcas, l�neas y modleos de los veh�culos ya fue inicializada correctamente.
	 *
	 *@param mar - marca del veh�culo. mar != null.
	 *@param lin - l�nea del veh�culo. lin != null.
	 *@param mod- modelo del veh�culo- mod != null.
	 *
	 *@return aval�o del veh�culo cuyos datos entraron como par�metro.
	 *
	 *@throws Exception si no encuentra registrados las marca, l�nea o el modelo.
	 *
	 ***/
	double buscarAvaluoVehiculo (String mar, String lin, String mod) throws Exception
	{
		return 0;
	}
	
	//CALCULAR PAGO DE IMPUESTO
	/**
	 *Calcula el pago de impuestos que debe hacer un veh�culo de un modelo dado.
	 *
	 *<b>pre:</b> La informaci�n de las marcas, l�neas y modleos de los veh�culos ya fue inicializada correctamente.
	 *
	 *@param mar - marca del veh�culo. mar != null.
	 *@param lin - l�nea del veh�culo. lin != null.
	 *@param mod- modelo del veh�culo- mod != null.
	 *@param descProntoPago - indica si aplica el descuento por pronto pago.
	 *@param descServicioPublico- indica si aplica descuento por servicio p�blico.
	 *@param descTrasladoCuenta - indica si aplica el descuento por traslado de cuenta.
	 *
	 *@return valor por pagar de acuerdo con las caracteristicas del veh�culo y los descuentos que se pueden
	 *aplicar. Si no encuentra un rango para ek modelo devuelto.
	 *
	 *@throws Exception si no encuentra el veh�culo dado por la marca, l�nea o el modelo.
	 *
	 ***/
	double calcularPago ( String mar, String lin, String mod, boolean descProntoPago, boolean descServicioPublico, boolean descTrasladoCuenta ) throws Exception
	{
		return 0;
	}
	
}