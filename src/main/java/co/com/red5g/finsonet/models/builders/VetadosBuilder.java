package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Vetados;

public class VetadosBuilder {
    private String documentoVetados;
    private String detalleVetados;

    public VetadosBuilder() {
        this.documentoVetados = "";
        this.detalleVetados = "";
    }

    public static VetadosBuilder a() {
        return new VetadosBuilder();
    }

    public Vetados build(){
        return  new Vetados(this);
    }

    public String getDocumentoVetados() { return documentoVetados;    }

    public String getDetalleVetados() { return detalleVetados;    }

    public Vetados unCliente() {
        this.condocumentoVetados("10040048");
        this.condetalleVetados("Usuario con problemas penales");
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

}
