public class Main {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona = new Persona("Juan", 25);

        // Usar getters para obtener valores
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        // Usar setters para cambiar valores
        persona.setNombre("Ana");
        persona.setEdad(30);

        // Mostrar los valores actualizados
        System.out.println("Nuevo Nombre: " + persona.getNombre());
        System.out.println("Nueva Edad: " + persona.getEdad());

        // Intentar establecer una edad negativa (fallará la validación (if))
        persona.setEdad(-5);
    }
}
