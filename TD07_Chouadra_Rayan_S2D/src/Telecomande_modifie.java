class Telecommande {
    private List<Lampe> lampes;
    private List<Hifi> chainesHifi;
    private List<Television> televisions;

    public Telecommande() {
        this.lampes = new ArrayList<>();
        this.chainesHifi = new ArrayList<>();
        this.televisions = new ArrayList<>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void ajouterChaineHifi(Hifi chaineHifi) {
        this.chainesHifi.add(chaineHifi);
    }

    public void ajouterTelevision(Television television) {
        this.televisions.add(television);
    }

    // Méthodes pour activer/désactiver une télévision

    public void activerTelevision(int indiceTelevision) {
        if (indiceTelevision >= 0 && indiceTelevision < televisions.size()) {
            televisions.get(indiceTelevision).allumer();
        } else {
            System.out.println("Télévision inexistante");
        }
    }

    public void desactiverTelevision(int indiceTelevision) {
        if (indiceTelevision >= 0 && indiceTelevision < televisions.size()) {
            televisions.get(indiceTelevision).eteindre();
        } else {
            System.out.println("Télévision inexistante");
        }
    }
    
@Override
    public String toString() {
    return "Télécommande de la télévision : [allumé=" + allume + ", chaîne=" + chaîne + "]";
}

}