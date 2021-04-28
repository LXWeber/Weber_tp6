package entidades;

public class Weber_tp6 {

    public static void main(String[] args) {
        
        Cliente aa = new Cliente(111111,"aa","aaa","ciudadUno","calle Falsa 123");
        Cliente bb = new Cliente(222222,"bb","bbb","ciudadUno","calle Falsa 456");
        Cliente cc = new Cliente(333333,"cc","ccc","ciudadUno","calle Falsa 789");
        Cliente dd = new Cliente(444444,"dd","ddd","ciudadDos","calle Cierta 666");
        Cliente ee = new Cliente(555555,"ee","eee","ciudadDos","calle sin nombre numero desconocido");
        Cliente eo = new Cliente(666666,"ee","ooo","pueblito","ranchito atras onde Alonzo");
        Cliente oo = new Cliente(000000,"oo","ooo","pueblito","ranchito atras onde Alonzo");
        
        DirectorioTelefonico dir = new DirectorioTelefonico();
        
        dir.agregarCliente(1111111111l,aa);
        dir.agregarCliente(1111111112l,aa);
        dir.agregarCliente(2222222222l,bb);
        dir.agregarCliente(3333333333l,cc);
        dir.agregarCliente(4444444444l,dd);
        dir.agregarCliente(5555555555l,ee);
        dir.agregarCliente(6666666666l,eo);
        dir.agregarCliente(0000000000l,oo);
        
        System.out.println("----Lista de Clietes---");
        System.out.println(dir.listaClientes);
        
        Cliente buscado = dir.buscarCliente(3333333333l);
        
        System.out.println("----Datos de cliente buscado---");
        System.out.println(buscado.getDNI());
        System.out.println(buscado.getApellido());
        System.out.println(buscado.getNombre());
        
        System.out.println("----Lista de Telefonos ligados a un mismo apellido---");
        System.out.println(dir.buscarTelefono("ooo"));
        
        System.out.println("----Lista de Clietes de la misma ciudad---");
        System.out.println(dir.buscarClientes("ciudadUno"));
        
        System.out.println("----Cliente buscado para eliminarse---");
        System.out.println(dir.buscarParaBorrar(444444l));
        
        dir.borrarCliente(444444);
        
        System.out.println("----Lista de Clietes sin el eliminado---");
        System.out.println(dir.listaClientes);
        
    }
    
}
