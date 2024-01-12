package fr.eni.demodao.dal.jdbc;

import fr.eni.demodao.bo.Article;
import fr.eni.demodao.dal.IArticleDAO;
import fr.eni.demodao.dal.IDAO;

import java.util.List;

public class ArticleDAO implements IDAO<Article, Integer> {
    @Override
    public void save(Article object) {

    }

    @Override
    public Article findById(Integer integer) {
        return null;
    }

    @Override
    public List<Article> findAll() {
        return null;
    }

    @Override
    public void update(Article object) {

    }

    @Override
    public void delete(Article object) {

    }


    /*
    @Override
    public void save(Article utilisateur) {

    }

    @Override
    public Article findId() {
        return null;
    }

    @Override
    public List<Article> findAll() {
        return null;
    }

    @Override
    public void update(Article utilisateur) {

    }

    @Override
    public void delete(Article utilisateur) {

    }*/
}
