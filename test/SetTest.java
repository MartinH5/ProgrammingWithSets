/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import setapi.SetAPI;

/**
 *
 * @author Mart_
 */
public class SetTest {

    private static SetAPI setTest = new SetAPI();
    private static Set<Integer> testSet1 = new HashSet<>();
    private static Set<Integer> testSet2 = new HashSet<>();
    private static ArrayList<Integer> testSet3 = new ArrayList<>();

    private static final Logger log = Logger.getLogger(SetTest.class.getName());

    @BeforeClass
    public static void init() {
        log.info("Starting Test ");

        testSet1.add(1);
        testSet1.add(2);
        testSet1.add(3);
        testSet1.add(4);
        testSet2.add(5);

        testSet2.add(1);
        testSet2.add(3);
        testSet2.add(5);
        testSet2.add(7);
        testSet2.add(9);

        testSet3.add(1);
        testSet3.add(5);
        testSet3.add(5);
        testSet3.add(10);
    }

    @Test
    public void testIsMemeber() {
        assertTrue(setTest.isMember(3, testSet1));
        assertFalse(setTest.isMember(420, testSet1));
    }

    @Test
    public void testUnion() {
        Set<Integer> unionTest = setTest.union(testSet1, testSet2);
        int[] expected = {1, 3, 5};
        for (int i : expected) {
            assertTrue(unionTest.contains(i));
        }
    }

    @Test
    public void testDifference() {
        Set<Integer> diffTest = setTest.difference(testSet1, testSet2);
        int[] expected = {7, 9};
        for (int i : expected) {
            assertTrue(diffTest.contains(i));
        }
    }

    @Test
    public void testComplement() {
        Set<Integer> compTest = setTest.complement(testSet3);
        int[] expected = {-999, 0,2,3,4,6,8,9, 11, 999};
        for (int i : expected) {
            assertTrue(compTest.contains(i));
        }
    }
}
