import java.util.ArrayList;

class Texto {
  static String[] split(String s) {
    // não sei o tamanho final
    // preciso manipular os elementos

    // texto de exemplo
    int tamanho = 1;
    for (int i = 0; i < s.length(); i++)
      if (' ' == s.charAt(i)) tamanho++;
    
    String[] splitado = new String[tamanho];
    for (int i = 0; i < splitado.length; i++) {
      splitado[i] = "";
    }

    int indice = 0;
    for (int i = 0; i < s.length(); i++) {
      if (' ' == s.charAt(i)) indice++;
      else splitado[indice] += s.charAt(i);
    }

    return splitado;
  }
}
