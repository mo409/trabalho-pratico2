import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection0 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        java.lang.Object[] objArray1 = serializableCollection0.toArray();
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection2 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection2.clear();
        java.io.Serializable serializable4 = null;
        boolean boolean5 = serializableCollection2.add(serializable4);
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection6 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection6.clear();
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection8 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection8.clear();
        boolean boolean11 = serializableCollection8.equals((java.lang.Object) (byte) 0);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator12 = serializableCollection8.spliterator();
        boolean boolean13 = serializableCollection6.addAll((java.util.Collection<java.io.Serializable>) serializableCollection8);
        boolean boolean14 = serializableCollection2.containsAll((java.util.Collection<java.io.Serializable>) serializableCollection6);
        int int16 = serializableCollection0.add((java.io.Serializable) serializableCollection2, (int) (byte) 1);
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection17 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection17.clear();
        java.io.Serializable serializable19 = null;
        boolean boolean20 = serializableCollection17.add(serializable19);
        java.util.Iterator<java.io.Serializable> serializableItor21 = serializableCollection17.iterator();
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection22 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection22.clear();
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection24 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection24.clear();
        boolean boolean27 = serializableCollection24.equals((java.lang.Object) (byte) 0);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator28 = serializableCollection24.spliterator();
        boolean boolean29 = serializableCollection22.addAll((java.util.Collection<java.io.Serializable>) serializableCollection24);
        org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable> serializableCollection30 = new org.apache.commons.collections4.multiset.HashMultiSet<java.io.Serializable>();
        serializableCollection30.clear();
        java.io.Serializable serializable32 = null;
        boolean boolean33 = serializableCollection30.add(serializable32);
        boolean boolean34 = serializableCollection22.containsAll((java.util.Collection<java.io.Serializable>) serializableCollection30);
        boolean boolean36 = serializableCollection22.equals((java.lang.Object) 10L);
        java.util.Set<org.apache.commons.collections4.MultiSet.Entry<java.io.Serializable>> serializableEntrySet37 = serializableCollection22.entrySet();
        boolean boolean38 = serializableCollection17.removeAll((java.util.Collection<java.io.Serializable>) serializableCollection22);
        int int40 = serializableCollection2.setCount((java.io.Serializable) serializableCollection22, 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on serializableCollection0 and serializableCollection17.", serializableCollection0.equals(serializableCollection17) == serializableCollection17.equals(serializableCollection0));
    }
}

