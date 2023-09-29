public class Owner {
    String owner = "";
    String cedula;
    int edad;
    char genero;

    public String esMayorEdad(){
        String my = "";
        if(edad >= 18){
            my = "Es mayor edad";
            System.out.println(my);
        } else{
            my = "Es menor de edad";
            System.out.println(my);
        }
        return my;
    }
}
