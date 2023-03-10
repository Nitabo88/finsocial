package co.com.red5g.finsonet.tasks.factories;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.AccionCdas;
import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.models.EquipoSatisfaccion;
import co.com.red5g.finsonet.models.FormularioSolicitud;
import co.com.red5g.finsonet.models.Incorporacion;
import co.com.red5g.finsonet.models.Tesoreria;
import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.AprobacionCreditoHuyPendiente;
import co.com.red5g.finsonet.tasks.AprobacionCreditoPendiente;
import co.com.red5g.finsonet.tasks.AprobacionDeCreditoFinsoamigo;
import co.com.red5g.finsonet.tasks.AprobacionDeCreditoLibranza;
import co.com.red5g.finsonet.tasks.AprobacionFormalizacion;
import co.com.red5g.finsonet.tasks.AprobacionFormalizacionCrediHuy;
import co.com.red5g.finsonet.tasks.AprobacionIncorporacion;
import co.com.red5g.finsonet.tasks.AprobacionIncorporacionCreditoHuy;
import co.com.red5g.finsonet.tasks.AprobacionTesoreriaCrediHuy;
import co.com.red5g.finsonet.tasks.AprobacionTesoreriaFinsoamigo;
import co.com.red5g.finsonet.tasks.AprobacionTesoreriaLibranza;
import co.com.red5g.finsonet.tasks.Cdas;
import co.com.red5g.finsonet.tasks.CrearSolicitudNueva;
import co.com.red5g.finsonet.tasks.FormularioSolicitudCredito;
import co.com.red5g.finsonet.tasks.IncorporacionPendiente;
import co.com.red5g.finsonet.tasks.InformacionAprobacionHuy;
import co.com.red5g.finsonet.tasks.InformacionChequeoDocumentoHuy;
import co.com.red5g.finsonet.tasks.InformacionChequeoDocumentoLibranza;
import co.com.red5g.finsonet.tasks.InformacionChequeoDocumentoLibranzaDigital;
import co.com.red5g.finsonet.tasks.InformacionConfirmacion;
import co.com.red5g.finsonet.tasks.InformacionIncompletaChequeoDocumentos;
import co.com.red5g.finsonet.tasks.NegacionChequeoDocumentoCrediHuy;
import co.com.red5g.finsonet.tasks.NegacionChequeoDocumentoLibranza;
import co.com.red5g.finsonet.tasks.PendienteConfirmacion;
import co.com.red5g.finsonet.tasks.PendienteCrediHuy;
import co.com.red5g.finsonet.tasks.PendienteFormalizacion;
import co.com.red5g.finsonet.tasks.PendienteTesoreria;
import co.com.red5g.finsonet.tasks.RealizarVeto;
import co.com.red5g.finsonet.tasks.RegresarAprobacionCredito;
import co.com.red5g.finsonet.tasks.RegresarConfirmacion;
import co.com.red5g.finsonet.tasks.RegresarIncoporacion;
import co.com.red5g.finsonet.tasks.RegresoFormalizacion;
import co.com.red5g.finsonet.tasks.RegresoTesoreria;
import co.com.red5g.finsonet.tasks.SolicitudCreditoBack;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso1;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso2;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso3;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso4;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso5;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso6;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso7;
import co.com.red5g.finsonet.tasks.SolicitudCreditoPaso8;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public final class Diligencia {

  private Diligencia() {}

  public static Performable laInformacionDeChequeoDeDocumentosLibranza(
      ChequeoDocumento chequeoDocumento) {
    return Tasks.instrumented(InformacionChequeoDocumentoLibranza.class, chequeoDocumento);
  }

  public static Performable laSolicitudDeCredito() {
    return instrumented(FormularioSolicitudCredito.class);
  }

  public static Performable laInformacionIncompletaDeChequeoDeDocumentos(
      ChequeoDocumento chequeoDocumento) {
    return Tasks.instrumented(InformacionIncompletaChequeoDocumentos.class, chequeoDocumento);
  }

  public static Performable laInformacionDeConfirmacion() {
    return instrumented(InformacionConfirmacion.class);
  }

  public static Performable laInformacionDeRegresoDeConfirmacion(Confirmacion confirmacion) {
    return Tasks.instrumented(RegresarConfirmacion.class, confirmacion);
  }

  public static Performable laInformacionDeRegresoDeAprobacionDeCredito(
      AprobacionCredito aprobacionCredito) {
    return instrumented(RegresarAprobacionCredito.class, aprobacionCredito);
  }

  public static Performable laInformacionDeCreditoPendiente(AprobacionCredito motivoPendiente) {
    return instrumented(AprobacionCreditoPendiente.class, motivoPendiente);
  }

  public static Performable laInformacionDeAprobacionDeCredito() {
    return instrumented(AprobacionDeCreditoLibranza.class);
  }

  public static Performable laInformacionDeRegresoDeIncorporacion(
      final Incorporacion motivoRegreso) {
    return instrumented(RegresarIncoporacion.class, motivoRegreso);
  }

  public static Performable laInformacionDeCreditoPendienteEnIncorporacion(
      final Incorporacion motivoPendiente) {
    return instrumented(IncorporacionPendiente.class, motivoPendiente);
  }

  public static Performable unaNuevaSolicitud(EquipoSatisfaccion equipoSatisfaccion) {
    return instrumented(CrearSolicitudNueva.class, equipoSatisfaccion);
  }

  public static Performable elVetoInterno(final Vetados vetados) {
    return instrumented(RealizarVeto.class, vetados);
  }

  public static Performable laAprobacionDelCreditoEnIncorporacion(final Incorporacion aprobacion) {
    return instrumented(AprobacionIncorporacion.class, aprobacion);
  }

  public static Performable laInformacionDeRegresoDeFormalizacion(
      final co.com.red5g.finsonet.models.Formalizacion motivoRegreso) {
    return instrumented(RegresoFormalizacion.class, motivoRegreso);
  }

  public static Performable laInformacionDePendienteConfirmacion(
      final Confirmacion motivoPendiente) {
    return instrumented(PendienteConfirmacion.class, motivoPendiente);
  }

  public static Performable laInformacionFormalizacionPendiente(
      co.com.red5g.finsonet.models.Formalizacion motivoPendiente) {
    return instrumented(PendienteFormalizacion.class, motivoPendiente);
  }

  public static Performable laAprobacionDelCreditoEnFormalizacion() {
    return instrumented(AprobacionFormalizacion.class);
  }

  public static Performable laInformacionDeRegresoDeTesoreria(Tesoreria motivoRegreso) {
    return instrumented(RegresoTesoreria.class, motivoRegreso);
  }

  public static Performable laInformacionTesoreriaPendiente(Tesoreria motivoPendiente) {
    return instrumented(PendienteTesoreria.class, motivoPendiente);
  }

  public static Performable laInformacionDeLosDocumentos(AccionCdas accionCdas) {
    return instrumented(Cdas.class, accionCdas);
  }

  public static Performable laInformacionDeAprobacionDeCreditoFinsoamigo(String perfilRiesgo) {
    return instrumented(AprobacionDeCreditoFinsoamigo.class, perfilRiesgo);
  }

  public static Performable laInformacionDeChequeoDeDocumentosHuy(
      ChequeoDocumento chequeoDocumento) {
    return instrumented(InformacionChequeoDocumentoHuy.class, chequeoDocumento);
  }

  public static Performable laAprobacionDelCreditonEnIncorporacionHuy() {
    return instrumented(InformacionAprobacionHuy.class);
  }

  public static Performable laInformacionDeCreditoHuyPendiente(AprobacionCredito motivoPendiente) {
    return instrumented(AprobacionCreditoHuyPendiente.class, motivoPendiente);
  }

  public static Performable laAprobacionDelCreditoEnIncorporacionHuy(Incorporacion aprobacion) {
    return instrumented(AprobacionIncorporacionCreditoHuy.class, aprobacion);
  }

  public static Performable laInformacionDeAprobacionDeTesoreria() {
    return instrumented(AprobacionTesoreriaLibranza.class);
  }

  public static Performable elCreditoHuyComoPendiente(ChequeoDocumento motivo) {
    return instrumented(PendienteCrediHuy.class, motivo);
  }

  public static Performable laNegaciondelCreditoHuy(ChequeoDocumento motivoNegacion) {
    return instrumented(NegacionChequeoDocumentoCrediHuy.class, motivoNegacion);
  }

  public static Performable laAprobacionDeTesoreriaFinsoamigo() {
    return instrumented(AprobacionTesoreriaFinsoamigo.class);
  }

  public static Performable laNegaciondelCreditodeLibranza(ChequeoDocumento motivoNegacionCreditoLibranza) {
    return instrumented(NegacionChequeoDocumentoLibranza.class, motivoNegacionCreditoLibranza);
  }

  public static Performable laAprobacionDelCreditoEnFormalizacionCrediHuy() {
    return instrumented(AprobacionFormalizacionCrediHuy.class);
  }

  public static Performable laInformacionDeAprobacionDeTesoreriaCrediHuy() {
    return instrumented(AprobacionTesoreriaCrediHuy.class);
  }

  public static Performable laSolicitudDeCreditoBackEnd(Credenciales credenciales, FormularioSolicitud formularioSolicitud, String cedula) {
    return instrumented(SolicitudCreditoBack.class, credenciales, formularioSolicitud, cedula);
  }

  public static Performable primerPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud) {
    return instrumented(SolicitudCreditoPaso1.class, cookie, formularioSolicitud);
  }

  public static Performable segundoPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud, String cedula) {
    return instrumented(SolicitudCreditoPaso2.class, cookie, formularioSolicitud, cedula);
  }

  public static Performable tercerPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud) {
    return instrumented(SolicitudCreditoPaso3.class, cookie, formularioSolicitud);
  }

  public static Performable cuartoPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud) {
    return instrumented(SolicitudCreditoPaso4.class, cookie, formularioSolicitud);
  }

  public static Performable quintoPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud) {
    return instrumented(SolicitudCreditoPaso5.class, cookie, formularioSolicitud);
  }

  public static Performable sextoPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud) {
    return instrumented(SolicitudCreditoPaso6.class, cookie, formularioSolicitud);
  }

  public static Performable septimoPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud) {
    return instrumented(SolicitudCreditoPaso7.class, cookie, formularioSolicitud);
  }

  public static Performable octavoPasoFormulario(String cookie, FormularioSolicitud formularioSolicitud, String cedula) {
    return instrumented(SolicitudCreditoPaso8.class, cookie, formularioSolicitud, cedula);
  }

  public static Performable laInformacionDeChequeoDeDocumentos(ChequeoDocumento chequeoDocumento, String id, Target lista) {
    return instrumented(
        InformacionChequeoDocumentoLibranzaDigital.class, chequeoDocumento, id, lista);
  }
}
