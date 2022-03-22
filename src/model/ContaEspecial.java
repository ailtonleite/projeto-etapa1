package model;

public class ContaEspecial extends Conta{
	private int limite;
	
	public ContaEspecial(int numero, double saldo, int limite) {
		super();
		super.numero = numero;
		super.saldo = saldo;
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) {
		if(getSaldo()+limite <= valor) {
			super.sacar(valor);
		}
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "Numero: "+numero+"\nSaldo: "+saldo+"\nLimite: "+limite;
	}
}
