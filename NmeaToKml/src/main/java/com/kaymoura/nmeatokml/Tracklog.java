/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaymoura.nmeatokml;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author devsys-b
 */
public class Tracklog {
    String nome;
    String descricao;
    List<Coordenada> Listacoordenadas = new ArrayList();;
    List<Waypoint> Wpts = new ArrayList();
    
    public Tracklog(String coord){ 
        //A cada 1om listar a coordenada 
        for(int i=0; i<=coord.length(); i++){
            
        }
    }
}
