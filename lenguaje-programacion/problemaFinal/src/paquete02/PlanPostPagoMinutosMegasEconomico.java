/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class PlanPostPagoMinutosMegasEconomico extends PlanCelular {

    // Atributos específicos para este tipo de plan
    private int minutos;
    private double costoMinuto;
    private double megasEnGigas;
    private double costoPorGiga;
    private double porcentajeDescuento;

    // Constructor
    public PlanPostPagoMinutosMegasEconomico(String nombreApellidoP,
            String pasaporteP, String ciudadP,
            String barrioP, String marcaC, String modeloC,
            String numeroC,
            int min, double costoM,
            double megasEnG, double costoPorG,
            double porcentajeD) {
        // Super
        super(nombreApellidoP, pasaporteP, ciudadP, barrioP,
                marcaC, modeloC, numeroC);

        // Inicialización de los atributos específicos de este tipo de plan
        minutos = min;
        costoMinuto = costoM;
        megasEnGigas = megasEnG;
        costoPorGiga = costoPorG;
        porcentajeDescuento = porcentajeD;

    }

    public int obtenerMinutos() {
        return minutos;
    }

    public void establecerMinutos(int m) {
        minutos = m;
    }

    public double obtenerCostoMinuto() {
        return costoMinuto;
    }

    public void establecerCostoMinuto(double c) {
        costoMinuto = c;
    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public void establecerMegasEnGigas(double mG) {
        megasEnGigas = mG;
    }

    public double obtenerCostoPorGiga() {
        return costoPorGiga;
    }

    public void establecerCostoPorGiga(double cG) {
        costoPorGiga = cG;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento() {
        porcentajeDescuento = (porcentajeDescuento * 
                (minutos*costoMinuto) + (megasEnGigas*costoPorGiga))/100;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = ((minutos*costoMinuto) + (megasEnGigas*costoPorGiga) - 
                                                porcentajeDescuento );
    }
    
    @Override
    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        return String.format("Plan de PostPago Minutos y Megas Econmico:\n"
                + "\tNombre y Apellido: %s\n"
                + "\tPasaporte: %s\n"
                + "\tCiudad: %s\n"
                + "\tBarrio: %s\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tNúmero del Celular: %s\n"
                + "\tMinutos Incluidos: %d\n"
                + "\tCosto por Minuto: %.2f\n"
                + "\tMegas Incluidos (en GB): %.2f\n"
                + "\tCosto por GB: %.2f\n"
                + "\tPorcentaje de Descuento: %.2f por ciento\n"
                + "\tPago Mensual: %.2f\n",
                obtenerNombreApellidoPropietario(),
                obtenerPasaportePropietario(),
                obtenerCiudadPropietaria(),
                obtenerBarrioPropietario(),
                obtenerMarcaCelular(),
                obtenerModeloCelular(),
                obtenerNumeroCelular(),
                obtenerMinutos(),
                obtenerCostoMinuto(),
                obtenerMegasEnGigas(),
                obtenerCostoPorGiga(),
                obtenerPorcentajeDescuento(),
                obtenerPagoMensual());
    }
}
