package segundageneracion;

import primerageneracion.Vampiro;

public class Dracula extends Vampiro {

    private int talla;

    public Dracula(String name, int age, int talla) {

        super(name, age);
        this.talla = talla;

    }

    public void hipnotizar(){
        System.out.println("*Lo Hipnotiza");
    }

    }
