package TypeArray;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author MouAz HE
 */
public class name_type implements Serializable{
    
    public String name;
    public String type;
    
    public name_type(String name , String type)
    {
        this.name = name;
        this.type = type;
    }
}
