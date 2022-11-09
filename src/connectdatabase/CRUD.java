package connectdatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD extends DBContext {
  public List<Account> getAllAccount()  {
    String query = "select * from webbanhangjsp.account ";
    List<Account> accountList = new ArrayList<>();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    try {
      preparedStatement = connection.prepareStatement(query);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next())  {
        int id = resultSet.getInt(1);
        String useName = resultSet.getString(2);
        String pass = resultSet.getString(3);
        int isSell = resultSet.getInt(4);
        int isAdmin = resultSet.getInt(5);
        Account account = new Account(id, useName, pass, isSell, isAdmin);
        accountList.add(account);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return accountList;
  }
  public void addAccount(Account account) {
    String query = "insert into webbanhangjsp.account (user_name, pass, is_sell, is_admin) VALUES (?,?,?,?)";
    PreparedStatement preparedStatement;
    try {
      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, account.getUserName());
      preparedStatement.setString(2, account.getPass());
      preparedStatement.setInt(3, account.getIsSell());
      preparedStatement.setInt(4, account.getiSAdmin());
      preparedStatement.executeUpdate();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  public Account getAccountById(int idAccount) {
    String query="select * from webbanhangjsp.account where id = ?";
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    try {
      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setInt(1,idAccount);
      resultSet = preparedStatement.executeQuery();
      if (resultSet.next()) {
        int id = resultSet.getInt(1);
        String userName = resultSet.getString(2);
        String pass = resultSet.getString(3);
        int isSell = resultSet.getInt(4);
        int isAdmin = resultSet.getInt(5);
        Account account = new Account(id, userName, pass, isSell, isAdmin);
        return account;
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
    return null;
  }
  public void editAccount(Account account) {
    String query = "update webbanhangjsp.account set user_name=?, pass=?, is_sell=?,is_admin=? where id=?";
    PreparedStatement preparedStatement;
    try{
      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, account.getUserName());
      preparedStatement.setString(2, account.getPass());
      preparedStatement.setInt(3, account.getIsSell());
      preparedStatement.setInt(4, account.getiSAdmin());
      preparedStatement.setInt(5, account.getId());
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  public void deleteAcountById(int id) {
    String query = "delete from webbanhangjsp.account where id=?";
    PreparedStatement preparedStatement;
    try{
      preparedStatement = connection.prepareStatement(query);
      preparedStatement.setInt(1, id);
      preparedStatement.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  public static void main(String[] args){
    String action = null;
    while (true) {
      System.out.print("Nhap vao thao tac: ");
      Scanner scanner = new Scanner(System.in);
      action = scanner.nextLine();
      CRUD crud = new CRUD();
      switch (action) {
        case "display":
          List<Account> accountList = crud.getAllAccount();
          for (Account accounts : accountList) {
            System.out.println(accounts);
          }
          break;
        case "add":
          System.out.println("Nhap vao cac thong tin:");
          System.out.print("Nhap userName: ");
          String userName = scanner.nextLine();
          System.out.print("Nhap vao Pass: ");
          String pass = scanner.nextLine();
          System.out.print("Nhap vao IS Sell (0 | 1): ");
          int isSell = scanner.nextInt();
          System.out.print("Nhap vao Is Admin (0 | 1): ");
          int isAdmin = scanner.nextInt();
          Account account = new Account(userName, pass, isSell, isAdmin);
          crud.addAccount(account);
          accountList = crud.getAllAccount();
          System.out.println("Danh sach cac tai khoan");
          for (Account accounts : accountList) {
            System.out.println(accounts);
          }
          break;
        case "edit":
          System.out.print("Nhap vao id tai khoan muon chinh sua: ");
          int id = scanner.nextInt();
          account = crud.getAccountById(id);
          System.out.println(account);
          System.out.println("Nhap vao cac thong tin can chinh sua: ");
          System.out.print("Nhap userName: ");
          scanner.nextLine();
          userName = scanner.nextLine();
          System.out.print("Nhap vao Pass: ");
          pass = scanner.nextLine();
          System.out.print("Nhap vao IS Sell (0 | 1): ");
          isSell = scanner.nextInt();
          System.out.print("Nhap vao Is Admin (0 | 1): ");
          isAdmin = scanner.nextInt();
          account = new Account(id, userName, pass, isSell, isAdmin);
          crud.editAccount(account);
          System.out.println("Cap nhat thanh cong!");
          System.out.println(account);
          break;
        case "delete":
          System.out.print("Nhap vao id tai khoan muon xoa: ");
          id = scanner.nextInt();
          account = crud.getAccountById(id);
          System.out.println(account);
          crud.deleteAcountById(id);
          System.out.println("xoa thanh cong!!!");
          System.out.println("Tat ca account");
          accountList = crud.getAllAccount();
          for (Account accounts : accountList) {
            System.out.println(accounts);
          }
          break;
        case "search":
          System.out.print("Nhap vao id tai khoan muon tim kiem: ");
          id = scanner.nextInt();
          account = crud.getAccountById(id);
          System.out.println(account);
          break;
        default:
          System.out.println("khong lam gi het");
          System.exit(0);

      }
    }

  }

}
