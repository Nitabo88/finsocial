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
