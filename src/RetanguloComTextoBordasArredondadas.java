// Implementação para um retângulo com bordas arredondadas e texto
public class RetanguloComTextoBordasArredondadas implements RetanguloComTexto {
    @Override
    public void desenhar(String texto) {
        int largura = texto.length() + 4;
        System.out.println("╭" + "─".repeat(largura - 2) + "╮");
        System.out.println("│ " + texto + " │");
        System.out.println("╰" + "─".repeat(largura - 2) + "╯");
    }
}
