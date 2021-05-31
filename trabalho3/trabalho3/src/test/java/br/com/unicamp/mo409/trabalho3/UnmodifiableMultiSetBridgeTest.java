package br.com.unicamp.mo409.trabalho3;

import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.Optional.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UnmodifiableMultiSetBridgeTest {

    @ParameterizedTest
    @MethodSource("provideDataForTestAdd")
    public void testAdd(Optional<Pessoa> objeto, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Pessoa pessoa = objeto.orElse(null);
        if (!permiteOperacao) {
            Executable executable = () -> coll.add(pessoa);
            assertUnsupportedOperation(executable);
        } else {
            coll.add(pessoa);
        }
    }

    private static Stream<Arguments> provideDataForTestAdd() {
        return Stream.of(
                Arguments.of(empty(), false),
                Arguments.of(of(new Pessoa()), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestAddAll")
    public void testAddAll(Optional<Collection<Pessoa>> objeto, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Collection<Pessoa> pessoa = objeto.orElse(null);
        if (!permiteOperacao) {
            Executable executable = () -> coll.addAll(pessoa);
            assertUnsupportedOperation(executable);
        } else {
            coll.addAll(pessoa);
        }
    }

    private static Stream<Arguments> provideDataForTestAddAll() {
        return Stream.of(
                Arguments.of(empty(), false),
                Arguments.of(of(Collections.singletonList(new Pessoa())), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestContains")
    public void testConstains(Optional<Pessoa> objeto, boolean objetoExisteNaColecao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Pessoa pessoa = objeto.orElse(null);
        if (objetoExisteNaColecao) {
            MultiSet<Pessoa> set = new HashMultiSet<>();
            set.add(pessoa);
            coll = new UnmodifiableMultiSetBridge(set);
        }

        boolean result = coll.contains(pessoa);
        assertEquals(objetoExisteNaColecao, result);
    }

    private static Stream<Arguments> provideDataForTestContains() {
        return Stream.of(
                Arguments.of(of(new Pessoa()), true),
                Arguments.of(of(new Pessoa()), false),
                Arguments.of(empty(), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestContainsAll")
    public void testConstainsAll(Optional<Collection<Pessoa>> colecaoOpt, boolean colecaoExisteNaColecao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Collection<Pessoa> colecao = colecaoOpt.orElse(null);

        if (colecaoExisteNaColecao) {
            MultiSet<Pessoa> set = new HashMultiSet(colecao);
            coll = new UnmodifiableMultiSetBridge(set);
        }

        boolean result = coll.containsAll(colecao);
        assertEquals(colecaoExisteNaColecao, result);
    }

    private static Stream<Arguments> provideDataForTestContainsAll() {
        return Stream.of(
                Arguments.of(of(Collections.singletonList(new Pessoa())), true),
                Arguments.of(of(Collections.singletonList(new Pessoa())), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestRemove")
    public void testRemove(Optional<Pessoa> objeto, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Pessoa pessoa = objeto.orElse(null);
        if (!permiteOperacao) {
            Executable executable = () -> coll.remove(pessoa);
            assertUnsupportedOperation(executable);
        } else {
            coll.remove(pessoa);
        }
    }

    private static Stream<Arguments> provideDataForTestRemove() {
        return Stream.of(
                Arguments.of(empty(), false),
                Arguments.of(of(new Pessoa()), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestRemoveAll")
    public void testRemoveAll(Optional<Collection<Pessoa>> objetoOpt, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Collection<Pessoa> colecao = objetoOpt.orElse(null);
        if (!permiteOperacao) {
            assertUnsupportedOperation(() -> coll.removeAll(colecao));
        } else {
            coll.removeAll(colecao);
        }
    }

    private static Stream<Arguments> provideDataForTestRemoveAll() {
        return Stream.of(
                Arguments.of(of(Collections.singletonList(new Pessoa())), false),
                Arguments.of(empty(), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestRemoveIf")
    public void testRemoveIf(Optional<Predicate<Pessoa>> predicadoOpt, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Predicate<Pessoa> predicado = predicadoOpt.orElse(null);
        if (!permiteOperacao) {
            assertUnsupportedOperation(() -> coll.removeIf(predicado));
        } else {
            coll.removeIf(predicado);
        }
    }

    private static Stream<Arguments> provideDataForTestRemoveIf() {
        return Stream.of(
                Arguments.of(of(Predicate.isEqual(new Pessoa())), false),
                Arguments.of(empty(), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestRetainAll")
    public void testRetainAll(Optional<Collection<Pessoa>> objetoOpt, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Collection<Pessoa> colecao = objetoOpt.orElse(null);
        if (!permiteOperacao) {
            assertUnsupportedOperation(() -> coll.retainAll(colecao));
        } else {
            coll.retainAll(colecao);
        }
    }

    private static Stream<Arguments> provideDataForTestRetainAll() {
        return Stream.of(
                Arguments.of(of(Collections.singletonList(new Pessoa())), false),
                Arguments.of(empty(), false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestSetCount")
    public void testSetCount(Optional<Pessoa> objetoOpt, int count, boolean permiteOperacao) {
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge();
        Pessoa objeto = objetoOpt.orElse(null);
        if (!permiteOperacao) {
            assertUnsupportedOperation(() -> coll.setCount(objeto, count));
        } else {
            coll.setCount(objeto, count);
        }
    }

    private static Stream<Arguments> provideDataForTestSetCount() {
        return Stream.of(
                Arguments.of(of(new Pessoa()), 1, false),
                Arguments.of(empty(), 1, false),

                Arguments.of(of(new Pessoa()), 2, false),
                Arguments.of(empty(), 2, false),

                Arguments.of(of(new Pessoa()), 3, false),
                Arguments.of(empty(), 3, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForTestSize")
    public void testSize(Optional<Collection<Pessoa>> objetoOpt, int returnValue) {
        Collection<Pessoa> colecao = objetoOpt.orElse(null);
        MultiSet<Pessoa> set = new HashMultiSet<>(colecao);
        UnmodifiableMultiSetBridge coll = new UnmodifiableMultiSetBridge(set);
        assertEquals(returnValue, coll.size());
    }

    private static Stream<Arguments> provideDataForTestSize() {
        return Stream.of(
                Arguments.of(of(Collections.singletonList(new Pessoa())), 1),
                Arguments.of(of(Collections.emptyList()), 0)
        );
    }

    private void assertUnsupportedOperation(Executable executable) {
        assertThrows(UnsupportedOperationException.class, executable);
    }

}
