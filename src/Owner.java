public class Owner {
    private String owner = "";
    private String cedula;
    private int edad;
    private char genero;

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
