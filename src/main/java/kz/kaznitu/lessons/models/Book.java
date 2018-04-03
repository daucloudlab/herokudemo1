package kz.kaznitu.lessons.models;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id ;
    @Column(name = "title")
    private String title ;

    public Book(){}

    public Book(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
