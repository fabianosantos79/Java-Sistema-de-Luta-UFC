
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l[1] = new Lutador("Puttscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		l[2] = new Lutador("SnapShadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		l[4] = new Lutador("UFOCobol", "México", 37, 1.70, 119.3, 5, 4, 3);
		l[5] = new Lutador("NerdArt", "Canadá", 30, 1.81, 105.7, 12, 2, 4);
		
		Luta combate1 = new Luta();
		combate1.marcarLuta(l[3], l[2]);
		combate1.lutar();
		//combate1.lutar();
		l[3].status();
		l[2].status();
	}

}
