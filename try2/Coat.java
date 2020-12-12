public class Coat extends Clothes{

	public Coat(String material, String size, String color){
		super(material, size, color);        
    }

    
    public int warm(Temperature temp, long r){ //повышение очков  нагрева куртки
    	if ((temp.increaseDegree(r) >= 15 )&&(temp.increaseDegree(r) <= 25 )){
    		warmEffect+=1;
    	}
    	else if (temp.increaseDegree(r) > 25) warmEffect+=2;
    	return warmEffect;
    }

   
    public void fall(Temperature temp, Person pers, long r){  //сбрасывание куртки в зависимости от температуры
    	if (temp.increaseDegree(r) >=23) {
    		System.out.println(pers.getType() + " threw off jacket."); 
    		Sound s = new Sound();
    		s.soundClothes();
    	}
    }

    @Override 
    public void describe(){
    	System.out.println("Information about clothes: " + getMaterial() + ' ' + getSize() + ' ' + getColor() + ' ' + getWarmeffect());
    }
}