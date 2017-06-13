
<?php
if( file_exists("client.xml")){
$xml=simplexml_load_file('client.xml');
$connexion = oci_connect('SYSTEM', 'MOTDEPASSE', 'localhost/XE');
$s = oci_parse($connexion, "insert into client(numero_identification,nom,prenom, codesecret,solde_en_compte )
	values ('$xml->numero_identification','$xml->nom','$xml->prenom','$xml->codesecret',$xml->solde_en_compte)");
oci_execute($s);

}


	

?>
