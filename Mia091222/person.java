/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia091222;

/**
 *
 * @author user
 */
public class person {
    
        protected String name;
    protected String address;
    /**
    * Default constructor
    */
    public person(){
    System.out.println("Inside person:Constructor");
    name = "";
    address = "";
    }
    /**
    * Constructor dengan dua parameter
    */
    public person( String name, String address ){
    this.name = name;
    this.address = address;
    }
    /**
    * Method accessor
    */
    public String getName(){
     System.out.println("Person: getName");
    return name;
    }
    public String getAddress(){
    return address;
    }
    public void setName( String name ){
    this.name = name;
    }
    public void setAddress( String add ){
    this.address = add;
    }

}
