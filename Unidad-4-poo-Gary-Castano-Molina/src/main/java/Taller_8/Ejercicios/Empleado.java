package Taller_8.Ejercicios;

class Empleado extends Persona {
    public void mostrarNombre() {
        System.out.println(nombre); // Error de compilación
    }
}

/**
 * Aunque Empleado hereda de Persona, el atributo nombre es private, por lo tanto no es accesible fuera de la clase Persona, ni siquiera por sus subclases.
 * La herencia no otorga acceso a miembros private; solo a miembros protected y public.
 */