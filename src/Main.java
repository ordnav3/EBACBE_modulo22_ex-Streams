import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite o nome e o sexo separados por vírgula (ex: Maria,F), digite 'sair' para finalizar:");

        while (true){
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")){
                break;
            }
            String[] dados = entrada.split(",");
            if (dados.length == 2){
                pessoas.add(new Pessoa(dados[0].trim(), dados[1].trim()));
            }else {
                System.out.println("Entrada inválida. Use o formato: Nome,Sexo");
            }
        }
        scanner.close();

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .toList();

        System.out.println("Lista de Mulheres:");
        mulheres.forEach(m -> System.out.println(m.getNome()));
    }
}