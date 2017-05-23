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


package com.google.api.ads.adwords.jaxws.v201607.rm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201607.cm.Selector;


/**
 * 
 *       Service which is used to manage user lists.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdwordsUserListServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201607.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201607.rm.ObjectFactory.class
})
public interface AdwordsUserListServiceInterface {


    /**
     * 
     *         Returns the list of user lists that meet the selector criteria.
     *         
     *         @param serviceSelector the selector specifying the {@link UserList}s to return.
     *         @return a list of UserList entities which meet the selector criteria.
     *         @throws ApiException if problems occurred while fetching UserList information.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.rm.UserListPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacegetResponse")
    public UserListPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
        Selector serviceSelector)
        throws ApiException
    ;

    /**
     * 
     *         Applies a list of mutate operations (i.e. add, set):
     *         
     *         Add - creates a set of user lists
     *         Set - updates a set of user lists
     *         Remove - not supported
     *         
     *         @param operations the operations to apply
     *         @return a list of UserList objects
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.rm.UserListReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacemutateResponse")
    public UserListReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
        List<UserListOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Mutate members of user lists by either adding or removing their lists of members.
     *         The following {@link Operator}s are supported: ADD and REMOVE. The SET operator
     *         is not supported.
     *         
     *         <p>Note that operations cannot have same user list id but different operators.
     *         
     *         @param operations the mutate members operations to apply
     *         @return a list of UserList objects
     *         @throws ApiException when there are one or more errors with the request
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.rm.MutateMembersReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
    @RequestWrapper(localName = "mutateMembers", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacemutateMembers")
    @ResponseWrapper(localName = "mutateMembersResponse", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacemutateMembersResponse")
    public MutateMembersReturnValue mutateMembers(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
        List<MutateMembersOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Returns the list of user lists that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @return A list of UserList
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201607.rm.UserListPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607", className = "com.google.api.ads.adwords.jaxws.v201607.rm.AdwordsUserListServiceInterfacequeryResponse")
    public UserListPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/rm/v201607")
        String query)
        throws ApiException
    ;

}
