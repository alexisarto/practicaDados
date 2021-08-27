import java.util.Random;

public class Jugador implements Tirador{
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public JugadorTirada tirar(Dado[] listaDados, int[] num, boolean testing) {
        int[] valores = new int[listaDados.length];
        if(testing==true){
            for (int i=0;i< listaDados.length;i++){
                valores[i]=num[i];
            }
        }else{
            for (int i=0;i< listaDados.length;i++){
                valores[i]=this.numAleatorio(listaDados[i]);
            }
        }
        JugadorTirada tirada= new JugadorTirada(this,valores);
        return tirada;
    }

    @Override
    public int numAleatorio(Dado dado) {
        int low = 1;
        Random random= new Random();
        int high = dado.getCaras()+1;
        int numAletorio = random.nextInt(high-low) + low;
        return numAletorio;
    }


}
