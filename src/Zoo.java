import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int n;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals=new Animal[25];
    }
    void displayZoo(){
        System.out.println("Name:"+name+" City:"+city+" NbrCages:"+nbrCages);
    }
    boolean addAnimal(Animal animal){
        if(n<25){
            if(searchAnimal(animal)==-1){
                animals[n]=animal;
                n++;
                return true;
            }
            return false;

        }
        else {
            System.out.println("Le zoo est plein");
            return false;
        }
    }
    public boolean removeAnimal(Animal animal){
        int index=searchAnimal(animal);
        if(index==-1){
            System.out.println("Animal non trouve");
            return false;
        }else{
            for(int i=index;i<n-1;i++){
                animals[i]=animals[i+1];
            }
            animals[n-1]=null;
            n--;
            return true;

        }
    }
    int searchAnimal(Animal animal){
        for(int i=0;i<n;i++){
            if(animals[i].name.equals(animal.name)){
                return i;
            }

        }
        return -1;
    }
    @Override
    public String toString(){
        System.out.println("Zoo:");
        /*for(int i=0;i<n;i++){
            System.out.println(animals[i]);
        }*/
        for(Animal a:animals){
            if(a!=null){
                System.out.println(a);
            }

        }
        //System.out.println(Arrays.toString(animals));

        return "Name:"+name+" City:"+city+" NbrCages:"+nbrCages;
    }
}
