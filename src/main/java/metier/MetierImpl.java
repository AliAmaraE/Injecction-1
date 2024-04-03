package metier;

import dao.Idao;

public class MetierImpl implements Imetier {
    private Idao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    public void setDao(Idao dao){
        this.dao=dao;
    }
}
