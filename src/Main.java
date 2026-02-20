public class Main {
    public static void main(String[] args) {

        //ESTUDIANTE11111111111111111111111111111111111111111111111111111111111111111111
        Estudiante e1 = new Estudiante("Jose", 3.5, 3.9, 4.7);

        e1.mostrarInformacion();

        System.out.println("El promedio es: " + e1.calcularPromedio());

        System.out.println(e1.estaAprobado(3));

        //ESTUDIANTE222222222222222222222222222222222222
        Estudiante e2 = new Estudiante ("Laura");

        e2.asignarNotas(2,2,2);

        e2.mostrarInformacion();

        System.out.println("El promedio es: " + e2.calcularPromedio());

        System.out.println(e2.estaAprobado(3));

    }
}