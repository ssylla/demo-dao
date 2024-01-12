package fr.eni.demodao.dal;

import fr.eni.demodao.bo.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDAO {

    Utilisateur login(String email, String mdp) throws Exception;
    void save(Utilisateur utilisateur);
    Utilisateur findId();
    List<Utilisateur> findAll();
    void update(Utilisateur utilisateur);
    void delete(Utilisateur utilisateur);
}
