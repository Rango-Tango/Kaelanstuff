
public class MovementspaceObject {
public void MovementspaceObject(){
}
	int x,y,player,health;
	public void setX(int here){
		this.x=here;
	}
	public void setY(int here){
		this.y=here;
	}
	public void setHealth(int here){
	this.health=here;
	}
	
	public void setPlayer(int here){
		this.player=here;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public int getHealth(){
	return this.health;	
	}
	public int getPlayer(){
		return this.player;
	}
}
