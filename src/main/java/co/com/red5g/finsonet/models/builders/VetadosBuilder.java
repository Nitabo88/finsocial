package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.utils.Builder;

public class VetadosBuilder implements Builder<Vetados> {
    private String documentoVetados;
    private String detalleVetados;
    private String listaVetados;

    public VetadosBuilder() {
      documentoVetados = "";
      detalleVetados = "";
      listaVetados = "";
    }

    public static VetadosBuilder a() {
        return new VetadosBuilder();
    }

    public Vetados build() {
        return new Vetados(this);
    }

    public String getDocumentoVetados() {
        return this.documentoVetados;
    }

    public String getDetalleVetados() {
        return this.detalleVetados;
    }

    public String getListaVetados() {
        return this.listaVetados;
    }

    public Vetados unCliente() {
      condocumentoVetados();
      condetalleVetados();
      conListaVetados();
        return build();
    }

    private VetadosBuilder condetalleVetados() {
        this.detalleVetados = "Usuario con problemas penales";
        return this;
    }
    private VetadosBuilder condocumentoVetados() {
        this.documentoVetados = "10040048";
        return this;
    }

    private VetadosBuilder conListaVetados() {
        this.listaVetados = "Sin motivo";
        return this;
    }
}