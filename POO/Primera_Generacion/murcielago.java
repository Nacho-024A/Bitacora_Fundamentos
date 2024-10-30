package primerageneracion;

public interface murcielago {

    void volar();

    default void dormirDeCabeza(){
        System.out.println("*Duerme De Cabeza");
    }

    static void hacerChichi(){
        System.out.println("*Hace Chichi");
    }
}
