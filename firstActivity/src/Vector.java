public class Vector {
    private Rational[] tab;

    public Vector(int size){
        tab = new Rational[size];
        for(int i = 0; i < tab.length; i++){
            tab[i] = new Rational(0, 1);
        }
    }

    public Vector(Rational[] tab){
        this.tab = tab;
    }

    public Vector(Vector vector){
        tab = new Rational[vector.getSize()];
        for(int i = 0; i < tab.length; i++){
            tab[i] = new Rational(vector.getRational(i));
        }
    }

    public void add(Vector other){
        if(this.getSize() != other.getSize()){
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        for(int i = 0; i < tab.length; i++){
            tab[i].add(other.getRational(i));
        }
    }

    public void multiply(Rational other){
        for(int i = 0; i < tab.length; i++){
            tab[i].multiply(other);
        }
    }

    public void multiply(Vector other){
        if(this.getSize() != other.getSize()){
            throw new IllegalArgumentException("Vectors must have the same size");
        }
        for(int i = 0; i < tab.length; i++){
            tab[i].multiply(other.getRational(i));
        }
    }

    public void reduce(){
        for(int i = 0; i < tab.length; i++){
            tab[i].reduce();
        }
    }

    public int getSize(){
        return tab.length;
    }

    public Rational getRational(int index){
        return tab[index];
    }

    public void setRational(int index, Rational rational){
        tab[index] = rational;
    }

    @Override
    public String toString(){
        String str = "[";
        for(int i = 0; i < tab.length; i++){
            str += tab[i].toString();
            if(i != tab.length - 1){
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
