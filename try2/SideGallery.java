public class SideGallery extends Location{
    
    public String type;
    protected double x1;
    protected double x2;
    protected double y;

    public SideGallery(double w, double h){
    	super(w, h);
	}

	public String getType(){
		return type;
	}
 //устанавливаем координаты   
   public void setXY(double x1, double y){
   	    this.x1 = x1;
   	    this.y = y;
   	    this.x2 = x1 + this.h;
    }
   
   public double getY(){
   	    return y;
   }

   public double getX(){
   	    return x1;
   }

  @Override
   public void describe(){
       System.out.printf("%s%d%s%d","Width of side gallery: ", getWidth(), " Height of side gallery: ", getHeight());
   }

   public double getWidth(){ //получаем высоту
   	    return w;
   }

   public double getHeight(){ //получаем ширину
   	    return h;
   }
   
}