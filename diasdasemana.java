import java.util.Random;

public class DiaDaSemana{
  private int dia; // 1-domingo, 2-segunda, etc.
  public DiaDaSemana(){
    Random gerador = new Random();
    this.dia = gerador.nextInt(1,8);
  }
  public int getDia(){
    return this.dia;
  }
  public String getNomeDoDia(){
    String[] nomes_dias = {"D,S,T,Q,QUI,SEX,SAB"};
    return nomes_dias[this.dia-1];
  }
public void setDia(int dia) {
	this.dia = dia;
}
}
class MeusDiasDeTrieno{
  public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

int array[];
  }
}
