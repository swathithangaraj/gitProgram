package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SqlOperation {
	/**
	 * �ṩ���ݿ�Ĳ���
	 */	
	public static final String DBDRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static final String DBURL="jdbc:sqlserver://localhost:1433;databaseName=jspSay";
	private static final String DBUSER ="sa";//�û���
	private static final String PASSWORD = "123456";//����
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
			connection=DriverManager.getConnection(DBURL,DBUSER,PASSWORD);//������ָ�����ݿ��URL���ӣ�����connnection
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
		ResultSet rs = null;//��ѯ�Ľ����
		try {
			pst=con.prepareStatement(sql);//����������sql����͵����ݿ�
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
