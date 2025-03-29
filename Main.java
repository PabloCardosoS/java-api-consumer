import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.print("Digite um número de CEP para conwsulta: ");
        String cep = scanner.nextLine();

        try {
            Endereco endereco1 = consultaCep.consultaEndereco("90480000");
            System.out.println(endereco1);

            GeraArquivo geraArquivo = new GeraArquivo();
            geraArquivo.geraJson(endereco1);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("FINALIZANDO!");
        }
    }
}
