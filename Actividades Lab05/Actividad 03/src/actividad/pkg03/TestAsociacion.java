
package actividad.pkg03;
public class TestAsociacion {
    public static void main(String[] args) {

        //------ Creacion de objeto bcp ---------
        Banco bcp = new Banco("BCP");

        //------ Personas del bcp ---------
        Persona Juan = new Persona(82397, "Juan", "Quispe");
        Persona Pedro = new Persona(21484, "Pedro", "Mamani");
        Persona Piero = new Persona(25425, "Piero", "Torres");
        Persona Gabriel = new Persona(73528, "Gabriel", "Luigui");
        Persona Mario = new Persona(938173, "Mario", "Santillana");

        //------ métodos dentro del bcp ---------
        bcp.agregarCliente(Juan);
        bcp.agregarCliente(Pedro);
        bcp.agregarCliente(Piero);
        bcp.agregarCliente(Gabriel);
        bcp.agregarCliente(Mario);

        bcp.darBajaCliente(Pedro);
        bcp.darBajaCliente(Piero);

        bcp.buscarCliente(Gabriel);
        bcp.buscarCliente(Juan);

        //------ imprimir datos del bcp ---------
        System.out.println(bcp);


        //------ Creacion de objeto bbva ---------
        Banco bbva = new Banco("BBVA",30);

        //------ Personas del bbva ------------
        Persona Eduardo = new Persona(738249, "Eduardo", "Manchego");
        Persona Victor = new Persona(327845, "Victor", "Hu");
        Persona Rodrigo = new Persona(823704, "Rodrigo", "Mendoza");
        Persona Sebastian = new Persona(00042, "Sebastian", "Ponze");
        Persona Geampier = new Persona(892474, "Geampier", "Chavez");

        //------ métodos dentro del bbva ---------
        bbva.agregarCliente(Eduardo);
        bbva.agregarCliente(Victor);
        bbva.agregarCliente(Rodrigo);
        bbva.agregarCliente(Sebastian);
        bbva.agregarCliente(Geampier);

        bbva.darBajaCliente(Victor);
        bbva.darBajaCliente(Sebastian);

        bbva.buscarCliente(Eduardo);
        bbva.buscarCliente(Geampier);

        //------ imprimir datos del bbva --------
        System.out.println(bbva);
    }
}