package fr.eni.demodao.dal;

import java.util.ResourceBundle;

public final class DAOFactory {

    private static final String STORE_MODE;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("app");
        STORE_MODE = bundle.getString("store.mode");
    }
    public DAOFactory() {}


    public static IUtilisateurDAO getUtilisateurDAO() {
        IUtilisateurDAO dao = null;

        switch (STORE_MODE) {
            case "JDBC":
                dao = new fr.eni.demodao.dal.jdbc.UtilisateurDAOImpl();
                break;
            case "XML":
                dao = new fr.eni.demodao.dal.xml.UtilisateurDAOImpl();
                break;
        }
        return dao;
    }
}
