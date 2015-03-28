
public class MedioDeTransporte {
	int cantidad_pasajeros;
	 double velocidad_maxima;
	 int cantidad_llantas = 0;

		
	MedioDeTransporte(int cantidad_pasajeros, double velocidad_maxima)
	{
		this.cantidad_pasajeros = cantidad_pasajeros;
		this.velocidad_maxima = velocidad_maxima;
	}
	
	int getCantidad_Pasajeros()
	{
		return cantidad_pasajeros;
	}
	
	void setCantidadPasajeros()
	{
		this.cantidad_pasajeros = cantidad_pasajeros;
	}
	
	double getVelocidadMaxima()
	{
		return velocidad_maxima;
	}
	
	void setVelocidadMaxima()
	{
		this.velocidad_maxima = velocidad_maxima;
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
	


