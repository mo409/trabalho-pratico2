package br.com.unicamp.mo409;

import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.multiset.UnmodifiableMultiSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

public class UnmodifiableMultiSetBridge {

    private UnmodifiableMultiSet<Pessoa> unmodifiableMultiSet;
    private MultiSet<Pessoa> multiset;

    public UnmodifiableMultiSetBridge() {
        multiset = new HashMultiSet<>();
        unmodifiableMultiSet = (UnmodifiableMultiSet<Pessoa>) UnmodifiableMultiSet.unmodifiableMultiSet(multiset);
    }

    public Iterator<Pessoa> iterator() {
        return unmodifiableMultiSet.iterator();
    }

    public boolean add(Pessoa pessoa) {
        return unmodifiableMultiSet.add(pessoa);
    }

    public boolean addAll(final Collection<Pessoa> coll) {
        return unmodifiableMultiSet.addAll(coll);
    }

    public void clear() {
        unmodifiableMultiSet.clear();
    }

    public boolean remove(Pessoa pessoa) {
        return unmodifiableMultiSet.remove(pessoa);
    }

    public boolean removeIf(final Predicate<Pessoa> filter) {
        return unmodifiableMultiSet.removeIf(filter);
    }

    public boolean removeAll(final Collection<Pessoa> coll) {
        return unmodifiableMultiSet.removeAll(coll);
    }

    public boolean retainAll(final Collection<?> coll) {
        return unmodifiableMultiSet.retainAll(coll);
    }

    public int setCount(final Pessoa pessoa, final int count) {
        return unmodifiableMultiSet.setCount(pessoa, count);
    }

    public Set<Pessoa> uniqueSet() {
        return unmodifiableMultiSet.uniqueSet();
    }

    public Set<MultiSet.Entry<Pessoa>> entrySet() {
        return unmodifiableMultiSet.entrySet();
    }

}
