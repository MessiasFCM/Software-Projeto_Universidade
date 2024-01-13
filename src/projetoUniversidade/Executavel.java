package projetoUniversidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

// Programa criado por João Victor e Messias Feres
// Turma: Informática 3

public class Executavel {
    
    public static void main(String[] args) { // Classe executável do programa
        // Algumas variáveis que utilizaremos no programa de forma geral
        int escolha = 0;
        int cont;
        int numeroAluno;
        int numeroDisciplina;
        String resultado;
        
        // ArrayLists utilizados para armazenas os dados em listas
        ArrayList<Disciplina> listaDisciplina = new ArrayList<>(); 
        ArrayList<Disciplina> disciplinaAdicionar = new ArrayList<>();
        ArrayList<Aluno> listaAluno= new ArrayList<>();
        ArrayList<Historico> listaHistorico= new ArrayList<>();
        
        // Puxa o mês do aparelho operacional do usuário no momento
        String data = LocalDate.now().toString(); 
        
        // Vetores utilizados no programa
        String[] dataSeparada = data.split("-");
        char[] notasConceito = new char[100];
        int[] notasNumericas = new int[100];
        
        // Scanner utilizado para realizar a entrada de dados do usuário
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoL = new Scanner(System.in);

        // Informações registradas no sistema
        Departamento depInfo = new Departamento("Departamento de Informática", 1, 1, "+55 (31) 9 9999-8888");
        Departamento depAdm = new Departamento("Departamento de Administração", 2, 2, "+55 (31) 9 9999-7777");

        Curso cursoInfo = new Curso("Curso Técnico em Informática", 
                "Nesse curso aprenderemos sobre a área de Informática", 1, 300, 5, depInfo);
        Curso cursoAdm = new Curso("Bacharelado em Administração", 
                "Nesse curso aprenderemos sobre a área da Administração", 2, 200, 5, depAdm);

        listaDisciplina.add(new Disciplina("Carlos Eduardo","Programação 1", 1, 2021, cursoInfo, 0));
        listaDisciplina.add(new Disciplina("Daniela","Programação OO", 1, 2021, cursoInfo, 1));
        listaDisciplina.add(new Disciplina("Saulo","Tópicos em Desenvolvimento", 1, 2021, cursoInfo, 2));
        listaDisciplina.add(new Disciplina("Cenoura","Gestão Empresarial", 1, 2021, cursoAdm, 3));
        listaDisciplina.add(new Disciplina("Diogo","Gestão Ambiental", 1, 2021, cursoAdm, 4));

        listaAluno.add(new Aluno("Gilberto", 47301, "588.749.126-41", 
                "Rua dos Gerânios - GO", "(62) 2523-6572", LocalDate.of(1999, 07, 10), 
                "Masculino", "Informática 3", depInfo, null, "Graduação"));
        listaAluno.add(new Aluno("Guilherme", 47302, "624.690.099-28", 
                "Alameda Alto Astral - RR", "(95) 99410-9303", LocalDate.of(1999, 03, 10), 
                "Masculino", "Informática 3", depInfo, null, "Graduação"));
        listaAluno.add(new Aluno("Cristiane", 47303, "664.019.003-69", 
                "Rua Leme - MG", "(31) 99518-3340", LocalDate.of(1999, 12, 27), 
                "Feminino", "Informática 3", depInfo, depAdm, "Graduação"));
        listaAluno.add(new Aluno("Jaqueline", 47304, "364.859.591-14", 
                "Rua Bragança - MA", "(98) 99615-0040", LocalDate.of(1999, 10, 01), 
                "Feminino", "Informática 3", depInfo, null, "Graduação"));
        listaAluno.add(new Aluno("Lúcia", 47305, "796.246.759-29", 
                "Rua Carazinho - RJ", "(21) 98125-6298", LocalDate.of(1999, 05, 07), 
                "Feminino", "Administração 3", depAdm, null, "Graduação"));
        listaAluno.add(new Aluno("Amanda", 47306, "510.122.666-13", 
                "Rua Professor Jorge Valente - BA", "(71) 98377-7929", LocalDate.of(1999, 07, 25), 
                "Feminino", "Administração 3", depAdm, null, "Graduação"));
        listaAluno.add(new Aluno("Otávio", 47307, "501.915.007-04", 
                "Rua Adelino José Oliveira - MT", "(66) 99220-1111", LocalDate.of(1999, 05, 10), 
                "Masculino", "Administração 3", depAdm, depInfo, "Graduação"));
        listaAluno.add(new Aluno("Isis", 47308, "103.388.069-89", 
                "Quadra 1007 Sul Avenida NS 7 - TO", "(63) 98937-9358", LocalDate.of(1999, 07, 02), 
                "Feminino", "Administração 3", depAdm, null, "Graduação"));
        
        // Início da visualização do Usuário
        System.out.println("Projeto Universidade");
        
        while (escolha!=5) {          
            
            System.out.println("\nMenu");
            System.out.println("1 - Cadatrar Disciplina");
            System.out.println("2 - Matricular Aluno em uma Disciplina");
            System.out.println("3 - Registrar Nota de um Aluno");
            System.out.println("4 - Listar Alunos Aprovados e Reprovados em uma Disciplina");
            System.out.println("5 - Sair");
            System.out.print("\nDigite o número de sua escolha: ");
            escolha = tecladoN.nextInt();

            switch(escolha){
                case 1: { // Cadatrar Disciplina
                    System.out.println("\nCadastramento de Disciplinas");
                    System.out.print("Digite o nome do professor: ");
                    String professor = tecladoL.nextLine();
                    System.out.print("Digite o nome da disciplina: ");
                    String nomeDisciplina = tecladoL.nextLine();
                    
                    int mes = Integer.parseInt(dataSeparada[1]);
                    int semestre;
                    if( mes > 6){
                        semestre = 2;
                    }else{
                        semestre = 1;
                    }
                    int ano = Integer.parseInt(dataSeparada[0]);
                    
                    int cursoSelecionado;
                    System.out.println("\nCursos disponíveis");
                    System.out.println("1 - Bacharelado em Administração");
                    System.out.println("2 - Curso Técnico em Informática");
                    System.out.print("Digite o número do curso onde deseja registrar a disciplina: ");
                    String curso = tecladoL.nextLine();
                    if("1".equals(curso)){
                        cursoSelecionado = 1;
                    }else if("2".equals(curso)){
                        cursoSelecionado = 2;
                    }else{
                        System.out.println("Curso inexistente");
                        break;
                    }
                    cont = 0;
                    for(Disciplina d: listaDisciplina){
                        if(cont == d.getNumeroDisciplina()){
                            cont++;
                        }
                    }
                    numeroDisciplina = cont;
                    for(Disciplina d: listaDisciplina){ // Valida se a disciplina já foi registrada anteriormente
                        if(d.getNomeDisciplina().equals(nomeDisciplina)){
                            System.out.println("Essa diciplina já existe");
                            cursoSelecionado = 0;
                            break;
                        }
                    }
                    if(cursoSelecionado == 1){  // Adiciona a nova Disciplina
                        Disciplina novaDisciplina = new Disciplina(professor, nomeDisciplina,semestre, ano, cursoAdm, numeroDisciplina);
                        listaDisciplina.add(novaDisciplina);
                        System.out.println("Disciplina cadastrada com sucesso!");
                    }else{
                        if(cursoSelecionado == 2){  // Adiciona a nova Disciplina
                            Disciplina novaDisciplina = new Disciplina(professor, nomeDisciplina,semestre, ano, cursoInfo, numeroDisciplina);
                            listaDisciplina.add(novaDisciplina);
                            System.out.println("Disciplina cadastrada com sucesso!");
                        }
                    }
                    break;
                }
                case 2: // Matricular Aluno em uma Disciplina
                    System.out.println("\nMatricula de alunos em uma disciplina");
                    System.out.println("Lista dos alunos matriculados na intituição:");
                    for(Aluno a: listaAluno){   // Faz a exibição dos Alunos e seu número de matricula
                        System.out.println(a.getNumeroMatricula()+ " - " + a.getNome());
                    }   
                    System.out.print("Digite o número do aluno: ");
                    numeroAluno = tecladoN.nextInt();
                    cont = 0;
                    for(Aluno a: listaAluno){   // Verifica se o ID pertence a um aluno matriculado
                        if(numeroAluno == a.getNumeroMatricula()){
                            cont++;
                        }
                    } 
                    if(cont == 0){
                        System.out.println("ID inexistente");
                        break;
                    }
                    System.out.println();
                    
                    for(Disciplina d: listaDisciplina){ // Faz a exibição das Disciplinas
                        System.out.println(d.getNumeroDisciplina() + " - " + d.getNomeDisciplina());
                    }   
                    System.out.print("Digite o número da disciplina: ");
                    numeroDisciplina = tecladoN.nextInt();
                    for(Historico h: listaHistorico){   // Analisa para ver se o aluno já está registrado em outra disciplina, se sim, adiciona a nova disciplina em um array já existente, se não, cria um novo array
                        for(Aluno a: listaAluno){
                            if(a.getNumeroMatricula() == numeroAluno){
                                if(a == h.getAluno()){
                                    h.getDisciplina().add(listaDisciplina.get(numeroDisciplina));
                                    System.out.println("Aluno foi adicionado à disciplina com sucesso!");
                                    break;
                                }
                            }
                        } 
                    }
                        
                    disciplinaAdicionar.add(listaDisciplina.get(numeroDisciplina));
                    
                    for(Aluno a: listaAluno){   // Matricula o aluno na disciplina
                        if(numeroAluno == a.getNumeroMatricula()){
                            listaHistorico.add(new Historico(a, disciplinaAdicionar, null, null));
                            System.out.println("Aluno foi adicionado à disciplina com sucesso!");
                        }
                    }
                   
                    break;  
                case 3: // Registrar Nota de um Aluno
                    System.out.println("\nRegistrar nota de um aluno");
                    System.out.println("Lista das disciplinas cadastradas:");
                    for(Disciplina d: listaDisciplina){ // Faz a exibição das Disciplinas
                        System.out.println(d.getNumeroDisciplina() + " - " + d.getNomeDisciplina());
                    }   
                    System.out.print("Digite o número da disciplina: ");
                    numeroDisciplina = tecladoN.nextInt();
                    
                    cont=0;
                    for(Historico h:listaHistorico) {   // Faz a exibição dos alunos registrados na disciplina escolhida
                        if(h.getDisciplina().isEmpty() == listaDisciplina.contains(numeroDisciplina)){
                            System.out.println(h.getAluno().getNumeroMatricula()+ " - " + h.getAluno().getNome());
                            cont++;
                        }
                    }
                    if(cont == 0){
                        System.out.println("Nenhum aluno registrado nessa disciplina");
                        break;
                    }
                    System.out.print("Digite o número do aluno: ");
                    numeroAluno = tecladoN.nextInt();
                    
                    System.out.print("Digite a nota do aluno: ");
                    int nota = tecladoN.nextInt();
                    
                    // Faz a analise da nota do aluno, atribuindo o conceito
                    if(nota <11){
                        notasConceito[numeroDisciplina] = 'F';
                        notasNumericas[numeroDisciplina] = nota;
                    }else if(nota>10 && nota<21){
                        notasConceito[numeroDisciplina] = 'E';
                        notasNumericas[numeroDisciplina] = nota;
                    }else if(nota>20 && nota<41){
                        notasConceito[numeroDisciplina] = 'D';
                        notasNumericas[numeroDisciplina] = nota;
                    }else if(nota>40 && nota<61){
                        notasConceito[numeroDisciplina] = 'C';
                        notasNumericas[numeroDisciplina] = nota;
                    }else if(nota>60 && nota<81){
                        notasConceito[numeroDisciplina] = 'B';
                        notasNumericas[numeroDisciplina] = nota;
                    }else if(nota>80 && nota<101){
                        notasConceito[numeroDisciplina] = 'A';
                        notasNumericas[numeroDisciplina] = nota;
                    }
                    
                    for(Historico h: listaHistorico){   // Seta a nota e o conceito do aluno na discuplina escolhida
                        if(h.getAluno().getNumeroMatricula() == numeroAluno){
                            h.setNotasConceito(notasConceito);
                            h.setNotasNumericas(notasNumericas);
                        }
                    }
                    System.out.println("Conceito foi atribuído com sucesso!");
                    break;
                case 4: // Listar Alunos Aprovados e Reprovados em uma Disciplina
                    System.out.println("\nListar o resultado dos alunos em uma disciplina");
                     for(Disciplina d: listaDisciplina){    // Faz a exibição das Disciplinas
                        System.out.println(d.getNumeroDisciplina() + " - " + d.getNomeDisciplina());
                    }   
                    System.out.print("Digite o número da disciplina: ");
                    numeroDisciplina = tecladoN.nextInt();
                    
                    cont=0;
                    for(Historico h:listaHistorico) {   // Faz a exibição dos Resultados, assim como o nome e a matricula do aluno
                        if(h.getDisciplina().isEmpty() == listaDisciplina.contains(numeroDisciplina)){
                           int[] notasNumericasAtribuidas = h.getNotasNumericas();
                           if(notasNumericasAtribuidas[numeroDisciplina] >= 60){
                               resultado = "Aprovado";
                           }else{
                               resultado = "Reprovado";
                           }     
                            System.out.println(h.getAluno().getNumeroMatricula()+ " - " + h.getAluno().getNome() + " - " + resultado);
                            cont++;
                        }
                    }
                    if(cont == 0){
                        System.out.println("Nenhum aluno registrado nessa disciplina");
                        break;
                    }
                    
                    break;
                case 5: // Sair
                    System.out.println("Encerrando sessão");   
                    break;
                default:
                    System.out.println("Escolha inválida");
            }
        }
        // Encerrando o Scanner (teclado) utilizado no programa
        tecladoL.close();
        tecladoN.close();
    }
    
}
