package fr.eni.demodao.dal;

import fr.eni.demodao.bo.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDAO<T, ID> extends IDAO<T, ID> {

    Utilisateur login(String email, String mdp) throws Exception;
}
