/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setapi;

import java.util.List;
import java.util.Set;

/**
 *
 * @author Mart_
 */
public interface SetInterface {
    
    public boolean isMember(int m, Set<Integer> set);
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2);
    public Set<Integer> intersection (Set<Integer> set1, Set<Integer> set2);
    public Set<Integer> difference (Set<Integer> set1, Set<Integer> set2);
    public Set<Integer> complement (List<Integer> set);
     
   
}
