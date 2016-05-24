/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALBERTO
 */
public class Herbivoros extends Animales{
    private String _Comen_Hierva;
    private String _No_Tienen_Garras;
    private String _No_Dientes_Afilados;
    private String _Tienen_Ojos;

    public Herbivoros() {
    }

    public Herbivoros(String Hierva, String No_Garras, String No_Dien_Afilados, String Ojos) {
        this._Comen_Hierva = Hierva;
        this._No_Tienen_Garras = No_Garras;
        this._No_Dientes_Afilados = No_Dien_Afilados;
        this._Tienen_Ojos = Ojos;
    }

    public String Comen_Hierva() {
        return _Comen_Hierva;
    }

    public void Comen_Hierva(String _Comen_Hierva) {
        this._Comen_Hierva = _Comen_Hierva;
    }

    public String No_Dientes_Afilados() {
        return _No_Dientes_Afilados;
    }

    public void No_Dientes_Afilados(String _No_Dientes_Afilados) {
        this._No_Dientes_Afilados = _No_Dientes_Afilados;
    }

    public String No_Tienen_Garras() {
        return _No_Tienen_Garras;
    }

    public void No_Tienen_Garras(String _No_Tienen_Garras) {
        this._No_Tienen_Garras = _No_Tienen_Garras;
    }

    public String Tienen_Ojos() {
        return _Tienen_Ojos;
    }

    public void Tienen_Ojos(String _Tienen_Ojos) {
        this._Tienen_Ojos = _Tienen_Ojos;
    }
    
    
}
