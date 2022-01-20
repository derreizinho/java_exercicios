package cadastro;

public class Cliente {
	private String nome;
	private double altura;
	
	public Cliente(String nome,double altura) {
		this.nome = nome;
		this.altura = altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getAltura() {
		return this.altura;
	}
}
