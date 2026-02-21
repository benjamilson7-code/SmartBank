package model;

import Helper.Utils;

public class Conta {
    private static int Codigo=1001;
    
    private int numero;
    private Cliente cliente;
    private Double saldo=0.0;
    private Double limite=0.0;
    private Double SaldoTotal;
    
    
    
    public Conta(Cliente cliente) {
		this.numero =Conta.Codigo;
		this.cliente = cliente;
		this.atualizarSaldoTotal();
		
		Conta.Codigo++;
		
	}
    
    
	private void atualizarSaldoTotal() {
		this.SaldoTotal=this.getSaldo()+this.getLimite();
		
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
		this.atualizarSaldoTotal();
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
		this.atualizarSaldoTotal();
	}
	public int getNumero() {
		return numero;
	}
	public Double getSaldoTotal() {
		return SaldoTotal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numer da Conta : "+this.getNumero()+
				"\nCliente: "+this.cliente.getNome()+
				"\nSaldo: "+Utils.doubleParaString(this.getSaldoTotal());
	}
	public void depositar(Double valor) {
		if(valor>0) {
			this.saldo=this.getSaldo()+valor;
			this.atualizarSaldoTotal();
			System.out.println("Deposito realizado com Successo!");
		}else {
			System.out.println("Erro ao depositar tente de novo");
		}
	}
	public void Sacar(Double valor) {
		if(valor>0 && this.getSaldoTotal()>=valor) {
			        if(this.getSaldo()>=valor) {
			        	this.saldo=this.getSaldo()-valor;
			        	this.atualizarSaldoTotal();
			        	System.out.println("Saque realizado com sucesso");
			        }
			        else {
			        	Double restante=this.saldo-valor;
			        	this.limite=this.getLimite()+restante;
			        	this.saldo=0.0;
			        	this.atualizarSaldoTotal();
			        	System.out.println("Saque efetuado com sucesso!!");
			        }
		}
		else {
			System.out.println("Saque nao realizado tente mais tadre.");
		}
	}
    public void transferir(Conta destino,Double valor) {
    	if(valor>0 && this.getSaldoTotal()>=valor) {
    		if(this.getSaldo()>=valor) {
	        	this.saldo=this.getSaldo()-valor;
	        	destino.saldo=destino.getSaldo()+valor;
	        	this.atualizarSaldoTotal();
	        	destino.atualizarSaldoTotal();
	        	System.out.println("Transferencia realizado com sucesso");
	        }
	        else {
	        	Double restante=this.saldo-valor;
	        	this.limite=this.getLimite()+restante;
	        	this.saldo=0.0;
	        	destino.saldo=destino.getSaldo()+valor;
	        	this.atualizarSaldoTotal();
	        	destino.atualizarSaldoTotal();
	        	System.out.println("Transferencia efetuado com sucesso!!");
	        }
    		
    	}else {
    		System.out.println("Tranferencia nao realizado. Tente novamente. ");
    	}
    }
}
