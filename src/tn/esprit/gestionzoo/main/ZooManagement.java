package tn.esprit.gestionzoo.main;

import java.io.File;
import java.io.FileReader;
import java.util.*;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {


        /*int nbrCages;
        String zooName;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Veuillez entrer le nom du zoo:");
        zooName=scanner.nextLine();
        System.out.println("Veuillez entrer le nombre de cages:");
        nbrCages=scanner.nextInt();
        System.out.printf("%s comporte %d cages",zooName,nbrCages);*/
        Animal animal=new Animal("Felidae","Lion",5,true);
        Animal animal1=new Animal("Felidae","Lion1",-2,true);
        Animal animal2=new Animal("Felidae","Lion2",5,true);
        Animal animal3=new Animal("Felidae","Lion3",5,true);
        Animal animal4=new Animal("Felidae","Lion",5,true);
        System.out.println(animal.getAge());
        animal.setAge(-5);
        System.out.println(animal.equals(animal1));



        Zoo zoo=new Zoo("Belveder","Tunis");
        animal.afficher();
        try {
            zoo.addAnimal(animal);
            zoo.addAnimal(animal1);
            zoo.addAnimal(animal2);
            zoo.addAnimal(animal3);
            zoo.addAnimal(animal4);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        System.out.println(zoo);
        System.out.println(zoo.searchAnimal(animal));
        System.out.println(zoo.searchAnimal(animal4));




        System.out.println(Animal.n);

        Zoo z1=new Zoo("aaaa","aaa");
        Zoo z2=new Zoo("bbbb","bbbb");
        Zoo z3=new Zoo("cccc","cccc");
        z3.comparerZoo(z2,z3);
        z2.comparerZoo(z3);
        z1.comparerZoo(z2);


        Aquatiques a=new Dolphin();
        Terrestres t=new Terrestres();
        Dolphin d=new Dolphin();
        Penguin penguin=new Penguin();


        a.swim();
        penguin.swim();
        d.swim();

        Animal animal5=new Animal();

        Animal animal6=new Terrestres();
        if(animal6 instanceof Aquatiques){
            ((Aquatiques)animal6).sayHello();
        }






        System.out.println((float)5/2);
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        System.out.println(str1.equals(str3));


        zoo.addAquaticAnimal(a);
        zoo.addAquaticAnimal(new Penguin());
        zoo.addAquaticAnimal(new Dolphin());
        for(Aquatiques aquatiques:zoo.aquaticAnimals){
            if(aquatiques!=null){
                aquatiques.swim();
            }
        }

        try {
            int tab[]=new int[4];
            tab[5]=6;
            System.out.println(5/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
        }finally {
            System.out.println("hello");
        }
        System.out.println("Hello");




    Penguin p=new Penguin();
    Terrestres terrestres=new Terrestres();
    p.eatMeat(Food.MEAT);
    terrestres.eatMeat(Food.MEAT);
    terrestres.eatPlant(Food.PLANT);
    terrestres.eatPlantAndMeet(Food.BOTH);
    List<Animal> list2=new ArrayList<Animal>();
    list2.add(new Animal());
    list2.contains(5);
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(22);
        list.add(1);

        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.contains(10));
        list.remove(2);
        for(Integer x:list){
            System.out.println(x);
        }
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));//T[i]
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("******");
        Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(6);
        set.add(22);
        set.add(1);
        set.add(22);
        System.out.println(set);








    }
}
