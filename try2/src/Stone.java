public class Stone extends SideGallery{

	public Stone(double w, double h){
    	super(w, h);
	}
    
   @Override
   public void describe(){
   	  System.out.printf("%s%d%s%d","Ширина каменной галереи: ", getWidth(), " Высота каменной галереи: ", getHeight());
   }
	
}