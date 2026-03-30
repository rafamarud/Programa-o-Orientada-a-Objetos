public class Ex7Excecoes {

    // Teste 1: NullPointerException
    static void testeNullPointer() {
        System.out.println("--- Teste NullPointerException ---");
        try {
            String texto = null;
            System.out.println(texto.length()); // tenta usar objeto null
        } catch (NullPointerException e) {
            System.out.println("[Erro] Tentou usar um objeto que é null.");
        }
    }

    // Teste 2: StackOverflowError
    static void contar() {
        contar(); // chama a si mesma infinitamente
    }

    static void testeStackOverflow() {
        System.out.println("--- Teste StackOverflowError ---");
        try {
            contar();
        } catch (StackOverflowError e) {
            System.out.println("[Erro] Recursão infinita esgotou a pilha de chamadas.");
        }
    }

    public static void main(String[] args) {
        testeNullPointer();
        testeStackOverflow();

        /*
         * EXCEÇÕES MAIS COMUNS DO JAVA:
         *
         * Exception
         *   Mãe de quase todas as exceções. Usada como genérica quando
         *   não se sabe o tipo específico do erro.
         *
         * IOException
         *   Ocorre em falhas de leitura/escrita de arquivos ou rede.
         *   Checked — o compilador exige que seja tratada.
         *
         * NumberFormatException
         *   Lançada quando Integer.parseInt() ou Double.parseDouble()
         *   recebem uma String que não representa um número válido.
         *
         * NullPointerException
         *   Ocorre ao tentar usar métodos ou atributos de um objeto null.
         *
         * ArithmeticException
         *   Erros matemáticos, como divisão por zero em inteiros.
         *
         * ArrayIndexOutOfBoundsException
         *   Acesso a um índice que não existe no array (negativo ou >= length).
         *
         * InputMismatchException
         *   O Scanner recebe um tipo diferente do esperado (ex: texto quando
         *   se espera inteiro via nextInt()).
         *
         * IllegalArgumentException
         *   Argumento passado a um método é inválido para aquele contexto.
         *
         * ClassCastException
         *   Tentativa de converter um objeto para um tipo incompatível.
         *
         * StackOverflowError
         *   Recursão infinita esgota a memória reservada para a pilha de
         *   chamadas. É um Error, não Exception, mas pode ser capturado.
         */
    }
}
