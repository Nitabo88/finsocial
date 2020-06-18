package co.com.red5g.utils.pdf;

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

  public static Integer boletinCostos(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Nombre y Apellidos", 180);
    map.put("Tipo Identificacion", 183);
    map.put("N. de Identificacion", 181);
    map.put("Lugar de expedicion", 181);
    map.put("Fecha de expedicion", 181);
    map.put("Ciudad", 182);
    map.put("Direccion", 182);
    map.put("Telefono", 182);
    return map.get(filaCampo);
  }

  public static Integer pagareFinsocial(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Ciudad", 100);
    map.put("Fecha Pagare", 100);
    map.put("Nombres y Apellidos", 101);
    map.put("Tipo de Identificacion", 103);
    map.put("Numero de Identificacion", 101);
    map.put("Lugar Expedicion", 102);
    map.put("Fecha Expedicion", 102);
    map.put("Ciudad Firma", 102);
    map.put("Direccion", 102);
    map.put("Telefono", 102);
    return map.get(filaCampo);
  }

  public static Integer pagareCoophumana(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Ciudad", 88);
    map.put("Fecha Pagare", 88);
    map.put("Nombres y Apellidos", 89);
    map.put("Tipo de Identificacion", 91);
    map.put("Numero de Identificacion", 89);
    map.put("Lugar Expedicion", 90);
    map.put("Fecha Expedicion", 90);
    map.put("Ciudad Firma", 90);
    map.put("Direccion", 90);
    map.put("Telefono", 90);
    return map.get(filaCampo);
  }

  public static Integer solicitudAfiliacionCoperativa(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Relacion", 0);
    map.put("Datos", 0);
    map.put("Fecha Solicitud", 0);
    map.put("Tipo Identificacion", 1);
    map.put("Numero Identificacion", 1);
    map.put("Fecha Expedicion", 1);
    map.put("Expedido en", 2);
    map.put("Lugar y fecha de nacimiento", 2);
    map.put("Primer Apellido", 3);
    map.put("Segundo Apellido", 3);
    map.put("Nombres", 3);
    map.put("Genero", 3);
    map.put("Estado Civil", 4);
    map.put("Hijos", 4);
    map.put("Personas a Cargo", 4);
    map.put("Madre Cabeza de Hogar", 4);
    map.put("Ciudad", 5);
    map.put("Departamento", 5);
    map.put("Direccion", 5);
    map.put("Estrato", 5);
    map.put("Celular", 6);
    map.put("Telefono", 6);
    map.put("Correo Electronico", 6);
    map.put("Nivel Estudio", 7);
    map.put("Maneja Recursos Publicos", 7);
    map.put("Ocupacion", 7);
    map.put("Ejerce cargos publicos", 8);
    map.put("Tiene reconocimiento publico", 8);
    map.put("Tiene relacion con una persona publicamente expuesta", 8);
    map.put("Nombre y apellido conyugue", 7);
    map.put("Documento Conyugue", 7);
    map.put("Ingresos Mensuales", 9);
    map.put("Egresos Mensuales", 9);
    map.put("Activos", 9);
    map.put("Pasivos", 9);
    map.put("Otros Ingresos", 9);
    map.put("PEPs", 10);
    map.put("FATCA-1", 11);
    map.put("FATCA-2", 12);
    map.put("FATCA-3", 13);
    map.put("FATCA-4", 14);
    map.put("FATCA-5", 15);
    map.put("FATCA-6", 16);
    map.put("Declaracion Origen Fondos", 17);
    map.put("Declaracion Tributaria Exterior", 18);
    map.put("Declaro Expresamente-1", 19);
    map.put("Declaro Expresamente-2", 20);
    map.put("Declaro Expresamente-3", 21);
    map.put("Declaro Expresamente-4", 22);
    map.put("Declaro Expresamente-5", 23);
    map.put("Declaro Expresamente-6", 24);
    map.put("Contrato de fianza - No Identificacion", 29);
    map.put("Contrato de fianza - Nombre Completo", 30);
    map.put("Contrato de fianza - Cedula", 30);
    map.put("Contrato de fianza - Ciudad", 31);
    map.put("Contrato de fianza - Fecha", 31);
    map.put("Deudor - Nombre y Apellidos", 32);
    map.put("Deudor - Tipo de Identificacion", 33);
    map.put("Deudor - No Identificacion", 33);
    map.put("Deudor - Lugar Expedicion",33);
    map.put("Deudor - Fecha Expedicion", 33);
    map.put("Deudor - Ciudad", 34);
    map.put("Deudor - Direccion", 34);
    map.put("Deudor - Telefono", 34);
    map.put("Firma - Nombre", 39);
    return map.get(filaCampo);
  }

  public static Integer solicitudCredito(String filaCampo, int pdf) {
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
    map.put("Activos Corrientes", 15 + pdf);
    map.put("Activos Fijos", 16 + pdf);
    map.put("Otros Activos", 17 + pdf);
    map.put("Total Activos", 18 + pdf);
    map.put("Pasivos Financieros", 19 + pdf);
    map.put("Pasivos Corrientes", 20 + pdf);
    map.put("Otros Pasivos", 21 + pdf);
    map.put("Total Pasivos", 22 + pdf);
    map.put("Salario Fijo", 23 + pdf);
    map.put("Salario Variable y Comisiones", 24 + pdf);
    map.put("Arrendamiento", 25 + pdf);
    map.put("Rendimiento Financieros", 26 + pdf);
    map.put("Honorarios", 27 + pdf);
    map.put("Otros Ingresos", 28 + pdf);
    map.put("Total Ingresos", 29 + pdf);
    map.put("Arriendos", 30 + pdf);
    map.put("Gastos Pesonales,Familiares", 31 + pdf);
    map.put("Prestamos diferentes a finsocial", 32 + pdf);
    map.put("Deducciones Nomina", 33 + pdf);
    map.put("Tarjeta Credito", 34 + pdf);
    map.put("Otros Gastos", 35 + pdf);
    map.put("Total Egresos", 36 + pdf);
    map.put("Datos Operaciones Internacionales", 37 + pdf);
    map.put("FATCA", 38 + pdf);
    map.put("Mutuario", pdf - 20);
    map.put("Numero Documento Mutuario", pdf - 19);
    map.put("Origen Fondos", pdf - 18);
    map.put("Asegurabilidad-1", pdf - 17);
    map.put("Asegurabilidad-2", pdf - 16);
    map.put("Asegurabilidad-3", pdf - 15);
    map.put("Asegurabilidad-4", pdf - 14);
    map.put("Asegurabilidad-5", pdf - 13);
    map.put("Enfermedad", pdf - 12);
    map.put("Declaracion Mutuario-1", pdf - 11);
    map.put("Declaracion Mutuario-2", pdf - 10);
    map.put("Declaracion Mutuario-3", pdf - 9);
    map.put("Declaracion Mutuario-4", pdf - 8);
    map.put("Nombres Y Apellidos Firma", pdf - 7);
    map.put("Tipo Documento Firma", pdf - 6);
    map.put("Numero Firma", pdf - 6);
    map.put("Ciudad Expedicion Firma", pdf - 6);
    map.put("Fecha Expedicion Firma", pdf - 6);
    map.put("Ciudad Firma", pdf - 5);
    map.put("Direccion Firma", pdf - 5);
    map.put("Telefono Firma", pdf - 5);
    return map.get(filaCampo);
  }

  public static Integer seguroVidaSura (String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Tipo de Identificacion Tomador", 0);
    map.put("Numero de Identificacion Tomador", 16);
    map.put("Razon Social", 16);
    map.put("Tipo Institucion", 16);
    map.put("Direccion Correspondencia Tomador", 17);
    map.put("Ciudad/Departamento", 17);
    map.put("Tipo Identificacion Deudor", 18);
    map.put("Numero Identificacion Deudor", 19);
    map.put("Nombres y Apellidos del deudor", 19);
    map.put("Sexo", 19);
    map.put("Fecha Nacimiento", 19);
    map.put("Peso", 20);
    map.put("Estatura", 20);
    map.put("Ciudad", 20);
    map.put("Departamento", 20);
    map.put("Telefono", 20);
    map.put("Celular", 20);
    map.put("Direccion Correspondencia Deudor", 21);
    map.put("Correo Electronico", 21);
    map.put("Valor Credito", 22);
    map.put("Valor Asegurado", 23);
    map.put("Declaracion Asegurabilidad-1", 24);
    map.put("Declaracion Asegurabilidad-2", 25);
    map.put("Fecha Diligenciamiento", 26);
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
    map.put(391, "$ 7.141.504");
    map.put(392, "$ 20.203.544");
    return map.get(filaCampo);
  }

  public static String valorCapitalSura(Integer filaCampo) {
    Map<Integer, String> map = new HashMap<>();
    map.put(386, "13.664.882");
    map.put(387, "7.141.504");
    map.put(388, "20.203.544");
    map.put(390, "13.664.882");
    map.put(391, "7.141.504");
    map.put(392, "20.203.544");
    return map.get(filaCampo);
  }
}
