package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.utils.Builder;

public class VetadosBuilder implements Builder<Vetados> {
    private String documentoVetados;
    private String detalleVetados;
    private String listaVetados;

    public VetadosBuilder() {
        this.documentoVetados = "";
        this.detalleVetados = "";
        this.listaVetados = "";
    }

    public static VetadosBuilder a() {
        return new VetadosBuilder();
    }

    public Vetados build() {
        return new Vetados(this);
    }

    public String getDocumentoVetados() {
        return documentoVetados;
    }

    public String getDetalleVetados() {
        return detalleVetados;
    }

    public String getListaVetados() {
        return listaVetados;
    }

    public Vetados unCliente() {
        this.condocumentoVetados("10040048");
        this.condetalleVetados("Usuario con problemas penales");
        this.conListaVetados("Sin motivo");
        return this.build();
    }

    private VetadosBuilder condetalleVetados(String detalleVetados) {
        this.detalleVetados = detalleVetados;
        return this;
    }
    private VetadosBuilder condocumentoVetados(String documentoVetados) {
        this.documentoVetados = documentoVetados;
        return this;
    }

    private VetadosBuilder conListaVetados(String listaVetados) {
        this.listaVetados = listaVetados;
        return this;
    }
}