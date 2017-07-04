package com.formulasearchengine.http;

import com.google.common.collect.Multiset;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Moritz on 04.07.2017.
 */
final public class testTest {
    @Test
    public void myTest() throws Exception {
        final Multiset<String> identifiers = test.getIdentifiers("a+b+c");
        assertTrue(identifiers.contains("a"));
        assertTrue(identifiers.contains("c"));
        assertTrue(identifiers.contains("b"));
    }
}