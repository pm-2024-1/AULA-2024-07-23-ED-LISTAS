import java.util.ArrayList;
// "programacao  modular" => 
// ["programacao", "", "modular"]
class Texto {
  static ArrayList<String> split(String s) {
    // texto de exemplo
    ArrayList<String> splitado = new ArrayList<>();
    
    String trecho = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        trecho += s.charAt(i);
      } else {
        splitado.add(trecho);
        trecho = "";
      }
    }
    splitado.add(trecho);

    return splitado;
  }
}
