/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALBERTO
 */
public class Animales {
    enum Clase {Vertebrado,Invertebrado};
    enum Tipo {Ave,Mamifero,Reptil};
    enum Pat {Tiene_Patas,No_Tiene_Patas};
    enum Sex {Macho,Hembra};
    
    private String _Raza;
    private String _Nombre;
    private int _Edad;
    private Clase _Clase_Animal;
    private Tipo _Tipo_Animal;
    private Pat _Patas;

    public Animales() {
    }

    public Animales(String raza, String nombre, int edad, Clase clase, Tipo tipo, Pat patas) {
        this._Raza = raza;
        this._Nombre = nombre;
        this._Edad = edad;
        this._Clase_Animal = clase;
        this._Tipo_Animal = tipo;
        this._Patas = patas;
    }

    public Clase clase() {
        return _Clase_Animal;
    }

    public void Clase_Animal(Clase clase) {
        this._Clase_Animal = clase;
    }

    public int edad() {
        return _Edad;
    }

    public void Edad(int edad) {
        this._Edad = edad;
    }

    public String nombre() {
        return _Nombre;
    }

    public void Nombre(String nombre) {
        this._Nombre = nombre;
    }

    public String raza() {
        return _Raza;
    }

    public void Raza(String raza) {
        this._Raza = raza;
    }

    public Tipo Tipo() {
        return _Tipo_Animal;
    }

    public void Tipo_Animal(Tipo Tipo) {
        this._Tipo_Animal = Tipo;
    }
    public Pat Patas() {
        return _Patas;
    }

    public void Patas(Pat Patas) {
        this._Patas = Patas;
    }
      
    
}
