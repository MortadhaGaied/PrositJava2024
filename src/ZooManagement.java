import java.util.Scanner;

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
        Animal animal1=new Animal("Felidae","Lion1",5,true);
        Animal animal2=new Animal("Felidae","Lion2",5,true);
        Animal animal3=new Animal("Felidae","Lion3",5,true);
        Animal animal4=new Animal("Felidae","Lion",5,true);
        System.out.println(animal.getAge());
        animal.setAge(-5);


        Zoo zoo=new Zoo("Belveder","Tunis",25);
        animal.afficher();
        zoo.addAnimal(animal);
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        System.out.println(zoo);
        System.out.println(zoo.searchAnimal(animal));
        System.out.println(zoo.searchAnimal(animal4));

        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");
        System.out.println(str1.equals(str3));

        System.out.println(Animal.n);








    }
}
