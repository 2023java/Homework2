public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2 () {
        System.out.println("Задача2");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача3");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача4");
        var friend=19.0;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog =frog/3.5;
        System.out.println(frog);
        frog =frog+4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача6");
        var boxer1=78.2;
        System.out.println(boxer1);
        var boxer2=82.7;
        System.out.println(boxer2);
        var weightOfBoxers=boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + weightOfBoxers+ " кг.");
        var weightDifference=boxer2-boxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача7");
        var boxer1=78.2;
        System.out.println(boxer1);
        var boxer2=82.7;
        System.out.println(boxer2);
        var weightOfBoxers=boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + weightOfBoxers+ " кг.");
        var weightDifference=boxer2-boxer1;
        System.out.println("1)Разница между весами бойцов " + weightDifference + " кг.");
        var weightDifference2=boxer2%boxer1;
        System.out.println("2)Разница между весами бойцов " + weightDifference2 + " кг.");
    }
    public static void task8 () {
        System.out.println("Задача8");
        var totalTime=640;
        var workingHours=8;
        var numberOfWorkers=totalTime/workingHours;
        System.out.println("1) Всего работников в компании — " + numberOfWorkers + " человек.");
        numberOfWorkers=numberOfWorkers+94;
        totalTime=numberOfWorkers*workingHours;
        System.out.println("2) Если в компании работает "+numberOfWorkers+ " человек, то всего " +totalTime+" часа работы может быть поделено между сотрудниками");
    }
}