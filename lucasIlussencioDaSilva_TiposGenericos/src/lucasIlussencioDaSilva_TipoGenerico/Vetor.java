package lucasIlussencioDaSilva_TipoGenerico;

public class Vetor<T>{

    private T[] vet;
    private int tam;

    public Vetor(int tam){
        this.tam = tam;
        this.vet = (T[]) new Object[tam];
    }

    public T getVet(int pos) {
        return vet[pos];
    }

    public void setVet(int pos, T vet) {
        this.vet[pos] = vet;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    //inicialize somente o tamanho do vetor
    
    //a inserção dos elementos no vetor devem ser feitas via método setVet( ) que
    // receberá a posição e o elemento a ser inserido
}
