package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>{
    List<Employe> list;
    public SocieteArrayList(){
        list=new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employe employe) {
        list.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe e:list){
            if(nom.equals(e.getNom())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return list.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        list.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(list);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(list);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

        //Collections.sort(list,new TriParNomDepartementEtGrade());
        Collections.sort(list,(o1, o2) ->{
            int dept=o1.getNom_departement().compareTo(o2.getNom_departement());
            if(dept!=0){
                return dept;
            }
            return o1.getGrade()-o2.getGrade();
        });
    }
}
