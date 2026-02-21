package view;

import java.util.ArrayList;
import java.util.Scanner;

import Helper.Utils;
import model.Cliente;
import model.Conta;

public class SmartBank {
	  static String Nome="Smart Bank";
      static Scanner teclado= new Scanner(System.in);
	  static ArrayList<Conta>contas;
	  
	public static void main(String[] args) {
		SmartBank.contas=new ArrayList<Conta>();
		SmartBank.menu();

	}

	private static void menu() {
		int opcao=0;
		System.out.println("======================================");
		System.out.println("================= ATM ================");
		System.out.println("============= "+SmartBank.Nome+" =============");
		System.out.println("======================================");
		System.out.println(" Selecine uma das opções no menu");
		System.out.println("1- Criar conta ");
		System.out.println("2- Efetuar Saque");
		System.out.println("3- Efetuar Deposito");
		System.out.println("4- Efetuar Transferencia");
		System.out.println("5- Listar Contas");
		System.out.println("6- Sair do sistema ");
		try {
			opcao=Integer.parseInt(SmartBank.teclado.nextLine());
		} catch (Exception e){
			System.out.println(e);
			Utils.pausar(3);
			SmartBank.menu();
		}
		
		switch (opcao) {
		case 1:
			SmartBank.CriarConta();
			   break;
		case 2:
			SmartBank.EfetuarSaque();
			   break;
		case 3:
			SmartBank.EfetuarDeposito();
			   break;
		case 4:
			SmartBank.EfetuarTransferencia();
			   break;
		case 5:
			SmartBank.ListarContas();
			   break;
		case 6:
			   System.out.println("Ate a proxima");
			   Utils.pausar(3);
			   System.exit(0);
		default:
			System.out.println("Opção invalida");
			Utils.pausar(3);
			SmartBank.menu();
			break;
		}
		
	}

	private static void ListarContas() {
		
		if(SmartBank.contas.size()>0) {
			System.out.println("Listando As contas ...");
			System.out.println(" ");
			for(Conta cont: SmartBank.contas) {
				System.out.println(cont);
				System.out.println(" ");
				Utils.pausar(1);
			}
			
		}
		else {
			System.out.println("Nao existe contas Cadastradas");
		}
		Utils.pausar(5);
		SmartBank.menu();
		
	}

	private static void EfetuarTransferencia() {
System.out.println("Efetuando Transferencia ...");
		
		System.out.println("Informe o numero da sua  conta :");
		int numero_O=SmartBank.teclado.nextInt();
		
		Conta conta_O = SmartBank.buscarContapornumero(numero_O);
		
		 if(conta_O!=null) {
			 System.out.println("Informe o numero da  conta Destino :");
				int numero_D=SmartBank.teclado.nextInt();
				
				Conta conta_D = SmartBank.buscarContapornumero(numero_D);
				
				 if(conta_D!=null) {
					 System.out.println("Informe o valor de Tranferencia");
					 Double val=SmartBank.teclado.nextDouble();
					 conta_O.transferir(conta_D, val);
				 }
				 else {
					 System.out.println(" Não foi encontrado a conta Destino numero "+numero_D);
				 }
			 	  
		 }
		 else {
			 System.out.println(" Não foi encontrado a conta numero "+numero_O);
		 }
		 Utils.pausar(5);
		 SmartBank.menu();
		
		
	}

	private static Conta buscarContapornumero(int numero) {
		  Conta c= null;
		   if(SmartBank.contas.size()>0) {
			   for(Conta ct: SmartBank.contas) {
				   if(ct.getNumero()==numero) {
					   c=ct;
				   }
			   }
		   }
		return c;
	}

	private static void EfetuarDeposito() {
		System.out.println("Efetuando Deposito ...");
		
		System.out.println("Informe o numero da conta :");
		int numero=SmartBank.teclado.nextInt();
		
		Conta conta = SmartBank.buscarContapornumero(numero);
		
		 if(conta!=null) {
			 System.out.println("Informe o valor de Deposito");
			 Double val=SmartBank.teclado.nextDouble();
			 conta.depositar(val);
		 }
		 else {
			 System.out.println(" Não foi encontrado a conta numero "+numero);
		 }
		 Utils.pausar(5);
		 SmartBank.menu();
		
	}

	private static void EfetuarSaque() {
		System.out.println("Efetuando Saque ...");
		
		System.out.println("Informe o numero da conta :");
		int numero=SmartBank.teclado.nextInt();
		
		Conta conta = SmartBank.buscarContapornumero(numero);
		 if(conta!=null) {
			 System.out.println("Informe o valor do Saque");
			 Double val=SmartBank.teclado.nextDouble();
			 conta.Sacar(val);
		 }
		 else {
			 System.out.println(" Não foi encontrado a conta numero "+numero);
		 }
		 Utils.pausar(5);
		 SmartBank.menu();
		
	}

	private static void CriarConta() {
		System.out.println("Criando Conta ...");
		
		System.out.println("Informe dados Cliente: ");
		
		System.out.println("Nome: ");
		String Nome=SmartBank.teclado.nextLine();
		
		System.out.println("Email: ");
		String Email=SmartBank.teclado.nextLine();
		
		System.out.println("Cpf: ");
		String Cpf=SmartBank.teclado.nextLine();
		
		System.out.println("Data Nascimento: ");
		String DataNasc=SmartBank.teclado.nextLine();
		
		Cliente cliente=new Cliente(Nome,Email,Cpf,Utils.stringParaData(DataNasc));
		
		Conta conta= new Conta(cliente);
		contas.add(conta);
		System.out.println(" Conta Criada Com Sucesso! ");
		System.out.println("Dado da Conta: ");
		System.out.println(conta);
		System.out.println();
		
		Utils.pausar(5);
		SmartBank.menu();
		
	}

}
