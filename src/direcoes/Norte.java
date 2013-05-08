package direcoes;

import model.Posicao;

public class Norte implements AbstractDirecao{
	
	public Norte(){
		
	}
	
	@Override
	public Posicao move(Posicao posicao) {
		return new Posicao(posicao.getX(),posicao.getY()+1);
	}
	
	@Override
	public AbstractDirecao turnRight() {
		return new Leste();	
	}

	@Override
	public AbstractDirecao turnLeft() {
		return new Oeste();
	}

	@Override
	public String toString() {
		return "N";
	}

}
