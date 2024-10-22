package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Multifuncional, copiando...");
    }
    
    @Override
    public void digitalizar() {
        System.out.println("Multifuncional, digitalizando...");
    }

    @Override
    public void imprimir() {
        System.out.println("Multifuncional, imprimindo...");
    }

}
