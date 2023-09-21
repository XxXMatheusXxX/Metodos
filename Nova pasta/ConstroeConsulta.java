package Leitura_Escrita;

public class ConstroeConsulta {
public static void main (String [] args) {
		
		Consulta consulta1 = new Consulta ("Rosangela", "Marcos");
		Consulta consulta2 = new Consulta ("Renê", "Junior");
		
		System.out.println(consulta1.getnomePende());
		System.out.println(consulta1.getnomeDepen());
		System.out.println("------------------");
		System.out.println(consulta2.getnomePende());
		System.out.println(consulta2.getDepen());
}
}