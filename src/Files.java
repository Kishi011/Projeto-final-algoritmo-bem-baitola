public enum Files {
  
  ADMIN_LOGIN_FILE("public/admin_login.txt"),
  FUNCIONARIO_LOGIN_FILE("public/funcionario_login.txt"),
  PRODUTOS_FILE("public/produtos.txt");

  private String filePath;

  private Files(String filePath) {
    this.filePath = filePath;
  }

  public String getFilePath() {
    return this.filePath;
  }
}
