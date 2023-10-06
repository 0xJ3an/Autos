public class auto {
    private int num_ruedas = 0;
    private String color = "";
    private int puertas = 0;

    private Motor motor;
    private Owner owner;

    public auto(){

    }

    public auto(int num_ruedas, String color, int puertas){
        this.num_ruedas = num_ruedas;
        this.color = color;
        this.puertas = puertas;
    }

    public auto(int num_ruedas, String color, int puertas, Motor motor, Owner owner) {
        this.num_ruedas = num_ruedas;
        this.color = color;
        this.puertas = puertas;
        this.motor = motor;
        this.owner = owner;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void print_color_puertas(){
        System.out.println("El color del auto es : "+color+" y el numero de puertas es: "+puertas);
    }

    public void print_color_puertas(int numAuto){
        System.out.println("El color del vehiculo "+numAuto+" es: "+color+" y el numero de puertas es: "+puertas);
    }
}
