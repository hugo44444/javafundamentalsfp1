package oopmodelling;

/**
 * Tarea 5: uso de diferentes constructores de una clase.
 *
 * NOTA: el enunciado dice "utilizando la clase Book proporcionada en el
 * proyecto". Si el profesor os dio su propia clase Book, sustituye esta
 * por la suya; lo importante es que tenga los 3 constructores
 * (vacío, 2 parámetros y 6 parámetros) y el atributo público "category".
 *
 * @author Hugo
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private int pages;
    private int year;
    // "public": se puede modificar desde fuera con b1.category = "...";
    public String category;

    /** Constructor por defecto (sin parámetros). */
    public Book() {
    }

    /** Constructor con 2 parámetros: id y title. */
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    /** Constructor completo: 6 parámetros. */
    public Book(int id, String title, String author, int pages, int year, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.category = category;
    }

    public int getId()        { return id; }
    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public int getPages()     { return pages; }
    public int getYear()      { return year; }
}
