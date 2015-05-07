package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SqlOperation {
	/**
	 * 提供数据库的操作
	 */	
	public static final String DBDRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String DBURL="jdbc:sqlserver://localhost:1433;databaseName=jspSay";
	private static final String DBUSER ="sa";//用户名
	private static final String PASSWORD = "123456";//密码
	private SqlOperation so=new SqlOperation();
	
	static{
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);//建立到指定数据库的URL链接，返回connnection
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void addSql(){
		Connection con=so.getConnection();
		//String sql="INSERT INTO tb_user VALUES ('"+username+"','"+password+"','"+sex+"','"+type+"')";
		String sql="select * from tb_user";
		PreparedStatement pst=null;
		ResultSet rs = null;//查询的结果集
		try {
			pst=con.prepareStatement(sql);//将参数化的sql语句送到数据库
			rs = pst.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		

	}

}