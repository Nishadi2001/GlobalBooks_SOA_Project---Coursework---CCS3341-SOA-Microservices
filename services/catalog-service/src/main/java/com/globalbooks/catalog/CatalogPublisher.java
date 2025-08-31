package com.globalbooks.catalog;

import jakarta.xml.ws.Endpoint;

public class CatalogPublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8888/ws/catalog";
        Endpoint.publish(url, new CatalogServiceImpl());
        System.out.println("✅ Service published at: " + url + "?wsdl");
    }
}
