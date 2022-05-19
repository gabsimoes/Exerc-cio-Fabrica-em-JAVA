package beans;

public class Veiculo {
	
	//ATRIBUTOS
	private String modelo;
	private String cor;
	private double distancia;
	private double litro;
	private double distanciaFinal;
	
	private String marca;
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getLitro() {
		return litro;
	}

	public void setLitro(double litro) {
		this.litro = litro;
	}

	public double getDistanciaFinal() {
		return distanciaFinal;
	}

	public void setDistanciaFinal(double distanciaFinal) {
		this.distanciaFinal = distanciaFinal;
	}

	
	//MÉTODOS
	void consumoMedio() {
		double consumoMedio = this.distancia / this.litro;
	}
	
	/*public String getMarca() {
		return marca;
	}
	
	public void setMarca(String MarcaVeiculo) {
		if (MarcaVeiculo == "Corolla") {
			this.marca = (MarcaVeiculo + " " + "Carro Comprado");
		}
		else {
			this.marca = MarcaVeiculo;
		}
	}*/
}
