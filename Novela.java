class Novela extends Libro {
    private String tipo;

   
    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de Novela: " + tipo);
    }

}
