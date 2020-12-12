public class Penguin implements Move{
    static int countPen=0; //количество пингвинов
    protected double pointPX = 0; //координата пингвина
    protected double stepP = 0;//шаг пингвина
	protected int number;
	protected String  color;
	protected String  sex;
	protected String  age; // adult||baby
	protected int health;

    public Penguin(int number, String age, String sex, String color){
        this.number=number;
    	this.age = age;
		this.sex = sex;
		this.color = color;
		countPen += 1;
    }


    public void setHealth(int h){ //устанавливаем здоровье
    	this.health = h;
    }
    
    public int getHealth(){
    	return health;
    }

    @Override   //шаг, с которым движется персонаж и изменение его координаты                   
    public void step (Tunnel tunnel) {
        stepP = (Math.random()+ 0.1)  * 2 ;
        if (pointPX + stepP  > tunnel.sizeTunnel) System.out.println("Penguin is in the underground.");
        if (pointPX + stepP <= tunnel.sizeTunnel) System.out.println("Penguin is still in the tunnel.");
        pointPX += stepP;
    }

//врезается во что-то
    public void bump (Stalakt st){ 
    	if ((st.getCoord() >= pointPX - 0.2) && (st.getCoord() <= pointPX + 0.2)) {
    		System.out.println("Penguin " + getNumber() + " bump into stalagmit.\n");
    		health -= 1;
    		Sound sound1 = new Sound();
            sound1.soundStalakt();
    	}
    	else {
    		System.out.println("Penguin bump into wall.\n");
    		Sound sound2 = new Sound();
    		health -= 2;
            sound2.soundTunnel();
    	}

    	if (health <= 0) {
    			health = 0;
    			System.out.println("Penguin was tired and went to sleep.\n");
    		}
    	else System.out.println("Health of penguin: " + getHealth());
    	


    }

    public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
    public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getColor(){
		return color;
	}
	public void setName(String color){
		this.color = color;
	}

    @Override
	public String toString(){
		System.out.println("Information about penguins: ");
		return "number" + getNumber() + ' ' + getAge() + ' ' + getSex() + ' ' + getColor() + '\n';
	}
}