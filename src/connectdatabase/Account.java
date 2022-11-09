package connectdatabase;

public class Account {
  private int id;
  private String userName;
  private String pass;
  private int isSell;
  private int iSAdmin;

  public Account(int id, String userName, String pass, int isSell, int iSAdmin) {
    this.id = id;
    this.userName = userName;
    this.pass = pass;
    this.isSell = isSell;
    this.iSAdmin = iSAdmin;
  }

  public Account(String userName, String pass, int isSell, int iSAdmin) {
    this.userName = userName;
    this.pass = pass;
    this.isSell = isSell;
    this.iSAdmin = iSAdmin;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  public int getIsSell() {
    return isSell;
  }

  public void setIsSell(int isSell) {
    this.isSell = isSell;
  }

  public int getiSAdmin() {
    return iSAdmin;
  }

  public void setiSAdmin(int iSAdmin) {
    this.iSAdmin = iSAdmin;
  }

  @Override
  public String toString() {
    return "Account{" +
      "id=" + id +
      ", userName='" + userName + '\'' +
      ", pass='" + pass + '\'' +
      ", isSell=" + isSell +
      ", iSAdmin=" + iSAdmin +
      '}';
  }
}
