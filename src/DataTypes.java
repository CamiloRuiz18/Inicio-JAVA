public class DataTypes {

    public static void main(String[] args){

        int age = 21; //enteros
        System.out.println(age);

        double heigth = 1.67; //decimales
        System.out.println(heigth);

        char x = 'N'; //para un solo parametro
        System.out.println(x);

        boolean gordo = false; //boleano
        System.out.println(gordo);

        String myGirl = "Nata"; //Tipo texto
        System.out.println(myGirl);


        //Unarios

        //Modifica la variable
        System.out.println(age++);
        System.out.println(++age);
        System.out.println(age--);
        System.out.println(--age);


        String name = "Camilo";

        //Longitud
        System.out.println(name.length());

        //Caracter
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(name.length()-1)); //Ultimo caracter de la longitud de la palabra

        //Subcadena
        System.out.println(name.substring(2)); //Inicia en el caracter dos hasta el final
        System.out.println(name.substring(0,4)); //Excluye el ultimo valor

        //Mayusculas y minisculas
        System.out.println(name.toLowerCase()); //m
        System.out.println(name.toUpperCase()); //M

        name = name.toUpperCase(); //aqui si se redefine la variable toda en mayuscula a diferencia de arriba que solo se imprime

        System.out.println(name);

        name = name.substring(2).toUpperCase();

        System.out.println(name);

        //Comprobar
        String firstname = "Ruiz Sanchez";

        System.out.println(name.contains("Ruiz"));

        System.out.println(firstname.toUpperCase().contains("SANCHEZ"));

        //Comparar
        String cat = "gato";
        String catM = "Gato";

        System.out.println(name.equals(firstname));
        System.out.println(cat.equals(catM));
        System.out.println(cat.equalsIgnoreCase(catM)); //En la comparacion ignora las mayusculas

        //equals vs ==
        var a = "Natalia";
        var b = "Natalia";
        var c = new String("Natalia"); //esto se considera un nuevo objeto

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));

        //equals compara contenido de variables, == compara objetos y no contenido

        //trim() and replace()

        String mom = " Elvira ";
        String dad = "Alexader Parra";

        System.out.println(mom);
        System.out.println(mom.trim()); //Quita los espacios principio y fin de las cadenas

        System.out.println(dad);
        System.out.println(dad.replace("Parra", "Ruiz")); //Remplaza caracteres



    }

}
