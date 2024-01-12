package fr.eni.demodao.bll;

public class UtilisateurService {

    private static UtilisateurService instance;

    private UtilisateurService() {}


    public static UtilisateurService getInstance() {
        if (null == instance) {
            instance = new UtilisateurService();
        }
        return instance;
    }
}
