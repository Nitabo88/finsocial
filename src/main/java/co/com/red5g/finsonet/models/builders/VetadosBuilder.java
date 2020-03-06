package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.utils.Builder;

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
      condocumentoVetados("10040048");
      condetalleVetados("Usuario con problemas penales");
      conListaVetados("Sin motivo");
        return build();
    }

    private VetadosBuilder condetalleVetados(final String detalleVetados) {
        this.detalleVetados = detalleVetados;
        return this;
    }
    private VetadosBuilder condocumentoVetados(final String documentoVetados) {
        this.documentoVetados = documentoVetados;
        return this;
    }

    private VetadosBuilder conListaVetados(final String listaVetados) {
        this.listaVetados = listaVetados;
        return this;
    }
}