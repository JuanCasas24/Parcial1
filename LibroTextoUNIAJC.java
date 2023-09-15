class LibroTextoUNIAJC extends libroTexto {
    private String facultad;

    public LibroTextoUNIAJC(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }

 public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + facultad);
    }

} 
