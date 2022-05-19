package teste;

import java.util.Scanner;

import beans.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {

		Veiculo carro;
		carro = new Veiculo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a marca do veículo: ");
		carro.setMarca(sc.nextLine());
		
		System.out.println("Insira o modelo do veículo: ");
		carro.setModelo(sc.nextLine());
		
		System.out.println("Insira a cor do veículo: ");
		carro.setCor(sc.nextLine());
		
		System.out.println("Insira a distância percorrida com o veículo: ");
		carro.setDistancia(sc.nextDouble());
		
		System.out.println("Insira a quantidade gasta em litros: ");
		carro.setLitro(sc.nextDouble());
		
		
		System.out.println("O carro é da marca " + carro.getMarca() + ", do modelo " 
		+ carro.getModelo() + " e da cor " + carro.getCor() 
		+ ". E a distância percorrida foi de " + carro.getDistancia() 
		+ "km, gastando " + carro.getLitro() + " litros de gasolina.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*carro.marca = "BMW";
		carro.modelo = "Z4";
		carro.cor = "vermelho";*/
		
		//System.out.println("O carro é da marca " + carro.getMarca() + ", do modelo " + carro.getModelo() + " e da cor " + carro.getCor() + ".");
		
		/*carro.marca = null;
		carro.modelo = null;
		carro.cor = null;
		carro.distancia = 0;
		carro.litro = 0;
		carro.distanciaFinal = 0;*/
		
		/*System.out.println("Insira a marca do veículo: ");
		carro.marca = sc.nextLine();
		
		System.out.println("Insira o modelo do veículo: ");
		carro.modelo = sc.nextLine();
		
		System.out.println("Insira a cor do veículo: ");
		carro.cor = sc.nextLine();
		
		System.out.println("Insira a distância percorrida com o veículo: ");
		carro.distancia = sc.nextDouble();
		
		
		System.out.println("Insira a quantidade gasta em litros: ");
		carro.litro = sc.nextDouble();
		
		System.out.println("O carro é da marca " + carro.marca + ", do modelo " + carro.modelo + " e da cor " + carro.cor + " e percorreu" + carro.distanciaFinal + ".");*/
		
		
	}

}
