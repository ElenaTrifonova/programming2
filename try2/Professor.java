public class Professor extends Person{
	
	protected int emoState;

	public Professor(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}
    
    @Override
    public void SaySth(){
    	System.out.printf("%s%s","-I will finally see penguins in their natural habitat! - exclaimed ", getType());
    	System.out.println("\n");
    }
    //эмоциональное состояние
    public void setEmoState(int e){
		this.emoState = e;
	}
    
    public int getEmoState(){
    	return emoState;
    }
//изменение очков эмоционального состояния
    public int influenceOnState(Tunnel tunnel){
        if (getX() <= tunnel.sizeTunnel / 2) emoState-=1;
        else if (getX() >= tunnel.sizeTunnel / 2)  emoState-=2;

        if (emoState <= -5) {
        	System.out.printf("%s%s",getName() , " couldn't stand it and went back to entrance.");
        }
        
        System.out.printf("%s%d", "Points of professor emotional state:", emoState);

        return emoState;  	
    }
//шаг и координата
    @Override
    public void step(Tunnel tunnel) {
        step = (Math.random()+ 0.5)  * 3 ;
        if (pointX + step  > tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is in the underground now.\n");
        if (pointX + step <= tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is still in the tunnel.\n");
        pointX += step;
    }



}