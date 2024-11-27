package tn.esprit.gestionzoo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe,Departement> affectations;
    public AffectationHashMap(){
        affectations=new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe e, Departement d){
        affectations.put(e,d);
    }
    public void supprimerEmploye (Employe e){
        affectations.remove(e);
    }
    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Departement> entry:affectations.entrySet()){
            System.out.println(entry.getKey()+" is in "+entry.getValue());
        }
    }
    public void supprimerEmployeEtDepartement (Employe e,
                                          Departement d){
        if(affectations.containsKey(e)){
            Departement d1=affectations.get(e);
            if(d1.equals(d)){
                affectations.remove(e);
            }
        }
    }
    public void afficherEmployes(){
        for(Employe e:affectations.keySet()){
            System.out.println(e);
        }
    }
    public void afficherDepartements(){
        for(Departement d:affectations.values()){
            System.out.println(d);
        }
    }
    public boolean rechercherEmploye (Employe e){
        return affectations.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d){
        return affectations.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap(){
        TreeMap<Employe, Departement> treeMap=new TreeMap<>();
        treeMap.putAll(affectations);
        return treeMap;
    }
}
