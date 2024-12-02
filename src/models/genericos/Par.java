package models.genericos;

public class Par<K,V> {
    private K clave;
    private V valor;

    public Par() {
        
    }

    public void establecerClave(K clave){
        this.clave=clave;
    }

    public K obtenerClave(){
        return clave;
    }

    public void establecerValor(V valor){
        this.valor=valor;
    }

    public V obtenerValor(){
        return valor;
    }

    public void establecerPar(K clave, V valor){
        this.clave=clave;
        this.valor=valor;
    }

    
}
