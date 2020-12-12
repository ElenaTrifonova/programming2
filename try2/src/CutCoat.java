public class CutCoat extends Clothes{

	public CutCoat(String material, String size, String color){
		super(material, size, color);        
    }
//поднятие курток
    public void toRaise(Person pers){
    	System.out.println(pers.getName() + " lifted the coat, it had been cut.\n"); //поднял куртку с земли, она оказалась с прорезями.
    }

    @Override 
    public void describe(){
    	System.out.println("Information about clothes on the ground: " + getMaterial() + ' ' + getSize() + ' ' + getColor() + ' ' + getWarmeffect());
    }
}