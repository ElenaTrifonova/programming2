public abstract class Location{

	protected double w;
	protected double h;

	public Location (double w, double h){
		this.w = w;
		this.h = h;
	}

	public abstract void describe();
	
}