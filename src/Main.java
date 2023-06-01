public class Main {
    public static void main(String[] args) {

       //Задание 1
      int age = 20;
      if (age >= 18){
          System.out.println("Вы совершеннолетний!");
      }
      if (age < 18){
          System.out.println("Вы не достигли совершеннолетия, нужно немного подождать!");
      }
      //Задание 2
        int temperature = 5;
      if (temperature <= 5 ){
          System.out.println("На улице " + temperature + " градуса нужно надеть шапку!");
      }
      if (temperature > 5 ){
          System.out.println("На улице " + temperature + " градуса можно идти без шапки!");
      }
      // Задание 3
        int speed = 60;
      if (speed <= 60){
          System.out.println("Если скорость " + speed + " км/ч то, можно ездить спокойно!");
      }
      if (speed > 60){
          System.out.println("Если скорость " + speed + "  км/ч то, придется заплатить штраф!");
      }
      //Задание 4
        int agePeople = 55;
      if (agePeople <= 2){
          System.out.println("Если возраст человека равен " + agePeople + " то ему пора спать.");
      }
      if (agePeople > 2 && agePeople <= 6){
          System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в детский сад.");
      }
      if (agePeople > 6 && agePeople <= 18){
          System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в школу.");
      }
      if (agePeople > 18 && agePeople <= 24){
          System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в университет.");
      }
      if (agePeople > 24 && agePeople <= 60) {
          System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить на работу.");
      }
        if (agePeople > 60){
            System.out.println("Если возраст человека равен " + agePeople + " то ему можно отдохнуть.");
        }
        //Задание 5
        int ageChild = 15;
        if (ageChild < 5){
            System.out.println("Если возраст ребенка равен " + ageChild + " то, ему нельзя кататься на аттракционе!");
        }
        if (ageChild >= 5 && ageChild <= 14){
            System.out.println("Если возраст ребенка равен " + ageChild + " то, ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageChild > 14){
            System.out.println("Если возраст ребенка равен " + ageChild + " то, ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        //Задача 6
        int capacity = 102;
        int seats = 60;
        int standing = capacity - seats;
        int seatsUsed = 60;
        int standingUsed = 42;
        if (seatsUsed < seats) {
            System.out.println("Есть еще " + (seats - seatsUsed) + " сидячих мест");
        } else {
                System.out.println("Сидячих мест нет!");
            }
        if (standingUsed < standing){
            System.out.println("Есть еще " + (standing - standingUsed) + " стоячих мест");
        } else{
        System.out.println("Стоячих мест нет!");
        }
        //Задача 7
        int one = 5;
        int two = 3;
        int three = 2;
        if(one > two) {
            if (one > three) {
                System.out.println("Большее число " + one);
            } else if (three > one) {
                System.out.println("Большее число " + three);
            }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Большее число " + two);
            } else if (three > two) {
                System.out.println("Большее число " + three);
            }
        } else {
                if (one > three){
                    System.out.println("Большее число " + one);
                } else if (three > one){
                    System.out.println("Большее число " + three);
                }
                else{
                    System.out.println("Все числа равны");
                }
            }



    }
}