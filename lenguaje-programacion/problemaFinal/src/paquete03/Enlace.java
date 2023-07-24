/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete02.*;

/**
 *
 * @author reroes
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanCelular.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutos(nombres,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, minutosNacionales,"
                    + "costoNacional, minutosInternacionales, costoInternacional, pago)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %d, %.2f, %d, %.2f, %.2f)",
                    plan.obtenerNombreApellidoPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietaria(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMinutosNacionales(),
                    plan.obtenerCostoMinutoNacional(),
                    plan.obtenerMinutosInternacionales(),
                    plan.obtenerCostoMinutoInternacional(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    public void insertarPlanPostPagoMegas(PlanPostPagoMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMegas(nombres,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, gigas,"
                    + "costoGiga, tarifa, pago)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %.2f, "
                    + "%.2f, %.2f, %.2f)",
                    plan.obtenerNombreApellidoPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietaria(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMegasEnGigas(),
                    plan.obtenerCostoPorGiga(),
                    plan.obtenerTarifaBase(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    
    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegas(nombres,"
                    + "pasaporte, ciudad, barrio, marca, modelo, numero, minutos,"
                    + "costoMinutos, gigas, costoGiga, pago)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s', %d,"
                    + "%.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombreApellidoPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietaria(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMinuto(),
                    plan.obtenerMegasEnGigas(),
                    plan.obtenerCostoPorGiga(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    
    public void insertarPlanPostPagoMinutosMegasEconomico
                                    (PlanPostPagoMinutosMegasEconomico plan) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO PlanPostPagoMinutosMegasEconomico"
                    + "(nombres, pasaporte, ciudad, barrio, marca, modelo, "
                    + "numero, minutos, costoMinutos, gigas, costoGiga, "
                    + "descuento, pago)"
                    + "values ('%s', '%s','%s', '%s', '%s', '%s', '%s',"
                    + "%d, %.2f, %.2f, %.2f, %.2f, %.2f)",
                    plan.obtenerNombreApellidoPropietario(),
                    plan.obtenerPasaportePropietario(),
                    plan.obtenerCiudadPropietaria(),
                    plan.obtenerBarrioPropietario(),
                    plan.obtenerMarcaCelular(),
                    plan.obtenerModeloCelular(),
                    plan.obtenerNumeroCelular(),
                    plan.obtenerMinutos(),
                    plan.obtenerCostoMinuto(),
                    plan.obtenerMegasEnGigas(),
                    plan.obtenerCostoPorGiga(),
                    plan.obtenerPorcentajeDescuento(),
                    plan.obtenerPagoMensual());

            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }
    
    
    public ArrayList<PlanCelular> obtenerDataPlanes() {
        ArrayList<PlanCelular> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();

            String data = "Select * from PlanPostPagoMinutos;";
            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {

                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombres"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numero"),
                        rs.getInt("minutosNacionales"),
                        rs.getDouble("costoNacional"),
                        rs.getInt("minutosInternacionales"),
                        rs.getDouble("costoInternacional"));

                lista.add(plan);
            }

            String data2 = "Select * from PlanPostPagoMegas;";
            rs = statement.executeQuery(data2);
            while (rs.next()) {

                PlanPostPagoMegas plan = new PlanPostPagoMegas(
                        rs.getString("nombres"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numero"),
                        rs.getDouble("gigas"),
                        rs.getDouble("costoGiga"),
                        rs.getDouble("tarifa"));
                lista.add(plan);
            }

            String data3 = "Select * from PlanPostPagoMinutosMegas;";
            rs = statement.executeQuery(data3);
            while (rs.next()) {

                PlanPostPagoMinutos plan = new PlanPostPagoMinutos(
                        rs.getString("nombres"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numero"),
                        rs.getInt("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getInt("gigas"),
                        rs.getDouble("costoGiga"));

                lista.add(plan);
            }

            String data4 = "Select * from PlanPostPagoMinutosMegasEconomico;";
            rs = statement.executeQuery(data4);
            while (rs.next()) {

                PlanPostPagoMinutosMegasEconomico plan = new PlanPostPagoMinutosMegasEconomico(
                        rs.getString("nombres"),
                        rs.getString("pasaporte"),
                        rs.getString("ciudad"),
                        rs.getString("barrio"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("numero"),
                        rs.getInt("minutos"),
                        rs.getDouble("costoMinutos"),
                        rs.getInt("gigas"),
                        rs.getDouble("costoGiga"),
                        rs.getDouble("descuento"));

                lista.add(plan);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlan");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
