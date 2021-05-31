import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa[] pessoaArray1 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList2 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList2, pessoaArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.removeAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<br.com.unicamp.mo409.Pessoa>> pessoaEntrySet1 = unmodifiableMultiSetBridge0.entrySet();
        org.junit.Assert.assertNotNull(pessoaEntrySet1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = unmodifiableMultiSetBridge0.add(pessoa1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa[] pessoaArray1 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList2 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList2, pessoaArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = unmodifiableMultiSetBridge0.removeAll(pessoaCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa[] pessoaArray1 = new br.com.unicamp.mo409.Pessoa[] {};
        java.util.ArrayList<br.com.unicamp.mo409.Pessoa> pessoaList2 = new java.util.ArrayList<br.com.unicamp.mo409.Pessoa>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList2, pessoaArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaList2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge1 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Set<br.com.unicamp.mo409.Pessoa> pessoaSet2 = unmodifiableMultiSetBridge1.uniqueSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unmodifiableMultiSetBridge0.retainAll((java.util.Collection<br.com.unicamp.mo409.Pessoa>) pessoaSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Iterator<br.com.unicamp.mo409.Pessoa> pessoaItor1 = unmodifiableMultiSetBridge0.iterator();
        org.junit.Assert.assertNotNull(pessoaItor1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        java.util.Collection<br.com.unicamp.mo409.Pessoa> pessoaCollection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = unmodifiableMultiSetBridge0.retainAll(pessoaCollection1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        br.com.unicamp.mo409.UnmodifiableMultiSetBridge unmodifiableMultiSetBridge0 = new br.com.unicamp.mo409.UnmodifiableMultiSetBridge();
        br.com.unicamp.mo409.Pessoa pessoa1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unmodifiableMultiSetBridge0.setCount(pessoa1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }
}

