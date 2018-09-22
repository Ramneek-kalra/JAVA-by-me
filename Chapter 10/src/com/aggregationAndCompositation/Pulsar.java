/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aggregationAndCompositation;

/**
 *
 * @author User
 */
public class Pulsar extends Bike{
    public void pulsarStartDemo(){
       Engine PulsarEngine=new Engine();
       PulsarEngine.stop();
       PulsarEngine.start();
    };
}
