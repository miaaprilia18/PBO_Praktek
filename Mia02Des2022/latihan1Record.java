/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mia02Des2022;

/**
 *
 * @author user
 */
public class latihan1Record {
    private String name; 
    private String address; 
    private String email; 
    private String no; 
 
    
    //area penulisan kode selanjutnya
    
 //name
        public latihan1Record() {
        
    }
    
    public latihan1Record(String temp){
        this.name=temp;
    } 
    
    
    public latihan1Record(String name,String address,String email,String no){
        this.name=name;
        this.address=address;
        this.email=email;
        this.no=no;
    }
    
    public String getName() {
        return name;
    }
    
    //address
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    
   
    
    //address
    public String getNo() {
        return no;
    }
   
    
   

 
    
        
}
