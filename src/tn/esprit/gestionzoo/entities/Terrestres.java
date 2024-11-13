package tn.esprit.gestionzoo.entities;

public class Terrestres extends Animal implements Omnivore<Food>{
    int nbrLegs;
    public Terrestres(String family,String name,int age,int nbrLegs){
        super(family,name,age);
        this.nbrLegs=nbrLegs;
    }
    public Terrestres(){

    }

    @Override
    public void eatMeat(Food meat) {
        if(meat.equals(Food.MEAT)){
            System.out.println(meat);
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if(plant.equals(Food.PLANT)){
            System.out.println(plant);
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if(food.equals(Food.BOTH)){
            System.out.println(food);
        }
    }
}

