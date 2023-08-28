import javax.swing.*;

public class dan {
    private String nom_banco;
    private Integer num_cuenta;
    private  Integer id;
    private String nom_cliente;
    private double dinero;
    private String contrasena;
    private String cajero;
    private double deudacliente;

    public dan(String nom_banco,Integer num_cuenta, String nom_cliente, Integer id, double dinero, String contrasena, String cajero, double deudacliente){
        this.nom_banco = nom_banco;
        this.num_cuenta = num_cuenta;
        this.nom_cliente = nom_cliente;
        this.dinero = dinero;
        this.contrasena = contrasena;
        this.cajero = cajero;
        this.deudacliente = deudacliente;
        this.id = id;
    }
    void getNum_cuenta(){
        num_cuenta = Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero de cuenta "));
        System.out.println("su cuenta es "+ num_cuenta);
    }

    public void disponible() {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad de que desea sacar: "));
        if (dinero >= monto) {
            dinero -= monto;
            System.out.println("puede retirar " + monto);
        } else {
            System.out.println("no puede retirar " + monto + " tiene " + dinero);
        }
    }

    void getdinero() {
        System.out.println("disponible " + dinero);
    }

    public void  getNom_banco() {
        System.out.println("vienvenido a "+nom_banco);
    }
    void prestamo(){
        String nombre = JOptionPane.showInputDialog("ingrese el nombre");
        Integer id = Integer.parseInt(JOptionPane.showInputDialog("ingrese su id "));
        if (nombre != null && id != null) {
            System.out.println("puede realizar el prestamo " + nombre);
        }
        else {
            System.out.println("no puede acceder al prestamo no cumple con uno de los  requisitos ");
        }

    }

    static class cliente extends dan{
        private double deuda;
        public  cliente(String nom_banco,Integer num_cuenta, String nom_cliente, Integer id, double dinero, String contrasena, String cajero,double deudacliente, double deuda){
            super(nom_banco, num_cuenta, nom_cliente, id, dinero, contrasena, cajero, deudacliente);
            this.deuda = deuda;
        }

    }


    public static void main(String[] args) {
        dan banco = new dan("BANVAR",null, "andres", 192812933,2000, "andres01", "pepito", 0);
        System.out.println("class banco");
        banco.getNom_banco();
        banco.getNum_cuenta();
        banco.getdinero();
        banco.disponible();
        banco.getdinero();
        banco.prestamo();
        System.out.println("class cliente");
        cliente cliente1 = new cliente("jose",null,"jaaja",10,1223,"damo","primero",300,300);
        cliente1.prestamo();
    }
}