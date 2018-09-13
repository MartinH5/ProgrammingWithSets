/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setapi;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mart_
 */
public class SetMain {
    
    private static SetAPI setter = new SetAPI();
    
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Is 3 in the set? " + setter.isMember(3, numbers));
        System.out.println("Is 4 in the set? " + setter.isMember(4, numbers));
    }
}
