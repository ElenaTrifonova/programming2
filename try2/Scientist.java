public class Scientist extends Person{
	
    protected int happy = 0;

	public Scientist(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}


    public int getHappy(){
    	return happy;
    }   
//изменение очков счастья
    public int influenceOnHappy(Penguin pen){
        if (pen.countPen == 0) happy-=1;
        else if ((pen.countPen>=1) && (pen.countPen<=3)) happy += 10;
        else happy+=13;        

        if (happy >= 15) {
        	System.out.printf("%s%s",getName() , " cried from happiness.");
        	System.out.println("\n");
        }
        
        System.out.printf("%s%d","Points of scientist  happiness:", happy);
        return happy;  	
    }

    @Override
    public void SaySth(){
    	System.out.printf("%s%s","-I just wanted to relax... What did I join them for??? - sighed ", getType());
    	System.out.println("\n");
    }
//шаг и координата
    @Override
    public void step(Tunnel tunnel) {
        step = (Math.random()+ 0.5)  * 3 ;
        if (pointX + step  > tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is in the underground now.\n");
        if (pointX + step <= tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is still in the tunnel.\n");
        pointX += step;
    }

   //считает пингвинов
    public int count(Penguin pen){
    	System.out.printf("%s%s%d",getType() , " wrote the information about penguins and their amount in notebook. Amount: ", pen.countPen);
    	System.out.println("\n");
    	return pen.countPen;
    }
 
}