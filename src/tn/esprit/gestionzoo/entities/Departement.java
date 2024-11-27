package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Departement implements Comparable<Departement>{
    private int id;
    private String nomDepartement;
    private int nbEmployee;

    public Departement() {
    }

    public Departement(int id, String nomDepartement, int nbEmployee) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmployee = nbEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbEmployee() {
        return nbEmployee;
    }

    public void setNbEmployee(int nbEmployee) {
        this.nbEmployee = nbEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return getId() == that.getId() && Objects.equals(getNomDepartement(), that.getNomDepartement());
    }
    @Override
    public int hashCode(){
        return Objects.hash(id,nomDepartement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmployee=" + nbEmployee +
                '}';
    }

    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
