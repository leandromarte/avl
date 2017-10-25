package com.company;

public class Main {

    public static void main(String[] args) {
	    ArvoreAvl a = new ArvoreAvl();
		casoX(a);
	    a.printInOrder(a.raiz);
//	    a.printPosOrder(a.raiz);
    }

    private static void casoX(ArvoreAvl a) {
    	a.inserir(4);
    	a.inserir(1);
    	a.inserir(9);
    	a.inserir(6);
    	a.inserir(2);
    	a.inserir(8);
    	a.inserir(3);
    	a.inserir(7);
    	a.inserir(5);
	}

	private static void piorCaso(ArvoreAvl a) {
		a.inserir(0);
		a.inserir(1);
		a.inserir(2);
		a.inserir(3);
		a.inserir(4);
		a.inserir(5);
		a.inserir(6);
		a.inserir(7);
	}
}
