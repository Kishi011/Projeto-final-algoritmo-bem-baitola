public class Admin implements Usuario {
  String login;
  String senha;

  public Admin() {
    
  }
  
  public Admin(String login) {
      this.login = login;
  }
  
  public void cadastrarUsuario() {
      
  }
  
  public void visualizarRelatorioVendas() {
      
  }

  @Override
  public void main() {
    System.out.println("Logado como Administrador");
    try {
        int opt;
        do {
            this.menu();
            opt = scan.nextInt();
            switch(opt) {
                case 0:
                    break;
                case 1:
                    // menuGerenciarProdutos
                    break;
                case 2:
                    // menuGerenciarFuncionarios
                    break;
                case 3:
                    // menuGerenciarVendas
                    break;
                case 4:
                    // this.trocaPerfil();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while(opt != 0);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
  }
  
  @Override
  public void menu() {
      System.out.println("MENU");
      System.out.println("1 - GERENCIAR PRODUTOS");
      System.out.println("2 - GERENCIAR FUNCIONARIOS");
      System.out.println("3 - GERENCIAR VENDAS");
      System.out.println("4 - TROCAR PERFIL");
      System.out.println("0 - SAIR");
  }

@Override
public String getLogin() {
    return this.login;
}
}