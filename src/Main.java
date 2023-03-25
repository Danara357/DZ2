public class Main {
    public static void main(String[] args) {
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var bokser1 = 78.2;
        var bokser2 = 82.7;
        var bokserTugether = bokser1 + bokser2;
        System.out.println("Общий вес боксеров " + bokserTugether + " кг.");
        var differenceBokser = bokser2 - bokser1;
        System.out.println("Разница в весе боксеров " + differenceBokser + " кг.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var bokser1 = 78.2;
        var bokser2 = 82.7;
        var differenceBokser = bokser2 - bokser1;
        System.out.println("Разница в весе боксеров второй минус первый " + differenceBokser + " кг.");
        var overLoadBokser = (bokser1) % bokser2;
        System.out.println("Вес второго превышает вес первого боксера на " + overLoadBokser + " кг.");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hourJob = 640;
        var hourEmployee = 8;
        var totaEmployee = hourJob/hourEmployee;
        System.out.println("Всего работников в компании " + totaEmployee + " человек");
        var moreEmployee = 94;
        var newTotaEmployee = totaEmployee + moreEmployee;
        var totalHour = newTotaEmployee * hourEmployee;
        System.out.println("Если в компании работает " + newTotaEmployee + "  человек, то всего " + totalHour + "   часов работы может быть поделено между сотрудниками.");
    }
}