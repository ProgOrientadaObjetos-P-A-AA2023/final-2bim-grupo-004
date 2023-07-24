/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete02.*;
import paquete03.Enlace;

/**
 *
 * @author denis
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean flag = true;
        int opcion;
        Enlace c = new Enlace();

        c.establecerConexion();

        while (flag) {
            System.out.println("--------------------BIENVENIDO A TELEFÓNICA"
                    + "--------------------");

            System.out.println("A continuacion elija la opcion que desea:"
                    + "(ingrese el numero de opcion)\n");

            System.out.println("1. Ingrese 1 si desea adquirir un "
                    + "Plan Post Pago Minutos");

            System.out.println("2. Ingrese 2 si desea adquirir un "
                    + "Plan Post Pago Megas");

            System.out.println("3. Ingrese 3 si desea adquirir un "
                    + "Plan Post Pago Minutos Megas");

            System.out.println("4. Ingrese 4 si desea adquirir un "
                    + "Plan Post Pago Minuto Megas Economico");

            System.out.println("5. Ingrese 5 para salir");

            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ha decidido adquirir un "
                            + "Plan Post Pago Minutos, por favor llene los "
                            + "siguientes datos:");

                    System.out.println("Ingrese sus nombres y apellidos:"
                            + "(Ejemplo: Juan David Salinas Salinas)");
                    String nombres = sc.nextLine();

                    System.out.println("Ingrese su pasaporte:");
                    String pasaporte = sc.nextLine();

                    System.out.println("Ingrese su ciudad");
                    String ciudad = sc.nextLine();

                    System.out.println("Ingrese su barrio:");
                    String barrio = sc.nextLine();

                    System.out.println("Ingrese su marca de celular:");
                    String marca = sc.nextLine();

                    System.out.println("Ingrese su modelo de celular:");
                    String modelo = sc.nextLine();

                    System.out.println("Ingrese su numero celular:");
                    String numero = sc.nextLine();

                    System.out.println("Ingrese el numero de minutos nacionales"
                            + " a contratar");
                    int minutosNacionales = sc.nextInt();

                    System.out.println("Ingrese el costo del minuto nacional:");
                    double costoMinutoNacional = sc.nextDouble();

                    System.out.println("Ingrese el numero de minutos internacionales"
                            + " a contratar:");
                    int minutosInternacionales = sc.nextInt();

                    System.out.println("Ingrese el costo del minuto internacional:");
                    double costoMinutoInternacional = sc.nextDouble();

                    PlanPostPagoMinutos planminutos = new PlanPostPagoMinutos(nombres,
                            pasaporte,
                            ciudad,
                            barrio,
                            marca,
                            modelo,
                            numero,
                            minutosNacionales,
                            costoMinutoNacional,
                            minutosInternacionales,
                            costoMinutoInternacional);

                    planminutos.establecerPagoMensual();
                    c.insertarPlanPostPagoMinutos(planminutos);
                    System.out.println("Plan creado con exito!");
                    break;

                case 2:
                    System.out.println("Ha decidido adquirir un "
                            + "Plan Post Pago Megas, por favor llene los "
                            + "siguientes datos:");

                    System.out.println("Ingrese sus nombres y apellidos:"
                            + "(Ejemplo: Juan David Salinas Salinas)");
                    nombres = sc.nextLine();

                    System.out.println("Ingrese su pasaporte:");
                    pasaporte = sc.nextLine();

                    System.out.println("Ingrese su ciudad");
                    ciudad = sc.nextLine();

                    System.out.println("Ingrese su barrio:");
                    barrio = sc.nextLine();

                    System.out.println("Ingrese su marca de celular:");
                    marca = sc.nextLine();

                    System.out.println("Ingrese su modelo de celular:");
                    modelo = sc.nextLine();

                    System.out.println("Ingrese su numero celular:");
                    numero = sc.nextLine();

                    System.out.println("Ingrese el numero de GB");
                    double gigas = sc.nextDouble();

                    System.out.println("Ingrese el costo del Giga:");
                    double costoGiga = sc.nextDouble();

                    System.out.println("Ingrese el valor de la tarifa base");
                    double tarifa = sc.nextDouble();

                    PlanPostPagoMegas megas = new PlanPostPagoMegas(nombres,
                            pasaporte,
                            ciudad,
                            barrio,
                            marca,
                            modelo,
                            numero,
                            gigas,
                            costoGiga,
                            tarifa);

                    megas.establecerPagoMensual();
                    c.insertarPlanPostPagoMegas(megas);
                    System.out.println("Plan creado con exito!");
                    break;

                case 3:
                    System.out.println("Ha decidido adquirir un "
                            + "Plan Post Pago Minutos Megas, por favor llene los"
                            + " siguientes datos:");

                    System.out.println("Ingrese sus nombres y apellidos:"
                            + "(Ejemplo: Juan David Salinas Salinas)");
                    nombres = sc.nextLine();

                    System.out.println("Ingrese su pasaporte:");
                    pasaporte = sc.nextLine();

                    System.out.println("Ingrese su ciudad");
                    ciudad = sc.nextLine();

                    System.out.println("Ingrese su barrio:");
                    barrio = sc.nextLine();

                    System.out.println("Ingrese su marca de celular:");
                    marca = sc.nextLine();

                    System.out.println("Ingrese su modelo de celular:");
                    modelo = sc.nextLine();

                    System.out.println("Ingrese su numero celular:");
                    numero = sc.nextLine();

                    System.out.println("Ingrese el numero de minutos a contratar");
                    int minutos = sc.nextInt();

                    System.out.println("Ingrese el costo del minuto:");
                    double costoMinutos = sc.nextDouble();

                    System.out.println("Ingrese el numero de GB a contratar:");
                    gigas = sc.nextInt();

                    System.out.println("Ingrese el costo del Giga");
                    costoGiga = sc.nextDouble();

                    PlanPostPagoMinutosMegas minutosMegas = new PlanPostPagoMinutosMegas(nombres,
                            pasaporte,
                            ciudad,
                            barrio,
                            marca,
                            modelo,
                            numero,
                            minutos,
                            costoMinutos,
                            gigas,
                            costoGiga);

                    minutosMegas.establecerPagoMensual();
                    c.insertarPlanPostPagoMinutosMegas(minutosMegas);
                    System.out.println("Plan creado con exito!");

                    break;

                case 4:
                    System.out.println("Ha decidido adquirir un "
                            + "Plan Post Pago Minutos Megas Economico"
                            + ", por favor llene los siguientes datos:");

                    System.out.println("Ingrese sus nombres y apellidos:"
                            + "(Ejemplo: Juan David Salinas Salinas)");
                    nombres = sc.nextLine();

                    System.out.println("Ingrese su pasaporte:");
                    pasaporte = sc.nextLine();

                    System.out.println("Ingrese su ciudad");
                    ciudad = sc.nextLine();

                    System.out.println("Ingrese su barrio:");
                    barrio = sc.nextLine();

                    System.out.println("Ingrese su marca de celular:");
                    marca = sc.nextLine();

                    System.out.println("Ingrese su modelo de celular:");
                    modelo = sc.nextLine();

                    System.out.println("Ingrese su numero celular:");
                    numero = sc.nextLine();

                    System.out.println("Ingrese el numero de minutos a contratar");
                    minutos = sc.nextInt();

                    System.out.println("Ingrese el costo del minuto:");
                    costoMinutos = sc.nextDouble();

                    System.out.println("Ingrese el numero de gigas a contratar:");
                    gigas = sc.nextInt();

                    System.out.println("Ingrese el costo del giga:");
                    costoGiga = sc.nextDouble();

                    System.out.println("Ingrese el porcentaje del descuento "
                            + "asignado:");
                    double descuento = sc.nextDouble();

                    PlanPostPagoMinutosMegasEconomico planEconomico
                            = new PlanPostPagoMinutosMegasEconomico(nombres,
                                    pasaporte,
                                    ciudad,
                                    barrio,
                                    marca,
                                    modelo,
                                    numero,
                                    minutos,
                                    costoMinutos,
                                    gigas,
                                    costoGiga,
                                    descuento);
                    
                    planEconomico.establecerPagoMensual();
                    c.insertarPlanPostPagoMinutosMegasEconomico(planEconomico);
                    System.out.println("Plan creado con exito!");
                    break;
                case 5:
                    System.out.println("Gracias por preferir a TELEFONICA!");
                    flag = false;
                    break;
                default:
                    System.err.println("Ingrese una opcion correcta por favor");
                    break;
            }

        }
        System.out.println("Sus planes son:\n");
        for (int i = 0; i < c.obtenerDataPlanes().size(); i++) {
            System.out.println(c.obtenerDataPlanes().get(i));
        }

    }

}
