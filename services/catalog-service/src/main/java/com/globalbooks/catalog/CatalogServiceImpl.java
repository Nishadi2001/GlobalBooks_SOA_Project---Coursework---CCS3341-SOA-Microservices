package com.globalbooks.catalog;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.math.BigDecimal;

@WebService(serviceName="CatalogService", portName="CatalogPort",
            targetNamespace="http://globalbooks.example.com/catalog")
public class CatalogServiceImpl {

    @WebMethod
    public String getBookByIsbn(String isbn) {
        return "Book Info → ISBN: " + isbn + ", Title: Sample Book, Price: " + new BigDecimal("29.99");
    }
}
