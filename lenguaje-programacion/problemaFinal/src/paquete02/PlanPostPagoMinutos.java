/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class PlanPostPagoMinutos extends PlanCelular {

    // Atributos específicos para este tipo de plan
    private int minutosNacionales;
    private double costoMinutoNacional;
    private int minutosInternacionales;
    private double costoMinutoInternacional;

// Constructor
    public PlanPostPagoMinutos(String nombreApellidoP,
            String pasaporteP, String ciudadP,
            String barrioP, String marcaC, String modeloC,
            String numeroC, int minutosNa,
            double costoMinutoNa, int minutosInter,
            double costoMinutoInter) {

        // Super
        super(nombreApellidoP, pasaporteP, ciudadP, barrioP,
                marcaC, modeloC, numeroC);

        // Inicialización de los atributos específicos de este tipo de plan
        minutosNacionales = minutosNa;
        costoMinutoNacional = costoMinutoNa;
        minutosInternacionales = minutosInter;
        costoMinutoInternacional = costoMinutoInter;

    }

    public int obtenerMinutosNacionales() {
        return minutosNacionales;
    }

    public void establecertMinutosNacionales(int mN) {
        minutosNacionales = mN;
    }

    public double obtenerCostoMinutoNacional() {
        return costoMinutoNacional;
    }

    public void establecerCostoMinutoNacional(double cMN) {
        costoMinutoNacional = cMN;
    }

    public int obtenerMinutosInternacionales() {
        return minutosInternacionales;
    }

    public void establecerMinutosInternacionales(int mI) {
        minutosInternacionales = mI;
    }

    public double obtenerCostoMinutoInternacional() {
        return costoMinutoInternacional;
    }

    public void establecerCostoMinutoInternacional(double cM) {
        costoMinutoInternacional = cM;
    }

    
    @Override
    public void establecerPagoMensual(){
        pagoMensual = (costoMinutoInternacional*minutosInternacionales) + 
                (costoMinutoNacional*minutosNacionales);
    }
    
    
    @Override
    public String toString() {
        return String.format("Plan PostPago Minutos:\n"
                + "\tNombre y Apellido: %s\n"
                + "\tPasaporte: %s\n"
                + "\tCiudad: %s\n"
                + "\tBarrio: %s\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tNúmero del Celular: %s\n"
                + "\tMinutos Nacionales Incluidos: %d\n"
                + "\tCosto por Minuto Nacional: %.2f\n"
                + "\tMinutos Internacionales Incluidos: %d\n"
                + "\tCosto por Minuto Internacional: %.2f\n"
                + "\tPago Mensual: %.2f\n",
                obtenerNombreApellidoPropietario(),
                obtenerPasaportePropietario(),
                obtenerCiudadPropietaria(),
                obtenerBarrioPropietario(),
                obtenerMarcaCelular(),
                obtenerModeloCelular(),
                obtenerNumeroCelular(),
                obtenerMinutosNacionales(),
                obtenerCostoMinutoNacional(),
                obtenerMinutosInternacionales(),
                obtenerCostoMinutoInternacional(),
                obtenerPagoMensual()
        );
    }
}
