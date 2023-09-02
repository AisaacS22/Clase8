package base;

import Especialidades.PizzaItaliana;
import pizza.interfaces.PizzaBase;
import base.Topping;
public class Main {
    public static void main(String[] args)
    {
        Pizza pizza = new Pizza("Pizza Margherita");
        pizza.addTopping(new Topping("Tomato", 5));
        pizza.addTopping(new Topping("Mozzarella", 4));
        pizza.addTopping(new Topping("Basil", 3));
        pizza.prepare();
        System.out.println(pizza.getPizzaPrice());

       /* PizzaItaliana pizza1 = new PizzaItaliana("Pizza",55, "Tomate");
        pizza1.addTopping(new Topping("Mozzarella"));
        pizza1.addTopping(new Topping("Cebolla"));
        pizza1.addTopping(new Topping ("Aceituna"));
        pizza1.prepare();
        System.out.println("Salsa: "+pizza1.getSalsa()); */


    }
}
//modificar la clase pizza
//agregar una prpiedad llamada tamaño
//el precio de la pizza variará dependiendo del tamaño
// small (default), medium =20, large = 35% = colocarlo en el contructor
//crear 4 especialidades diferentes de pizza
//cada pizza debe de tener por lo menos 1 ingrediente adicional y minimo 2 metodos a diferentes de
//preparado.(sobrescribir al metodo de preparacion)