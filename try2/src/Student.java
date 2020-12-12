public class Student extends Person{

    protected int speed;

	public Student(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}
    //устанавливаем скорость
    public void setSpeed(int sp){
		this.speed = sp;
	}
    
    public int getSpeed(){
    	return speed;
    }
//изменение скорости
    public int influenceOnSpeed(){
        if (getX() % 2 == 0) speed+=1;
        else if (getX() % 2 == 1)  speed-=1;
        System.out.printf("%s%d","Speed of student:", speed);
        
        return speed;  	
    }
//заходит в галлерею бриллиантовую
    public void comeIntoGallery1(Brilliant bril){
    	if ((pointX >= bril.x1) && (pointX <= bril.x2)) {
    	  System.out.printf("%s%s", getName() , " is into brilliant gallery.\n");
          Smell smell1 = new Smell();
          smell1.smellBrillGall();
          System.out.printf("%s%s", getName() , " informed the others about it.");

    	}
    }
//заходит в галлерею каменную
    public void comeIntoGallery2(Stone stone){
    	if ((pointX >= stone.x1) && (pointX <= stone.x2)){
    	   System.out.printf("%s%s", getName() , " is into stone gallery.\n");
    	   Smell smell2 = new Smell();
           smell2.smellStoneGall();
           System.out.printf("%s%s", getName() , " informed the others about it.");
    	}
    }

	@Override
    public void SaySth(){
    	System.out.printf("%s%s","-I have wanted to catch an adventure for so long!!!, - said ", getName());
    	System.out.println("\n");
    }
//шаг и координата
    @Override
    public void step(Tunnel tunnel) {
        step = (Math.random()+ 0.5)  * speed ;
        if (pointX + step  > tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is in the underground now.\n");
        if (pointX + step <= tunnel.sizeTunnel) System.out.printf("%s%s",getType() , " is still in the tunnel.\n");
        pointX += step;
    }
}