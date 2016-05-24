/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALBERTO
 */
public class Principal {
    public static void main(String[] args) {
        Carnivoros p =new Carnivoros();
        p.Nombre("Leon");
        p.Comen_Carne("SI");
        p.Edad(8);
        p.Clase_Animal(Carnivoros.Clase.Vertebrado);
        p.Dientes_Afilados("SI");
     
        Carnivoros p1 =new Carnivoros();
        p1.Nombre("Tigre");
        p1.Comen_Carne("SI");
        p1.Edad(11);
        p1.Clase_Animal(Carnivoros.Clase.Vertebrado);
        p1.Dientes_Afilados("SI");
        
    imprimir (p);
    imprimir (p1);
    }
    
        public static void imprimir(Carnivoros p)
        {
        System.out.println("Nombre: " + p.nombre());    
        System.out.println("Comen Carne: " + p.Comen_Carne());
        System.out.println("Edad: " + p.edad());
        System.out.println("Dientes Afilados: " + p.Dientes_Afilados());
        System.out.println("Clase Animal: " + p.clase());
        }
    }

