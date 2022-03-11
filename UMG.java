package ejercicio0000591;


public class ArbolBinario<T> {
    
    
		System.out.println("Generando 1,000,000 números desde -10,000,000 hasta 10,000,000");
		for (int i = 0; i < 1000001; i++)
			System.out.println(+generaNumeros(-10000001,10000001));
                        System.out.println("No. "+i+" = "+A[i]);
      
    
                                
    Nodo<T> root;
    
    public ArbolBinario() {
        root = null;
    }
    
    public void insertar(T dato) {
        if (root == null) {
            root = new Nodo<>(dato);
            return;
        }
        
        Nodo temporal = root;
        Nodo auxiliar = null;
        int valorActual = Integer.parseInt(String.valueOf(dato));
        
        while (temporal != null) {
            auxiliar = temporal;
            int valor = Integer.parseInt(String.valueOf(temporal.dato));
            
            if (valorActual < valor) {
                temporal = temporal.izquierda;
            } else {
                temporal = temporal.derecha;
            }
        }
        
        int valor = 0;
        
        if (auxiliar != null) {
            valor = Integer.parseInt(String.valueOf(auxiliar.dato));
        }
        
        if (auxiliar == null) {
            auxiliar = new Nodo<>(dato);
        } else if (valorActual < valor) {
            auxiliar.izquierda = new Nodo<>(dato);
        } else {
            auxiliar.derecha = new Nodo<>(dato);
        }
    }
    
    public void preorden(Nodo<T> nodo) {
        if (nodo == null) {
            return;
        }
        
        System.out.print(nodo.dato + " ");
        
        preorden(nodo.izquierda);
        
        preorden(nodo.derecha);
    }
    
    public void inorden(Nodo<T> nodo) {
        if (nodo == null) {
            return;
        }
        
        inorden(nodo.izquierda);
        
        System.out.print(nodo.dato + " ");
        
        inorden(nodo.derecha);
    }
    
    public void postorden(Nodo<T> nodo) {
        if (nodo == null) {
            return;
        }
        
        postorden(nodo.izquierda);
        
        postorden(nodo.derecha);
        
        System.out.print(nodo.dato + " ");
    }
    
    public static void main(String[] args) {
      
		
        
        arbolEnteros.inorden(arbolEnteros.root);
        
        System.out.println();
        System.out.println();
        
        arbolEnteros.preorden(arbolEnteros.root);
        
        System.out.println();
        System.out.println();
        
        arbolEnteros.postorden(arbolEnteros.root);
    }
}

class Nodo<T> {

    public T dato;
    public Nodo<T> izquierda;
    public Nodo<T> derecha;

    public Nodo(T dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }
}

