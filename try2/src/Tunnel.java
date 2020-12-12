public class Tunnel extends Location{
    
    public double sizeTunnel;

	public Tunnel(double w, double h){
        super(w, h);
	}

   public double getWidth(){ //получаем высоту
   	    return w;
   }

   public double getHeight(){ //получаем ширину
   	    return h;
   }
   
   public void setSize(double s){
   	    this.sizeTunnel = s;
   }

   public double getSize(){
   	    return sizeTunnel;
   }
 
   @Override
   public void describe(){
   	  System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth(), " Height of tunnel: ", getHeight());
   }

//изменение данных туннеля
   public void depict(long r){
   	if (r<70){
      System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth(), " Height of tunnel: ", getHeight());
      System.out.println("\n");
    }
    else if ((r>=70) && (r<=99)){
      System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth() , " Height of tunnel: ", getHeight()-0.1);
      System.out.println("\n");
      h = h - 0.1;
      
    }
    else {
      System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth()-0.2 , " Height of tunnel: ", getHeight()-0.2);   
      System.out.println("\n");   
      w = w - 0.2; 
      h = h - 0.2; 
    }
   }

}