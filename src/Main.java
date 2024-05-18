// Classe de teste
public class Main {
    public static void main(String[] args) {
        // Criando objetos para diferentes tipos de retângulos com texto
        RetanguloComTexto retangulo1 = new RetanguloComTextoBordasArredondadas();
        RetanguloComTexto retangulo2 = new RetanguloComTextoLinhasDuplas();
        RetanguloComTexto retangulo3 = new RetanguloComTextoAsciiArt();

        // Desenhando os retângulos com texto
        retangulo1.desenhar("Texto com bordas arredondadas");
        retangulo2.desenhar("Texto com linhas duplas");
        retangulo3.desenhar("Texto com ASCII art");
    }
}