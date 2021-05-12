package br.com.unicamp.mo409;

import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.multiset.UnmodifiableMultiSet;

public class UnmodifiableMultiSetBridge {

    private UnmodifiableMultiSet<Object> unmodifiableMultiSet;
    private MultiSet<Object> multiset;

    public UnmodifiableMultiSetBridge() {
        multiset = new HashMultiSet<>();
        unmodifiableMultiSet = (UnmodifiableMultiSet<Object>) UnmodifiableMultiSet.unmodifiableMultiSet(multiset);
    }

    public void add(Object object) {
        unmodifiableMultiSet.add(object);
    }

}
