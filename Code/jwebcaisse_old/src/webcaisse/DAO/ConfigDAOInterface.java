/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webcaisse.DAO;

import webcaisse.model.Configuration;

/**
 *
 * @author patrick
 */
public interface ConfigDAOInterface {
    
    static Configuration getConfiguration(){
        Configuration c = new Configuration();
        // code à implémenter 
        return c;
    }
    static void initXMLFile(String path) {
        // code à implémenter 
    }
    static void saveXMLFile(Configuration c) {
       // code à implémenter  
    };
}
