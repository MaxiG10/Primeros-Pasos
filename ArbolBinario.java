package nuevoPaquete;

public class ArbolBinario<T> {
	
	private Nodo<T> raiz;
	
public class Nodo<T>{
	
	private T info;
	private Nodo<T> izq;
	private Nodo<T> der;
	
	public Nodo(T info) {
		
		this.info = info;
		
	}
	@override
	public String toString () {
		
		return info.toString();
		
	}
}

}
