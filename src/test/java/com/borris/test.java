package com.borris;

import com.alibaba.fastjson.JSONObject;
import com.netflix.discovery.shared.Applications;
import com.netflix.discovery.shared.transport.EurekaHttpClient;
import com.netflix.discovery.shared.transport.EurekaHttpResponse;
import com.netflix.discovery.shared.transport.decorator.EurekaHttpClientDecorator;
import com.netflix.discovery.shared.transport.jersey.EurekaJerseyClient;
import com.netflix.discovery.shared.transport.jersey.EurekaJerseyClientImpl;
import com.netflix.eureka.transport.JerseyReplicationClient;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.client.apache4.ApacheHttpClient4;

import javax.ws.rs.core.MediaType;

public class test {
    public static void main(String[] args) {
//        EurekaHttpClientDecorator.RequestExecutor<Applications> requestExecutor = new EurekaHttpClientDecorator.RequestExecutor<Applications>() {
//            @Override
//            public EurekaHttpResponse<Applications> execute(EurekaHttpClient delegate) {
//                return delegate.getApplications();
//            }
//
//            @Override
//            public EurekaHttpClientDecorator.RequestType getRequestType() {
//                return EurekaHttpClientDecorator.RequestType.GetApplications;
//            }
//        };
//        EurekaHttpClient currentHttpClient = clientFactory.newClient(currentEndpoint);;

        String s = "{\"clientHandler\":{\"cookieStore\":{\"cookies\":[{\"domain\":\"localhost\",\"name\":\"JSESSIONID\",\"path\":\"/\",\"persistent\":false,\"secure\":false,\"value\":\"86A23D6B6683EFA22A305DA24C959A26\",\"version\":0}]},\"httpClient\":{\"authSchemes\":{\"schemeNames\":[\"negotiate\",\"ntlm\",\"digest\",\"kerberos\",\"basic\"]},\"connectionKeepAliveStrategy\":{},\"connectionManager\":{\"connectionsInPool\":1,\"defaultMaxPerRoute\":50,\"maxTotal\":200,\"schemeRegistry\":{\"schemeNames\":[\"http\",\"https\"]}},\"connectionReuseStrategy\":{},\"cookieSpecs\":{\"specNames\":[\"default\",\"netscape\",\"best-match\",\"rfc2109\",\"ignorecookies\",\"rfc2965\",\"compatibility\"]},\"cookieStore\":{\"$ref\":\"$.clientHandler.cookieStore\"},\"credentialsProvider\":{},\"httpRequestRetryHandler\":{\"requestSentRetryEnabled\":false,\"retryCount\":3},\"params\":{\"names\":[\"http.protocol.content-charset\",\"http.socket.buffer-size\",\"http.protocol.handle-redirects\",\"com.sun.jersey.client.property.followRedirects\",\"com.sun.jersey.impl.client.httpclient.connectionManager\",\"http.protocol.version\",\"http.socket.timeout\",\"http.connection.timeout\",\"http.tcp.nodelay\",\"http.useragent\"]},\"proxyAuthenticationHandler\":{},\"proxyAuthenticationStrategy\":{},\"redirectHandler\":{},\"redirectStrategy\":{},\"requestExecutor\":{},\"requestInterceptorCount\":10,\"responseInterceptorCount\":1,\"routePlanner\":{},\"targetAuthenticationHandler\":{},\"targetAuthenticationStrategy\":{},\"userTokenHandler\":{}},\"messageBodyWorkers\":{}},\"executorService\":{\"activeCount\":0,\"completedTaskCount\":0,\"corePoolSize\":0,\"largestPoolSize\":0,\"maximumPoolSize\":2147483647,\"poolSize\":0,\"queue\":[],\"rejectedExecutionHandler\":{},\"shutdown\":false,\"taskCount\":0,\"terminated\":false,\"terminating\":false,\"threadFactory\":{}},\"headHandler\":{\"next\":{\"next\":{\"$ref\":\"$.clientHandler\"}}},\"messageBodyWorkers\":{\"$ref\":\"$.clientHandler.messageBodyWorkers\"},\"properties\":{\"http.protocol.handle-redirects\":false,\"com.sun.jersey.client.property.followRedirects\":false,\"com.sun.jersey.impl.client.httpclient.connectionManager\":{\"$ref\":\"$.clientHandler.httpClient.connectionManager\"},\"http.useragent\":\"Java-EurekaClient/v1.9.8\"},\"providers\":{}}";
        ApacheHttpClient4 jerseyClient = (ApacheHttpClient4) JSONObject.parse(s);
//        WebResource.Builder resourceBuilder = jerseyClient.resource("http://localhost:7001").getRequestBuilder();
//        ClientResponse response = resourceBuilder
//                .header("Accept-Encoding", "gzip")
//                .type(MediaType.APPLICATION_JSON_TYPE)
//                .accept(MediaType.APPLICATION_JSON)
//                .get(ClientResponse.class);
//        System.out.println(response);
    }
}
