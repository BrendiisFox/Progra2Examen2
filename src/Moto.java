
public class Moto extends MedioDeTransporte{
	
	int cantidad_llantas = 2;
	
	Moto(int cantidad_pasajeros, double velocidad_maxima)
	{
		super(cantidad_pasajeros,  velocidad_maxima);
	}

	int getCantidadLlantas()
	{
		return cantidad_llantas;
	}
	void setCantidadLlantas()
	{
		this.cantidad_llantas = cantidad_llantas;
	}
	

}
