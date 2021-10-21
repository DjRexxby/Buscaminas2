package com.example.buscaminas;

public class Celda {
    public int x,y,ancho;
    public int contenido=0;
    public boolean destapado=false;

    public void fijarxy(int x, int y, int ancho) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
    }

    public boolean dentro(int x2, int y2){
        if(x2>=this.x && x2<=this.x+ancho && y2>=this.x && y2<=this.x+ancho){
            return true;
        }else{
            return false;
        }
    }
}
