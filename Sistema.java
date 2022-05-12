import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Sistema {
 
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
       
        ArrayList<Cliente> listaClientes = new ArrayList<>();
       
        int opcao;
        int id;
        String nome;
        int idade;
 
        do {        
            System.out.printf("===> Macgyver Internet Banking <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir cliente/conta \n" +
                              "2 - Depósito \n" +
                              "3 - Saque \n" +
                              "4 - Transferência \n" +
                              "5 - Consulta de saldo \n" +
                              "6 - Extrato \n" +
                              "7 - Sair\n\n");
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
           
            if (opcao == 1) {
                Cliente c = new Cliente();
               
                id = listaClientes.size() + 1;
                c.setId(id);
               
                System.out.printf("\nDigite o nome do cliente: ");
                nome = ler.next();
                c.setNome(nome);
               
                System.out.printf("Digite a idade do cliente: ");
                idade = ler.nextInt();
                c.setIdade(idade);
                
                ContaBancaria cb = new ContaBancaria();
                
                cb.setAgencia("4422");
                
                int n = rand.nextInt(1000);
                cb.setNumero();
                
                
                
               
                listaAlunos.add(aluno);
               
                System.out.printf("Aluno incluído com sucesso!");
                System.in.read();
            }
            else if (opcao == 2) {          
                for(Aluno a: listaAlunos) {
                    System.out.printf("ID: %d - Nome: %s - RA: %s \n", a.getId(), a.getNome(), a.getRa());
                }
               
                System.out.printf("\nDigite o id do aluno que deseja atualizar: ");
                id = ler.nextInt();
               
                System.out.printf("Digite o novo nome do aluno: ");
                nome = ler.next();
               
                System.out.printf("Digite o novo ra do aluno: ");
                ra = ler.next();
               
                Aluno aluno = listaAlunos.get(id-1);
               
                aluno.setNome(nome);
                aluno.setRa(ra);
               
                System.out.printf("Aluno atualizado com sucesso!");
                System.in.read();
            }
            else if (opcao == 3) {
                for(Aluno a: listaAlunos) {
                    System.out.printf("ID: %d - Nome: %s - RA: %s \n", a.getId(), a.getNome(), a.getRa());
                }
               
                System.out.printf("\nDigite o id do aluno para exclusão: ");
                id = ler.nextInt();
 
                listaAlunos.remove(id-1);
               
                System.out.printf("Aluno excluído com sucesso!");
                System.in.read();
            }
            else if (opcao == 4) {
                for(Aluno a: listaAlunos) {
                    System.out.printf("ID: %d - Nome: %s - RA: %s \n", a.getId(), a.getNome(), a.getRa());
                }
               
                System.in.read();
            }
        }while(opcao != 7);
       
       
    }
}
