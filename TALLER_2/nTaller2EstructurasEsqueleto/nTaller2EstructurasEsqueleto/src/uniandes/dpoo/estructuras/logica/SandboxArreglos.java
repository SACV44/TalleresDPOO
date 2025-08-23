package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[0];
        arregloCadenas = new String[0];
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	
    	int [] copiaArregloEnteros = new int[arregloEnteros.length];
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		copiaArregloEnteros[i] = arregloEnteros[i];			
    	}
    		
        return copiaArregloEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	
    	String [] copiaArregloCadenas = new String[arregloCadenas.length];
    	
    	for(int i = 0; i<arregloCadenas.length; i++) {
    		copiaArregloCadenas[i] = arregloCadenas[i];
    	}
    	
    	
        return copiaArregloCadenas;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	
    	int counter = 0;
    	
    	for(int i = 0; i<arregloEnteros.length; i++) {
    		counter++;
    	}
    	
        return counter;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	
    	
        return arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	
    	int [] copiaArregloEnteros = new int[arregloEnteros.length + 1];
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		copiaArregloEnteros[i] = arregloEnteros[i];			
    	}
    	
    	copiaArregloEnteros[arregloEnteros.length] = entero;
    	
    	arregloEnteros = copiaArregloEnteros;

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	
    	String [] copiaArregloCadenas = new String[arregloCadenas.length + 1];
    	
    	for(int i = 0; i<arregloCadenas.length; i++) {
    		copiaArregloCadenas[i] = arregloCadenas[i];
    	}
    	
    	copiaArregloCadenas[arregloCadenas.length] = cadena;
    	
    	arregloCadenas = copiaArregloCadenas;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	
    	int count = 0;
    	int j = 0;
    	
    	for(int i=0; i < arregloEnteros.length; i++) {
    		if (arregloEnteros[i] != valor) {
    			count ++;
    		}
    	}
    	
    	int [] ArregloEnteros = new int[count];
    	
    	for(int i = 0; i < arregloEnteros.length; i++) {
    		
    		if (arregloEnteros[i] != valor) {
    			
    			ArregloEnteros[j] = arregloEnteros[i];
    			j += 1;
    			
    			
    		}
    	arregloEnteros = ArregloEnteros;	
    		
    	}
    	
    	
    	
    	

    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {

    	int count = 0;
    	
    	for(int i=0; i < arregloCadenas.length; i++) {
    		if (!arregloCadenas[i].equals(cadena)) {
    			count +=1;
    			
    		}
    	}
    	
    	int j = 0;
    	
    	String [] NuevaCadena = new String [count];
    	
    	for(int i=0; i < arregloCadenas.length;i++ ) {
    		if (!arregloCadenas[i].equals(cadena)) {
    			
    			NuevaCadena[j] = arregloCadenas[i];
    			j += 1;
    				
    		}
    	}
    		
    		arregloCadenas = NuevaCadena;
    	
    	
    	
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int [] NuevoEnteros = new int [arregloEnteros.length + 1];
    	
    	if (posicion < 0) {
    		
    	NuevoEnteros[0] = entero;
    	for(int i=0; i< arregloEnteros.length;i++) {
    		NuevoEnteros[i+1]=arregloEnteros[i];
    		}
    	} else if (posicion >= arregloEnteros.length) {
    		
    		for(int i=0; i< arregloEnteros.length;i++) {
        		NuevoEnteros[i]=arregloEnteros[i];
        		}
    		
    		NuevoEnteros[NuevoEnteros.length - 1] = entero;
    		
    	} else {
    	
    	for(int i=0; i < NuevoEnteros.length; i++) {
    		if(i<posicion) {
    			NuevoEnteros[i] = arregloEnteros[i];
    		} else if (i == posicion){
    			NuevoEnteros[i] = entero;	
    		} else {
    			NuevoEnteros[i] = arregloEnteros[i-1];
    			}
    		}
    	}
    	
    	arregloEnteros = NuevoEnteros;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion < 0 || posicion >= arregloEnteros.length) {
    		return;
    	}
    	else {
    		
    		int [] NuevoEnteros = new int[arregloEnteros.length-1];
    		
    		for(int i=0; i<NuevoEnteros.length; i++) {
    			
    			if (i < posicion) {
    				NuevoEnteros[i] = arregloEnteros[i];
    				
    			} else if (i >= posicion) {
    				NuevoEnteros[i] = arregloEnteros[i+1];
    				
    			}
    			
    			
    		}
    		
    		
    		arregloEnteros = NuevoEnteros;
    		
    		
    	}
    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int [] NuevoEnteros = new int [valores.length];
    	
    	for(int i=0; i<valores.length; i++) {
    		
    		NuevoEnteros[i] = (int) valores[i];
    		
    	}
    	
    	arregloEnteros = NuevoEnteros;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	
    	String [] NuevoCadenas = new String [objetos.length];
    	
    	for(int i=0; i<objetos.length; i++) {
    		
    		NuevoCadenas[i] = objetos[i].toString();
    		
    	}
    	
    	arregloCadenas = NuevoCadenas;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	
    	int [] NuevoEnteros = new int [arregloEnteros.length];
    	
    	for(int i=0; i<arregloEnteros.length; i++) {
    		if (arregloEnteros[i] < 0) {
    			NuevoEnteros[i] = -arregloEnteros[i];
    		} else {
    			NuevoEnteros[i] = arregloEnteros[i];
    		}
    		
    	}
    	
    	arregloEnteros = NuevoEnteros;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	
    	for (int i=0; i<arregloEnteros.length; i++) {
    		
    		int menor = arregloEnteros[i];
    		int pos = i;
    		
    		for(int j=i+1; j<arregloEnteros.length; j++) {
    			
    			if(arregloEnteros[j]<menor) {
    				menor = arregloEnteros[j];
    				pos = j;
    			}
    		}
    		
    		arregloEnteros[pos] = arregloEnteros[i];
    		arregloEnteros[i] = menor;	
    	}
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	for(int i=0; i<arregloCadenas.length; i++) {
    		
    		String menor = arregloCadenas[i];
    		int pos = i;
    		
    		for(int j=i+1; j<arregloCadenas.length; j++) {
    			
    			if(arregloCadenas[j].compareTo(menor)<0) {
    				
    				menor = arregloCadenas[j];
    				pos = j;
    			}	
    		}
    		
    		arregloCadenas[pos] = arregloCadenas[i];
    		arregloCadenas[i] = menor;	
    	}
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	
    	int count = 0;
    	
    	for(int i=0; i<arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			count++;
    		}
    	}
        return count;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int count = 0;
    	
    	for(int i=0; i<arregloCadenas.length; i++) {
    		if(arregloCadenas[i].compareToIgnoreCase(cadena) == 0) {
    			count++;
    		}
    	}
    	
        return count;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	
    	int [] pos = new int [0];
    	
    	for (int i=0; i<arregloEnteros.length; i++) {
    		if(arregloEnteros[i] == valor) {
    			
    			int [] pos_new = new int[pos.length +1];
    			
    			for(int j=0; j< pos.length; j++) {
    				pos_new[j] = pos[j];
    			}
    			
    			pos_new[pos.length] = i;
    			pos = pos_new;
    				
    		}
    	}
    	
        return pos;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
    	int [] result = new int [2];
    	
    	if (arregloEnteros.length == 0) {
    		result = new int [0];
    	} else {
    	
    	
    	int menor = arregloEnteros[0];
    	
    	for(int i=0; i<arregloEnteros.length; i++) {
    		
    		if(arregloEnteros[i]<menor) {
    			menor = arregloEnteros[i];
    		}	
    	
    	}
    	
    	int mayor = arregloEnteros[0];
    	
    	for (int i=0; i<arregloEnteros.length; i++) {
    		
    		if(arregloEnteros[i] > mayor) {
    			mayor = arregloEnteros[i];
    			
    		}
    	}
    	
    	result[0] = menor;
    	result[1] = mayor;
    	
    	}
    	
        return result;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
    	
    	HashMap<Integer, Integer> mapa = new HashMap<>();
    	
    	for(int i=0; i<arregloEnteros.length; i++) {
    		
    		
    		if (mapa.containsKey(arregloEnteros[i])){
    			
    			int value = mapa.get(arregloEnteros[i]);
    			value ++;
    			mapa.put(arregloEnteros[i], value);
 
    		} else {
    		mapa.put(arregloEnteros[i], 1);
    	}
    	}
    	
        return mapa;
    
    }
    
    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {	
    	int [] repetidos = new int[0];
    	
    	for(int i=0; i<arregloEnteros.length; i++) {
    		for (int j=i+1; j < arregloEnteros.length; j++) {
    			if (arregloEnteros[i] == arregloEnteros[j]) {
    				
    				boolean check = false;
    				
    				for(int k = 0; k<repetidos.length; k++) {
    					if (repetidos[k] == arregloEnteros[j]) {
    						check = true;
    					}
    				}
    				if (check == false) {
    					int [] repetidostemp = new int [repetidos.length+1];
    					
    					for(int s=0; s<repetidos.length; s++) {
    						repetidostemp[s] = repetidos[s];
    					
    						}
    					
    					repetidostemp[repetidostemp.length-1] = arregloEnteros[j];
    					repetidos = repetidostemp;
    				}
    					
    				}
    			}
    		}
    	
    	
    	return repetidos.length;
        
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	boolean cont = true;
    	
    	if(arregloEnteros.length == otroArreglo.length) {
    		
    		
    	for(int i=0; i<arregloEnteros.length; i++) {
    		
    		if(arregloEnteros[i] != otroArreglo[i]) {
    			cont = false;
    		}
    		
    		}
    	
    	
    	} else {
    		return false;
    	}
    	
    	if (cont == false) {
    		return false;
    	} else {
    	
        return true;
    	}
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	
    	int [] arregloEnterosNew = new int[arregloEnteros.length];
    	
    	
    	for(int i=0; i<arregloEnteros.length; i++) {
    		arregloEnterosNew[i] = arregloEnteros[i];
    	}
    	
    	int [] otroArregloNew = new int[otroArreglo.length];
    	
    	
    	for(int i=0; i<otroArreglo.length; i++) {
    		otroArregloNew[i] = otroArreglo[i];
    	}
    	
    	
    	
    	
    	
    	for (int i=0; i<arregloEnterosNew.length; i++) {
    		
    		int menor = arregloEnterosNew[i];
    		int pos = i;
    		
    		for(int j=i+1; j<arregloEnterosNew.length; j++) {
    			
    			if(arregloEnterosNew[j]<menor) {
    				menor = arregloEnterosNew[j];
    				pos = j;
    			}
    		}
    		
    		arregloEnterosNew[pos] = arregloEnterosNew[i];
    		arregloEnterosNew[i] = menor;	
    	}
    	
    	
    	for (int i=0; i<otroArregloNew.length; i++) {
    		
    		int menor = otroArregloNew[i];
    		int pos = i;
    		
    		for(int j=i+1; j<otroArregloNew.length; j++) {
    			
    			if(otroArregloNew[j]<menor) {
    				menor = otroArregloNew[j];
    				pos = j;
    			}
    		}
    		
    		otroArregloNew[pos] = otroArregloNew[i];
    		otroArregloNew[i] = menor;	
    	}
    	
    	
    	boolean cont = true;
    	
    	if(arregloEnterosNew.length == otroArregloNew.length) {
    		
    		
    	for(int i=0; i<arregloEnteros.length; i++) {
    		
    		if(arregloEnterosNew[i] != otroArregloNew[i]) {
    			cont = false;
    		}
    		
    		}
    	
    	
    	} else {
    		return false;
    	}
    	
    	if (cont == false) {
    		return false;
    	} else {
    	
        return true;
    	}
    }
    	
    	
    	
    	
    	
	
    
    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros(int cantidad, int minimo, int maximo) {
        int[] nuevoEnteros = new int[cantidad];
        int rn = maximo - minimo + 1;

        for (int i = 0; i < cantidad; i++) {
            nuevoEnteros[i] = minimo + (int)(Math.random() * rn);
        }

        arregloEnteros = nuevoEnteros;
    }
}
