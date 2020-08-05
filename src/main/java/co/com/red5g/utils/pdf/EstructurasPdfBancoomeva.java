package co.com.red5g.utils.pdf;

import java.util.HashMap;
import java.util.Map;

public class EstructurasPdfBancoomeva {

  public static Integer pdf0151(String filaCampo) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Fecha de Solicitud", 0);
    map.put("Oficina", 0);
    map.put("Operacion a realizar", 1);
    map.put("Canal Utilizado", 1);
    map.put("Identificacion", 1);
    map.put("No", 2);
    map.put("Lugar de Expedicion", 2);
    map.put("Fecha de Expedicion", 2);
    map.put("Primer Apellido", 2);
    map.put("Segundo Apellido", 3);
    map.put("Primer Nombre", 3);
    map.put("Segundo Nombre", 3);
    map.put("Fecha de Nacimiento", 3);
    map.put("Ciudad de Nacimiento", 3);
    map.put("Pais de Nacimiento", 3);
    map.put("Nacionalidad 1", 4);
    map.put("Nacionalidad 2", 4);
    map.put("Sexo", 4);
    map.put("Estado civil", 4);
    map.put("Personas a cargo", 4);
    map.put("Nivel Academico", 4);
    map.put("Profesion", 5);
    map.put("Ocupacion", 5);
    map.put("Declara Renta?", 5);
    map.put("Desempeña un cargo Politico?", 5);
    map.put("Ciudad Residencia", 5);
    map.put("Ciudad Residencia", 5);
    map.put("Ciudad Residencia", 5);
    map.put("Ciudad Residencia", 5);
    map.put("Ciudad Residencia", 5);
    map.put("Ciudad Residencia", 5);
    return map.get(filaCampo);
  }

}
