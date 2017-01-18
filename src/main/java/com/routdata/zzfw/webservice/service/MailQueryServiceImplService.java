package com.routdata.zzfw.webservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-31T13:56:12.022+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "MailQueryServiceImplService", 
                  wsdlLocation = "http://219.134.187.38:7010/sdzzfwservice/webservice/mailQueryService?wsdl",
                  targetNamespace = "http://service.webservice.zzfw.routdata.com/") 
public class MailQueryServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.webservice.zzfw.routdata.com/", "MailQueryServiceImplService");
    public final static QName MailQueryServiceImplPort = new QName("http://service.webservice.zzfw.routdata.com/", "MailQueryServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://219.134.187.38:7010/sdzzfwservice/webservice/mailQueryService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MailQueryServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://219.134.187.38:7010/sdzzfwservice/webservice/mailQueryService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MailQueryServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MailQueryServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MailQueryServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IMailQueryService
     */
    @WebEndpoint(name = "MailQueryServiceImplPort")
    public IMailQueryService getMailQueryServiceImplPort() {
        return super.getPort(MailQueryServiceImplPort, IMailQueryService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMailQueryService
     */
    @WebEndpoint(name = "MailQueryServiceImplPort")
    public IMailQueryService getMailQueryServiceImplPort(WebServiceFeature... features) {
        return super.getPort(MailQueryServiceImplPort, IMailQueryService.class, features);
    }

}