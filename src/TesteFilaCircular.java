public class TesteFilaCircular {

    public static void main(String[] args) {
        FilaCircular filaCircular = new FilaCircular();

        System.out.println(filaCircular);
        filaCircular.adicionaNoComeco("elvis");
        System.out.println(filaCircular);
        filaCircular.adicionaNoComeco("luana");
        System.out.println(filaCircular);
        filaCircular.adicionaNoComeco("benjamin");
        System.out.println(filaCircular);

        filaCircular.adiciona("jose");
        System.out.println(filaCircular);

        filaCircular.adiciona(2, "rute");
        System.out.println(filaCircular);

        Object x = filaCircular.pega(2);
        System.out.println(x);

        System.out.println(filaCircular.tamanho());

        filaCircular.removeDoComeco();
        System.out.println(filaCircular);

        System.out.println(filaCircular.tamanho());

        filaCircular.removeDoFim();
        System.out.println(filaCircular);

        filaCircular.adiciona("jose");
        filaCircular.adiciona("maria");

        filaCircular.remove(0);

        System.out.println(filaCircular);

        System.out.println(filaCircular.contem("joao"));
        System.out.println(filaCircular.contem("pedro"));

    }
}