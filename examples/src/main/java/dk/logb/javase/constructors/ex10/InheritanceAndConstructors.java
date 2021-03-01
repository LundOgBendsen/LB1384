package dk.logb.javase.constructors.ex10;

/**
 * Dette eksempel viser, at man FRIVILLIGT kan v�lge at kalde superklassens
 * constructor vha. keywordet super efterfulgt af en parentes med de parametre
 * den �nskede constructor i superklassen tager. Hvis man vil kalde super selv,
 * skal det g�res i den F�RSTE linie af den constructor hvorfra man kalder. Hvis
 * man IKKE selv kalder super, inds�tter kompileren et kald til en no-args /
 * default constructor i superklassen, hvilket ikke vil fungere i nedenst�ende
 * program, da superklassen ikke HAR en no-arg-constructor.
 */

public class InheritanceAndConstructors
{
  public static void main(final String[] args)
  {
    PersonMedFornavn pmf = new PersonMedFornavn("Rasmus");
    PersonMedFuldtNavn pmfn = new PersonMedFuldtNavn("Rasmus", "Lund");
  }
}

class PersonMedFornavn
{
  String fornavn;

  PersonMedFornavn(final String fornavn)
  {
    this.fornavn = fornavn;
  }
}

class PersonMedFuldtNavn extends PersonMedFornavn
{
  String efternavn; // har jo nedarvet fornavn

  PersonMedFuldtNavn(final String fornavn, final String efternavn)
  {
    // vi kalder eksplicit superklassens construtor, der tager en String
    // pr�v evt. at se den kompilerfejl vi f�r uden linien nedenfor.
    super(fornavn);
    this.efternavn = efternavn;
  }
}
