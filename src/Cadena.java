
/** Una Candena está conformada por una secuencia de Eslabones.
 * Cada uno de los Eslabones que forman parte de una Cadena 
 * pueden tener diferente longitud.
 */
public class Cadena {

	private Eslabon primerEslabon;
	private Eslabon segundoEslabon;
	private Eslabon tercerEslabon;
	
	/** @post crea la Cadena inicializando los Eslabones 
	 * con número correlativo y
	* con la longitud indicada en longitudesDeEslabones.
	*/
	public Cadena(float longUno, float longDos, float longTres,
			int numUno,int numDos, int numTres){
		this.primerEslabon = new Eslabon(numUno, longUno);
		this.segundoEslabon = new Eslabon(numDos, longDos);
		this.tercerEslabon = new Eslabon(numTres, longTres);
	}
	/** @post devuelve la cantidad de Eslabones que tiene la Cadena.
	*/
	public int getCantidadDeEslabones(int numero_del_eslabon){
		if(numero_del_eslabon == 1){
			return this.primerEslabon.getNumero();
			
		}else if (numero_del_eslabon == 2) {
			return this.segundoEslabon.getNumero();
		}else {
			return this.tercerEslabon.getNumero();
		}
	}
	
	/** @pre número es un valor comprendido en entre 1 y la 
	 * cantidad de Eslabones que tiene la Cadena.
	* @post devuelve el Eslabón con el número indicado.
	*/
	public Eslabon getEslabon(int numero_del_eslabon){
		if(numero_del_eslabon == 1){
			return this.primerEslabon;
			
		}else if (numero_del_eslabon == 2) {
			return this.segundoEslabon;
		}else {
			return this.tercerEslabon;
		}
	}
	/** @post devuelve la longitud total de la Cadena, 
	 * siendo esta la suma de la longitudes de sus Eslabones.
	*/
	public float getLongitud(){
		float sumaTotal = this.primerEslabon.getLongitud()+this.segundoEslabon.getLongitud()+this.tercerEslabon.getLongitud();
		return sumaTotal;
	}
}