public abstract class Clothes{
	protected String color;
	protected String material;
	protected String size;
	protected int warmEffect=2;
    
    public Clothes(String material, String size, String color){
		this.material = material;
		this.size = size;
		this.color = color;        
    }

	abstract public void describe();
	
	public void setWarmEffect(int s){ //устанавливаем тепло от одежды
		this.warmEffect = s;
	}
    
    public int getWarmeffect(){
    	return warmEffect;
    }

    public String getMaterial(){
    	return material;
    }

    public String getSize(){
    	return size;
    }

    public String getColor(){
    	return color;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
        return false;
    }

    Clothes cl = (Clothes) obj;
    return (material == cl.material || (material != null && material.equals(cl.getMaterial()))) && (size == cl.size|| (size != null && size.equals(cl.getSize()))) && (color == cl.color|| (color != null && color.equals(cl.getColor())));
    }

    @Override
    public int hashCode(){
    final int p = 31;
    int result = 1;
    result = p * result + ((material == null) ? 0 : material.hashCode());             
    result = p * result + ((size == null) ? 0 : size.hashCode());
    result = p * result + ((color == null) ? 0 : color.hashCode());  
    return result;
    }
}