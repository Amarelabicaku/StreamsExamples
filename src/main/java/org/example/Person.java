package org.example;

public class Personi {
//    private String emer mbiemer gjinis profesioni adresa nr tel
//            krijo nje objekt/konstruktor builder/liste personash per cdo vendodhje
//    do nxjerresh vetem personat ne tirane
//    vetem ne tirane dhe gjinia femer  me lope dh streams
//            do gjesh vendodhjen e personave ne elb dhe do tu ndrushosh vendodhjen ne
//
//    public tirane getDhe() {
//        return dhe;
//        nje metode per te gjetur sa femra dhe meshkuj jane;


    private String name;
    private String surname;
    private String gender;
    private String profession;
    private String adress;
    private int nrTelefoni;

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getGjinia() {
        return gjinia;
    }

    public void setGjinia(String gjinia) {
        this.gjinia = gjinia;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public int getNrTelefoni() {
        return nrTelefoni;
    }

    public void setNrTelefoni(int nrTelefoni) {
        this.nrTelefoni = nrTelefoni;
    }

    public String getProfesioni() {
        return profesioni;
    }

    public void setProfesioni(String profesioni) {
        this.profesioni = profesioni;
    }

    public Personi(String emer, String mbiemer,String gjinia,String profesioni,String adresa,int ) {
        this.adresa = adresa;
    }
}
