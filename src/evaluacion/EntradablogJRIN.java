package evaluacion;

/**@apiNote Clase para manejar las entradas de un blog.
 * @author JRIN
 * @since 21.2.2022
 * @version Esta es la versi�n 2.3
 */
public class EntradablogJRIN {
	
	
		
/**separador es el ccar�cter que separa ENTRADA DE del nombre del autor
 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		

/**
 * @param id Constructor de la clase. recibe el n�mero de entrada
 * @param autor, el nombre del autor
 * @param texto, texto que contiene la entrada
 * @throws IllegalArgumentException, si el n�mero de entrada es negativo, lanza una excepci�n.
 */
		@SuppressWarnings("javadoc")
		public EntradablogJRIN(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		
/**
 * @return Devuelve el n�mero de la entrada.
 */
		public int getId(){
			return this.id;
		}
		
	
/**
 * @return devuelve el texto completo de la entrada
 */
		@SuppressWarnings("javadoc")
		public String getTexto(){
			return this.texto;
		}
		
		
/**
 * @return devuelve el nombre del autor de la entrada en may�sculas
 */
		@SuppressWarnings("javadoc")
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		

/**
 * @return devuelve el nombre del autor. Ya no se usa. Mejor ver getAuto
 */
		@SuppressWarnings("javadoc")
		public String devuelveAutor(){
			return this.autor;
		}
		
		
/**
 * @param args No tiene porqu� tener argumentos.
 */
		public static void main(String[] args) {
	               
			EntradablogJRIN e1=new EntradablogJRIN (-3,"ana","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
	}


