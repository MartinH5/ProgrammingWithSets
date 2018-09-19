/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mart_
 */
public class SetAPI implements SetInterface {

    private int infiP = 999;
    private int infiN = -999;

    @Override
    public boolean isMember(int m, Set<Integer> set) {
        return set.contains(m);
    }

    @Override
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> union = new HashSet<>();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }

    @Override
    public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersect = new HashSet<>();
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                intersect.add(integer);
            }
        }
        return intersect;
    }

    @Override
    public Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> diff = new HashSet<>();
        for (Integer integer : set1) {
            if (!set2.contains(integer)) {
                diff.add(integer);
            }
        }
        for (Integer integer : set2) {
            if (!set1.contains(integer)) {
                diff.add(integer);
            }
        }
        return diff;
    }

    @Override
    public Set<Integer> complement(List<Integer> set) {
        Set<Integer> compl = new HashSet<>();
        List sortedList = new ArrayList(set);
        Collections.sort(sortedList);
        int lowest = set.get(0);
        int highest = set.get(set.size() - 1);
        compl.add(lowest - 1);
        compl.add(highest + 1);
        for (int i = lowest; i < highest; i++) {
            if (!set.contains(i)) {
                compl.add(i);
            }
        }
        compl.add(infiN);
        compl.add(infiP);

        return compl;
    }

}
