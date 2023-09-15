class libroTexto extends Libro {
    private String curso;
 
    public libroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;  

}

public void imprimir() {
    super.imprimir();
    System.out.println("Curso: " + curso);
}

}




