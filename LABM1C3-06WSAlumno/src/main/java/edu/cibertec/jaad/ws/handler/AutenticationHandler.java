package edu.cibertec.jaad.ws.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.NodeList;

public class AutenticationHandler implements SOAPHandler<SOAPMessageContext>{
	private static final Logger LOG = LoggerFactory.getLogger(AutenticationHandler.class);
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest = !(Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		String usuario = "";
		String clave = "";
		try{
			if(isRequest){
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				
				if(header == null || !header.hasChildNodes()){
					SOAPFault fault = envelope.getBody().addFault();
					fault.setFaultString("El mensaje no tiene header");
					throw new SOAPFaultException(fault);
					//return false;
				}
				
				NodeList nodes = header.getElementsByTagNameNS("http://security/", "*");
				for(int i = 0; i < nodes.getLength(); i++){
					if(nodes.item(i).getLocalName().equals("user")){
						usuario = nodes.item(i).getTextContent();
					}
					if(nodes.item(i).getLocalName().equals("clave")){
						clave = nodes.item(i).getTextContent();
					}
				}
				if(usuario.equals("duke") && clave.equals("java")){
					LOG.info("Autenticacion exitosa");
				}else{
					SOAPFault fault = envelope.getBody().addFault();
					fault.setFaultString("Credenciales invalidas");
					throw new SOAPFaultException(fault);
				}
				
			}
		}catch(SOAPFaultException ex){
			throw ex;
		}catch(Exception ex){
			LOG.info("Error al procesar la autenticacion", ex);
			
		}
		
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		LOG.info("On headers");
		return null;
	}
	
	
}
