package auxiliar;

import java.io.Serializable;

/**
 *
 * @author joan
 */
public class Dades implements Serializable {
  private int numeric;
  private String alfanumeric;

    public Dades(int numeric, String alfanumeric) {
        this.numeric = numeric;
        this.alfanumeric = alfanumeric;
    }

    public String getAlfanumeric() {
        return alfanumeric;
    }

    public void setAlfanumeric(String alfanumeric) {
        this.alfanumeric = alfanumeric;
    }

    public int getNumeric() {
        return numeric;
    }

    public void setNumeric(int numeric) {
        this.numeric = numeric;
    }

    @Override
    public String toString() {
        return "Dades{" + "numeric=" + numeric + ", alfanumeric=" + alfanumeric + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dades other = (Dades) obj;
        if (this.numeric != other.numeric) {
            return false;
        }
        if ((this.alfanumeric == null) ? (other.alfanumeric != null) : !this.alfanumeric.equals(other.alfanumeric)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
  
  
}
