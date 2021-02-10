import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class eventos {
        public static void main(String[] args) {
            List lista;
            lista = new ArrayList();

            //Lista de las personas registradas.

            lista.add("Mery Jadan");
            lista.add("Mauro Jadan");
            lista.add("Rosa Heredia");
            lista.add("Magaly Heredia");

            for (Object nombre : lista) {
                // System.out.println (((String) nombre));

            }
            //personas registradas Set
            Set listaset;
            listaset = new HashSet();

            listaset.add("Mery Jadan");
            listaset.add("Mauro Jadan");
            listaset.add("Rosa Heredia");
            listaset.add("Magaly Heredia");

            for (Object nombre : lista) {
                System.out.println(((String) nombre));


            }
            persona p1 = new persona();
            p1.setId(1);
            p1.setNombre("Mery Jadan persona");

            persona p2 = new persona();
            p2.setId(2);
            p2.setNombre("Mauro Jadan persona");

            persona p3 = new persona();
            p3.setId(3);
            p3.setNombre("Rosa Heredia persona");

            persona p4 = new persona();
            p4.setId(4);
            p4.setNombre("Magaly Heredia persona");

            List listaPersonas = new ArrayList();

            listaPersonas.add(p1);
            listaPersonas.add(p2);
            listaPersonas.add(p3);
            listaPersonas.add(p4);

            // for mejorado

            for (Object p : listaPersonas) {
                System.out.println(((persona)p).getNombre() + " " + (((persona)p).getId()));



            }
        }
    public static class asistentes {
        public static void main(String[] args) {
            List lista;
            lista = new ArrayList();

            //Lista de las personas registradas.

            lista.add("Mery Jadan");
            lista.add("Mauro Jadan");
            lista.add("Rosa Heredia");
            lista.add("Magaly Heredia");

            for (Object nombre : lista) {
                // System.out.println (((String) nombre));

            }
            //personas registradas Set
            Set listaset;
            listaset = new HashSet<>();

            listaset.add("Mery Jadan");
            listaset.add("Mauro Jadan");
            listaset.add("Rosa Heredia");
            listaset.add("Magaly Heredia");

            for (Object nombre : lista) {
                System.out.println(((String) nombre));


            }
            persona p1 = new persona();
            p1.setId(1);
            p1.setNombre("Mery Jadan persona");

            persona p2 = new persona();
            p2.setId(2);
            p2.setNombre("Mauro Jadan persona");

            persona p3 = new persona();
            p3.setId(3);
            p3.setNombre("Rosa Heredia persona");

            persona p4 = new persona();
            p4.setId(4);
            p4.setNombre("Magaly Heredia persona");

            List listaPersonas = new ArrayList();

            listaPersonas.add(p1);
            listaPersonas.add(p2);
            listaPersonas.add(p3);
            listaPersonas.add(p4);

            // for mejorado

            for (Object p : listaPersonas) {
                System.out.println(((persona)p).getNombre() + " " + (((persona)p).getId()));



            }
        }
    }
}
