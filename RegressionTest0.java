import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.lang.Object[] objArray9 = objCollection5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objSet4.addAll((java.util.Collection<java.lang.Object>) objCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection3 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = objCollection0.retainAll((java.util.Collection<java.lang.Object>) objCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray7 = objCollection4.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet8 = objCollection4.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objCollection0.remove((java.lang.Object) objCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objEntrySet8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = objCollection0.remove((java.lang.Object) objCollection1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = objCollection9.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection9.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objCollection4.removeAll((java.util.Collection<java.lang.Object>) objCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objCollection0.remove((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (-1L), objCollection8, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList40 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList40, objArray39);
        boolean boolean42 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objList40);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection51 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int53 = objCollection51.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray54 = objCollection51.toArray();
        java.util.Set<java.lang.Object> objSet55 = objCollection51.uniqueSet();
        boolean boolean56 = objCollection51.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objSet55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection6 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int8 = objCollection6.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray9 = objCollection6.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objCollection0.addAll((java.util.Collection<java.lang.Object>) objCollection6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Object[] objArray11 = objCollection0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = objCollection0.remove((java.lang.Object) 100L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objCollection0.remove((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = objCollection9.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objCollection4.addAll((java.util.Collection<java.lang.Object>) objCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objCollection4.add((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1L), objCollection9, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList41, objArray40);
        boolean boolean43 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objList41);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet48 = objCollection44.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection49 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int51 = objCollection49.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray52 = objCollection49.toArray();
        java.util.Set<java.lang.Object> objSet53 = objCollection49.uniqueSet();
        boolean boolean54 = objCollection44.containsAll((java.util.Collection<java.lang.Object>) objCollection49);
        boolean boolean55 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objCollection49);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = objCollection0.remove((java.lang.Object) boolean55, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objEntrySet48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objSet53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        int int51 = objCollection44.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection52 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int54 = objCollection52.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet55 = objCollection52.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = objCollection44.addAll((java.util.Collection<java.lang.Object>) objCollection52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objSet55);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet5 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertNotNull(objEntrySet5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.List[] listArray44 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray45 = (java.util.List<java.lang.Object>[]) listArray44;
        java.util.List<java.lang.Object>[] objListArray46 = objCollection39.toArray(objListArray45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = objCollection0.remove((java.lang.Object) objCollection39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(listArray44);
        org.junit.Assert.assertNotNull(objListArray45);
        org.junit.Assert.assertNotNull(objListArray46);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList2 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList2, objArray1);
        java.util.stream.Stream<java.lang.Object> objStream4 = objList2.parallelStream();
        java.lang.Class<?> wildcardClass5 = objList2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objStream4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.List[] listArray5 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray6 = (java.util.List<java.lang.Object>[]) listArray5;
        java.util.List<java.lang.Object>[] objListArray7 = objCollection0.toArray(objListArray6);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection8.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        int int19 = objCollection8.size();
        boolean boolean20 = objCollection0.contains((java.lang.Object) objCollection8);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = objCollection8.add((java.lang.Object) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(listArray5);
        org.junit.Assert.assertNotNull(objListArray6);
        org.junit.Assert.assertNotNull(objListArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray15 = objCollection12.toArray();
        java.util.List[] listArray17 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray18 = (java.util.List<java.lang.Object>[]) listArray17;
        java.util.List<java.lang.Object>[] objListArray19 = objCollection12.toArray(objListArray18);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection20 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int22 = objCollection20.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray23 = objCollection20.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet24 = objCollection20.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection25 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int27 = objCollection25.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = objCollection25.toArray();
        java.util.Set<java.lang.Object> objSet29 = objCollection25.uniqueSet();
        boolean boolean30 = objCollection20.containsAll((java.util.Collection<java.lang.Object>) objCollection25);
        int int31 = objCollection20.size();
        boolean boolean32 = objCollection12.contains((java.lang.Object) objCollection20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = objCollection5.addAll((java.util.Collection<java.lang.Object>) objCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(listArray17);
        org.junit.Assert.assertNotNull(objListArray18);
        org.junit.Assert.assertNotNull(objListArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objEntrySet24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean11 = objCollection5.isEmpty();
        java.util.AbstractList<java.lang.Object>[] objListArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<java.lang.Object>[] objListArray13 = objCollection5.toArray(objListArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet7 = objCollection4.entrySet();
        boolean boolean8 = objCollection4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objEntrySet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        int int51 = objCollection44.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection52 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int54 = objCollection52.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray55 = objCollection52.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet56 = objCollection52.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection57 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int59 = objCollection57.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray60 = objCollection57.toArray();
        java.util.Set<java.lang.Object> objSet61 = objCollection57.uniqueSet();
        boolean boolean62 = objCollection52.containsAll((java.util.Collection<java.lang.Object>) objCollection57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = objCollection44.retainAll((java.util.Collection<java.lang.Object>) objCollection52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objEntrySet56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(objSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        boolean boolean17 = objCollection10.contains((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        boolean boolean4 = objCollection0.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = objCollection0.remove((java.lang.Object) objArray8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = objCollection0.setCount(obj10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet7 = objCollection4.entrySet();
        boolean boolean8 = objCollection4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objCollection0.add((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objEntrySet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        int int51 = objCollection44.size();
        java.lang.Object[] objArray52 = objCollection44.toArray();
        java.lang.Class<?> wildcardClass53 = objArray52.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        int int11 = objCollection0.getCount((java.lang.Object) objCollection7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objCollection0.add((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean11 = objCollection5.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray15 = objCollection12.toArray();
        java.util.Set<java.lang.Object> objSet16 = objCollection12.uniqueSet();
        boolean boolean17 = objCollection12.isEmpty();
        java.lang.String str18 = objCollection12.toString();
        boolean boolean20 = objCollection12.contains((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = objCollection5.add((java.lang.Object) boolean20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Collection<java.lang.Object> objCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objCollection0.retainAll(objCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        int int13 = objCollection5.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet17 = objCollection14.uniqueSet();
        java.lang.Object[] objArray18 = objCollection14.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = objCollection19.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet23 = objCollection19.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection24 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int26 = objCollection24.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray27 = objCollection24.toArray();
        java.util.Set<java.lang.Object> objSet28 = objCollection24.uniqueSet();
        boolean boolean29 = objCollection19.containsAll((java.util.Collection<java.lang.Object>) objCollection24);
        int int30 = objCollection19.size();
        java.util.Set<java.lang.Object> objSet31 = objCollection19.uniqueSet();
        int int32 = objCollection14.getCount((java.lang.Object) objSet31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = objCollection5.add((java.lang.Object) objSet31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objEntrySet23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        java.util.Set<java.lang.Object> objSet12 = objCollection0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection13.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection17 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int19 = objCollection17.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet20 = objCollection17.uniqueSet();
        boolean boolean21 = objCollection13.containsAll((java.util.Collection<java.lang.Object>) objCollection17);
        java.lang.String str22 = objCollection13.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = objCollection0.addAll((java.util.Collection<java.lang.Object>) objCollection13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objEntrySet16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection12.contains((java.lang.Object) objCollection13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        java.util.Spliterator<java.lang.Object> objSpliterator39 = objList36.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objSpliterator39);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        java.util.Collection<java.lang.Object> objCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objCollection1.containsAll(objCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet9 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        int int16 = objCollection5.size();
        java.util.Set<java.lang.Object> objSet17 = objCollection5.uniqueSet();
        int int18 = objCollection0.getCount((java.lang.Object) objSet17);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet22 = objCollection19.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection23 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int25 = objCollection23.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet26 = objCollection23.uniqueSet();
        boolean boolean27 = objCollection19.containsAll((java.util.Collection<java.lang.Object>) objCollection23);
        java.lang.String str28 = objCollection19.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection29 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int31 = objCollection29.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray32 = objCollection29.toArray();
        java.util.Set<java.lang.Object> objSet33 = objCollection29.uniqueSet();
        boolean boolean34 = objCollection19.containsAll((java.util.Collection<java.lang.Object>) objCollection29);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet35 = objCollection19.entrySet();
        java.lang.Object[] objArray36 = objCollection19.toArray();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = objCollection0.setCount((java.lang.Object) objCollection19, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objEntrySet9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objEntrySet22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(objEntrySet35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        int int13 = objCollection5.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objCollection5.removeAll((java.util.Collection<java.lang.Object>) objCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        int int13 = objCollection5.size();
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection5.parallelStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objStream14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection3 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int5 = objCollection3.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray6 = objCollection3.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet7 = objCollection3.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<java.lang.Object> objSet12 = objCollection8.uniqueSet();
        boolean boolean13 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        boolean boolean14 = objCollection8.isEmpty();
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objCollection8.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = objCollection0.remove((java.lang.Object) objCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objEntrySet7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objSpliterator15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection3 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int5 = objCollection3.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray6 = objCollection3.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet7 = objCollection3.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<java.lang.Object> objSet12 = objCollection8.uniqueSet();
        boolean boolean13 = objCollection3.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        java.util.stream.Stream<java.lang.Object> objStream14 = objCollection8.parallelStream();
        java.util.Iterator<java.lang.Object> objItor15 = objCollection8.iterator();
        int int16 = objCollection8.size();
        java.lang.Object obj17 = null;
        boolean boolean18 = objCollection8.equals(obj17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = objCollection0.add(obj17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objEntrySet7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objStream14);
        org.junit.Assert.assertNotNull(objItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        java.util.Iterator<java.lang.Object> objItor39 = objCollection0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection40 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int42 = objCollection40.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection40.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet47 = objCollection44.uniqueSet();
        boolean boolean48 = objCollection40.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objItor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet19 = objCollection16.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection20 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int22 = objCollection20.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet23 = objCollection20.uniqueSet();
        boolean boolean24 = objCollection16.containsAll((java.util.Collection<java.lang.Object>) objCollection20);
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        java.util.stream.Stream<java.lang.Object> objStream29 = objList27.parallelStream();
        boolean boolean30 = objCollection20.containsAll((java.util.Collection<java.lang.Object>) objList27);
        java.util.stream.Stream<java.lang.Object> objStream31 = objCollection20.parallelStream();
        int int32 = objCollection0.getCount((java.lang.Object) objStream31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objEntrySet19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objStream29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objStream31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objEntrySet16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection51 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int53 = objCollection51.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet54 = objCollection51.uniqueSet();
        java.lang.Object[] objArray55 = objCollection51.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection56 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int58 = objCollection56.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray59 = objCollection56.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet60 = objCollection56.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection61 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int63 = objCollection61.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray64 = objCollection61.toArray();
        java.util.Set<java.lang.Object> objSet65 = objCollection61.uniqueSet();
        boolean boolean66 = objCollection56.containsAll((java.util.Collection<java.lang.Object>) objCollection61);
        int int67 = objCollection56.size();
        java.util.Set<java.lang.Object> objSet68 = objCollection56.uniqueSet();
        int int69 = objCollection51.getCount((java.lang.Object) objSet68);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = objCollection44.removeAll((java.util.Collection<java.lang.Object>) objCollection51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objSet54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(objEntrySet60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(objSet65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objSet68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        int int51 = objCollection44.size();
        java.lang.Object[] objArray52 = objCollection44.toArray();
        java.lang.Object[] objArray53 = objCollection44.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection6 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int8 = objCollection6.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray9 = objCollection6.toArray();
        java.util.List[] listArray11 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray12 = (java.util.List<java.lang.Object>[]) listArray11;
        java.util.List<java.lang.Object>[] objListArray13 = objCollection6.toArray(objListArray12);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet18 = objCollection14.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = objCollection19.toArray();
        java.util.Set<java.lang.Object> objSet23 = objCollection19.uniqueSet();
        boolean boolean24 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        int int25 = objCollection14.size();
        boolean boolean26 = objCollection6.contains((java.lang.Object) objCollection14);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = objCollection0.setCount((java.lang.Object) boolean26, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(listArray11);
        org.junit.Assert.assertNotNull(objListArray12);
        org.junit.Assert.assertNotNull(objListArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objEntrySet18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet9 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        int int16 = objCollection5.size();
        java.util.Set<java.lang.Object> objSet17 = objCollection5.uniqueSet();
        int int18 = objCollection0.getCount((java.lang.Object) objSet17);
        int int19 = objCollection0.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection20 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int22 = objCollection20.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet23 = objCollection20.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection24 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int26 = objCollection24.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet27 = objCollection24.uniqueSet();
        boolean boolean28 = objCollection20.containsAll((java.util.Collection<java.lang.Object>) objCollection24);
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList31, objArray30);
        java.util.stream.Stream<java.lang.Object> objStream33 = objList31.parallelStream();
        boolean boolean34 = objCollection24.containsAll((java.util.Collection<java.lang.Object>) objList31);
        java.util.stream.Stream<java.lang.Object> objStream35 = objCollection24.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = objCollection0.retainAll((java.util.Collection<java.lang.Object>) objCollection24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objEntrySet9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objEntrySet23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objStream33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objStream35);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        boolean boolean10 = objCollection7.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.reflect.GenericDeclaration> genericDeclarationCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        int int13 = objCollection5.size();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet14 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection15 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int17 = objCollection15.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = objCollection15.toArray();
        java.util.Set<java.lang.Object> objSet19 = objCollection15.uniqueSet();
        boolean boolean20 = objCollection15.isEmpty();
        java.lang.String str21 = objCollection15.toString();
        boolean boolean23 = objCollection15.contains((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = objCollection5.remove((java.lang.Object) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objEntrySet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        java.lang.String str5 = objCollection0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean1 = objCollection0.isEmpty();
        int int3 = objCollection0.getCount((java.lang.Object) 0.0f);
        boolean boolean5 = objCollection0.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = objCollection0.remove((java.lang.Object) 0L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.parallelStream();
        java.util.Iterator<java.lang.Object> objItor6 = objCollection0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        java.util.Set<java.lang.Object> objSet11 = objCollection7.uniqueSet();
        boolean boolean12 = objCollection7.isEmpty();
        java.lang.String str13 = objCollection7.toString();
        int int15 = objCollection7.getCount((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = objCollection0.addAll((java.util.Collection<java.lang.Object>) objCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertNotNull(objStream5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet8 = objCollection5.entrySet();
        boolean boolean9 = objCollection5.isEmpty();
        java.lang.Object[] objArray10 = objCollection5.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objCollection0.remove((java.lang.Object) objArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objEntrySet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection14.isEmpty();
        java.lang.String str20 = objCollection14.toString();
        org.apache.commons.collections4.MultiSet[] multiSetArray22 = new org.apache.commons.collections4.MultiSet[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MultiSet<java.lang.Object>[] objCollectionArray23 = (org.apache.commons.collections4.MultiSet<java.lang.Object>[]) multiSetArray22;
        objCollectionArray23[0] = objCollection14;
        org.apache.commons.collections4.MultiSet<java.lang.Object>[] objCollectionArray26 = objCollection5.toArray(objCollectionArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = objCollection5.remove((java.lang.Object) 100L, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(multiSetArray22);
        org.junit.Assert.assertNotNull(objCollectionArray23);
        org.junit.Assert.assertNotNull(objCollectionArray26);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection6 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        java.util.Set<java.lang.Object> objSet11 = objCollection7.uniqueSet();
        boolean boolean12 = objCollection6.contains((java.lang.Object) objCollection7);
        boolean boolean13 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet18 = objCollection14.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = objCollection19.toArray();
        java.util.Set<java.lang.Object> objSet23 = objCollection19.uniqueSet();
        boolean boolean24 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        java.util.stream.Stream<java.lang.Object> objStream25 = objCollection19.parallelStream();
        java.util.Iterator<java.lang.Object> objItor26 = objCollection19.iterator();
        int int27 = objCollection19.size();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet28 = objCollection19.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = objCollection0.remove((java.lang.Object) objEntrySet28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objEntrySet18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objStream25);
        org.junit.Assert.assertNotNull(objItor26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objEntrySet28);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection7.spliterator();
        int int11 = objCollection7.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet15 = objCollection12.uniqueSet();
        java.util.Iterator<java.lang.Object> objItor16 = objCollection12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = objCollection7.setCount((java.lang.Object) objItor16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objSet15);
        org.junit.Assert.assertNotNull(objItor16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        java.lang.String str5 = objCollection0.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Iterable<java.lang.Object>> objIterableCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Iterable<java.lang.Object>>();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        int int11 = objCollection0.getCount((java.lang.Object) objCollection7);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray15 = objCollection12.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection12.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream17 = objCollection12.parallelStream();
        java.util.Iterator<java.lang.Object> objItor18 = objCollection12.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objCollection0.add((java.lang.Object) objItor18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objEntrySet16);
        org.junit.Assert.assertNotNull(objStream17);
        org.junit.Assert.assertNotNull(objItor18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection7.spliterator();
        java.lang.Object[] objArray11 = objCollection7.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objSpliterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.List[] listArray5 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray6 = (java.util.List<java.lang.Object>[]) listArray5;
        java.util.List<java.lang.Object>[] objListArray7 = objCollection0.toArray(objListArray6);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection8.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        int int19 = objCollection8.size();
        boolean boolean20 = objCollection0.contains((java.lang.Object) objCollection8);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(listArray5);
        org.junit.Assert.assertNotNull(objListArray6);
        org.junit.Assert.assertNotNull(objListArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        java.lang.String str7 = objCollection0.toString();
        java.lang.String str8 = objCollection0.toString();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet9 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(objEntrySet9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        int int9 = objCollection0.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet14 = objCollection10.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection10.parallelStream();
        boolean boolean16 = objCollection0.equals((java.lang.Object) objCollection10);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection17 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int19 = objCollection17.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray20 = objCollection17.toArray();
        java.util.List[] listArray22 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray23 = (java.util.List<java.lang.Object>[]) listArray22;
        java.util.List<java.lang.Object>[] objListArray24 = objCollection17.toArray(objListArray23);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection25 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int27 = objCollection25.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = objCollection25.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet29 = objCollection25.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection30 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int32 = objCollection30.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray33 = objCollection30.toArray();
        java.util.Set<java.lang.Object> objSet34 = objCollection30.uniqueSet();
        boolean boolean35 = objCollection25.containsAll((java.util.Collection<java.lang.Object>) objCollection30);
        int int36 = objCollection25.size();
        boolean boolean37 = objCollection17.contains((java.lang.Object) objCollection25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objEntrySet14);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(listArray22);
        org.junit.Assert.assertNotNull(objListArray23);
        org.junit.Assert.assertNotNull(objListArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objEntrySet29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray7 = objCollection4.toArray();
        java.util.Set<java.lang.Object> objSet8 = objCollection4.uniqueSet();
        java.lang.Object[] objArray9 = objSet8.toArray();
        int int10 = objCollection0.getCount((java.lang.Object) objSet8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertNotNull(objStream5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean1 = objCollection0.isEmpty();
        int int3 = objCollection0.getCount((java.lang.Object) 0.0f);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray6 = objCollection0.toArray(genericDeclarationArray5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArray6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.List[] listArray5 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray6 = (java.util.List<java.lang.Object>[]) listArray5;
        java.util.List<java.lang.Object>[] objListArray7 = objCollection0.toArray(objListArray6);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection8.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        int int19 = objCollection8.size();
        boolean boolean20 = objCollection0.contains((java.lang.Object) objCollection8);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.String> strCollection21 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.String>();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = objCollection8.remove((java.lang.Object) strCollection21, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(listArray5);
        org.junit.Assert.assertNotNull(objListArray6);
        org.junit.Assert.assertNotNull(objListArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Iterator<java.lang.Object> objItor4 = objCollection0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection5.isEmpty();
        java.lang.String str11 = objCollection5.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet15 = objCollection12.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet19 = objCollection16.uniqueSet();
        boolean boolean20 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection16);
        int int21 = objCollection5.getCount((java.lang.Object) boolean20);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = objCollection0.add((java.lang.Object) int21, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objEntrySet15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Iterator<java.lang.Object> objItor16 = objCollection10.iterator();
        java.util.Iterator<java.lang.Object> objItor17 = objCollection10.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertNotNull(objItor17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        java.util.Set<java.lang.Object> objSet12 = objCollection0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = objCollection0.add((java.lang.Object) objCollection13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        boolean boolean39 = objList36.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        java.util.Iterator<java.lang.Object> objItor39 = objCollection0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection40 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int42 = objCollection40.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet43 = objCollection40.uniqueSet();
        java.lang.Object[] objArray44 = objCollection40.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection45 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int47 = objCollection45.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray48 = objCollection45.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet49 = objCollection45.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection50 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int52 = objCollection50.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray53 = objCollection50.toArray();
        java.util.Set<java.lang.Object> objSet54 = objCollection50.uniqueSet();
        boolean boolean55 = objCollection45.containsAll((java.util.Collection<java.lang.Object>) objCollection50);
        int int56 = objCollection45.size();
        java.util.Set<java.lang.Object> objSet57 = objCollection45.uniqueSet();
        int int58 = objCollection40.getCount((java.lang.Object) objSet57);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objItor39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objSet43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objEntrySet49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objSet54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objSet57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Iterator<java.lang.Object> objItor16 = objCollection10.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection17 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int19 = objCollection17.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray20 = objCollection17.toArray();
        java.util.Set<java.lang.Object> objSet21 = objCollection17.uniqueSet();
        boolean boolean22 = objCollection17.isEmpty();
        java.lang.String str23 = objCollection17.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection24 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean25 = objCollection24.isEmpty();
        boolean boolean26 = objCollection17.containsAll((java.util.Collection<java.lang.Object>) objCollection24);
        java.util.Spliterator<java.lang.Object> objSpliterator27 = objCollection24.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = objCollection10.addAll((java.util.Collection<java.lang.Object>) objCollection24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objSpliterator27);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection14.isEmpty();
        java.lang.String str20 = objCollection14.toString();
        org.apache.commons.collections4.MultiSet[] multiSetArray22 = new org.apache.commons.collections4.MultiSet[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MultiSet<java.lang.Object>[] objCollectionArray23 = (org.apache.commons.collections4.MultiSet<java.lang.Object>[]) multiSetArray22;
        objCollectionArray23[0] = objCollection14;
        org.apache.commons.collections4.MultiSet<java.lang.Object>[] objCollectionArray26 = objCollection5.toArray(objCollectionArray23);
        java.lang.Object[] objArray27 = objCollection5.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(multiSetArray22);
        org.junit.Assert.assertNotNull(objCollectionArray23);
        org.junit.Assert.assertNotNull(objCollectionArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Iterator<java.lang.Object> objItor4 = objCollection0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = objCollection0.setCount((java.lang.Object) objCollection5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.util.Iterator<java.lang.Object> objItor1 = objCollection0.iterator();
        java.util.stream.Stream<java.lang.Object> objStream2 = objCollection0.parallelStream();
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objStream2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet10 = objCollection0.entrySet();
        java.lang.Class<?> wildcardClass11 = objCollection0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet3 = objCollection0.uniqueSet();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet8 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet12 = objCollection9.uniqueSet();
        boolean boolean13 = objCollection5.containsAll((java.util.Collection<java.lang.Object>) objCollection9);
        int int14 = objCollection5.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection15 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int17 = objCollection15.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = objCollection15.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet19 = objCollection15.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream20 = objCollection15.parallelStream();
        boolean boolean21 = objCollection5.equals((java.lang.Object) objCollection15);
        boolean boolean22 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objSet3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objEntrySet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objEntrySet19);
        org.junit.Assert.assertNotNull(objStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        java.util.stream.Stream<java.lang.Object> objStream7 = objCollection0.parallelStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(objStream7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet11 = objCollection5.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objEntrySet11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean1 = objCollection0.isEmpty();
        int int3 = objCollection0.getCount((java.lang.Object) 0.0f);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        int int5 = objCollection0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection0.entrySet();
        java.lang.Object obj17 = null;
        int int18 = objCollection0.getCount(obj17);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objEntrySet16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet12 = objCollection9.uniqueSet();
        java.lang.Object[] objArray13 = objCollection9.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet18 = objCollection14.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = objCollection19.toArray();
        java.util.Set<java.lang.Object> objSet23 = objCollection19.uniqueSet();
        boolean boolean24 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        int int25 = objCollection14.size();
        java.util.Set<java.lang.Object> objSet26 = objCollection14.uniqueSet();
        int int27 = objCollection9.getCount((java.lang.Object) objSet26);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = objCollection0.add((java.lang.Object) int27, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objEntrySet18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet18 = objCollection14.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = objCollection19.toArray();
        java.util.Set<java.lang.Object> objSet23 = objCollection19.uniqueSet();
        boolean boolean24 = objCollection14.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = objCollection5.retainAll((java.util.Collection<java.lang.Object>) objCollection14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objEntrySet18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean11 = objCollection5.isEmpty();
        int int12 = objCollection5.size();
        java.lang.Object[] objArray13 = objCollection5.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.Spliterator<java.lang.Object> objSpliterator9 = objCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objSpliterator9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = objCollection0.add((java.lang.Object) int6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        java.util.Spliterator<java.lang.Object> objSpliterator10 = objCollection7.spliterator();
        int int11 = objCollection7.size();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection7.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objEntrySet12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        boolean boolean4 = objCollection0.isEmpty();
        boolean boolean5 = objCollection0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.lang.Object[] objArray11 = objCollection0.toArray();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection0.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objItor12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.List[] listArray5 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray6 = (java.util.List<java.lang.Object>[]) listArray5;
        java.util.List<java.lang.Object>[] objListArray7 = objCollection0.toArray(objListArray6);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection8.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        int int19 = objCollection8.size();
        boolean boolean20 = objCollection0.contains((java.lang.Object) objCollection8);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray21 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray21 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray23 = objCollection8.toArray(genericDeclarationArray22);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection24 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int26 = objCollection24.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet27 = objCollection24.uniqueSet();
        java.lang.Object[] objArray28 = objCollection24.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection29 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int31 = objCollection29.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray32 = objCollection29.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet33 = objCollection29.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection34 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int36 = objCollection34.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray37 = objCollection34.toArray();
        java.util.Set<java.lang.Object> objSet38 = objCollection34.uniqueSet();
        boolean boolean39 = objCollection29.containsAll((java.util.Collection<java.lang.Object>) objCollection34);
        int int40 = objCollection29.size();
        java.util.Set<java.lang.Object> objSet41 = objCollection29.uniqueSet();
        int int42 = objCollection24.getCount((java.lang.Object) objSet41);
        int int43 = objCollection24.size();
        int int44 = objCollection8.getCount((java.lang.Object) int43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(listArray5);
        org.junit.Assert.assertNotNull(objListArray6);
        org.junit.Assert.assertNotNull(objListArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(genericDeclarationArray21);
        org.junit.Assert.assertNotNull(genericDeclarationArray22);
        org.junit.Assert.assertNotNull(genericDeclarationArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objSet27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objEntrySet33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objSet38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objSet41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList11 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.util.stream.Stream<java.lang.Object> objStream13 = objList11.parallelStream();
        boolean boolean14 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objList11);
        java.util.stream.Stream<java.lang.Object> objStream15 = objCollection4.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.util.Iterator<java.lang.Object> objItor17 = objCollection16.iterator();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = objCollection4.add((java.lang.Object) objItor17, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objStream15);
        org.junit.Assert.assertNotNull(objItor17);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        int int11 = objCollection0.getCount((java.lang.Object) objCollection7);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet15 = objCollection12.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet19 = objCollection16.uniqueSet();
        boolean boolean20 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection16);
        boolean boolean21 = objCollection0.equals((java.lang.Object) objCollection16);
        java.util.Iterator<java.lang.Object> objItor22 = objCollection16.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objEntrySet15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objItor22);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        java.util.Set<java.lang.Object> objSet12 = objCollection0.uniqueSet();
        boolean boolean13 = objSet12.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList11 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.util.stream.Stream<java.lang.Object> objStream13 = objList11.parallelStream();
        boolean boolean14 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objList11);
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objList11.spliterator();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet19 = objCollection16.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection20 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int22 = objCollection20.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet23 = objCollection20.uniqueSet();
        boolean boolean24 = objCollection16.containsAll((java.util.Collection<java.lang.Object>) objCollection20);
        java.lang.String str25 = objCollection16.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection26 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int28 = objCollection26.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray29 = objCollection26.toArray();
        java.util.Set<java.lang.Object> objSet30 = objCollection26.uniqueSet();
        boolean boolean31 = objCollection16.containsAll((java.util.Collection<java.lang.Object>) objCollection26);
        boolean boolean32 = objList11.addAll((java.util.Collection<java.lang.Object>) objCollection26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objEntrySet19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection0.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.lang.Object[] objArray14 = objCollection10.toArray();
        boolean boolean15 = objCollection0.equals((java.lang.Object) objCollection10);
        // The following exception was thrown during execution in test generation
        try {
            objCollection0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objStream9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        int int13 = objCollection0.getCount((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        boolean boolean11 = objCollection5.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet15 = objCollection12.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet19 = objCollection16.uniqueSet();
        boolean boolean20 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection16);
        int int21 = objCollection12.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection22 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int24 = objCollection22.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray25 = objCollection22.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet26 = objCollection22.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream27 = objCollection22.parallelStream();
        boolean boolean28 = objCollection12.equals((java.lang.Object) objCollection22);
        java.util.Set<java.lang.Object> objSet29 = objCollection22.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = objCollection5.retainAll((java.util.Collection<java.lang.Object>) objSet29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objEntrySet15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objEntrySet26);
        org.junit.Assert.assertNotNull(objStream27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objSet29);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection0.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.lang.Object[] objArray14 = objCollection10.toArray();
        boolean boolean15 = objCollection0.equals((java.lang.Object) objCollection10);
        java.lang.Object[] objArray16 = objCollection0.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objStream9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream5 = objCollection0.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection6 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int8 = objCollection6.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet9 = objCollection6.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet13 = objCollection10.uniqueSet();
        boolean boolean14 = objCollection6.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.util.stream.Stream<java.lang.Object> objStream19 = objList17.parallelStream();
        boolean boolean20 = objCollection10.containsAll((java.util.Collection<java.lang.Object>) objList17);
        java.util.Spliterator<java.lang.Object> objSpliterator21 = objList17.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = objCollection0.setCount((java.lang.Object) objSpliterator21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertNotNull(objStream5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objEntrySet9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objStream19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objSpliterator21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        java.util.Collection<java.lang.Object> objCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objCollection0.containsAll(objCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection5.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection14.isEmpty();
        java.lang.String str20 = objCollection14.toString();
        org.apache.commons.collections4.MultiSet[] multiSetArray22 = new org.apache.commons.collections4.MultiSet[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.MultiSet<java.lang.Object>[] objCollectionArray23 = (org.apache.commons.collections4.MultiSet<java.lang.Object>[]) multiSetArray22;
        objCollectionArray23[0] = objCollection14;
        org.apache.commons.collections4.MultiSet<java.lang.Object>[] objCollectionArray26 = objCollection5.toArray(objCollectionArray23);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection27 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int29 = objCollection27.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet30 = objCollection27.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection31 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int33 = objCollection31.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet34 = objCollection31.uniqueSet();
        boolean boolean35 = objCollection27.containsAll((java.util.Collection<java.lang.Object>) objCollection31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = objCollection5.remove((java.lang.Object) boolean35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
        org.junit.Assert.assertNotNull(multiSetArray22);
        org.junit.Assert.assertNotNull(objCollectionArray23);
        org.junit.Assert.assertNotNull(objCollectionArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objEntrySet30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.List[] listArray5 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray6 = (java.util.List<java.lang.Object>[]) listArray5;
        java.util.List<java.lang.Object>[] objListArray7 = objCollection0.toArray(objListArray6);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection8.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        int int19 = objCollection8.size();
        boolean boolean20 = objCollection0.contains((java.lang.Object) objCollection8);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection21 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean22 = objCollection21.isEmpty();
        int int24 = objCollection21.getCount((java.lang.Object) 0.0f);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet25 = objCollection21.entrySet();
        boolean boolean26 = objCollection0.equals((java.lang.Object) objEntrySet25);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet27 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(listArray5);
        org.junit.Assert.assertNotNull(objListArray6);
        org.junit.Assert.assertNotNull(objListArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objEntrySet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objEntrySet27);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        java.lang.String str7 = objCollection0.toString();
        java.lang.String str8 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection9.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet16 = objCollection13.uniqueSet();
        boolean boolean17 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        java.util.stream.Stream<java.lang.Object> objStream18 = objCollection9.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = objCollection19.toArray();
        java.lang.Object[] objArray23 = objCollection19.toArray();
        boolean boolean24 = objCollection9.equals((java.lang.Object) objCollection19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(objStream18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        boolean boolean11 = objCollection7.contains((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray12 = objCollection7.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        boolean boolean9 = objCollection4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            objCollection4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray15 = objCollection12.toArray();
        boolean boolean16 = objCollection0.equals((java.lang.Object) objCollection12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        java.lang.Object[] objArray8 = objCollection4.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = objCollection9.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection9.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        int int20 = objCollection9.size();
        java.util.Set<java.lang.Object> objSet21 = objCollection9.uniqueSet();
        int int22 = objCollection4.getCount((java.lang.Object) objSet21);
        boolean boolean23 = objCollection0.equals((java.lang.Object) objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream24 = objCollection0.stream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objStream24);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection0.entrySet();
        java.lang.Object obj17 = null;
        int int18 = objCollection0.getCount(obj17);
        java.lang.Object[] objArray19 = objCollection0.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objEntrySet16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean1 = objCollection0.isEmpty();
        int int3 = objCollection0.getCount((java.lang.Object) 0.0f);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        boolean boolean5 = objCollection0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        java.lang.String str7 = objCollection0.toString();
        java.lang.String str8 = objCollection0.toString();
        boolean boolean9 = objCollection0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        // The following exception was thrown during execution in test generation
        try {
            objCollection4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        int int12 = objCollection0.size();
        java.lang.Object[] objArray13 = objCollection0.toArray();
        java.lang.Object[] objArray14 = objCollection0.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.List[] listArray5 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray6 = (java.util.List<java.lang.Object>[]) listArray5;
        java.util.List<java.lang.Object>[] objListArray7 = objCollection0.toArray(objListArray6);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection8.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection13 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int15 = objCollection13.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray16 = objCollection13.toArray();
        java.util.Set<java.lang.Object> objSet17 = objCollection13.uniqueSet();
        boolean boolean18 = objCollection8.containsAll((java.util.Collection<java.lang.Object>) objCollection13);
        int int19 = objCollection8.size();
        boolean boolean20 = objCollection0.contains((java.lang.Object) objCollection8);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray21 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray21 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray23 = objCollection8.toArray(genericDeclarationArray22);
        java.util.Set<java.lang.Object> objSet24 = objCollection8.uniqueSet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(listArray5);
        org.junit.Assert.assertNotNull(objListArray6);
        org.junit.Assert.assertNotNull(objListArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objEntrySet12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(genericDeclarationArray21);
        org.junit.Assert.assertNotNull(genericDeclarationArray22);
        org.junit.Assert.assertNotNull(genericDeclarationArray23);
        org.junit.Assert.assertNotNull(objSet24);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection0.entrySet();
        java.lang.Object obj17 = null;
        int int18 = objCollection0.getCount(obj17);
        java.util.stream.Stream<java.lang.Object> objStream19 = objCollection0.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection20 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int22 = objCollection20.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray23 = objCollection20.toArray();
        java.util.List[] listArray25 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray26 = (java.util.List<java.lang.Object>[]) listArray25;
        java.util.List<java.lang.Object>[] objListArray27 = objCollection20.toArray(objListArray26);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection28 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int30 = objCollection28.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray31 = objCollection28.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet32 = objCollection28.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection33 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int35 = objCollection33.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray36 = objCollection33.toArray();
        java.util.Set<java.lang.Object> objSet37 = objCollection33.uniqueSet();
        boolean boolean38 = objCollection28.containsAll((java.util.Collection<java.lang.Object>) objCollection33);
        int int39 = objCollection28.size();
        boolean boolean40 = objCollection20.contains((java.lang.Object) objCollection28);
        java.lang.Object[] objArray41 = objCollection20.toArray();
        boolean boolean42 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objEntrySet16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objStream19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(listArray25);
        org.junit.Assert.assertNotNull(objListArray26);
        org.junit.Assert.assertNotNull(objListArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objEntrySet32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        int int11 = objCollection0.getCount((java.lang.Object) objCollection7);
        java.util.stream.Stream<java.lang.Object> objStream12 = objCollection0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objStream12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.CharSequence> charSequenceCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.CharSequence>();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection1.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet8 = objCollection5.uniqueSet();
        boolean boolean9 = objCollection1.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int10 = objCollection1.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection11 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int13 = objCollection11.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray14 = objCollection11.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet15 = objCollection11.entrySet();
        java.util.stream.Stream<java.lang.Object> objStream16 = objCollection11.parallelStream();
        boolean boolean17 = objCollection1.equals((java.lang.Object) objCollection11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objEntrySet15);
        org.junit.Assert.assertNotNull(objStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        java.lang.Object[] objArray5 = objSet4.toArray();
        // The following exception was thrown during execution in test generation
        try {
            objSet4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Collection<java.lang.Object> objCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objCollection0.containsAll(objCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        boolean boolean11 = objCollection0.equals((java.lang.Object) true);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objEntrySet12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet10 = objCollection7.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection11 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int13 = objCollection11.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet14 = objCollection11.uniqueSet();
        boolean boolean15 = objCollection7.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        int int16 = objCollection0.getCount((java.lang.Object) boolean15);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection17 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int19 = objCollection17.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray20 = objCollection17.toArray();
        boolean boolean21 = objCollection0.equals((java.lang.Object) objCollection17);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection22 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int24 = objCollection22.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray25 = objCollection22.toArray();
        java.lang.Object[] objArray26 = objCollection22.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet27 = objCollection22.entrySet();
        int int28 = objCollection17.getCount((java.lang.Object) objEntrySet27);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection29 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int31 = objCollection29.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet32 = objCollection29.entrySet();
        boolean boolean33 = objCollection29.isEmpty();
        java.lang.Object[] objArray34 = objCollection29.toArray();
        boolean boolean35 = objCollection17.containsAll((java.util.Collection<java.lang.Object>) objCollection29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objEntrySet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objEntrySet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet43 = objCollection39.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection44 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int46 = objCollection44.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray47 = objCollection44.toArray();
        java.util.Set<java.lang.Object> objSet48 = objCollection44.uniqueSet();
        boolean boolean49 = objCollection39.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        boolean boolean50 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection44);
        int int51 = objCollection44.size();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection52 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int54 = objCollection52.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray55 = objCollection52.toArray();
        java.util.Set<java.lang.Object> objSet56 = objCollection52.uniqueSet();
        boolean boolean57 = objCollection52.isEmpty();
        java.lang.String str58 = objCollection52.toString();
        java.lang.Object[] objArray59 = objCollection52.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = objCollection44.remove((java.lang.Object) objCollection52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objEntrySet43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "[]" + "'", str58, "[]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        int int9 = objCollection0.size();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet10 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objEntrySet10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        int int9 = objCollection0.size();
        boolean boolean10 = objCollection0.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1) };
        java.util.ArrayList<java.lang.Object> objList11 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList11, objArray10);
        java.util.stream.Stream<java.lang.Object> objStream13 = objList11.parallelStream();
        boolean boolean14 = objCollection4.containsAll((java.util.Collection<java.lang.Object>) objList11);
        java.util.Spliterator<java.lang.Object> objSpliterator15 = objList11.spliterator();
        objList11.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objSpliterator15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        java.lang.Object[] objArray8 = objCollection4.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = objCollection9.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection9.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        int int20 = objCollection9.size();
        java.util.Set<java.lang.Object> objSet21 = objCollection9.uniqueSet();
        int int22 = objCollection4.getCount((java.lang.Object) objSet21);
        boolean boolean23 = objCollection0.equals((java.lang.Object) objCollection4);
        // The following exception was thrown during execution in test generation
        try {
            objCollection4.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        java.lang.Object[] objArray7 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection8 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int10 = objCollection8.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray11 = objCollection8.toArray();
        java.util.Set<java.lang.Object> objSet12 = objCollection8.uniqueSet();
        boolean boolean13 = objCollection8.isEmpty();
        java.lang.String str14 = objCollection8.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection15 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int17 = objCollection15.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet18 = objCollection15.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection19 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int21 = objCollection19.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet22 = objCollection19.uniqueSet();
        boolean boolean23 = objCollection15.containsAll((java.util.Collection<java.lang.Object>) objCollection19);
        int int24 = objCollection8.getCount((java.lang.Object) boolean23);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection25 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int27 = objCollection25.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = objCollection25.toArray();
        boolean boolean29 = objCollection8.equals((java.lang.Object) objCollection25);
        boolean boolean30 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objEntrySet18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet39 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objEntrySet39);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.lang.String str16 = objCollection10.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection3 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int5 = objCollection3.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray6 = objCollection3.toArray();
        java.util.Set<java.lang.Object> objSet7 = objCollection3.uniqueSet();
        boolean boolean8 = objCollection3.isEmpty();
        java.lang.String str9 = objCollection3.toString();
        int int10 = objCollection3.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objCollection0.removeAll((java.util.Collection<java.lang.Object>) objCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Spliterator<java.lang.Object> objSpliterator4 = objCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSpliterator4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.util.Set<java.lang.Object>[]> objSetArrayCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.util.Set<java.lang.Object>[]>();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        int int11 = objCollection0.size();
        boolean boolean12 = objCollection0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objCollection0.remove((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        java.lang.Object[] objArray8 = objCollection4.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection9 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int11 = objCollection9.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = objCollection9.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet13 = objCollection9.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection14 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int16 = objCollection14.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = objCollection14.toArray();
        java.util.Set<java.lang.Object> objSet18 = objCollection14.uniqueSet();
        boolean boolean19 = objCollection9.containsAll((java.util.Collection<java.lang.Object>) objCollection14);
        int int20 = objCollection9.size();
        java.util.Set<java.lang.Object> objSet21 = objCollection9.uniqueSet();
        int int22 = objCollection4.getCount((java.lang.Object) objSet21);
        boolean boolean23 = objCollection0.equals((java.lang.Object) objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream24 = objCollection4.stream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objEntrySet13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objStream24);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Iterator<java.lang.Object> objItor16 = objCollection10.iterator();
        java.lang.String str17 = objCollection10.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objItor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.util.stream.BaseStream<java.lang.Object, java.util.stream.Stream<java.lang.Object>>> objBaseStreamCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.util.stream.BaseStream<java.lang.Object, java.util.stream.Stream<java.lang.Object>>>();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.lang.String str9 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.util.Set<java.lang.Object> objSet14 = objCollection10.uniqueSet();
        boolean boolean15 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection10);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet16 = objCollection0.entrySet();
        java.lang.Object[] objArray17 = objCollection0.toArray();
        java.lang.Object[] objArray18 = objCollection0.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objEntrySet16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        int int8 = objCollection0.getCount((java.lang.Object) 1L);
        java.lang.Object[] objArray9 = objCollection0.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        int int11 = objCollection0.getCount((java.lang.Object) objCollection7);
        java.util.Spliterator<java.lang.Object> objSpliterator12 = objCollection7.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objCollection7.add((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objSpliterator12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet10 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection11 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int13 = objCollection11.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet14 = objCollection11.uniqueSet();
        java.lang.Object[] objArray15 = objCollection11.toArray();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray19 = objCollection16.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet20 = objCollection16.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection21 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int23 = objCollection21.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray24 = objCollection21.toArray();
        java.util.Set<java.lang.Object> objSet25 = objCollection21.uniqueSet();
        boolean boolean26 = objCollection16.containsAll((java.util.Collection<java.lang.Object>) objCollection21);
        int int27 = objCollection16.size();
        java.util.Set<java.lang.Object> objSet28 = objCollection16.uniqueSet();
        int int29 = objCollection11.getCount((java.lang.Object) objSet28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = objCollection0.setCount((java.lang.Object) int29, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objEntrySet20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objSet25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection1 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int3 = objCollection1.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = objCollection1.toArray();
        java.util.Set<java.lang.Object> objSet5 = objCollection1.uniqueSet();
        boolean boolean6 = objCollection0.contains((java.lang.Object) objCollection1);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray10 = objCollection7.toArray();
        int int11 = objCollection0.getCount((java.lang.Object) objCollection7);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection12 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int14 = objCollection12.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet15 = objCollection12.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection16 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int18 = objCollection16.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet19 = objCollection16.uniqueSet();
        boolean boolean20 = objCollection12.containsAll((java.util.Collection<java.lang.Object>) objCollection16);
        boolean boolean21 = objCollection0.equals((java.lang.Object) objCollection16);
        java.util.Spliterator<java.lang.Object> objSpliterator22 = objCollection0.spliterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet23 = objCollection0.entrySet();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objEntrySet15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objSpliterator22);
        org.junit.Assert.assertNotNull(objEntrySet23);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1L), objCollection4, (-1.0d), (short) 100, ' ', (-1.0d), 0, ' ', (byte) 10, false, 100, "", 0, 100.0d, "hi!", (short) 1, (-1.0f), ' ', 10, 1.0d, (short) 1, 1.0d, (byte) 10, 1L, (byte) 0, 10, (-1.0d), 100.0d, (byte) 0, (-1.0d), (-1.0d), (byte) 100 };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean38 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objList36);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection39 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int41 = objCollection39.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray42 = objCollection39.toArray();
        java.util.List[] listArray44 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Object>[] objListArray45 = (java.util.List<java.lang.Object>[]) listArray44;
        java.util.List<java.lang.Object>[] objListArray46 = objCollection39.toArray(objListArray45);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection47 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int49 = objCollection47.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray50 = objCollection47.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet51 = objCollection47.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection52 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int54 = objCollection52.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray55 = objCollection52.toArray();
        java.util.Set<java.lang.Object> objSet56 = objCollection52.uniqueSet();
        boolean boolean57 = objCollection47.containsAll((java.util.Collection<java.lang.Object>) objCollection52);
        int int58 = objCollection47.size();
        boolean boolean59 = objCollection39.contains((java.lang.Object) objCollection47);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray60 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray61 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray60 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray62 = objCollection47.toArray(genericDeclarationArray61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean63 = objCollection0.remove((java.lang.Object) genericDeclarationArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, [], -1.0, 100,  , -1.0, 0,  , 10, false, 100, , 0, 100.0, hi!, 1, -1.0,  , 10, 1.0, 1, 1.0, 10, 1, 0, 10, -1.0, 100.0, 0, -1.0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(listArray44);
        org.junit.Assert.assertNotNull(objListArray45);
        org.junit.Assert.assertNotNull(objListArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(objEntrySet51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(genericDeclarationArray60);
        org.junit.Assert.assertNotNull(genericDeclarationArray61);
        org.junit.Assert.assertNotNull(genericDeclarationArray62);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        java.lang.String str7 = objCollection0.toString();
        java.lang.String str8 = objCollection0.toString();
        int int9 = objCollection0.size();
        java.lang.Object[] objArray10 = objCollection0.toArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        boolean boolean8 = objCollection7.isEmpty();
        boolean boolean9 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection7);
        boolean boolean11 = objCollection7.contains((java.lang.Object) (byte) -1);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet12 = objCollection7.entrySet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objEntrySet12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        int int8 = objCollection0.getCount((java.lang.Object) 1L);
        java.lang.Object obj9 = null;
        int int10 = objCollection0.getCount(obj9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.lang.Object[] objArray4 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet5 = objCollection0.entrySet();
        java.util.Spliterator<java.lang.Object> objSpliterator6 = objCollection0.spliterator();
        java.lang.Class<?> wildcardClass7 = objCollection0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objEntrySet5);
        org.junit.Assert.assertNotNull(objSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        java.lang.String str6 = objCollection0.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection7 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int9 = objCollection7.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet10 = objCollection7.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection11 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int13 = objCollection11.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet14 = objCollection11.uniqueSet();
        boolean boolean15 = objCollection7.containsAll((java.util.Collection<java.lang.Object>) objCollection11);
        int int16 = objCollection0.getCount((java.lang.Object) boolean15);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection17 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int19 = objCollection17.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray20 = objCollection17.toArray();
        boolean boolean21 = objCollection0.equals((java.lang.Object) objCollection17);
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection22 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int24 = objCollection22.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray25 = objCollection22.toArray();
        java.lang.Object[] objArray26 = objCollection22.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet27 = objCollection22.entrySet();
        int int28 = objCollection17.getCount((java.lang.Object) objEntrySet27);
        boolean boolean29 = objCollection17.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection30 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int32 = objCollection30.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray33 = objCollection30.toArray();
        java.util.Set<java.lang.Object> objSet34 = objCollection30.uniqueSet();
        boolean boolean35 = objCollection30.isEmpty();
        java.lang.String str36 = objCollection30.toString();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection37 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int39 = objCollection37.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet40 = objCollection37.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection41 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int43 = objCollection41.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet44 = objCollection41.uniqueSet();
        boolean boolean45 = objCollection37.containsAll((java.util.Collection<java.lang.Object>) objCollection41);
        int int46 = objCollection30.getCount((java.lang.Object) boolean45);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet47 = objCollection30.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = objCollection17.remove((java.lang.Object) objCollection30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objEntrySet10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objEntrySet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objEntrySet40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(objEntrySet47);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<java.lang.Object> objSet4 = objCollection0.uniqueSet();
        boolean boolean5 = objCollection0.isEmpty();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection6 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int8 = objCollection6.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray9 = objCollection6.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet10 = objCollection6.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = objCollection0.setCount((java.lang.Object) objEntrySet10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objEntrySet10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet3 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection4 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int6 = objCollection4.getCount((java.lang.Object) "hi!");
        java.util.Set<java.lang.Object> objSet7 = objCollection4.uniqueSet();
        boolean boolean8 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection4);
        java.util.stream.Stream<java.lang.Object> objStream9 = objCollection0.parallelStream();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection10 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int12 = objCollection10.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray13 = objCollection10.toArray();
        java.lang.Object[] objArray14 = objCollection10.toArray();
        boolean boolean15 = objCollection0.equals((java.lang.Object) objCollection10);
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = objCollection0.remove(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objStream9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection0 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int2 = objCollection0.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray3 = objCollection0.toArray();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet4 = objCollection0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object> objCollection5 = new br.com.unicamp.mo409.UnmodifiableMultiSet<java.lang.Object>();
        int int7 = objCollection5.getCount((java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = objCollection5.toArray();
        java.util.Set<java.lang.Object> objSet9 = objCollection5.uniqueSet();
        boolean boolean10 = objCollection0.containsAll((java.util.Collection<java.lang.Object>) objCollection5);
        java.util.stream.Stream<java.lang.Object> objStream11 = objCollection5.parallelStream();
        java.util.Iterator<java.lang.Object> objItor12 = objCollection5.iterator();
        int int13 = objCollection5.size();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.lang.Object>> objEntrySet14 = objCollection5.entrySet();
        java.util.Iterator<java.lang.Object> objItor15 = objCollection5.iterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objEntrySet4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objStream11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objEntrySet14);
        org.junit.Assert.assertNotNull(objItor15);
    }
}

