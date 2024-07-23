import java.util.ArrayList;

class App {
  public static void main(String[] args) {
    //              0     1  2
    //             [texto,de,exemplo]
    String texto = "texto de exemplo"; // variável
    // <String> parâmetro de tipo
    ArrayList<String> partes = Texto.split(texto);
    System.out.println(partes); // String[]@123123
    System.out.println(partes.size()); // 3
    System.out.println(partes.get(0)); // texto
    System.out.println(partes.get(1)); // de
    System.out.println(partes.get(2)); // exemplo

  }
}