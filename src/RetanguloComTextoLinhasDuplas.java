// Implementação para um retângulo com linhas duplas e texto
public class RetanguloComTextoLinhasDuplas implements RetanguloComTexto {
    @Override
    public void desenhar(String texto) {
        int largura = texto.length() + 4;
        System.out.println("╔" + "═".repeat(largura - 2) + "╗");
        System.out.println("║ " + texto + " ║");
        System.out.println("╚" + "═".repeat(largura - 2) + "╝");
    }
}