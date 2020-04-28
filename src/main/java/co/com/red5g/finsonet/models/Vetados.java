package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.VetadosBuilder;

public class Vetados {
    private final String documentoVetados;
    private final String detalleVetados;
    private final String listaVetados;

    public Vetados(final VetadosBuilder vetadosBuilder) {
      documentoVetados = vetadosBuilder.getDocumentoVetados();
      detalleVetados = vetadosBuilder.getDetalleVetados();
      listaVetados = vetadosBuilder.getListaVetados();
    }

    public String getListaVetados() {
        return this.listaVetados;
    }

    public String getDocumentoVetados() {
        return this.documentoVetados;
    }

    public String getDetalleVetados() {
        return this.detalleVetados;
    }
}