package direcoes;

import model.Posicao;

public interface AbstractDirecao {
	
	public Posicao move(Posicao posicao);
	public AbstractDirecao turnRight();
	public AbstractDirecao turnLeft();
	public String toString();
	
}
