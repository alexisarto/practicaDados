public interface Tirador extends Aleatorio {

    JugadorTirada tirar(Dado[] listaDados, int[] num, boolean testing);
}
