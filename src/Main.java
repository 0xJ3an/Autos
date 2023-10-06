import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        auto auto1 = new auto();
        auto1.setPuertas(4);
        auto1.setColor("Blanco");
        auto1.print_color_puertas(1);

        Owner owner1 = new Owner("Juan", "032323232", 19, 'h' );

        Motor motor1 = new Motor(2.0, "gasolina");

        auto auto2 = new auto(4, "Rojo", 4, motor1, owner1);
        auto2.print_color_puertas();
        owner1.print_owner();
        motor1.print_Motor();

        auto1.setMotor(motor1);
        auto1.getMotor().print_Motor();

        auto1.setOwner(owner1);
        auto1.getOwner().print_owner();

        System.out.println("-------------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de ruedas: ");
        int num_Ruedas = sc.nextInt();
        System.out.println("Ingrese el color: ");
        String color = sc.next();
        System.out.println("Ingrese el numero de puertas: ");
        int num_puertas =  sc.nextInt();
        System.out.println("Ingrese el cilindraje del motor: ");
        double cilindraje = sc.nextDouble();
        System.out.println("Ingrese el combustible: ");
        String combustible = sc.next();
        Motor motor3 = new Motor(cilindraje, combustible);
        System.out.println("Ingrese nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese cedula: ");
        String cedula = sc.next();
        System.out.println("Ingrese genero: ");
        char genero = sc.next().charAt(0);
        Owner owner3 = new Owner(nombre, cedula, edad, genero);
        auto auto3 = new auto(num_Ruedas, color, num_puertas, motor3, owner3);
        auto3.print_color_puertas(3);
        auto3.getMotor().print_Motor();
        auto3.getOwner().print_owner();




    }
}