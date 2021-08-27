public class Main {

    public static void main(String[] args){
        /*Dado dado= new Dado(6);
        Dado dado2= new Dado(6);
        Dado dado3= new Dado(6);
        Dado[] dadosJuego= new Dado[3];
        dadosJuego[0]=dado;
        dadosJuego[1]=dado2;
        dadosJuego[2]=dado3;
        int[] arrayTest= new int[3];
        arrayTest[0]=3;
        arrayTest[1]=3;
        arrayTest[2]=3;
        int[] arrayTest2= new int[3];
        arrayTest2[0]=4;
        arrayTest2[1]=3;
        arrayTest2[2]=4;
        Jugador jugador=new Jugador("ElKeto");
        Jugador jugador2=new Jugador("Gusti");
        Juez juez=new Juez();
        juez.evaluarTiradas(jugador.tirar(dadosJuego,arrayTest,false), jugador2.tirar(dadosJuego,arrayTest2,true));*/


                String cuilTest = "20-39371660-7";
                String dni = "39371660";

                int[] arrayTest = new int[10];
                arrayTest[0] = 5;
                arrayTest[1] = 4;
                arrayTest[2] = 3;
                arrayTest[3] = 2;
                arrayTest[4] = 7;
                arrayTest[5] = 6;
                arrayTest[6] = 5;
                arrayTest[7] = 4;
                arrayTest[8] = 3;
                arrayTest[9] = 2;


                String[] split = cuilTest.split("-");

                if(split[1].equals(dni)){
                    String validCuil = split[0]+split[1];
                    System.out.println(validCuil);
                    int sumatoria = 0;

                    for(int i = 0; i < arrayTest.length; i++){
                        System.out.println(validCuil.charAt(i)+ " * " + arrayTest[i]+"="+((int)validCuil.charAt(i) * arrayTest[i]));
                        sumatoria += (int)validCuil.charAt(i) * arrayTest[i];
                    }
                    System.out.println(sumatoria / 11);
                }else{
                    System.out.println("El cuil no equivale a ese dni");
                }

            }
        }



