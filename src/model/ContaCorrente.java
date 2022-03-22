package model;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, double saldo) {
		super();
		super.numero = numero;
		super.saldo = saldo;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor < getSaldo()) {
			super.sacar(valor);
		}
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
	
}
