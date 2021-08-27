public class Juez {

    public void evaluarTiradas(JugadorTirada jugadorTirada1, JugadorTirada jugadorTirada2){

        int total1 = jugadorTirada1.getTotal();

        int total2= jugadorTirada2.getTotal();

        if(total1==total2){
            System.out.println("empate");
        }else if(total1>total2){
            System.out.println("Gano el jugador "+ jugadorTirada1.getJugador().getNombre() + " con el valor de: "+ jugadorTirada1.getTotal());
        }else{
            System.out.println("Gano el jugador "+ jugadorTirada2.getJugador().getNombre()+ " con el valor de: "+ jugadorTirada2.getTotal());
        }
    }

}
