package direcoes;

import model.Posicao;

public class Leste implements AbstractDirecao {
	
	public Leste(){
		
	}
	
	@Override
	public Posicao move(Posicao posicao) {
		return new Posicao(posicao.getX()+1,posicao.getY());
	}
	
	@Override
	public AbstractDirecao turnRight() {
		return new Sul();	
	}

	@Override
	public AbstractDirecao turnLeft() {
		return new Norte();
	}

	@Override
	public String toString() {
		return "E";
	}

}