public class PrecoMedioBombom {
    public static void main(String[] args) {
        //preço das últimas 3 vendas realizas // 
        int preco1 = 5;
        int preco2 = 8;
        int preco3 = 12;

        int mediaPrecos = (preco1 + preco2 + preco3) / 3;
        System.out.println("\" Sistema de Calculo de Media \"");
        System.out.println("Preco1: " + preco1);
        System.out.println("Preco2: " + preco2);
        System.out.println("Preco3: " + preco3);
        System.out.println("\nMedia dos precos:\n" + mediaPrecos);

        int notaAluno1 = 10;
        int notaAluno2 = 9;
        int notaAluno3 = 7;

        int mediaDosAlunos = ( notaAluno1 + notaAluno2 + notaAluno3 ) / 3;
        System.out.println("\nMedia dos alunos:\n " + mediaDosAlunos);

    }

}