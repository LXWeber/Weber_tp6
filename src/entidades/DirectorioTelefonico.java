package entidades;
import java.util.*;

public class DirectorioTelefonico {
    TreeMap <Long,Cliente> listaClientes = new TreeMap <>();
    
    // permite registrar un nuevo cliente con su respectivo nro de
    // teléfono. Siendo el nro del teléfono la clave del mismo.
    public Cliente agregarCliente(Long telefono,Cliente cliente){
        if(listaClientes.put(telefono,cliente)==null){
            listaClientes.put(telefono, cliente);
            return null;
        } else {
            return cliente;
        }
    }
    
    // en base al nro de teléfono retorna el Cliente asociado al mismo.
    public Cliente buscarCliente(Long telefono){
        Set<Long> clientes = listaClientes.keySet();
        Long x= null;
        for(Long i: clientes){
            if(listaClientes.get(i).equals(listaClientes.get(telefono)) ){
                x = i;
            }
        }
        return listaClientes.get(x);
    }
    
    // en base a un apellido nos devuelve una lista con los nros de
    // teléfono asociados a dicho apellido
    public HashSet<Long> buscarTelefono(String apellido){
        Set<Long> clientes = listaClientes.keySet();
        HashSet<Long> telefonos = new HashSet<>();
        for(Long i : clientes){
            if(listaClientes.get(i).getApellido() == apellido){
                telefonos.add(i);
            }
        }
        return telefonos;
    }
    
    // En base a una ciudad nos devuelve una lista con los Clientes
    // asociados a dicha ciudad.
    public HashSet<Cliente> buscarClientes(String ciudad){
        Set<Long> clientes = listaClientes.keySet();
        HashSet<Cliente> lista = new HashSet<>();
        for(Long i: clientes){
            if(listaClientes.get(i).getCiudad() == ciudad){
                lista.add(listaClientes.get(i));
            }
        }
        return lista;
    }
    
    // Extra. Buscador de clientes por dni
    // para mejorar el borrarCliente
    public Long buscarParaBorrar(Long dni){
        Set<Long> clientes = listaClientes.keySet();
        Long x= null;
        for(Long i: clientes){
            if(listaClientes.get(i).getDNI() == dni){
                x=i;
                break;
            }
        }
        return x;
    }
    
    
    public boolean borrarCliente(long dni){
        Set<Long> lista = listaClientes.keySet();
        boolean borrado=false;
        for(Long i: lista){
            if(listaClientes.get(i).getDNI() == dni){
                listaClientes.remove(i);
                borrado=true;
                break;
            }
        }
        return borrado;
    }
}
