import java.util.ArrayList;
import java.util.Random;

public class timeCasa extends time implements Marcagol {
    private int golscasa;
    private ArrayList<Integer> tempo;

    public timeCasa() {
        super(e7.getNome(),e7.getQualidade());
        this.tempo = new ArrayList<>();
        for(int i=1;i<10;i++){
        tempo.add(i*10);}
    }

    public int getgolscasa() {
        return golscasa;
    }

    public void setGols(int golscasa) {
        this.golscasa = golscasa;
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
    golscasa+=1;
    System.out.println("gol do time casa aos "+tempo.get(i));
        }
    }
}
 public int mostrarGolcasa(){
    return getgolscasa();
    }
}
