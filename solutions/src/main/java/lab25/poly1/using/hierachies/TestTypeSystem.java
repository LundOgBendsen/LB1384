package lab25.poly1.using.hierachies;

public class TestTypeSystem
{

  public static void main(final String[] args)
  {
    // (a) At en Object-reference kan pege p� alle typer instanser
    Object[] objects = new Object[6];
    objects[0] = new Animal();
    objects[1] = new Reptile();
    objects[2] = new Mammal();
    objects[3] = new Snake();
    objects[4] = new Cat();
    objects[5] = new Dog();

    // (b) At en reference kan pege p� objekter af sin egen type
    Animal a01 = new Animal();
    Reptile a02 = new Reptile();
    Dog a03 = new Dog();

    // (c) At en reference kan pege p� instanser af sine subtyper
    Animal a04 = new Reptile();
    Animal a05 = new Dog();
    Mammal a06 = new Cat();

    // (d) At en reference ikke kan pege p� et objekt, som hverken
    // er af samme type som referencens type, eller en subtype af
    // referencens type (burde give kompileringsfejl)

    // Dog a07 = new Animal();
    // Snake a08 = new Dog();
    // Cat a08 = new Dog();
    // Mammal a09 = new Object();

    // (e) At metoder nedarves
    Mammal a10 = new Dog();
    a10.run(); // udskriver: Mammal is running

    // (f) At det er objektets type (og ikke referencens type) der
    // bestemmer hvilken metode der bliver k�rt (overriding, polymorfi og
    // dynamic binding)
    Mammal a11 = new Cat();
    a11.run(); // udskriver: Cat is running (og ikke Mammal is running)

    // (g) At man ikke kan kalde en metode via en reference, hvis
    // referencen ikke kender metoden (burde give kompileringsfejl �
    // udkomment�r linien)
    Animal a12 = new Dog();
    // a12.bark(); //Animal kender ikke bark()-metoden
    Object a13 = new Cat();
    // a13.run(); //Object kender ikke run()-metoden

    // (h) Lav et eksempel p� et eksplicit upcast (selvom det er
    // un�dvendigt)
    Animal a14 = new Dog();
    Object a15 = new Snake();
    Dog a16 = new Dog();
    Animal a17 = a16;
    Object a18 = a17;

    // (i) Lav et eksempel p� et implicit/automatisk upcast
    Animal a19 = new Dog(); // Dog-instansen upcastes til Animal
    Object a20 = new Snake(); // Snake-instansen upcastes til Object
    Dog a21 = new Dog();
    Animal a22 = a21; // Dog-instansen upcastes fra Dog til Animal
    Object a23 = a22; // Dog-instansen upcastes fra Animal til Object

    // (j) Lav et eksempel p� et ekslicit downcast
    Animal a24 = new Snake(); // Snake-objekt upcastes til typen Animal
    Reptile a25 = (Reptile) a24; // Snake-objekt downcastes fra Animal til Reptile
    Snake a26 = (Snake) a25; // Snake-objekt downcastes fra Reptile til Snake

    // (k) Lav et eksempel, der viser, at downcasts skal v�re eksplicitte
    Animal a27 = new Snake(); // Snake-objekt upcastes til typen Animal
    // Snake a28 = a27; //Downcast fra Animal til Snake skal v�re eksplicit

    // (l) Lav et eksempel, der viser et downcast, som g�r galt
    // (b�r give en k�retidsfejl i form af en ClassCastException)
    Mammal a28 = new Cat();
    try
    {
      Dog a29 = (Dog) a28; // Smider ClassCastException under k�rsel
    }
    catch (ClassCastException e)
    {
      System.out.println("Greb en forventet ClassCastException");
    }
  }
}
