package entidades;

import java.util.Objects;

/**
 * @author LXWeber
 */
public class Cliente {
    protected long DNI;
    protected String Nombre;
    protected String Apellido;
    protected String Ciudad;
    protected String Direccion;

    public Cliente(long DNI, String Nombre, String Apellido, String Ciudad, String Direccion) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
    }

    public long getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Cliente '"+Apellido+" "+Nombre+"' DNI: "+DNI;
    }

    
    
    @Override
    public int hashCode() {
        return (int) this.DNI;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.DNI, other.DNI);
    }
    
    
}
