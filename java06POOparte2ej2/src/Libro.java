public class Libro {
    private String titulo, autor;
    private Integer ejemplaresTotal, ejemplaresPrestaados;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplaresTotal() {
        return ejemplaresTotal;
    }

    public void setEjemplaresTotal(Integer ejemplaresTotal) {
        this.ejemplaresTotal = ejemplaresTotal;
    }

    public Integer getEjemplaresPrestaados() {
        return ejemplaresPrestaados;
    }

    public void setEjemplaresPrestaados(Integer ejemplaresPrestaados) {
        this.ejemplaresPrestaados = ejemplaresPrestaados;
    }

    public Integer prestarLibro(Integer cantidad){
        return ejemplaresPrestaados++;
    }
    public Integer devolverLibro(Integer cantidad){
        return ejemplaresPrestaados--;
    }
}
