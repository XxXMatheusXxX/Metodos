package Leitura_Escrita;

public class ConstroAnimal {
public static void main (String [] args) {
		
		Animal animal1 = new Animal ("preto", 123);
		Animal animal2 = new Animal ("branco", 232);
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		System.out.println("------------------");
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());
}
}