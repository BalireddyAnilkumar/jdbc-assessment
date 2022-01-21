package com.dxc.assessment;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

import com.dxc.assessment.dao.AuthorDao;
import com.dxc.assessment.modal.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Author anil = new Author("'9494','anil','balireddy','ethical','anilbalireddy6969@gmail.com'");
        

        List<Author> author = List.of(anil);
        AuthorDao authorDao = new AuthorDao();

        author.forEach(au-> {
            try {
                Author rows = authorDao.create(au);
                System.out.println("Rows affected: " + rows);
            } catch (SQLDataException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        });
        
    }
    
}