public class Client {
	// déclaration des attributs
private String numero_identification;
private String nom;
private String prenom;
private String code_secret;
private  double solde_en_compte;
//  les getters et setters  pour chaque attribut
public String getNumero_identification() {
	return numero_identification;
}
public void setNumero_identification(String numero_identification) {
	this.numero_identification = numero_identification;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getCode_secret() {
	return code_secret;
}
public void setCode_secret(String code_secret) {
	this.code_secret = code_secret;
}
public double getSolde_en_compte() {
	return solde_en_compte;
}
public void setSolde_en_compte(double solde_en_compte) {
	this.solde_en_compte = solde_en_compte;
}
//constructeur par défaut 
public Client() {
	
}
// constructeur initialisant les attributs 
public Client(String numero_identification, String nom, String prenom, String code_secret, double solde_en_compte) {
	
	this.numero_identification = numero_identification;
	this.nom = nom;
	this.prenom = prenom;
	this.code_secret = code_secret;
	this.solde_en_compte = solde_en_compte;
}
public static void main(String[] args) {
	//Création d'une instance client
	Client c =new Client("numero","nom","prenom","codesecret",3000);
	//affichage des informations du client 
	System.out.println("Numéro d'identification : "+c.getNumero_identification());
	System.out.println("Nom : "+c.getNom());
	System.out.println("Prénom : "+c.getPrenom());
	System.out.println("Code secret : "+c.getCode_secret());
	System.out.println("Solde en compte : "+c.getSolde_en_compte());
	//diminution du solde en compte du client
	c.setSolde_en_compte(c.getSolde_en_compte()-100);
	//affichage des informations du client 
		System.out.println("Numéro d'identification : "+c.getNumero_identification());
		System.out.println("Nom : "+c.getNom());
		System.out.println("Prénom : "+c.getPrenom());
		System.out.println("Code secret : "+c.getCode_secret());
		System.out.println("Solde en compte : "+c.getSolde_en_compte());
	
}
}
