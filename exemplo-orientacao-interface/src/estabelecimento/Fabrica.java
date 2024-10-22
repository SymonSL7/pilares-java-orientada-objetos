package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {

    public static void main(String[] args) {

        EquipamentoMultiFuncional multiFuncional = new EquipamentoMultiFuncional();
        
        Impressora impressora = multiFuncional;
        Digitalizadora digitalizadora = multiFuncional;
        Copiadora copiadora = multiFuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }

}
