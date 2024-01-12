package fr.eni.demodao.dal;

import fr.eni.demodao.bo.Article;
import fr.eni.demodao.bo.Utilisateur;

import java.util.List;

public interface IArticleDAO {

    void save(Article utilisateur);
    Article findId();
    List<Article> findAll();
    void update(Article utilisateur);
    void delete(Article utilisateur);
}
