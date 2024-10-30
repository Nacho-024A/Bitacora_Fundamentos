package primerageneracion;

public class Vampiro implements murcielago {

    private String name;

    private int age;

    public Vampiro(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void volar() {

    }


    public void morder(){
        System.out.println("*Muerde");
    }

    public void chuparsangre(){
        System.out.println("*Le Chupa La Sangre");
    }

    protected void aguantarsol(){
        System.out.println("*Aguanta Sol");
    }
}
