public class JugadorTirada{
    private Jugador jugador;
    private int[] jugadaDados;

    public JugadorTirada(Jugador jugador, int[] jugadaDados) {
        this.jugador = jugador;
        this.jugadaDados = jugadaDados;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public int getTotal() {
        int total=0;
        for (int i=0; i<this.jugadaDados.length ;i++){
            total+=jugadaDados[i];
        }
        return total;
    }
}
