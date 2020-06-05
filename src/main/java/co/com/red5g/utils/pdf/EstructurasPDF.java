package co.com.red5g.utils.pdf;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import java.util.HashMap;
import java.util.Map;

public class EstructurasPDF {

  private EstructurasPDF() {
  }

  public static Integer segurosVidaMundial(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Ciudad Solicitud", 0);
    map.put("Fecha Solicitud", 0);
    map.put("Nombre o Razon Social", 1);
    map.put("Tipo Identificacion Tomador", 1);
    map.put("Numero Identificacion Tomador", 1);
    map.put("Credito No", 2);
    map.put("Valor Capital", 2);
    map.put("Tipo Identificacion Asegurado", 2);
    map.put("Numero Identificacion Asegurado", 2);
    map.put("Primer Apellido", 3);
    map.put("Segundo Apellido", 3);
    map.put("Nombres", 3);
    map.put("Peso", 3);
    map.put("Estatura", 3);
    map.put("Sexo", 4);
    map.put("Fecha Nacimiento", 4);
    map.put("Edad", 4);
    map.put("Ocupacion Actual", 4);
    map.put("Estado Civil", 4);
    map.put("Direccion Residencia", 5);
    map.put("E-mail", 5);
    map.put("Telefono", 5);
    map.put("Ciudad Residencia", 5);
    return map.get(filaCampo);
  }

  public static Integer solicitudCredito(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Fecha Solicitud", 0);
    map.put("Tipo Solicitud", 1);
    map.put("Valor", 2);
    map.put("Linea", 2);
    map.put("Numero Cuotas", 2);
    map.put("Valor Cuota", 2);
    map.put("Primer Nombre", 3);
    map.put("Segundo Nombre", 3);
    map.put("Primer Apellido", 3);
    map.put("Segundo Apellido", 3);
    map.put("Tipo Identificacion", 4);
    map.put("Numero Identificacion", 5);
    map.put("Fecha Expedicion", 5);
    map.put("Lugar Expedicion", 5);
    map.put("Fecha de Nacimiento", 6);
    map.put("Sexo", 6);
    map.put("Lugar Nacimiento", 7);
    map.put("Estado Civil", 8);
    map.put("Pais Residencia", 9);
    map.put("Ciudad y Departamento", 9);
    map.put("Direccion Residencia", 10);
    map.put("Telefono Residencia", 10);
    map.put("Telefono Celular", 10);
    map.put("Lugar Envio Correspondencia", 11);
    map.put("Correo Electronico", 11);
    map.put("Ocupacion", 12);
    map.put("Preguntas Actividad Laboral", 13);
    map.put("Actividad Economica", 14);
    map.put("Nombre Empresa", 15);
    map.put("Cargo", 15);
    map.put("Direccion Trabajo", 16);
    map.put("Ciudad Trabajo", 16);
    map.put("Telefono Trabajo", 16);
    map.put("Activos Corrientes", 17);
    map.put("Activos Fijos", 18);
    map.put("Otros Activos", 19);
    map.put("Total Activos", 20);
    map.put("Pasivos Financieros", 21);
    map.put("Pasivos Corrientes", 22);
    map.put("Otros Pasivos", 23);
    map.put("Total Pasivos", 24);
    map.put("Salario Fijo", 25);
    map.put("Salario Variable y Comisiones", 26);
    map.put("Arrendamiento", 27);
    map.put("Rendimiento Financieros", 28);
    map.put("Honorarios", 29);
    map.put("Otros Ingresos", 30);
    map.put("Total Ingresos", 31);
    map.put("Arriendos", 32);
    map.put("Gastos Pesonales,Familiares", 33);
    map.put("Prestamos diferentes a finsocial", 34);
    map.put("Deducciones Nomina", 35);
    map.put("Tarjeta Credito", 36);
    map.put("Otros Gastos", 37);
    map.put("Total Egresos", 38);
    map.put("Datos Operaciones Internacionales",39);
    map.put("FATCA",40);
    map.put("Cuenta Exterior",41);
    map.put("Mutuario",46);
    map.put("Numero Mutuante",47);
    map.put("Origen Fondos",48);
    map.put("Asegurabilidad-1",49);
    map.put("Asegurabilidad-2",50);
    map.put("Asegurabilidad-3",51);
    map.put("Asegurabilidad-4",52);
    map.put("Asegurabilidad-5",53);
    map.put("Enfermedad",54);
    map.put("Declaracion Mutuario-1",55);
    map.put("Declaracion Mutuario-2",56);
    map.put("Declaracion Mutuario-3",57);
    map.put("Declaracion Mutuario-4",58);
    map.put("Nombres-Firma",59);
    map.put("Tipo Identificacion-Firma",60);
    map.put("Numero-Firma",60);
    map.put("Lugar Expedicion-Firma",60);
    map.put("Fecha Expedicion-Firma",60);
    map.put("Ciudad-Firma",61);
    map.put("Direccion-Firma",61);
    map.put("Telefono-Firma",61);
    return map.get(filaCampo);
  }

  public static String ocupacion(Integer filaCampo) {
    Map<Integer, String> map = new HashMap<>();
    map.put(124, "pensionado");
    map.put(68, "docente");
    return map.get(filaCampo);
  }

  public static String estadoCivil(String filaCampo) {
    Map<String, String> map = new HashMap<>();
    map.put("s", "soltero");
    map.put("c", "casado");
    map.put("u", "union libre");
    map.put("v", "viudo");
    return map.get(filaCampo);
  }

  public static String valorCapital(Integer filaCampo) {
    Map<Integer, String> map = new HashMap<>();
    map.put(386, "$ 13.664.882");
    map.put(387, "$ 7.141.504");
    map.put(388, "$ 20.203.544");
    map.put(390, "$ 13.664.882");
    return map.get(filaCampo);
  }
}
