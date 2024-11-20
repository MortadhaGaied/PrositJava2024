package tn.esprit.gestionzoo.entities;

import java.util.Comparator;

public class TriParNomDepartementEtGrade implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        int dept=o1.getNom_departement().compareTo(o2.getNom_departement());
        if(dept!=0){
            return dept;
        }
        return o1.getGrade()-o2.getGrade();
    }
}
