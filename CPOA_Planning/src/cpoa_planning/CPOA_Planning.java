package cpoa_planning;
import BD.*;
import java.sql.*;
import java.util.ArrayList;

public class CPOA_Planning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<TypeFilm> ListCategorie;
        ListCategorie = DAOTypeFilm.Get_All_Competitions();
        DAOFilm.Get_All_Films(ListCategorie);
        DisplayFilmByCategorie(ListCategorie);
    }
    
    //Fonction qui affiche les films par catégorie
    private static void DisplayFilmByCategorie(ArrayList<TypeFilm> ListCategorie){
        System.out.println("Les catégories dans la BD sont :\n");
        for(TypeFilm TF: ListCategorie){
            System.out.println(TF.getID_type()+" "+TF.getNom_type());
            System.out.println("Les films de cette catégorie sont :");
            for(Film f: TF.getFilm()){
                System.out.println("    "+f.getID_film()+" "+f.getTitre()+" réalisé par "+f.getReal());
            }
            System.out.println("\n");
        }
    } 
    
}
    