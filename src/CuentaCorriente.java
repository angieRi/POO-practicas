
public class CuentaCorriente {
	private String titular;
	private double descubierto;
	private double saldo;
	private double descubiertoMaximo;
	
	/**
	* post: la instancia queda asignada al titular indicado,
	* con saldo igual a 0 y pudiendo tener el máximo de descubierto indicado.
	*/
	public CuentaCorriente(String titularDeLaCuenta, double descubiertoMaximo){
		this.titular = titularDeLaCuenta;
		this.descubierto = descubiertoMaximo;
		this.descubiertoMaximo  = descubiertoMaximo;
		this.saldo = 0;
	}
	/**
	* post: devuelve el nombre del titular de la Cuenta Corriente.
	*/
	public String getTitular(){
		return this.titular;
	}
	/**
	* post: devuelve el saldo de la Cuenta Corriente.
	*/
	public double getSaldo(){
		return this.saldo;
	}
	/**
	* post: devuelve el descubierto que tiene la Cuenta Corriente.
	*/
	public double getDescubierto(){
		return this.descubierto;
	}
	/**
	* pre : monto es un valor mayor a 0.
	* post: aumenta el saldo de la Cuenta Corriente según el monto
	* depositado, cubriendo primero el descubierto.
	*/
	public void depositar(double monto){
		if(verificarMonto(monto) && this.saldo == 0 && this.descubierto == this.descubiertoMaximo){
			this.saldo = monto;
			
		}else if(verificarMonto(monto) && this.saldo == 0 && this.descubierto < this.descubiertoMaximo){
			if(monto >= this.descubiertoMaximo){				
				this.saldo = (monto + this.descubierto) - monto;
				this.descubierto = this.descubiertoMaximo;
			}else{
				if(this.descubiertoMaximo == (this.descubierto + monto)){					
					this.descubierto = this.descubiertoMaximo;
				}else{
					this.descubierto = this.descubierto + monto;
				}
				this.saldo = 0;
			}
		}else if(verificarMonto(monto) && this.saldo != 0){
			this.descubierto = this.descubiertoMaximo;
			this.saldo = this.saldo + monto;
		}
	}
	/**
	* pre : monto es un valor mayor a 0.
	* post: disminuye el saldo de la Cuenta Corriente según el monto
	* extraído. Si el saldo no es suficiente, utiliza el descubierto disponible
	* de la misma. Si aún así no es suficiente, no realiza la operación.
	*/
	public void extraer(double monto){
		if (verificarMonto(monto) && monto <= this.saldo ) {
			this.saldo = this.saldo - monto;
		
		}else if((verificarMonto(monto) && monto > this.saldo) &&( monto <= this.descubiertoMaximo)){
			this.descubierto = this.descubiertoMaximo - (monto - this.saldo);
			this.saldo = 0;
		}
	}
	
	private boolean verificarMonto(double monto) {
		if(monto > 0){			
			return true;
		}
		return false;
	}

}
