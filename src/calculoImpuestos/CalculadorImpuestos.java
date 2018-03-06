package calculoImpuestos;

public class CalculadorImpuestos {
	
	//MÉTODO CONSTRUCTOR
	/**
	 *Crea un calculador de impuestos, cargando la información de dos archivos
	 *
	 *<b>pre:</b> la información en los archivos relacionados con las marcas, líneas y modelos de los vehículos es correcta. 
	 *También es correcta la información relacionada con los ragos de impuestos.
	 *
	 *<b>post:</b> se leyó la información de los vehículos y los impuestos y se inicializaron los datos correctamente.
	 *
	 *@throws Exception error al tratar de leer los archivos
	 *
	 *
	 ***/
	public CalculadorImpuestos()  throws Exception
	{ }
	
	CalculadorImpuestos calculador = new CalculadorImpuestos();
	
	//AVALÚO DE UN VEHÍCULO
	/**
	 *Retorna el valor del avalúo de un vehículo de la marca, línea y modelo dados.
	 *
	 *<b>pre:</b> La información de las marcas, líneas y modleos de los vehículos ya fue inicializada correctamente.
	 *
	 *@param mar - marca del vehículo. mar != null.
	 *@param lin - línea del vehículo. lin != null.
	 *@param mod- modelo del vehículo- mod != null.
	 *
	 *@return avalúo del vehículo cuyos datos entraron como parámetro.
	 *
	 *@throws Exception si no encuentra registrados las marca, línea o el modelo.
	 *
	 ***/
	double buscarAvaluoVehiculo (String mar, String lin, String mod) throws Exception
	{
		return 0;
	}
	
	//CALCULAR PAGO DE IMPUESTO
	/**
	 *Calcula el pago de impuestos que debe hacer un vehículo de un modelo dado.
	 *
	 *<b>pre:</b> La información de las marcas, líneas y modleos de los vehículos ya fue inicializada correctamente.
	 *
	 *@param mar - marca del vehículo. mar != null.
	 *@param lin - línea del vehículo. lin != null.
	 *@param mod- modelo del vehículo- mod != null.
	 *@param descProntoPago - indica si aplica el descuento por pronto pago.
	 *@param descServicioPublico- indica si aplica descuento por servicio público.
	 *@param descTrasladoCuenta - indica si aplica el descuento por traslado de cuenta.
	 *
	 *@return valor por pagar de acuerdo con las caracteristicas del vehículo y los descuentos que se pueden
	 *aplicar. Si no encuentra un rango para ek modelo devuelto.
	 *
	 *@throws Exception si no encuentra el vehículo dado por la marca, línea o el modelo.
	 *
	 ***/
	double calcularPago ( String mar, String lin, String mod, boolean descProntoPago, boolean descServicioPublico, boolean descTrasladoCuenta ) throws Exception
	{
		return 0;
	}
	
}