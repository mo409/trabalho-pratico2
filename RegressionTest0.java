import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = unmodifiableMultiSetBridge0.remove(pessoa1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass3 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.remove(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass2 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa[] pessoaArray4 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList5 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList5, pessoaArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass3 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.remove(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.removeAll(pessoaCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.add(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = unmodifiableMultiSetBridge0.addAll(pessoaCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.lang.Class<?> wildcardClass1 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.remove(pessoa2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge2.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.remove(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge2.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge2.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.add(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.removeAll(pessoaCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.remove(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.add(pessoa2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass3 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.addAll(pessoaCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.remove(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.remove(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass5 = pessoaItor4.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge3.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.add(pessoa2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa[] pessoaArray5 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList6 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList6, pessoaArray5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass6 = pessoaSet5.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass7 = pessoaItor6.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unmodifiableMultiSetBridge0.setCount(pessoa8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge8.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass5 = pessoaEntrySet4.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.add(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass4 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge2.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge1.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge1.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge1.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass7 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass5 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.remove(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge3.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.add(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge2.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge2.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge8.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaSet15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unmodifiableMultiSetBridge0.setCount(pessoa2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass3 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.remove(pessoa9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass9 = pessoaSet8.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass8 = pessoaSet7.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass5 = pessoaItor4.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass6 = pessoaEntrySet5.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass5 = pessoaItor4.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass4 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unmodifiableMultiSetBridge0.setCount(pessoa9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass8 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.remove(pessoa9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge1.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge1.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge1.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unmodifiableMultiSetBridge0.setCount(pessoa8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge3.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge3.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.add(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass7 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.add(pessoa10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass5 = pessoaSet4.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass8 = pessoaSet7.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.remove(pessoa2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass8 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor14 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet17 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaItor14);
        org.junit.Assert.assertNotNull(pessoaSet15);
        org.junit.Assert.assertNotNull(pessoaSet16);
        org.junit.Assert.assertNotNull(pessoaSet17);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge10 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge10.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge10.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge10.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge10.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet14 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor15 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaEntrySet14);
        org.junit.Assert.assertNotNull(pessoaItor15);
        org.junit.Assert.assertNotNull(pessoaSet16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unmodifiableMultiSetBridge0.setCount(pessoa9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge3 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge3.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge3.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge3.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge3.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass6 = pessoaEntrySet5.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.remove(pessoa12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.remove(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass5 = pessoaEntrySet4.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor14 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet15 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaItor14);
        org.junit.Assert.assertNotNull(pessoaEntrySet15);
        org.junit.Assert.assertNotNull(pessoaSet16);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass4 = pessoaSet3.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge12 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge12.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor15 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet16 = unmodifiableMultiSetBridge12.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor17 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet18 = unmodifiableMultiSetBridge12.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet19 = unmodifiableMultiSetBridge12.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor20 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet21 = unmodifiableMultiSetBridge12.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaItor15);
        org.junit.Assert.assertNotNull(pessoaEntrySet16);
        org.junit.Assert.assertNotNull(pessoaItor17);
        org.junit.Assert.assertNotNull(pessoaSet18);
        org.junit.Assert.assertNotNull(pessoaSet19);
        org.junit.Assert.assertNotNull(pessoaItor20);
        org.junit.Assert.assertNotNull(pessoaSet21);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge10 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge10.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge10.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge10.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet14 = unmodifiableMultiSetBridge10.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge10.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaEntrySet14);
        org.junit.Assert.assertNotNull(pessoaSet15);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unmodifiableMultiSetBridge0.setCount(pessoa6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass8 = pessoaSet7.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unmodifiableMultiSetBridge0.setCount(pessoa8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge11 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge11.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge11.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor14 = unmodifiableMultiSetBridge11.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet15 = unmodifiableMultiSetBridge11.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet16 = unmodifiableMultiSetBridge11.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet17 = unmodifiableMultiSetBridge11.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet18 = unmodifiableMultiSetBridge11.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaItor14);
        org.junit.Assert.assertNotNull(pessoaEntrySet15);
        org.junit.Assert.assertNotNull(pessoaEntrySet16);
        org.junit.Assert.assertNotNull(pessoaSet17);
        org.junit.Assert.assertNotNull(pessoaSet18);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa[] pessoaArray7 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList8 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList8, pessoaArray7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet15 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet17 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaEntrySet15);
        org.junit.Assert.assertNotNull(pessoaSet16);
        org.junit.Assert.assertNotNull(pessoaSet17);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa[] pessoaArray4 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList5 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList5, pessoaArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass10 = pessoaItor9.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeAll(pessoaCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass3 = pessoaItor2.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass8 = pessoaItor7.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor14 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor17 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet18 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaItor14);
        org.junit.Assert.assertNotNull(pessoaSet15);
        org.junit.Assert.assertNotNull(pessoaSet16);
        org.junit.Assert.assertNotNull(pessoaItor17);
        org.junit.Assert.assertNotNull(pessoaSet18);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass7 = pessoaEntrySet6.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge11 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge11.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge11.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor14 = unmodifiableMultiSetBridge11.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor15 = unmodifiableMultiSetBridge11.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge11.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet17 = unmodifiableMultiSetBridge11.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet18 = unmodifiableMultiSetBridge11.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaItor14);
        org.junit.Assert.assertNotNull(pessoaItor15);
        org.junit.Assert.assertNotNull(pessoaSet16);
        org.junit.Assert.assertNotNull(pessoaSet17);
        org.junit.Assert.assertNotNull(pessoaSet18);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet16 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaSet15);
        org.junit.Assert.assertNotNull(pessoaSet16);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unmodifiableMultiSetBridge0.setCount(pessoa9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.remove(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge11 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge11.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge11.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge11.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass8 = pessoaItor7.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass7 = pessoaItor6.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.remove(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.add(pessoa9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unmodifiableMultiSetBridge0.setCount(pessoa7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass7 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge7.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge7.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaSet15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass5 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass3 = pessoaSet2.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.add(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unmodifiableMultiSetBridge0.setCount(pessoa8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass7 = pessoaEntrySet6.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass9 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unmodifiableMultiSetBridge0.setCount(pessoa2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.remove(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.add(pessoa5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.add(pessoa8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge1.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge1.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge1.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge1.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge1.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unmodifiableMultiSetBridge0.setCount(pessoa9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.addAll(pessoaCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unmodifiableMultiSetBridge0.setCount(pessoa8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge4.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.retainAll(pessoaCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.remove(pessoa10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeAll(pessoaCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor14 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet15 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaItor14);
        org.junit.Assert.assertNotNull(pessoaSet15);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge12 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor13 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge12.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor15 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet16 = unmodifiableMultiSetBridge12.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor17 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet18 = unmodifiableMultiSetBridge12.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet19 = unmodifiableMultiSetBridge12.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet20 = unmodifiableMultiSetBridge12.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor21 = unmodifiableMultiSetBridge12.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet22 = unmodifiableMultiSetBridge12.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaItor15);
        org.junit.Assert.assertNotNull(pessoaEntrySet16);
        org.junit.Assert.assertNotNull(pessoaItor17);
        org.junit.Assert.assertNotNull(pessoaSet18);
        org.junit.Assert.assertNotNull(pessoaSet19);
        org.junit.Assert.assertNotNull(pessoaEntrySet20);
        org.junit.Assert.assertNotNull(pessoaItor21);
        org.junit.Assert.assertNotNull(pessoaSet22);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass5 = pessoaSet4.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.add(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass6 = pessoaItor5.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge4 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge4.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge4.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge4.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge4.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.remove(pessoa11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unmodifiableMultiSetBridge0.setCount(pessoa5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unmodifiableMultiSetBridge0.setCount(pessoa10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaSet9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor11 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaItor11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.add(pessoa3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaItor10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unmodifiableMultiSetBridge0.add(pessoa4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge2 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge2.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge2.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge2.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge8 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge8.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge8.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge8.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge8.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet15 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor16 = unmodifiableMultiSetBridge7.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor17 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet18 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
        org.junit.Assert.assertNotNull(pessoaEntrySet15);
        org.junit.Assert.assertNotNull(pessoaItor16);
        org.junit.Assert.assertNotNull(pessoaItor17);
        org.junit.Assert.assertNotNull(pessoaSet18);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet6 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaEntrySet6);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass8 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet9 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaSet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = unmodifiableMultiSetBridge0.remove(pessoa7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass8 = pessoaItor7.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet7 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge9 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge9.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge9.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge9.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge9.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaEntrySet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet11 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet12 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaEntrySet11);
        org.junit.Assert.assertNotNull(pessoaSet12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.remove(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge10 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge10.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor12 = unmodifiableMultiSetBridge10.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge10.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaItor12);
        org.junit.Assert.assertNotNull(pessoaSet13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge6 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge6.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge6.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet13 = unmodifiableMultiSetBridge6.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge6.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaSet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaSet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.lang.Class<?> wildcardClass9 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaItor7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.lang.Class<?> wildcardClass9 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge7 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge7.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet10 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge7.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet12 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet13 = unmodifiableMultiSetBridge7.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet14 = unmodifiableMultiSetBridge7.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaEntrySet10);
        org.junit.Assert.assertNotNull(pessoaSet11);
        org.junit.Assert.assertNotNull(pessoaEntrySet12);
        org.junit.Assert.assertNotNull(pessoaEntrySet13);
        org.junit.Assert.assertNotNull(pessoaSet14);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet10 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.Pessoa pessoa11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.add(pessoa11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
        org.junit.Assert.assertNotNull(pessoaSet10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet8 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.retainAll(pessoaCollection9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaEntrySet8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unmodifiableMultiSetBridge0.setCount(pessoa10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass4 = pessoaEntrySet3.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet8 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        java.util.function.Predicate<br.com.unicamp.mo409.Pessoa> pessoaPredicate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.removeIf(pessoaPredicate10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaSet8);
        org.junit.Assert.assertNotNull(pessoaItor9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.lang.Class<?> wildcardClass6 = unmodifiableMultiSetBridge0.getClass();
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge5 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge5.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet9 = unmodifiableMultiSetBridge5.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor10 = unmodifiableMultiSetBridge5.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet11 = unmodifiableMultiSetBridge5.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaEntrySet9);
        org.junit.Assert.assertNotNull(pessoaItor10);
        org.junit.Assert.assertNotNull(pessoaSet11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unmodifiableMultiSetBridge0.setCount(pessoa3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor5 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor9 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = unmodifiableMultiSetBridge0.remove(pessoa10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaItor5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
        org.junit.Assert.assertNotNull(pessoaItor9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor2 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet3 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet4 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        br.com.unicamp.mo409.Pessoa pessoa6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unmodifiableMultiSetBridge0.add(pessoa6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaItor2);
        org.junit.Assert.assertNotNull(pessoaEntrySet3);
        org.junit.Assert.assertNotNull(pessoaSet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet4 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet5 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaEntrySet4);
        org.junit.Assert.assertNotNull(pessoaEntrySet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet6 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet7 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor8 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unmodifiableMultiSetBridge0.add(pessoa9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaSet6);
        org.junit.Assert.assertNotNull(pessoaSet7);
        org.junit.Assert.assertNotNull(pessoaItor8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet1 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor3 = unmodifiableMultiSetBridge0.iterator();
        br.com.unicamp.mo409.Pessoa pessoa4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unmodifiableMultiSetBridge0.setCount(pessoa4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaSet1);
        org.junit.Assert.assertNotNull(pessoaSet2);
        org.junit.Assert.assertNotNull(pessoaItor3);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet2 = unmodifiableMultiSetBridge0.entrySet();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet3 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor4 = unmodifiableMultiSetBridge0.iterator();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet5 = unmodifiableMultiSetBridge0.uniqueSet();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor6 = unmodifiableMultiSetBridge0.iterator();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor7 = unmodifiableMultiSetBridge0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            unmodifiableMultiSetBridge0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pessoaItor1);
        org.junit.Assert.assertNotNull(pessoaEntrySet2);
        org.junit.Assert.assertNotNull(pessoaSet3);
        org.junit.Assert.assertNotNull(pessoaItor4);
        org.junit.Assert.assertNotNull(pessoaSet5);
        org.junit.Assert.assertNotNull(pessoaItor6);
        org.junit.Assert.assertNotNull(pessoaItor7);
    }
}

