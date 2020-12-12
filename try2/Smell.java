public class Smell{
//запах в бриллиантовой
	public void smellBrillGall(){
		System.out.println("There is none smell in the brilliant gallery.");
	}
//запах в каменной
	public void smellStoneGall(){
		System.out.println("There is an acrid smell in the stone gallery too.");
	}
//запах в туннеле
	public void smellTunnel(long r){
		if (r<60) {
		    System.out.println("A slight unpleasant smell is felt.");//Чувствуется легкий неприятный запах
		    System.out.println("\n");
		    } 
        else if ((r>=60) && (r<=127)) {
            System.out.println("Acrid smell intensifies.");//Едкий запах усиливается
            System.out.println("\n");
            } 
        else {
            System.out.println("Unbearable acrid smell.");//невыносимый едкий запах
            System.out.println("\n"); 
        }
	}

}