package aaa;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelBook {
    private Integer bookid    = null; // bookid int not null auto_increment primary key
    private String  bookname  = "";   // bookname varchar(50)
    private String  publisher = "";   // publisher varchar(40)
    private String  year      = "";   // year varchar(10)
    private Integer price     = null; // price int
    private Date    dtm       = null; // dtm date
    private Boolean use_yn    = null; // use_yn bit
    private Integer authid    = null; // authid int
    
    public Integer getBookid() {
        return bookid;
    }
    
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }
    
    public String getBookname() {
        return bookname;
    }
    
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public Integer getPrice() {
        return price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    
    public Date getDtm() {
        return dtm;
    }
    
    public void setDtm(Date dtm) {
        this.dtm = dtm;
    }
    
    public Boolean getUse_yn() {
        return use_yn;
    }
    
    public void setUse_yn(Boolean use_yn) {
        this.use_yn = use_yn;
    }
    
    public Integer getAuthid() {
        return authid;
    }
    
    public void setAuthid(Integer authid) {
        this.authid = authid;
    }
    
    @Override
    public String toString() {
        return "ModelBook [bookid=" + bookid + ", bookname=" + bookname
                + ", publisher=" + publisher + ", year=" + year + ", price="
                + price + ", dtm=" + dtm + ", use_yn=" + use_yn + ", authid="
                + authid + "]";
    }
    
    public ModelBook(Integer bookid, String bookname, String publisher,
            String year, Integer price, Date dtm, Boolean use_yn,
            Integer authid) {
        super();
        this.bookid = bookid;
        this.bookname = bookname;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
        this.dtm = dtm;
        this.use_yn = use_yn;
        this.authid = authid;
    }
    
    public ModelBook() {
        super();
    }
    
}