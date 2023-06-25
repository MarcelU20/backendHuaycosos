package pe.edu.upc.semana9.entities;

import javax.persistence.*;

import java.time.LocalDate;

@Entity

@Table(name = "books")

public class Book {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idBook;

    @Column(name = "nameBook",length = 45,nullable = false)

    private String nameBook;

    @Column(name = "publicationDateBook",nullable = false)

    private LocalDate publicationDateBook;

    @Column(name ="nHojasBook",nullable = false)

    private int nHojasBook;

    @ManyToOne
    @JoinColumn(name="idAuthor")
    private Author author;



    public Book() {

    }



    public Book(int idBook, String nameBook, LocalDate publicationDateBook, int nHojasBook, Author author) {

        this.idBook = idBook;

        this.nameBook = nameBook;

        this.publicationDateBook = publicationDateBook;

        this.nHojasBook = nHojasBook;

        this.author = author;

    }



    public int getIdBook() {

        return idBook;

    }



    public void setIdBook(int idBook) {

        this.idBook = idBook;

    }



    public String getNameBook() {

        return nameBook;

    }



    public void setNameBook(String nameBook) {

        this.nameBook = nameBook;

    }



    public LocalDate getPublicationDateBook() {

        return publicationDateBook;

    }



    public void setPublicationDateBook(LocalDate publicationDateBook) {

        this.publicationDateBook = publicationDateBook;

    }



    public int getnHojasBook() {

        return nHojasBook;

    }



    public void setnHojasBook(int nHojasBook) {

        this.nHojasBook = nHojasBook;

    }



    public Author getAuthor() {

        return author;

    }



    public void setAuthor(Author author) {

        this.author = author;

    }

}