package exercicioRelacionamento;
import exercicioRelacionamento.Contato;
import java.util.Scanner;
import exercicioRelacionamento.Endereco;
import exercicioRelacionamento.Telefone;
public class Teste {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	Contato contato = new Contato();
	
	System.out.print("Digite o nome da rua: ");
	String nomeRua = scan.nextLine();
	System.out.print("Digite o numero residencia: ");
	String numero = scan.nextLine();
	System.out.print("Digite complemento: ");
	String complemento = scan.nextLine();
	System.out.print("Digite o nome da cidade: ");
	String cidade = scan.nextLine();
	System.out.print("Digite o estado: ");
	String estado = scan.nextLine();
	System.out.print("Digite o CEP: ");
	String cep = scan.nextLine();
	System.out.print("Digite o telefone: ");
	String telefone = scan.nextLine();
	
	contato.setnome(nomeRua);
	
	Endereco endereco = new Endereco();
	endereco.setnomeRua(nomeRua);
	endereco.setnumero(numero);
	endereco.setcomplemento(complemento);
	endereco.setcidade(cidade);
	endereco.setestado(estado);
	endereco.setcep(cep);
	
	contato.setendereco(endereco);
	int n = 1;
	
	
	
 for (int i=0; i<n; i++) {
	Telefone[] telefone1 = new Telefone[n];
	System.out.print("Digite o tipo: ");
	String tipo = scan.nextLine();
	System.out.print("Digite o ddd: ");
	String ddd = scan.nextLine();
	System.out.print("Digite o telefone: ");
	String numero1 = scan.nextLine();
	telefone1[i].settipo(tipo);
	telefone1[i].setddd(ddd);
	telefone1[i].setnumero(numero);
	
 }
	
 	System.out.println(telefone);
	System.out.print("Endereço: "+ endereco.getnomeRua() + " numero: " + endereco.getnumero() + " Complemento: " + endereco.getcomplemento() + " Cidade: " + endereco.getcidade() + " Estado: " + endereco.getestado() + "cep: "+ endereco.getcep()  );
	System.out.println();

	scan.close();
	
	}
	

}
