/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class PlanPostPagoMegas extends PlanCelular {

    // Atributos específicos para este tipo de plan
    private double megasEnGigas;
    private double costoPorGiga;
    private double tarifaBase;

    public PlanPostPagoMegas(String nombreApellidoP,
            String pasaporteP, String ciudadP,
            String barrioP, String marcaC, String modeloC,
            String numeroC, double megasEnG, double costoPorG,
            double tarifaB) {
        // Super
        super(nombreApellidoP, pasaporteP, ciudadP, barrioP, marcaC, modeloC,
                numeroC);

        // Inicialización de los atributos específicos de este tipo de plan
        megasEnGigas = megasEnG;
        costoPorGiga = costoPorG;
        tarifaBase = tarifaB;

    }

    public double obtenerMegasEnGigas() {
        return megasEnGigas;
    }

    public void establecerMegasEnGigas(double mE) {
        megasEnGigas = mE;
    }

    public double obtenerCostoPorGiga() {
        return costoPorGiga;
    }

    public void establecerCostoPorGiga(double cPG) {
        costoPorGiga = cPG;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double tB) {
        tarifaBase = tB;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (megasEnGigas*costoPorGiga) + tarifaBase;
    }

    @Override
    public String toString() {
        return String.format("Plan PostPago Megas:\n"
                + "\tNombre y Apellido: %s\n"
                + "\tPasaporte: %s\n"
                + "\tCiudad: %s\n"
                + "\tBarrio: %s\n"
                + "\tMarca del Celular: %s\n"
                + "\tModelo del Celular: %s\n"
                + "\tNúmero del Celular: %s\n"
                + "\tMegas Incluidos (en GB): %.2f\n"
                + "\tCosto por GB: %.2f\n"
                + "\tTarifa Base: %.2f\n"
                + "\tPago Mensual: %.2f\n",
                obtenerNombreApellidoPropietario(),
                obtenerPasaportePropietario(),
                obtenerCiudadPropietaria(),
                obtenerBarrioPropietario(),
                obtenerMarcaCelular(),
                obtenerModeloCelular(),
                obtenerNumeroCelular(),
                obtenerMegasEnGigas(),
                obtenerCostoPorGiga(),
                obtenerTarifaBase(),
                obtenerPagoMensual());
    }
}
