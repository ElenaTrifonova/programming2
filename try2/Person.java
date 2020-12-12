abstract public class Person implements Move, SaySth{

    protected int age;
	protected String sex;
	protected String name;
	protected String type;
    protected double pointX = 0;
    protected double step = 0;
   
        
    public Person(String name, int age, String sex, String type){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.type = type;
	}


    @Override   //шаг, с которым движется персонаж и изменение его координаты                   
    public void step(Tunnel tunnel) {
        step = (Math.random()+ 0.1)  * 4 ;
        if (pointX + step  > tunnel.sizeTunnel) System.out.println(getType() + " попал в подземный ход.");
        if (pointX + step <= tunnel.sizeTunnel) System.out.println(getType() + " is still in the tunnel.");
        pointX += step;
}
    @Override //слова, которые произносит персонаж
    public void SaySth (){
    	System.out.println("Что-то");
    }

    public double getX() { //получаем координату
        return pointX;
    }

    public String getType(){//получаем род деятельности
		return type;
	}
	public void setType(String type){
		this.type = type;
	}	
	public String getName(){//получаем имя
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getSex(){//получаем пол
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}    
	public int getAge(){//получаем возраст
		return age;
    }
	public void setAge(int age){
		this.age = age;
	}
    @Override //выводим информацию об участнике
	public String toString(){
		System.out.println("Information about person: ");
		return getName() + ' ' + getAge() + ' ' + getSex() + ' ' + getType() + '\n';
	}
}