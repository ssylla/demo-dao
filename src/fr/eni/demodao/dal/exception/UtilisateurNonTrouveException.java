package fr.eni.demodao.dal.exception;

public class UtilisateurNonTrouveException extends Exception {

    private String email;
    private String mdp;

    public UtilisateurNonTrouveException(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public String getMdp() {
        return mdp;
    }

    @Override
    public String getMessage() {
        return "Aucun utilisateur ne correspond au couple login/mdp";
    }
}
