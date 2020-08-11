package co.com.red5g.utils.pdf;

import java.util.HashMap;
import java.util.Map;

public class EstructurasPdfBancoomeva {

  public static Integer pdf0151(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Fecha de Solicitud", 0);
    map.put("NIT", 0);
    map.put("NOMBRES Y APELLIDOS COMPLETOS", 1);
    map.put("TIPO DE DOCUMENTO", 1);
    map.put("No DE DOCUMENTO ", 1);
    map.put("FECHA DE NACIMIENTO", 2);
    map.put("EDAD", 2);
    map.put("PESO", 2);
    map.put("ESTATURA", 2);
    map.put("GENERO", 3);
    map.put("OCUPACION", 3);
    map.put("CARGO", 3);
    map.put("DIRECCION DE RESIDENCIA", 3);
    map.put("CIUDAD", 3);
    map.put("DEPARTAMENTO", 3);
    map.put("NACIONALIDAD", 4);
    map.put("PAIS RESIDENCIA", 4);
    map.put("TELEFONOS FIJO Y CELULAR", 4);
    map.put("CORREO ELECTRONICO", 4);
    map.put("VALOR ASEGURADO", 4);
    map.put("NUEVO TOTAL VALOR ASEGURADO", 4);
    map.put("DATOS BENEFICIARIOS", 5);
    map.put("DECLARACION DE ASEGURABILIDAD", 5);
    return map.get(filaCampo);
  }

}
