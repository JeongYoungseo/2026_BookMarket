package kr.ac.kopo.youngseo.bookmarket.repository;

import kr.ac.kopo.youngseo.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private List<Book> listOfBooks = new ArrayList<Book>();
        
    
    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn1001");
        book1.setBookName("SpringBoot");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구입니다." +
                "이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있습니다." +
                " 그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있습니다." +
                "개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있습니다.");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT교육");
        book1.setAuthor("송미영");
        book1.setUniPrice(new BigDecimal(35000));
        book1.setReleaseDate("2024-12-31");


        Book book2 = new Book();
        book2.setBookId("isbn1002");
        book2.setBookName("모두의 데이터 분석 with 파이썬");
        book2.setDescription("데이터 분석의 시작은 관심 있는 데이터에 호기심을 가지는 것부터입니다. 이 책은 기온, 인구, 대중교통 같은 공공데이터를 활용한 데이터 분석 프로젝트를 진행합니다." +
                "데이터 다운로드부터 정제, 문제 해결 방법 구상, 파이썬 코드로 구현까지 차근차근 진행하면서, 초보자가 데이터 분석의 성공적인 첫걸음을 내딛도록 도와줍니다." +
                "이어서 막대그래프 그리기, 파이 차트 그리기, 버블 차트 그리기 같은 다양한 시각화 방법부터 numpy, pansdas 같은 라이브러리 활용법까지 다룹니다." +
                "최소한의 파이썬 문법만을 사용하여 설명하므로 프로그래밍 경험이 적은 사람도 충분히 따라 할 수 있습니다." +
                "이제 데이터 분석 전문가가 아니어도, 자신의 업무에서, 일생생활 속에서, 다양한 데이터를 스스로 분석하여 가치를 얻는 즐거움을 경험해 보세요!");
        book2.setPublisher("길벗캠퍼스");
        book2.setCategory("IT교육");
        book2.setAuthor("송석리");
        book2.setUniPrice(new BigDecimal(18000));
        book2.setReleaseDate("2019-04-25");

        Book book3 = new Book();
        book3.setBookId("isbn1003");
        book3.setBookName("모두의 파이썬");
        book3.setDescription("프로그래밍을 한 번도 해본 적이 없어도 괜찮다. 파이썬이 무엇인지 몰라도 상관 없다." +
                "어려운 개념과 복잡한 이론 설명은 최대한 줄이고, 초보자가 프로그래밍을 쉽게 배울 수 있도록 짧고 간단한 예제로 내용을 구성했다." +
                "처음부터 모든 것을 다 이해하지 못해도 괜찮다. 프로그램을 따라서 입력하고, 실행 결과를 확인하며, 책에서 알려주는 대로 에러를 수정해 보자." +
                "어느새 파이썬 프로그램으로 멋진 그림을 그리고, 계산을 하고, 간단한 게임을 만들고, 수학 문제를 푸는 자신을 발견하게 될 것이다. ");
        book3.setPublisher("길벗캠퍼스");
        book3.setCategory("IT교육");
        book3.setAuthor("이승진");
        book3.setUniPrice(new BigDecimal(12000));
        book3.setReleaseDate("2018-10-09");
        
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
}
