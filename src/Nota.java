
public class Nota {
	
	private int valorNota;

		/* pre : valorInicial está comprendido entre 0 y 10.
		 * post: inicializa la Nota con el valor indicado.
		 */
		Nota(int valorInicial) {
			if( valorInicial >= 0 && valorInicial < 11) {
				this.valorNota= valorInicial;
			}
			
			
		}
		
		/* post: devuelve el valor numérico de la Nota,
		 * comprendido entre 0 y 10.
		 */
		int obtenerValor() {
			return this.valorNota;
		}
		/* post: indica si la Nota permite o no la aprobación.
		 */
		boolean aprobado() {
			
			boolean isAprobado;
			
			if(this.valorNota > 4 && this.valorNota < 11 ) {
				isAprobado= true;
			}else {
				isAprobado= false;
			}
			return isAprobado;
		}
		/* post: indica si la Nota implica la desaprobación.
		 */
		boolean desaprobado() {
			
			boolean isDesaprobado;
			
			if(this.valorNota < 5 && this.valorNota >= 0) {
				isDesaprobado= true;
			}else {
				isDesaprobado= false;
			}
			return isDesaprobado;
		}

		/* pre : nuevoValor está comprendido entre 0 y 10.
		 * post: modifica el valor numérico de la Nota, cambiándolo
		 * por nuevoValor, si nuevoValor es superior al
		 * valor numérico actual de la Nota.
		 */
		void recuperar(int nuevoValor) {
			
			if( (nuevoValor >= 0 && nuevoValor < 11) && (nuevoValor > this.valorNota)) {
			
					this.valorNota = nuevoValor;
			}
		}


}
