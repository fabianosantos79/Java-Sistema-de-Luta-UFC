
public class Lutador {
	
	//ATRIBUTOS
	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private double altura;
	private double peso;

	
	//CONSTRUTOR
		public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
			this.setNome(no);
			this.nacionalidade = na;
			this.idade = id;
			this.altura = al;
			this.setPeso(pe);
			this.vitorias = vi;
			this.derrotas = de;
			this.empates = em;
		}
		

		
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}
	

	public String getCategoria() {
		return categoria;
	}
	
	
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválida";
		}else if(peso <= 70.00) {
			this.categoria = "Leve";
		}else if(peso <= 83.9) {
			this.categoria = "Média";
		}else if(peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválida";
		}

	}
	
	
	public int getVitorias() {
		return vitorias;
	}


	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}


	public int getDerrotas() {
		return derrotas;
	}


	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}


	public int getEmpates() {
		return empates;
	}


	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	//MÉTODOS DA CLASSE	
	public void apresentar() {
		System.out.println("---------------------------------");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador: "+ this.getNome());
		System.out.println("Diretamente de : "+ this.getNacionalidade());
		System.out.println("com: "+ this.getIdade() + " anos e " + this.getAltura() + " de alltura");
		System.out.println("Pesando: "+ this.getPeso() + " kg");
		System.out.println("com "+ this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates");
	}
	
	
	public void status() {
		System.out.println("");
		System.out.println(this.getNome() + " é um peso " + this.categoria);
		System.out.println("Ganhou: "+ this.getVitorias() + " vezes");
		System.out.println("Perdeu: "+ this.getDerrotas() + " vezes");
		System.out.println("Empatou: "+ this.getEmpates() + " vezes");
	}
	
	
	public void ganharLuta() {
		setVitorias(this.getVitorias() + 1);
	}
	
	
	public void perderLuta() {
		setDerrotas(this.getDerrotas() + 1);
	}
	
	
	public void empatarLuta() {
		setEmpates(this.getEmpates() + 1);
	}

}
