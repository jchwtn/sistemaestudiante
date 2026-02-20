public class Estudiante {

    //nombre
    private String nombre;
    //notas
    private double nota1;
    private double nota2;
    private double nota3;

    //constructor vacio
    public Estudiante() {
    }

    //constructor con todos los parametros
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    //Tostring
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }


    //METDOSO PROPIOS
    //SIN PARAMETROS SIN RETORNO
    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("NOTA 1: " + this.getNota1());
        System.out.println("NOTA 2: " + this.getNota2());
        System.out.println("NOTA 3: " + this.getNota3());
    }

    //CON PARAMETROS SIN RETORNO
    public void asignarNotas(double n1, double n2, double n3){

        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    //CON RETORNO SIN PARAMETROS
    public double calcularPromedio(){

        return (this.nota1 + this.nota2 + this.nota3)/3;
    }

    //CON RETORNO CON PARAMETROS


    public String estaAprobado(double notaMin){
        double promedio = calcularPromedio();
        if(promedio >= notaMin){
            return ("ESRUDIANTE APROBADO");

        }else{
            return ("ESTUDIANTE DESAPROBADO");

        }
    }


}
