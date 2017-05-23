// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.dfp.jaxws.v201608;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides operations for creating, updating and retrieving {@link Company} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CompanyServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CompanyServiceInterface {


    /**
     * 
     *         Creates new {@link Company} objects.
     *         
     *         @param companies the companies to create
     *         @return the created companies with their IDs filled in
     *       
     * 
     * @param companies
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201608.Company>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "createCompanies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.CompanyServiceInterfacecreateCompanies")
    @ResponseWrapper(localName = "createCompaniesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.CompanyServiceInterfacecreateCompaniesResponse")
    public List<Company> createCompanies(
        @WebParam(name = "companies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        List<Company> companies)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CompanyPage} of {@link Company} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Company#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Company#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Company#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Company#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of companies
     *         @return the companies that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201608.CompanyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "getCompaniesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.CompanyServiceInterfacegetCompaniesByStatement")
    @ResponseWrapper(localName = "getCompaniesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.CompanyServiceInterfacegetCompaniesByStatementResponse")
    public CompanyPage getCompaniesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Company} objects.
     *         
     *         @param companies the companies to update
     *         @return the updated companies
     *       
     * 
     * @param companies
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201608.Company>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "updateCompanies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.CompanyServiceInterfaceupdateCompanies")
    @ResponseWrapper(localName = "updateCompaniesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.CompanyServiceInterfaceupdateCompaniesResponse")
    public List<Company> updateCompanies(
        @WebParam(name = "companies", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        List<Company> companies)
        throws ApiException_Exception
    ;

}
