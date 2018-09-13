/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setapi;

import java.util.Set;

/**
 *
 * @author Mart_
 */
public class SetAPI implements SetInterface{

    @Override
    public boolean isMember(int m, Set<Integer> set) {
        return set.contains(m);
    }

    @Override
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<Integer> complement(Set<Integer> set) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
