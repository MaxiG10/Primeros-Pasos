package nuevoPaquete;

public class BusquedaBinaria {

	public int busquedaBinaria(int[] arr, int valor) {

		int desde = 0;

		int hasta = 0;

		int medio = (desde + hasta) / 2;

		while (desde <= hasta) {

			medio = (desde + hasta) / 2;

			if (arr[medio] == valor)

				return medio;

			else if (arr[medio] > valor)
				hasta = medio - 1;
			else
				desde = medio + 1;
		}
		return -1;
	}
	
	//Busqueda Binaria de forma Recursiva.
	
	public int busqBinariaRecur ( int [] arr, int valor) {
		
		return busqBinariaRecur ( int [] arr, int valor, int desde, int hasta)
	
	}			
	
	private int busqBinariaRecur ( int [] arr, int valor, int desde, int hasta) {
			
		if (desde > hasta)
				
				return -1;
			
			int medio = (desde + hasta) / 2;
			
		if ( arr[medio] == valor)
			
			return medio;
		
		if (arr[medio] > valor )
			
			return busqBinariaRecur ( arr, valor, desde, (medio-1));
		
		else
			
			return busqBinariaRecur ( arr, valor,(medio+1), hasta);
		}




}
	


