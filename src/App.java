import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Produto[] produto = new Produto[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < produto.length; i++){
            produto[i] = new Produto();

            boolean verificaNomeValido = true;

            do {
                System.out.print("Informe o nome do " + (i+1) + "° produto: ");
                produto[i].setNomeProduto(sc.nextLine());

                //VERIFICA SE O NOME DO PRODUTO JÁ É EXISTENTE
                for (int j = 0; j < i; j++ ){
                    verificaNomeValido = true;
                    if (produto[i].getNomeProduto().equals(produto[j].getNomeProduto())){
                        System.out.print("Nome de produto já existente!\n");
                        verificaNomeValido = false;
                    }
                }
            }while (!verificaNomeValido);

            System.out.print("Informe a descrição do " + (i+1) + "° produto: ");
            produto[i].setDescricaoProduto(sc.nextLine());

            do {
                System.out.print("Informe o valor do " + (i+1) + "° produto: ");
                produto[i].setValorProduto(Double.parseDouble(sc.nextLine()));

                if (produto[i].getValorProduto() < 0){
                    System.out.println("Valor inválido!");
                }
            }while (produto[i].getValorProduto() < 0);

            do {
                System.out.print("Informe a quantidade em estoque do " + (i+1) + "° produto: ");
                produto[i].setQuantidadeEstoque(Integer.parseInt(sc.nextLine()));

                if (produto[i].getQuantidadeEstoque() < 0){
                    System.out.println("Valor inválido!");
                }
            }while (produto[i].getQuantidadeEstoque() < 0);
        }

        double valorTotalProdutoInferior = 0;
        double valorTotal = 0;
        double total = 0;
        int estoqueTotal = 0;

        //SOMA O VALOR TOTAL DOS PRODUTOS, DE ESTOQUE E DE ESTOQUE <= 5
        System.out.println("==============================");
        for (int i = 0; i < produto.length; i++){
            if (produto[i].getQuantidadeEstoque() <= 5){
                System.out.println(produto[i].getNomeProduto() + " tem estoque menor ou igual 5");
                valorTotalProdutoInferior += (produto[i].getValorProduto()*produto[i].getQuantidadeEstoque());
            }
            valorTotal += (produto[i].getValorProduto()*produto[i].getQuantidadeEstoque());
            total += produto[i].getValorProduto();
            estoqueTotal += produto[i].getQuantidadeEstoque();
        }
        System.out.println("==============================");
        for (int i = 0; i < produto.length; i++){
            System.out.println("Nome do " + (i + 1) + "° produto: " + produto[i].getNomeProduto());
            System.out.println("Descrição do " + (i + 1) + "° produto: " + produto[i].getDescricaoProduto());
            System.out.println("Valor do " + (i + 1) + "° produto: " + produto[i].getValorProduto());
            System.out.println("Estoque do " + (i + 1) + "° produto: " + produto[i].getQuantidadeEstoque());
            System.out.println("==============================");
        }

        double media = total / produto.length;

        System.out.println("==============================");

        System.out.println("Valor total dos produtos: " + valorTotal);
        System.out.println("Valor total dos produtos com quantidade de estoque menores ou iguais a 5: " + valorTotalProdutoInferior);
        System.out.println("Estoque total de produtos: " + estoqueTotal);
        System.out.println("Média do valor dos produtos: " + media);
    }
}