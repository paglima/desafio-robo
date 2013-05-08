package direcoes;

import model.Posicao;

public class Oeste implements AbstractDirecao{
	
	public Oeste(){
		
	}
	
	@Override
	public Posicao move(Posicao posicao) {
		return new Posicao(posicao.getX()-1,posicao.getY());
	}

	@Override
	public AbstractDirecao turnRight() {
		return new Norte();	
	}

	@Override
	public AbstractDirecao turnLeft() {
		return new Sul();
	}

	@Override
	public String toString() {
		return "W";
	}

}
