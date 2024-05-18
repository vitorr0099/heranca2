// Implementação para um retângulo com ASCII art e texto
public class RetanguloComTextoAsciiArt implements RetanguloComTexto {
    @Override
    public void desenhar(String texto) {
        int largura = texto.length() + 4;
        System.out.println("#######################");
        System.out.println("# " + texto + " #");
        System.out.println("#######################");
    }
}