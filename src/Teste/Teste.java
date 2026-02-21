package Teste;
import Helper.Utils;
import model.Cliente;
import model.Conta;
public class Teste {

	public static void main(String[] args) {
	Cliente benji = new Cliente(
			"Benjamim kipopi",
			"benjamilson7@gmail.com",
			"314322043",
			Utils.stringParaData("14/08/2002")
			);
    Cliente Angelina= new Cliente(
    		"Angeliana jolie",
    		"Angejoli@gmail.com",
    		"354868952",
    		Utils.stringParaData("23/02/1978")
    		);
    
    /*System.out.println(benji);
    System.out.println();
    System.out.println(Angelina);*/
    
    Conta c1=new Conta(benji);
    Conta c2=new Conta(Angelina);
    
    
    ////Depositando valor=0
    
  /*  c1.depositar(0.00);
    c2.depositar(0.00);
    System.out.println();*/
    
    
    ////Depositando valor negativo
    /*
    c1.depositar(-5000.00);
    c2.depositar(-5000.00);
    System.out.println();*/
    
//Depositando valor positivo
    c1.depositar(500.00);
    c2.depositar(500.00);
    System.out.println();
    
    
 //Saquando valor =0
  /*  c1.Sacar(0.00);
    c2.Sacar(0.00);
    System.out.println();  */
    
 /*   
 //Saquando valor negativo
    c1.Sacar(-300.00);
    c2.Sacar(-200.00);
    System.out.println();  */
  //setando o limite
    
  c1.setLimite(200.00);
  c2.setLimite(200.00);
    
 //Saquando valor maior que o saldo 
  c1.Sacar(800.00);
  c2.Sacar(600.00);
    System.out.println();
    
  
 //Saquando valor no saldo suficiente
  /*  c1.Sacar(300.00);
    c2.Sacar(200.00);
    System.out.println();*/
    
    System.out.println(c1);
    System.out.println();
    System.out.println(c2);
    System.out.println();
    
   c1.transferir(c2, 300.00);
   
   System.out.println();
   System.out.println(c1);
   System.out.println();
   System.out.println(c2);
    
    }

}
