package direcoes;

import model.Posicao;

public class Sul implements AbstractDirecao {
	
	public Sul(){
		
	}

	@Override
	public Posicao move(Posicao posicao) {
		return new Posicao(posicao.getX(),posicao.getY()-1);
	}
	
	@Override
	public AbstractDirecao turnRight() {
		return new Oeste();	
	}

	@Override
	public AbstractDirecao turnLeft() {
		return new Leste();
	}

	@Override
	public String toString() {
		return "S";
	}

	
}
