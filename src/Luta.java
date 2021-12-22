import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;


	public Lutador getDesafiado() {
		return desafiado;
	}



	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	
	public Lutador getDesafiante() {
		return desafiante;
	}



	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	
	
	public int getRounds() {
		return rounds;
	}



	public void setRounds(int rounds) {
		this.rounds = rounds;
	}



	public boolean getAprovada() {
		return aprovada;
	}
	
	
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	
    
	
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria()) {
			if(l1 != l2) {
				this.setDesafiado(l1);
				this.setDesafiante(l2);
				this.setAprovada(true);
				System.out.println("Luta aprovada!");
			}
			else {
				System.out.println("Mesmo lutador, luta não pode ocorrer!");
				this.setAprovada(false);
			}
		}
		else {
			System.out.println("Categorias diferentes, luta não pode ocorrer!");
			this.setAprovada(false);
		}
	}
	
	
	
	public void lutar() {
		if(this.getAprovada()) {
			System.out.println("");
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("");
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			
			switch(vencedor) {
				case 0: //Empate
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				System.out.println("");
				System.out.println("=== EMPATOU ===");
				System.out.println("Empatou");
				break;
				
				case 1: //Desafiado venceu
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				System.out.println("");
				System.out.println("======= VENCEDOR =======");
				System.out.println("O vencedor foi: " + this.getDesafiado().getNome());
				System.out.println("===========================");
				break;
				
				case 2: //Desafiante venceu
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				System.out.println("");
				System.out.println("======= VENCEDOR =======");
				System.out.println("O vencedor foi: " + this.getDesafiante().getNome());
				System.out.println("===========================");
				break;
				
			}
		}
		else {
			System.out.println("Luta não aprovada!");
		}
	}

}
