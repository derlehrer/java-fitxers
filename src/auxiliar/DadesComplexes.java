package auxiliar;

import java.io.Serializable;

/**
 *
 * @author joan
 */
public class DadesComplexes implements Serializable {

    String identificador;
    Dades dades;

    public DadesComplexes(String identificador, int numeric, String alfanumeric) {
        this.identificador = identificador;
        this.dades = new Dades(numeric, alfanumeric);
    }

    public Dades getDades() {
        return dades;
    }

    public void setDades(Dades dades) {
        this.dades = dades;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DadesComplexes other = (DadesComplexes) obj;
        if ((this.identificador == null) ? (other.identificador != null) : !this.identificador.equals(other.identificador)) {
            return false;
        }
        if (this.dades != other.dades && (this.dades == null || !this.dades.equals(other.dades))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.identificador != null ? this.identificador.hashCode() : 0);
        hash = 71 * hash + (this.dades != null ? this.dades.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "DadesComplexes{" + "identificador=" + identificador + ", dades=" + dades + '}';
    }

}
