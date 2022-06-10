package guia.poo.Entidades;

public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {

    }

    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;

    }

    
    @Override
    public String toString() {
        return "Libro{" + "ISBN = " + ISBN + ", titulo = " + titulo + ", autor = " + autor + ", numPag = " + numPag + '}';
    }

}
