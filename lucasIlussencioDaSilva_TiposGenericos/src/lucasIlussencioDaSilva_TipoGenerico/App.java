package lucasIlussencioDaSilva_TipoGenerico;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Vetor<Pessoa> vp = new Vetor<>(10);
        Vetor<Cidade> vc = new Vetor<>(10);
        int conti = 0, contj = 0;
        String nome, naturalidade, adjetivo, estado;
        char resp, sexo;

        //INSERIR PESSOAS
        do{
            nome = JOptionPane.showInputDialog("Entre com o nome PESSOA: ");
            sexo = JOptionPane.showInputDialog("Entre com o sexo (M/F):").charAt(0);
            naturalidade = JOptionPane.showInputDialog("Entre com a naturalidade: ");
            vp.setVet(conti, new Pessoa(nome,sexo,naturalidade));
            conti ++;
            resp = JOptionPane.showInputDialog("Deseja inserir uma nova PESSOA? (S/N)").charAt(0);
        }while (resp == 'S' || resp == 's');

        // INSERIR CIDADES
        do{
            nome = JOptionPane.showInputDialog("Entre com o nome CIDADE: ");
            adjetivo = JOptionPane.showInputDialog("Entre com o adjetivo: ");
            estado = JOptionPane.showInputDialog("Entre com o estado: ");
            vc.setVet(contj, new Cidade(nome,adjetivo,estado));
            contj ++;
            resp = JOptionPane.showInputDialog("Deseja inserir uma nova CIDADE? (S/N)").charAt(0);
        }while (resp == 'S' || resp == 's');

        // BUSCAR NOMES
        do {
            String newString = "";
            nome = JOptionPane.showInputDialog("Digite o nome de uma pessoa: ");
            for( int i = 0; i < conti; i ++){
                if( nome.toLowerCase().equals(vp.getVet(i).getNome().toLowerCase() ) ){
                    for(int j = 0; j < contj; j ++){
                        if(vp.getVet(i).getNaturalidade().toLowerCase().equals(vc.getVet(j).getNome().toLowerCase())){
                            if(vp.getVet(i).getSexo() == 'M' || vp.getVet(i).getSexo() == 'm'){
                                newString += "O "+ vc.getVet(j).getAdjetivo() + " " + vp.getVet(i).getNome() + " nasceu em " + vc.getVet(j).getNome() + " - " +vc.getVet(j).getEstado();
                            }else{
                                newString += "A "+ vc.getVet(j).getAdjetivo() + " " + vp.getVet(i).getNome() + " nasceu em " + vc.getVet(j).getNome() + " - " +vc.getVet(j).getEstado();
                            }
                        }
                    }
                    if(newString.equals("")){
                        newString += vp.getVet(i).getNome() + " nasceu em " + vp.getVet(i).getNaturalidade();
                    }
                }
            }
            if(newString.equals("")){
                newString += nome + " nasceu em cidade desconhecida.";
            }
            JOptionPane.showMessageDialog(null,newString);
            resp = JOptionPane.showInputDialog("Deseja Buscar uma nova pessoa? (S/N)").charAt(0);
        }while (resp == 'S' || resp == 's');
    }
}
