package fr.eni.demodao.dal.jdbc;

import fr.eni.demodao.bo.Utilisateur;
import fr.eni.demodao.dal.IUtilisateurDAO;
import fr.eni.demodao.dal.exception.UtilisateurNonTrouveException;

import java.sql.*;
import java.util.List;

public class UtilisateurDAOImpl implements IUtilisateurDAO {

    private static final String LOGIN_QUERY = "SELECT ID, NOM, PRENOM, EMAIL, MDP FROM utilisateur WHERE EMAIL = ? AND MDP = ?";
    @Override
    public Utilisateur login(String email, String mdp) throws SQLException, UtilisateurNonTrouveException {

        Utilisateur user = null;
        Connection connection = PersistenceManager.getConnection();
        try (PreparedStatement pst = connection.prepareStatement(LOGIN_QUERY)) {
            pst.setString(1, email);
            pst.setString(2, mdp);
            try( ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    System.out.println(String.format(LOGIN_QUERY, email, mdp ));
                    user = new Utilisateur(rs.getInt("ID"), rs.getString("NOM"), rs.getString("PRENOM"), rs.getString("EMAIL"), rs.getString("MDP"));
                } else {
                    throw new UtilisateurNonTrouveException(email, mdp);
                }
            }
        }

        return user;
    }

    @Override
    public void save(Utilisateur utilisateur) {

    }

    @Override
    public Utilisateur findId() {
        return null;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }

    @Override
    public void update(Utilisateur utilisateur) {

    }

    @Override
    public void delete(Utilisateur utilisateur) {

    }
}
