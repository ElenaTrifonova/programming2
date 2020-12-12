public class Temperature{
    public int degree = 15;
//устанавливаем температуру
    public void setDegree(int d){
		this.degree = d;
	}
    
    public int getDegree(){
    	return degree;
    }
//увеличение температуры
	public int increaseDegree(long r){
		if (r<60) degree+=1;
        else if ((r>=60) && (r<=99)) degree+=3;
        else degree+=2;
        System.out.printf("%s%d","Temperature of air: ", degree);
        System.out.println("\n");
        return degree;
	}
	
}