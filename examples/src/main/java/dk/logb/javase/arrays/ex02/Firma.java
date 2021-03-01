package dk.logb.javase.arrays.ex02;

/*
 * Viser hvordan vi kan modellere et firma, som har mange kurser via
 * en ArrayList i Firma-klassen.
 */
import java.util.ArrayList;

public class Firma
{
  String navn;

  ArrayList<Kursus> kurser = new ArrayList<Kursus>();

  public Firma(final String navn)
  {
    this.navn = navn;
  }

  void addKursus(final Kursus kursus)
  {
    this.kurser.add(kursus);
  }

  Kursus getKursus(final int index)
  {
    Kursus kursus;
    kursus = this.kurser.get(index);
    return kursus;
  }

  int getAntalKurser()
  {
    int antal = this.kurser.size();
    return antal;
  }

  @Override
  public String toString()
  {
    String s = "Firma[" + navn + ", Kurser[" + kurser + "]";
    return s;
  }

  public static void main(final String[] args)
  {
    Firma firma = new Firma("KursusButikken ApS");
    firma.addKursus(new Kursus(1, "VBA"));
    firma.addKursus(new Kursus(2, "C#"));
    firma.addKursus(new Kursus(3, "Java"));
    System.out.println(firma);
  }

}

class Kursus
{
  int nummer;

  String navn;

  public Kursus(final int nummer, final String navn)
  {
    super();
    this.nummer = nummer;
    this.navn = navn;
  }

  @Override
  public String toString()
  {
    return "Kursus[" + nummer + ", " + navn + "]";
  }
}
