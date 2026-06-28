public class CompteBancaire {
    private  String titulaire ;
    private double  solde ;
    public CompteBancaire (String titulaire, double solde){
        setTitulaire(titulaire) ;
        if(solde > 0){
            this.solde = solde ;
        }
        else {
            this.solde = 0 ;
        }
    }
    public String getTitulaire(){
        return  titulaire ;
    }
    public double  getSolde(){
        return solde;
    }
    public void setTitulaire(String titulaire){
        if(titulaire != null && !titulaire.isEmpty()){
            this.titulaire = titulaire ;
        }
        else{
            System.out.println("Indisponible titulaire");
        }
    }
    public  void deposer (double  montant){
        if(montant > 0){
            solde = solde+montant ;
            System.out.println(montant + " a été ajouté, solde actuel : "+ solde);
        }
        else{
            System.out.println("Invalide montant");
        }
    }
    public void retirer(double montant){
        if(montant < solde && montant > 0 ){
            solde = solde-montant ;
            System.out.println(montant + " a été retiré, solde actuel : "+ solde);
        }
        else{
            System.out.println("Invalide montant");
        }
    }
    public void afficher(){
        System.out.println("Titulaire : "+ titulaire);
        System.out.println("Solde : "+ solde);
    }

}
