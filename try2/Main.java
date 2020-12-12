public class Main {

	public static void main(String args[]) throws InterruptedException{
		
        System.out.println("Day of week: " +DayOfWeek.WEDNESDAY.getTitle());
        System.out.println("\n");
        
        //создаем экземпляры классов людей
        Student student = new Student("Dima", 18, "male", "Student");
		Leader leader = new Leader("Victor", 35, "male", "Leader");
		Professor professor = new Professor("Sergey Vasilevich", 27, "male", "Professor");
		Scientist scientist = new Scientist("Ivan", 25, "male", "Scientist");
        
        //устанавливаем параметры скорости для студента, настроения для лидера и эмоционального состояния для профессора
		student.setSpeed(4);
		leader.setMood(10);
		professor.setEmoState(5);
		
		
        //вывод информации об участниках 
        System.out.println(student.toString()); 
		System.out.println(professor.toString());
		System.out.println(scientist.toString());
		System.out.println(leader.toString());

        //экземпляр класса симуляции
        Simul simulation = new Simul();
		simulation.simul(student,  professor, leader, scientist); //подаем в метод класса симуляции наши объекты

		System.out.println("To be continued...");
	}
}