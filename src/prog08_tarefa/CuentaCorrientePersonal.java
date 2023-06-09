
package prog08_tarefa;

import java.util.ArrayList;


public class CuentaCorrientePersonal extends CuentaCorriente{
    
        private double comisionMantenimiento; // solo cuenta corriente Personal

    public CuentaCorrientePersonal(double comisionMantenimiento, String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(listaEntidades, titular, saldo, IBAN);
        this.comisionMantenimiento = comisionMantenimiento;
    }

    public double getComisionMantenimiento() {
        return comisionMantenimiento;
    }

    public void setComisionMantenimiento(double comisionMantenimiento) {
        this.comisionMantenimiento = comisionMantenimiento;
    }

    @Override
    public String devolverInfoString(){
        return super.devolverInfoString() + ", comisionMantenimiento = " + comisionMantenimiento;
    }
    
        
        
}
