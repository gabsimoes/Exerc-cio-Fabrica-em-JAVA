package teste;

import java.util.Scanner;

import beans.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		Veiculo carro;
		carro = new Veiculo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a marca do ve�culo: ");
		carro.setMarca(sc.nextLine());
		
		System.out.println("Insira o modelo do ve�culo: ");
		carro.setModelo(sc.nextLine());
		
		System.out.println("Insira a cor do ve�culo: ");
		carro.setCor(sc.nextLine());
		
		System.out.println("Insira a dist�ncia percorrida com o ve�culo: ");
		carro.setDistancia(sc.nextDouble());
		
		System.out.println("Insira a quantidade gasta em litros: ");
		carro.setLitro(sc.nextDouble());
		
		
		System.out.println("O carro � da marca " + carro.getMarca() + ", do modelo " 
		+ carro.getModelo() + " e da cor " + carro.getCor() 
		+ ". E a dist�ncia percorrida foi de " + carro.getDistancia() 
		+ "km, gastando " + carro.getLitro() + " litros de gasolina.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*carro.marca = "BMW";
		carro.modelo = "Z4";
		carro.cor = "vermelho";*/
		
		//System.out.println("O carro � da marca " + carro.getMarca() + ", do modelo " + carro.getModelo() + " e da cor " + carro.getCor() + ".");
		
		/*carro.marca = null;
		carro.modelo = null;
		carro.cor = null;
		carro.distancia = 0;
		carro.litro = 0;
		carro.distanciaFinal = 0;*/
		
		/*System.out.println("Insira a marca do ve�culo: ");
		carro.marca = sc.nextLine();
		
		System.out.println("Insira o modelo do ve�culo: ");
		carro.modelo = sc.nextLine();
		
		System.out.println("Insira a cor do ve�culo: ");
		carro.cor = sc.nextLine();
		
		System.out.println("Insira a dist�ncia percorrida com o ve�culo: ");
		carro.distancia = sc.nextDouble();
		
		
		System.out.println("Insira a quantidade gasta em litros: ");
		carro.litro = sc.nextDouble();
		
		System.out.println("O carro � da marca " + carro.marca + ", do modelo " + carro.modelo + " e da cor " + carro.cor + " e percorreu" + carro.distanciaFinal + ".");*/
		
		
	}

}
