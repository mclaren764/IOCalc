package com.company;

public class Main {

    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.display();
        System.out.println(Animal.getCounter());

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();
        System.out.println(Bird.getCounter());

        Fish f = new Fish();
        f.setName("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();
        System.out.println(Fish.getCounter());

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
        System.out.println(Insect.getCounter());

    }
}

    class Animal{

        String type;
        String name;
        int age;
        double weight;
        boolean isSwim;
        boolean isWalk;
        boolean isFly;
        {
            name = "AnyAnimal";
            type = "AnyType";
        }
        final static String description;
        static int count = 1;
     static{
        description  = "I am Animal";
     }
     static int getCounter(){
         return count;
        }
        Animal(){count++;}
        Animal(String entrytype, String entryname){type = entrytype; name = entryname;}
        Animal(String entrytype, int entryage){type = entrytype; age = entryage; name = "Noname";}
        Animal(String entrytype, String entryname, int entryage, double entryweight, boolean swim,
               boolean walk, boolean fly){type = entrytype; name = entryname; age= entryage; weight = entryweight;
            isSwim = swim; isWalk = walk; isFly = fly;}
        void display(){
        System.out.println("Тип: "+type +" , Имя: " + name+ " , Возраст: " +age+" , Вес: " +weight+" , Умеет летать?: " +isFly +
                " , Умеет ходить?: "  +isWalk+" , Умеет плавать?: " +isSwim);
        }
        final void rename(String str){
        name = str;
        }
        void setName(String name){this.name = name;}
        void holiday(){weight+=0.1;}
        void holiday(double m){weight+=m;}
        void holiday(double m, int n){weight+=m*n;}

         void setWeight(double weight) {
            this.weight = weight;
        }
        void setAge(int age){
            this.age = age;
        }
        void setSwim(boolean swim) {
            this.isSwim = swim;
        }
        void setWalk(boolean walk) {
            this.isWalk = walk;
        }
        void setFly(boolean fly) {
            this.isFly = fly;
        }

        double getWeight() {
            return this.weight;
        }
        int getAge(){
            return this.age;
        }
        String getName() {
            return this.name;
        }
        String getType(){
            return this.type;
        }
        boolean isSwim() {
            return this.isSwim;
        }
        boolean isWalk() {
            return this.isWalk;
        }
        boolean isFly() {
            return this.isFly;
        }
    }

    class Bird extends Animal{
        {
            name = "AnyName";
            type = "Bird";
        }
        String Area;
        boolean winterFly;
        void setWinterFly(boolean fly){this.winterFly=fly;}
        void setArea(String area){this.Area=area;}
        String getArea(){return this.Area;}
        boolean isWinterFly(){return this.winterFly;}
        void chirick_chirick(){System.out.println("Chirik-Chirik");}
        @Override
        void display(){        System.out.println("I am Bird "+ "Тип: "+type +" , Имя: " + name+ " , Возраст: " +age+" , Вес: " +weight+" , Умеет летать?: " +isFly +
                " , Умеет ходить?: "  +isWalk+" , Умеет плавать?: " +isSwim);}

    }

final class Fish extends Animal{
    {
        name = "AnyFish";
        type = "Fish";
    }
    String Squama;
    boolean UpStreamSwim;
    void setUpStreamSwim(boolean swim){this.UpStreamSwim = swim;}
    void setSquama(String Squama){this.Squama=Squama;}
    String getSquama(){return this.Squama;}
    boolean isUpStreamSwim(){return this.UpStreamSwim;}
    void bul_bul(){System.out.println("Bul-bul");}
    @Override
    void display(){        System.out.println("I am Fish "+ "Тип: "+type +" , Имя: " + name+ " , Возраст: " +age+" , Вес: " +weight+" , Умеет летать?: " +isFly +
            " , Умеет ходить?: "  +isWalk+" , Умеет плавать?: " +isSwim);}

}


class Insect extends Animal{
    {
        name = "AnyInsect";
        type = "Insect";
    }
    int wingCount;
    boolean likeJesus;
    void setLikeJesus(boolean likeJesus){this.likeJesus = likeJesus;}
    void setWingCount(int count){this.wingCount=count;}
    int getWingCount(){return this.wingCount;}
    boolean isLikeJesus(){return this.likeJesus;}
    void ggggg(){System.out.println("Ggggg");}
    @Override
    void display(){        System.out.println("I am Insect "+ "Тип: "+type +" , Имя: " + name+ " , Возраст: " +age+" , Вес: " +weight+" , Умеет летать?: " +isFly +
            " , Умеет ходить?: "  +isWalk+" , Умеет плавать?: " +isSwim);}

}




