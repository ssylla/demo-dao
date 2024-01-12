package fr.eni.demodao.bo;

import java.io.Serializable;

public class Article implements Serializable {

    private int id;
    private String ref;

    public Article() {}

    public Article(int id, String ref) {
        this.id = id;
        this.ref = ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Article{");
        sb.append("id=").append(id);
        sb.append(", ref='").append(ref).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
