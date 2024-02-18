package code;

/**
 *
 * @author Bryan alberto
 */
public class Cliente {
    private double saldo;
    private int nip;
    private String nombre;

    public Cliente(int nip, String nombre) {
        this.nip = nip;
        this.nombre = nombre;
    }
    
    public void deposito(double cant){
        this.saldo += cant;
        System.out.println("Tu nuevo saldo es de " + this.saldo);
    }
    
    public boolean retiro(double cant, int nip){
        if(nip != this.nip){
            return false;
        }else if(cant > this.saldo){
            return false;
        }else{
            this.saldo -= cant;
            System.out.println("Tu nuevo saldo es de " + this.saldo);
        }
        return true;    
    }
}
