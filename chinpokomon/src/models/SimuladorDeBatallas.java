package models;

import helpers.Logger;

public class SimuladorDeBatallas {

    public static Logger logger = Logger.getInstance();

    public static Chinpokomon pelear_Contra_(Chinpokomon primero, Chinpokomon segundo) {
        logger.info("¡Comienza la batalla!");
        logger.info(primero.getNombre() + " vs. " + segundo.getNombre() + "\n");
        while (primero.sigueVivo() && segundo.sigueVivo()) {
            logger.info("Estado:");
            logger.info(primero.getNombre() + " - vida restante: " + primero.getVida());
            logger.info(segundo.getNombre() + " - vida restante: " + segundo.getVida() + "\n");
            primero.atacarA_(segundo);

            logger.info("Estado:");
            logger.info(primero.getNombre() + " - vida restante: " + primero.getVida());
            logger.info(segundo.getNombre() + " - vida restante: " + segundo.getVida() + "\n");

            // Después del ataque, puede haber muerto alguno, solo atacar si ambos están aún vivos.
            if (primero.sigueVivo() && segundo.sigueVivo()) {
                segundo.atacarA_(primero);
            }
        }
        logger.info("Estado:");
        logger.info(primero.getNombre() + " - vida restante: " + primero.getVida());
        logger.info(segundo.getNombre() + " - vida restante: " + segundo.getVida() + "\n");

        System.out.println("¡Victoria!");
        System.out.println((primero.sigueVivo() ? primero : segundo).getNombre() + " es el ganador");
        return primero.sigueVivo() ? primero : segundo;
    }
}
