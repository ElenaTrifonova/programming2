public class Leader extends Person{
    
    protected int mood;

	public Leader(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

    public void setMood(int m){
		this.mood = m;
	}
    
    public int getMood(){
    	return mood;
    }
//изменение настроения
    public int influenceOnMood(Temperature temp, long r){
        if ((temp.increaseDegree(r) >=15) && (temp.increaseDegree(r) <=30)) mood-=1;
        else if (temp.increaseDegree(r) > 30) mood-=2;
        else mood+=1;

        System.out.printf("%s%d","Points of leader mood:", mood);
        return mood;  	
    }

	@Override
    public void SaySth(){
    	System.out.printf("%s%s","-Go straight, we're not turning anywhere!, - said ", getName());
    	System.out.println("\n");
    }
//шаг и координата
    @Override
    public void step(Tunnel tunnel) {
        step = (Math.random()+ 0.5)  * 5 ;
        if (pointX + step  > tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is in the underground now.\n");
        if (pointX + step <= tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is still in the tunnel.\n");
        pointX += step;
    }

}