package com.test.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.test.ws package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetMyNameResponse_QNAME = new QName(
			"http://webservice.test.com/", "getMyNameResponse");
	private final static QName _GetMyName_QNAME = new QName(
			"http://webservice.test.com/", "getMyName");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.test.ws
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetMyNameResponse }
	 * 
	 */
	public GetMyNameResponse createGetMyNameResponse() {
		return new GetMyNameResponse();
	}

	/**
	 * Create an instance of {@link GetMyName }
	 * 
	 */
	public GetMyName createGetMyName() {
		return new GetMyName();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMyNameResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservice.test.com/", name = "getMyNameResponse")
	public JAXBElement<GetMyNameResponse> createGetMyNameResponse(
			GetMyNameResponse value) {
		return new JAXBElement<GetMyNameResponse>(_GetMyNameResponse_QNAME,
				GetMyNameResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetMyName }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservice.test.com/", name = "getMyName")
	public JAXBElement<GetMyName> createGetMyName(GetMyName value) {
		return new JAXBElement<GetMyName>(_GetMyName_QNAME, GetMyName.class,
				null, value);
	}

}
