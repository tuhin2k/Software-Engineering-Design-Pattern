package Decorator;

abstract public class Coffe {
    abstract public int getcost();
    abstract public String getdescription();
}


class Nescafe extends Coffe{

    @Override
    public int getcost() {
        return 100;
    }

    @Override
    public String toString() {
        return "Finest Nescafe";
    }

    @Override
    public String getdescription() {
        return "Finest Nescafe";
    }
    
}

class Darkroast extends Coffe{

    @Override
    public int getcost() {
        return 120;
    }

    @Override
    public String getdescription() {
        return "Finnest Darkroast";
    }

    public String toString(){
        return "Finnest Darkroast";
    }
}


abstract class condiment extends Coffe{
    Coffe coffe;
}

class Sweetnuts extends condiment{
    Sweetnuts(Coffe coffe){
        this.coffe=coffe;
    }

    @Override
    public int getcost() {
        return coffe.getcost()+30;
    }

    @Override
    public String toString() {
        return coffe.toString() + " SweetNuts";
    }

    @Override
    public String getdescription() {
        return coffe.toString() + " SweetNuts";
    }
}

class Chocolate extends condiment{

    Chocolate(Coffe coffe){
        this.coffe=coffe;
    }
    @Override
    public int getcost() {
        return coffe.getcost() + 50;
    }

    @Override
    public String getdescription() {
        return coffe.toString() + " Chocolate";
    }

    public String toString(){
        return coffe + " Chocolate";

    }
    
}



class Main{
    public static void main(String[] args) {
        Coffe coffe = new Nescafe();
        System.out.printf("%s and %d \n",coffe,coffe.getcost());

        coffe = new Sweetnuts(coffe);

        System.out.printf("%s and %d\n",coffe,coffe.getcost());

        coffe = new Sweetnuts(coffe);

        System.out.printf("%s and %d\n",coffe,coffe.getcost());

        coffe = new Chocolate(coffe);

        System.out.printf("%s and %d\n",coffe,coffe.getcost());

        Coffe coffee1= new Darkroast();
        System.out.printf("%s and %d\n",coffee1,coffee1.getcost());
        // decorator(SweetNuts/Chocolate) diye baseitem(coffe) ke wrap kortesi.

    }
}