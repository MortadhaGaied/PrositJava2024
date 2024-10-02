public class Animal {
    String family;
    String name;
    private int age;
    boolean isMammal;
    static int n=0;
    Animal(String family,String name,int age){
        this.family=family;
        this.name=name;
        this.age=age;
    }
    Animal(boolean isMammal){
        this.isMammal=isMammal;
    }
    Animal(String family,String name,int age,boolean isMammal){
        this(family,name,age);
        this.isMammal=isMammal;
        n++;

    }
    Animal(){

    }
    Animal(int age){
        this.age=age;
    }
    Animal(String name){
        this.name=name;
    }
    public static void getNbr(){
        System.out.println(n);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0){
            this.age=age;
        }else{
            System.out.println("Lage doit etre positif");
        }

    }
    void afficher(){
        System.out.println("Family:"+family+" Name:"+name+" age:"+age+" isMammal:"+isMammal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
