import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestesTest {
    @Test
    public void testeListaMulheres() {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Maria", "F"),
                new Pessoa("João", "M"),
                new Pessoa("Ana", "F"),
                new Pessoa("Carlos", "M"),
                new Pessoa("Julia", "F")
        );

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .toList();

        assertTrue("A lista contém pessoas que não são mulheres!", mulheres.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("F")));
    }
}