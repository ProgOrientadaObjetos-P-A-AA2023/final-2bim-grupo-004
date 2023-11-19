/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public abstract class PlanCelular {

    protected String nombreApellidoPropietario;
    protected String ciudadPropietaria;
    protected String pasaportePropietario;
    protected String barrioPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String nombreApellidoP, String pasaporteP,
            String ciudadP, String barrioP,
            String marcaC, String modeloC,
            String numeroC) {

        nombreApellidoPropietario = nombreApellidoP;
        pasaportePropietario = pasaporteP;
        ciudadPropietaria = ciudadP;
        barrioPropietario = barrioP;
        marcaCelular = marcaC;
        modeloCelular = modeloC;
        numeroCelular = numeroC;

    }

    public String obtenerNombreApellidoPropietario() {
        return nombreApellidoPropietario;
    }

    public void establecerNombreApellidoPropietario(String nomP) {
        nombreApellidoPropietario = nomP;
    }

    public String obtenerPasaportePropietario() {
        return pasaportePropietario;
    }

    public void establecerPasaportePropietario(String pasP) {
        pasaportePropietario = pasP;
    }

    public String obtenerCiudadPropietaria() {
        return ciudadPropietaria;
    }

    public void establecerCiudadPropietaria(String cP) {
        ciudadPropietaria = cP;
    }

    public String obtenerBarrioPropietario() {
        return barrioPropietario;
    }

    public void establecerBarrioPropietario(String bP) {
        barrioPropietario = bP;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public void establecerMarcaCelular(String mC) {
        marcaCelular = mC;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public void establecerModeloCelular(String mC) {
        modeloCelular = mC;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public void establecerNumeroCelular(String nM) {
        numeroCelular = nM;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public abstract void establecerPagoMensual();

}
