package tn.esprit.gestionzoo.entities;

public abstract class Aquatiques extends Animal implements Carnivore<Food>{
    String habitat;
    public Aquatiques(String family,String name,int age,String habitat){

        this.habitat=habitat;
    }
    public Aquatiques(){

    }

    public void sayHello(){
        System.out.println("Hello im aquatiques animal");
    }
    public abstract void swim();
    public String toString(){
        //return "family:"+super.getFamily()+" name="+super.getName()+" age="+super.getAge()+" habitat"+this.habitat;
        return super.toString()+" habitat="+this.habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Aquatiques){
            if(this.getAge()==((Aquatiques)obj).getAge() && this.habitat.equals(((Aquatiques)obj).habitat) && this.getName().equals(((Aquatiques)obj).getName())){
                return true;

            }
            else{
                return false;
            }
        }
        return false;

    }
    @Override
    public void eatMeat(Food meat) {
        if(meat.equals(Food.MEAT)){
            System.out.println(meat);
        }
    }
}
