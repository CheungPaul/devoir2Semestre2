package Tools;

import Entities.Exo1.Captage;
import Entities.Exo1.Cuve;
import Entities.Exo1.Forage;
import Entities.Exo1.IVolume;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{

    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasCaptage(ArrayList<Captage> uneListe)
    {
        // A compléter ici
        colonnes = new String[]{"Numéro", "Description", "Volume"};
        lignes = new Object[6][3];
        int i = 0;

        for (Captage lesCaptages : uneListe){
            lignes[i][0] = lesCaptages.getIdCaptage();
            lignes[i][1] = lesCaptages.GetDescription();
            if (lesCaptages.getIdCaptage() == 3 || lesCaptages.getIdCaptage() == 5 ){ //est captage
                lignes[i][2] = lesCaptages.GetDescription();

            } else if (lesCaptages.getIdCaptage() == 6 || lesCaptages.getIdCaptage() == 1) { //est forage
                lignes[i][2] = ((Forage) lesCaptages).GetDescription();
                lignes[i][3] = ((Forage) lesCaptages).GetVolume();

            }else //est cuve
            {
                lignes[i][2] = ((Cuve) lesCaptages).GetDescription();
                lignes[i][3] = ((Cuve) lesCaptages).GetVolume();
            }
            i++;
        }

    }
}
