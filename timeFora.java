import java.util.ArrayList;
import java.util.Random;

public class timeFora extends time implements Marcagol {
    private int golsfora;
    private ArrayList<Integer> tempo;

    public timeFora() {
        super(e1.getNome(),e1.getQualidade());
        this.tempo = new ArrayList<>();
        for(int i=1;i<10;i++){
        tempo.add(i*10);}
    }

    public int getgolsfora() {
        return golsfora;
    }

    public void setGols(int golsfora) {
        this.golsfora = golsfora;
    }

    public ArrayList<Integer> getTempo() {
        return tempo;
    }

    public void setTempo(ArrayList<Integer> tempo) {
        this.tempo = tempo;
    }

    @Override
    public void MarcaGol() {
   Random g= new Random();
   for(int i=0;i<tempo.size();i++){
    int numeroSorteado= g.nextInt(10-getQualidade());
   if(numeroSorteado==0){
    golsfora+=1;
    System.out.println("gol do time fora aos "+tempo.get(i));
        }
    }
}
    public int mostrarGolfora(){
    return getgolsfora();
    }
}


