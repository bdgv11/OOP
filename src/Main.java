import com.ucreativa.familia.Bryan;
import com.ucreativa.familia.Omar;

public class Main {

    public static void main(String[] args) {

        Bryan br = new Bryan("Saludo, prueba herencia");

        Omar padre = new Omar("Hola soy el papa de Bryan jaja");
        padre.setAge();
        int edad = padre.getAge();
        System.out.println("La edad de mi padre es: " + edad + " y su hobby es: " + padre.getHobby());

    }
}