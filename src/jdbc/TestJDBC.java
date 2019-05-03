package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TestJDBC {
    public static void main(String[] args){
        Connection c = null;
        Statement s = null;
        try{
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("数据库驱动加载成功！");
             c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
            System.out.println("连接成功,获取连接对象:"+c);
             s = c.createStatement();
            System.out.println("获取 Statement对象"+s);
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);
            System.out.println("执行插入语句成功");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(s!= null){
                try {
                    s.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(c !=null){
                try {
                    c.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
