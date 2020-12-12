public class Simul {
//класс симуляции

	public void simul(Student student, Professor professor, Leader leader, Scientist scientist){
        
        Tunnel tunnel = new Tunnel(4, 6); //создаем туннель
        Brilliant brill1 = new Brilliant(4, 4);//создаем бриллиантовую галерею один
        Brilliant brill2 = new Brilliant(3, 4);//создаем бриллиантовую галерею два
        Stone stone = new Stone(2, 3);//создаем каменную галерею
        
        tunnel.setSize(16); //задаем длину туннеля
        brill1.setXY(2, 5); //задаем левую координату x галереи и y
        stone.setXY(8, 3); //задаем левую координату x галереи и y
        brill2.setXY(11, 4); //задаем левую координату x галереи и y
        
        
        Time time = new Time(); //создаем экземпляр класса времени
        long start = System.currentTimeMillis();//обозначаем начало счета
        long r1 = time.mainn(start);//время в данный момент
        time.running(r1); //время на входе в пещеру

        Smell smell = new Smell(); // запахи
        smell.smellTunnel(r1);//запах в туннеле

        Temperature temperature = new Temperature();//создаем объект температуры
        

        //люди озвучивают свои фразы
		student.SaySth(); 
		professor.SaySth();
		scientist.SaySth();
		leader.SaySth();
		System.out.println("\n");
        
        //люди идут
		student.step(tunnel);
		professor.step(tunnel);
		leader.step(tunnel);
		scientist.step(tunnel);
		System.out.println("\n");

        //выводим расстояние, которое прошли люди
		System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of professor: ",professor.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of leader: ",leader.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of scientist: ",scientist.getX(), "\n");
		System.out.println("\n");
        
        student.comeIntoGallery1(brill1); //проверяем, совпадают ли координаты студента и галереи


		long r2 = time.mainn(start);
        time.running(r2); //время 
        smell.smellTunnel(r2);//запах в туннеле

        student.influenceOnSpeed();//изменение скорости студента
        System.out.println("\n");

        temperature.increaseDegree(r2);//увеличивается температура

        //создаем пингвинов
        Penguin penguin1 = new Penguin(1, "adult", "male", "green");
		Penguin penguin2 = new Penguin(2, "baby", "female", "pink");
		Penguin penguin3 = new Penguin(3, "adult", "male", "blue");

        penguin1.setHealth(10); //устанавливаем очки злоровья
        penguin2.setHealth(10);
        penguin3.setHealth(10);

		System.out.println(penguin1.toString()); //выводим информацию о пингвинах
		System.out.println(penguin2.toString());
		System.out.println(penguin3.toString());

		System.out.printf("%s%d%s","Health of penguin1:", penguin1.getHealth(), "\n");//вывод данных о здоровье
		System.out.printf("%s%d%s","Health of penguin2:", penguin2.getHealth(), "\n");
		System.out.printf("%s%d%s","Health of penguin3:",penguin3.getHealth(), "\n");
		System.out.println("\n");

		scientist.count(penguin3);//ученый считает пингвинов

        //пингвины бегают в туннеле
		penguin1.step(tunnel);
		penguin2.step(tunnel);
		penguin3.step(tunnel);

		Stalakt stalakt1 = new Stalakt(); //создаем сталагмиты
		Stalakt stalakt2 = new Stalakt();
		Stalakt stalakt3 = new Stalakt();


		stalakt1.setCoord(); //рандомные координаты сталагмитов
		stalakt2.setCoord();
		stalakt3.setCoord();

		penguin1.bump(stalakt1);//пингвины врезаются
		penguin1.bump(stalakt2);
		penguin1.bump(stalakt3);


        //люди идут
		student.step(tunnel);
		professor.step(tunnel);
		leader.step(tunnel);
		scientist.step(tunnel);
		System.out.println("\n");

		System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of professor: ",professor.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of leader: ",leader.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of scientist: ",scientist.getX(), "\n");
		System.out.println("\n");
        


		student.comeIntoGallery1(brill1);//проверяем, совпадают ли координаты студента и галереи
		student.comeIntoGallery1(brill2);//проверяем, совпадают ли координаты студента и галереи

		long r3 = time.mainn(start);
        time.running(r3); //время 
        smell.smellTunnel(r3); //запах в туннеле

        scientist.influenceOnHappy(penguin3);//изменение характеристики ученого
        System.out.println("\n");

        temperature.increaseDegree(r3);//увеличивается температура

        //создаем куртку
        Coat coat = new Coat("fur", "S", "white");
        coat.describe();
        coat.warm(temperature, r3);//нагрев
        System.out.printf("%s%d", "Warm effect of coat: ", coat.getWarmeffect());
        System.out.println("\n");



        //люди идут
		student.step(tunnel);
		professor.step(tunnel);
		leader.step(tunnel);
		scientist.step(tunnel);
		System.out.println("\n");

		System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of professor: ",professor.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of leader: ",leader.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of scientist: ",scientist.getX(), "\n");
		System.out.println("\n");



        //куртки на земле
	    CutCoat cutcoat1 = new CutCoat("fur", "L", "brown");
		CutCoat cutcoat2 = new CutCoat("leather", "M", "black");

		cutcoat1.describe();
		cutcoat2.describe();

		cutcoat1.toRaise(scientist); //люди поднимают вещи с земли
		cutcoat2.toRaise(professor);

		student.comeIntoGallery1(brill2);//проверяем, совпадают ли координаты студента и галереи

		long r4 = time.mainn(start);
        time.running(r4); //время 
        smell.smellTunnel(r4);//запах в туннеле

        leader.influenceOnMood(temperature, r4);//изменение характеристики лидера
        System.out.println("\n");

        temperature.increaseDegree(r4);//увеличивается температура

        coat.fall(temperature, student, r4);//сбрасывание куртки в зависимости от температуры

        //люди идут
		student.step(tunnel);
		professor.step(tunnel);
		leader.step(tunnel);
		scientist.step(tunnel);
		System.out.println("\n");

		System.out.printf("%s%.3f%s", "Distance of student: ", student.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of professor: ",professor.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of leader: ",leader.getX(), "\n");
		System.out.printf("%s%.3f%s","Distance of scientist: ",scientist.getX(), "\n");
		System.out.println("\n");



		student.comeIntoGallery1(brill2);//проверяем, совпадают ли координаты студента и бриллиантовой галереи
		student.comeIntoGallery2(stone);//проверяем, совпадают ли координаты студента и каменной галереи

		long r5 = time.mainn(start);
        time.running(r5); //время
        smell.smellTunnel(r5); //запах в туннеле

        professor.influenceOnState(tunnel);//изменение характеристик профессора
        System.out.println("\n");

        temperature.increaseDegree(r5);//увеличивается температура





	}




}