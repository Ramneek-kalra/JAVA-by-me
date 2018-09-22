/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PalindomEx {
    public boolean isPalindom(String s){
        StringBuilder str =new StringBuilder(s);
        boolean status=false;
        if(str.reverse().equals(s)){
            status = true;
        }
    }
}
