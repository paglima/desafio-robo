package model;

import direcoes.AbstractDirecao;
import direcoes.Leste;
import direcoes.Norte;
import direcoes.Oeste;
import direcoes.Sul;

public class Robo {
	
	private AbstractDirecao direcao;
	private Posicao posicao;
	
	
	public Robo(int x, int y,char direcao) throws Exception {
		verifica(direcao);
		this.posicao = new Posicao(x,y);
	}
	
	public void turnRight(){
		this.direcao = direcao.turnRight();
	}
	
	public void turnLeft(){
		this.direcao = direcao.turnRight();
	}
	
	public void move(){
		this.posicao = direcao.move(this.posicao);
	}
	
	private void verifica(char direcao) throws Exception{
		switch(direcao){
			case 'N': this.direcao = new Norte(); break;
			case 'S': this.direcao = new Sul(); break;
			case 'E': this.direcao = new Leste(); break;
			case 'W': this.direcao = new Oeste(); break;
			default: throw new Exception("Direção inválida");
		}
	}
	
	public String toString(){
		return this.posicao+" "+this.direcao;
	}
}