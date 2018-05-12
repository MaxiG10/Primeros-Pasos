package nuevoPaquete;

public class ArbolBinario<T> {

	private Nodo<T> raiz;

	public class Nodo<T> {

		private T info;
		private Nodo<T> izq;
		private Nodo<T> der;

		public Nodo(T info) {

			this.info = info;

		}

		@override
		public String toString() {

			return info.toString();

		}
	}

	public void agregar(T elem) {

		Nodo<T> nuevo = new Nodo<T>(elem);
		if (raiz == null)
			raiz = nuevo;
		else
			agregar(raiz, nuevo);
	}

	private void agregar(Nodo<T> padre, Nodo<T> nuevo) {
		if (padre.izq == null)
			padre.izq = nuevo;
		else if (padre.der == null)
			padre.der = nuevo;
		else
			agregar(padre.der, nuevo);
	}

	public Nodo<T> buscar(T elem) {

		return (raiz == null) ? null : buscar(raiz, elem);
	}

	private Nodo<T> buscar(Nodo<T> nodo, T elem) {

		if (nodo.info.equals(elem))
			return nodo;
		else {
			Nodo<T> izq = null;
			Nodo<T> der = null;
			if (nodo.izq != null)
				izq = buscar(nodo.izq, elem);
			if (nodo.der != null)
				der = buscar(nodo.der, elem);
			if (izq != null)
				return izq;
			else
				return der;
		}
	}

	public int cantNodos() {

		return (raiz == null) ? 0 : cantNodos(raiz);
	}

	private int cantNodos(Nodo<T> nodo) {

		int cantIzq = (nodo.izq == null) ? 0 : cantNodos(nodo.izq);
		int cantDer = (nodo.der == null) ? 0 : cantNodos(nodo.der);
		return 1 + cantIzq + cantDer;
	}

	public int altura() {

		return (raiz == null) ? 0 : altura(raiz);
	}

	private int altura(Nodo<T> nodo) {

		int altIzq = (nodo.izq == null) ? 0 : altura(nodo.izq);
		int altDer = (nodo.der == null) ? 0 : altura(nodo.der);

		return 1 + Math.max(altIzq, altDer);
	}

	public boolean balanceado() {

		return (raiz == null) ? true : balanceado(raiz);
	}

	private boolean balanceado(Nodo<T> nodo) {

		boolean ret = true;
		int altIzq = 0;
		int altDer = 0;
		if (nodo.izq != null) {
			altIzq = altura(nodo.izq);
			ret = ret && balanceado(nodo.izq);
		}
		if (nodo.der != null) {
			altDer = altura(nodo.der);
			ret = ret && balanceado(nodo.der);
		}
		ret = ret && Math.abs(altIzq - altDer) <= 1;

		return ret;
	}

	public String toString() {

		return (raiz == null) ? "" : toString(raiz);
	}

	private String toString(Nodo<T> nodo) {

		String ret = nodo.info.toString();
		if (nodo.izq != null)
			ret = ret + toString(nodo.izq);
		if (nodo.der != null)
			ret = ret + toString(nodo.der);

		return ret;
	}

}// no borrar
