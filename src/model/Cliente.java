package model;

import java.util.Date;
import Helper.Utils;
public class Cliente {
     private static int contador=0;
     
     private int codigo;
     private String Nome;
     private String email;
     private String Cpf;
     private Date dataNascimento;
     private Date dataCadastro;
     
     public Cliente(String nome, String email, String cpf, Date dataNascimento) {
	     this.codigo=Cliente.contador;
		this.Nome = nome;
		this.email = email;
		this.Cpf = cpf;
		this.dataNascimento = dataNascimento;
		Cliente.contador++;
		this.dataCadastro=new Date();
	}
     public int getCodigo() {
    	 return this.codigo;
     }
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataCadastro() {
		return this.dataCadastro;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Codigo:  "+this.getCodigo()+
    			"\nE-mail: "+this.getEmail()+
    			"\nNome: "+this.getNome()+
    			"\nCpf: "+this.getCpf()+
    			"\nData de Nascimento: "+Utils.dateParString(this.getDataNascimento())+
    			"\nData de Cadastro: "+Utils.dateParString(this.getDataCadastro());
    }
}
