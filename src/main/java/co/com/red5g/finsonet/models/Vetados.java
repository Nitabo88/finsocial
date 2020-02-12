package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.VetadosBuilder;

public class Vetados {
    private String documentoVetados;
    private String detalleVetados;
    private String listaVetados;


    public Vetados(VetadosBuilder vetadosBuilder) {
        this.documentoVetados = vetadosBuilder.getDocumentoVetados();
        this.detalleVetados = vetadosBuilder.getDetalleVetados();
        this.listaVetados = listaVetados;
    }

    public String getListaVetados() {
        return listaVetados;
    }

    public String getDocumentoVetados() {
        return documentoVetados;
    }

    public String getDetalleVetados() {
        return detalleVetados;
    }
}