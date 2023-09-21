package Leitura_Escrita;

public class ConstroeCarro {
public static void main (String [] args) {
		
		Carro carro1 = new Carro ("ABNT-0109", "1234455");
		Carro carro2 = new Carro ("222222222", "3333333");
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
		System.out.println("------------------");
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getNumChassi());
}
}