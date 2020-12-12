import java.util.Date; 

public class Time{

  public long r = 0;
//считаем время
  public long mainn(long start){
    long r = System.currentTimeMillis() - start;
    return r;
  }
//время с момента входа
  public void running(long r){
    System.out.printf("%s%d%s","Time since entering the tunnel:", r, " milliseconds.");
    System.out.println("\n");        
  }

}