package model;


public class Robo {
	
	private char direcao;
	private Posicao posicao;
	
	
	public Robo(int x, int y,char direcao) throws Exception {
		this.direcao = direcao;
		this.posicao = new Posicao(x,y);
	}
	
	public void turnRight(){
		if(this.direcao=='N'){
			this.direcao = 'E';
		}else if(this.direcao=='S'){
			this.direcao = 'W';
		}else if(this.direcao=='E'){
			this.direcao = 'S';
		}else if(this.direcao=='W'){
			this.direcao = 'N';
		}
	}
	
	public void turnLeft(){
		if(this.direcao=='N'){
			this.direcao = 'W';
		}else if(this.direcao=='S'){
			this.direcao = 'E';
		}else if(this.direcao=='E'){
			this.direcao = 'N';
		}else if(this.direcao=='W'){
			this.direcao = 'S';
		}
	}
	
	public void move(){
		if(this.direcao=='N'){
			this.posicao = new Posicao(posicao.getX(),posicao.getY()+1);
		}else if(this.direcao=='S'){
			this.posicao = new Posicao(posicao.getX(),posicao.getY()-1);
		}else if(this.direcao=='E'){
			this.posicao = new Posicao(posicao.getX()+1,posicao.getY());
		}else if(this.direcao=='W'){
			this.posicao = new Posicao(posicao.getX()-1,posicao.getY());
		}
	}
	
	public String toString(){
		return this.posicao+" "+this.direcao;
	}
}