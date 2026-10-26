public class Main {

    public static void main(String[] argument){

        String name = "Andres ";
        String firstName = "Ruiz";

        int age = 21;

        // name = 21 (al reasignarse una variable no puede cambiar su tipo de dato)

        System.out.println("La edad de " + name + firstName + "es de " + age);

        // constantes --- es una buena practica nombrar las variables de este tipo todas en mayusculas
        final String EMAIL = "andres18@gmail.com";
        System.out.println(EMAIL);

        var year = 2005; //funciona tambien auto, el mismo motor identifica que tipo de dato se esta definiendo
        System.out.println("nacido en el año " + year);

    }

}