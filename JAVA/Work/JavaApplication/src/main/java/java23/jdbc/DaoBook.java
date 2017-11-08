package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DaoBook implements IBook {
    private java.sql.Connection conn = null;
    
    public DaoBook(Connection conn) {
        super();
        this.conn = conn;
    }
    
    @Override
    public int getCount(ModelBook book) throws SQLException {
        int result = -1;
        // SQL 문장
        String query = "SELECT count(*) as total from  book where 1=1;";
        try {
            // SQL 객체 생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            java.sql.ResultSet rs = stmt.executeQuery();
            // SQL문장을 실행하고 결과로 ResultSet을 반환한다.
            
            rs.next(); // 커서 이동. ResultSewt 첫번째로 로우로
            result = rs.getInt("total"); // total 컬럼의 값을 가져온다.
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            
        }
        return result;
        
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public int getMaxBookid() throws SQLException {
        int result = -1;
        
        // SQL 문장
        
        String query = "select max(bookid) maxid from book";
        try {
            // 문장 객체 생성
            PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            ResultSet rs = stmt.executeQuery();
            rs.next();
            result = rs.getInt("maxid");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        java.sql.ResultSet rs = null;
        
        // SQl 문장 실행
        String query = "SELECT * FROM book ORDER BY bookid ASC";
        
        try {
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            // SQL 문장 실행
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            
        }
        return rs;
        
    }
    
    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        java.sql.ResultSet rs = null;
        
        try {
            // SQl 문장 실행
            String query = "SELECT * FROM book where bookname like ?";
            
            // SQL 객체생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + book.getBookname() + "%");
            // 문장 객체 실행
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            
        }
        return rs;
        
    }
    
    @Override
    public ResultSet selectEqual(ModelBook book) throws SQLException {
        java.sql.ResultSet rs = null;
        
        try {
            // SQl 문장 실행
            String query = "SELECT * FROM book where bookname = ?";
            
            // SQL 객체생성
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            // 문장 객체 실행
            rs = stmt.executeQuery();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            
        }
        return rs;
        
    }
    
    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        return null;
        
    }
    
    @Override
    public int insertBook(ModelBook book) throws SQLException {
        int rs = 0;
        try {
            String query = "INSERT INTO ";
            query += "BOOK (BOOKNAME,PUBLISHER,YEAR,PRICE,DTM,USE_YN,AUTHID) ";
            query += "VALUES(?,?,?,?,?,?,?)";
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            stmt.setString(2, book.getPublisher());
            stmt.setString(3, book.getYear());
            stmt.setInt(4, book.getPrice());
            stmt.setDate(5, (java.sql.Date) book.getDtm());
            stmt.setBoolean(6, book.getUse_yn());
            stmt.setInt(7, book.getAuthid());
            
            rs = stmt.executeUpdate();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return rs;
        
    }
    
    @Override
    public int updateBHook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteBook(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
