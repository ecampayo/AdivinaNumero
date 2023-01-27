import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numeroAdivinar=(int)(Math.random()*500);
        //El valor del número estará entre 1 y 500
        int numero=0;
        int intentos=0;
        do{
            boolean leido;
        }
        do{
            System.out.println("Introduce un numero entre 1 y 500");
        }
        try{
            intentos++;
            numero=teclado.nextInt();
            System.out.println("El numero introducido es "+ numero);
            leido=true;
        }catch (InputMismatchException ex){
            System.out.println("No ha introducido un numero entero");
            teclado.next();
            leido=false;
        }
        while(leido==false);
        if (numero>numeroAdivinar){
            System.out.println("El numero es menor. Sigue intentandolo");
        }
        if (numero<numeroAdivinar){
            System.out.println("El numero es mayor. Sigue intentandolo");
        }
        while (numero!=numeroAdivinar);
        System.out.println("Felicidades has acertado el numero es "+ numeroAdivinar);
        System.out.println("El numero de intentos que has necesito son "+intentos);
    }
}
