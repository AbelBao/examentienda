package com.example.examentienda.View;

import com.example.examentienda.Controller.TiendaController;

public class BasicController {
    protected TiendaController t;

    public TiendaController getVc() {
        return t;
    }

    public void setVc(TiendaController vc) {
        this.t = t;
    }
}
