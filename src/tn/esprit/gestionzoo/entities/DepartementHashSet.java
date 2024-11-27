package tn.esprit.gestionzoo.entities;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> set;
    public DepartementHashSet(){
        set=new HashSet<>();
    }
    @Override
    public void ajouterDepartement(Departement departement) {
        set.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for(Departement d:set){
            if(d.getNomDepartement().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return set.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        set.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for(Departement d:set){
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> treeset=new TreeSet<Departement>();
        treeset.addAll(set);

        return treeset;
    }
}
