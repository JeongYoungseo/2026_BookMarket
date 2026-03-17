package kr.ac.kopo.youngseo.bookmarket.repository;

import kr.ac.kopo.youngseo.bookmarket.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAllBookList();
}
