package cuentas;

/**
 *
 * @author Jhorman
 * @version v1.0 febrero_2023
 */
public class Main {

    /**
     * 
     * @param args  Ejecutara el programa donde creamos cuentas. 
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * 
     * @param cantidad La cantidad que tendra nuestra cuenta.
     */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
