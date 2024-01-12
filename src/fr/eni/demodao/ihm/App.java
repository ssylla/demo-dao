package fr.eni.demodao.ihm;

import fr.eni.demodao.bll.UtilisateurService;
import fr.eni.demodao.bo.Utilisateur;
import fr.eni.demodao.dal.DAOFactory;
import fr.eni.demodao.dal.IUtilisateurDAO;
import fr.eni.demodao.dal.exception.UtilisateurNonTrouveException;

import java.util.Scanner;

public class App {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        welcomeMsg();
        login();
    }

    public static void welcomeMsg() {
        System.out.println("***************************************");
        System.out.println("******Bienvenue dans ma super App******");
        System.out.println("***************************************");
        UtilisateurService service = UtilisateurService.getInstance();
    }

    public static void login() {

        System.out.println("* Merci de vous identifier...");
        System.out.print("* Entrez votre email :");
        String email = sc.nextLine();
        System.out.print("* Entrez votre mot de passe :");
        String mdp = sc.nextLine();


        //UtilisateurService service = UtilisateurService.getInstance();

        IUtilisateurDAO dao = DAOFactory.getUtilisateurDAO();

        try {
            Utilisateur user = dao.login(email, mdp);
            System.out.println("Bienvenue à toi : "+ user.getPrenom());
        } catch (UtilisateurNonTrouveException e) {
            System.err.println(e.getMessage()+ e.getEmail());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
