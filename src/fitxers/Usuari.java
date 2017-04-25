package fitxers;

import java.io.Serializable;

public class Usuari implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nom;
    private String llinatge;
    private String email;

    public Usuari(String firstName, String lastName, String email) {
        super();
        this.nom = firstName;
        this.llinatge = lastName;
        this.email = email;
    }

    //..getters and setters...
    /**
     * Two users are equal if their firstName, lastName and email address is
     * same.
     */
    @Override
    public boolean equals(Object obj) {
        return (this.nom.equals(((Usuari) obj).nom)
                && this.llinatge.equals(((Usuari) obj).llinatge) && this.email
                .equals(((Usuari) obj).email));
    }

    @Override
    public String toString() {
        return getNom() + " " + getLlinatge() + " " + getEmail();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge() {
        return llinatge;
    }

    public void setLlinatge(String llinatge) {
        this.llinatge = llinatge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
