package co.umariana.equipo;

import java.util.ArrayList;
import java.util.List;

/**
 * LA TARJETA DE CADA INTEGRANTE SE AGREGA EN ESTE ARCHIVO (el mismo para todo el equipo).
 *
 * Agregue UNA línea con su tarjeta, justo debajo del comentario ">>> AGREGUE ...".
 * Los datos son: su usuario de GitHub, su nombre, un mensaje corto (máximo 80 caracteres)
 * y un color (por ejemplo #EF476F, #118AB2, #06D6A0, #FFD166).
 *
 * Si dos compañeros agregan su línea en el mismo lugar, Git avisará de un conflicto al unir
 * los Pull Requests: cómo resolverlo se explica en clase.
 */
public final class Integrantes {

    /** Título que muestra la ventana (no es necesario cambiarlos). */
    public static final String NOMBRE_EQUIPO = "Lamento Colombiano";
    public static final String LEMA = "En la vida hay dos opciones: Ser feliz... o ser usuario de Linux :C";

    private Integrantes() {
    }

    public static List<Tarjeta> tarjetas() {
        List<Tarjeta> lista = new ArrayList<>();

        lista.add(new Tarjeta("Mlasso-proyects", "Mario Lasso", "de que sirve despejar Y si sigo siendo X para ella", "#FFD166"));
        lista.add(new Tarjeta("CamiloMarmolejo", "Camilo Marmolejo", "En la vida hay dos opciones: Ser feliz... o ser usuario de Linux :C", "#1b004b" ));
        lista.add(new Tarjeta("gabcastrobat", "Gabriel Castro", "Todo se acabo señores, todo todillo", "#ccff00" ));
        lista.add(new Tarjeta("IvanVallejo0888", "Ivan Vallejo", "HolakHace", "#118AB2"));
        lista.add(new Tarjeta("Esteban-P14", "Mario Esteban Pascal", "Si funciona, No lo toques", "#941c04"));
        return lista;
    }
}
