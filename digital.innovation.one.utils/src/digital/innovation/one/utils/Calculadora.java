package digital.innovation.one.utils;


import digital.innovation.one.utils.internal.DivHelper;
import digital.innovation.one.utils.internal.MultHelper;
import digital.innovation.one.utils.internal.SubHelper;
import digital.innovation.one.utils.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;

    public Calculadora(){
        this.sumHelper = new SumHelper();
        this.subHelper = new SubHelper();
        this.multHelper = new MultHelper();
        this.divHelper = new DivHelper();
    }

    public double sum(double n1, double n2){
        return sumHelper.execute(n1, n2);
    }

    public double sub(double n1, double n2){
        return subHelper.execute(n1, n2);
    }

    public double mult(double n1, double n2){
        return multHelper.execute(n1, n2);
    }

    public double div(double n1, double n2){
        return divHelper.execute(n1, n2);
    }

}
