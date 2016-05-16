/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BRAYAN
 */
public class Carnivoros extends Animales{
    private String _Comen_Carne;
    private String _Tienen_Garras;
    private String _Dientes_Afilados;
    private String _Tienen_Cola;

    public Carnivoros() {
    }

    public Carnivoros(String Carne, String Garras, String Dien_Afilados, String Cola) {
        this._Comen_Carne = Carne;
        this._Tienen_Garras = Garras;
        this._Dientes_Afilados = Dien_Afilados;
        this._Tienen_Cola = Cola;
    }

    public String Comen_Carne() {
        return _Comen_Carne;
    }

    public void Comen_Carne(String _Comen_Carne) {
        this._Comen_Carne = _Comen_Carne;
    }

    public String Dientes_Afilados() {
        return _Dientes_Afilados;
    }

    public void Dientes_Afilados(String _Dientes_Afilados) {
        this._Dientes_Afilados = _Dientes_Afilados;
    }

    public String Tienen_Cola() {
        return _Tienen_Cola;
    }

    public void Tienen_Cola(String _Tienen_Cola) {
        this._Tienen_Cola = _Tienen_Cola;
    }

    public String Tienen_Garras() {
        return _Tienen_Garras;
    }

    public void Tienen_Garras(String _Tienen_Garras) {
        this._Tienen_Garras = _Tienen_Garras;
    }
    
    
}
