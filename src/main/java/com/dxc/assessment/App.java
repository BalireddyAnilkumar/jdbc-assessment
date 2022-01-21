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
        findAllAuthor();
    }
    static void findAllAuthor(){
        
        AuthorDao dao = new AuthorDao(); 

            
        try {
            List<Author> author= dao.findAll();
            if (author.size() == 0) {
                System.out.println("No author found");
                return;
            }
            author.forEach(au -> System.out.println(au));
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }
    }
}