public class Brilliant extends SideGallery{

	public Brilliant(double w, double h){
    	super(w, h);
	}
    
   @Override
   public void describe(){
   	  System.out.printf("%s%d%s%d","Ширина бриллиантовой галереи: ", getWidth(), " Высота бриллиантовой галереи: ", getHeight());
   }

}