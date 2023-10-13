public class Livre {
    private int id;
    private String titre;
    private String auteur;
    private float prix;
    static int count;

    public Livre(int id, String titre, String auteur, float prix) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        count++;
    }

    public Livre() {
        count++;
    }
    public void ToString(){
        System.out.println("id est "+id);
        System.out.println("le titre est "+titre);
        System.out.println("l'auteur est "+auteur);
        System.out.println("le prix est+prix");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public float getPrix() {
        return prix;
    }
}

