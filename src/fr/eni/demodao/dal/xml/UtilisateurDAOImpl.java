package fr.eni.demodao.dal.xml;

import fr.eni.demodao.bo.Utilisateur;
import fr.eni.demodao.dal.IUtilisateurDAO;

import java.util.List;

public class UtilisateurDAOImpl implements IUtilisateurDAO<Utilisateur, Integer> {

    @Override
    public void save(Utilisateur object) {

    }

    @Override
    public Utilisateur findById(Integer integer) {
        return null;
    }

    @Override
    public List<Utilisateur> findAll() {
        return null;
    }

    @Override
    public void update(Utilisateur object) {

    }

    @Override
    public void delete(Utilisateur object) {

    }

    @Override
    public Utilisateur login(String email, String mdp) throws Exception {
        return null;
    }
}
