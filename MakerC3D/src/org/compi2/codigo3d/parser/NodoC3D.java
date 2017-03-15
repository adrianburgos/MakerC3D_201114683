package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    public String cad;
    public String lv,lf;

    public NodoC3D(String cad) {
        this.cad = cad;
    }

    public NodoC3D(String lv, String lf) {
        this.lv = lv;
        this.lf = lf;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }
    
}
