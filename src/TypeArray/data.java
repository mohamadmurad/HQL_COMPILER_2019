package TypeArray;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author MouAz HE
 */
public class data implements Serializable {
    String name_typ;
    ArrayList<name_type> typ = new ArrayList<name_type>();
    
    public data(String name_typ , ArrayList<name_type> typ)
    {
       this.name_typ = name_typ;
       this.typ = typ;
    }
    
}
