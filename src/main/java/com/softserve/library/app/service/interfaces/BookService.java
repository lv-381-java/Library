package com.softserve.library.app.service.interfaces;

import com.softserve.library.app.dto.BookParametersDto;
import com.softserve.library.app.model.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Roman Berezhnov
 */
public interface BookService extends SimpleCrudService<Book> {

    List<Book> getAllByParameters(BookParametersDto bookParametersDto) throws SQLException;

//    List<BookDto> getAll() throws SQLException;

//    int getAllAvailableByBookId(int id) throws SQLException;
//
//    List<BookDto> getAllByAuthor(String authorName) throws SQLException;
//
//    int getBookQuantityPublishedFromYear(int year) throws SQLException;
//
//    int getNumberOfOverallBookUsages(int bookId) throws SQLException;
//
//    int getNumberOfBookUsagesByCopy(int copyId) throws SQLException;
//
//    int getAverageReadingTime(int bookId) throws SQLException;

//    int getMostPopularBookWithinPeriod(Date periodStartDate, Date periodEndDate) throws SQLException;
//
//    int getMostUnopularBookWithinPeriod(Date periodStartDate, Date periodEndDate) throws SQLException;

//    List<CopyDto> getAllCopiesByBookName(String bookName) throws SQLException;
}
