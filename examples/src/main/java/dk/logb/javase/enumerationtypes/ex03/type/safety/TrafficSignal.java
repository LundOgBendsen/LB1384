package dk.logb.javase.enumerationtypes.ex03.type.safety;

/*
 * I realiteten er en enum en klasse.
 * 
 * Listen af v�rdier i en enum er instanser af "enum"-klassen. Hver v�rdi i en
 * enum er i realiteten et public static final felt.
 * 
 * Det sikres, at der ikke kan laves nye v�rdier end de opstillede i en enum:
 * (1) at tvinge en enum til kun at m�tte have private constructors (2) kun at
 * tillade "instantiering" vha. enums specielle syntaks (ikke new!)
 * 
 * Man kan fx lave metoder, der forventer at f� en enum-type som parameter, og
 * det vil *ikke* v�re muligt at sende andet end netop en af enum'ens v�rdier.
 * Sammenlignet med heltalskonstante er enums alts� langt sikrere.
 * 
 * Enums h�ndteres specielt mht. serialisering, s� det ikke er muligt at f�
 * oprettet dubletter af en enum-instans (dvs. vi kan bruge deres identitet,
 * eller sagt med andre ord, det er ufarligt at bruge == operatoren).
 * 
 * Enums er automatisk final (dvs. man ikke kan lave subtyper af en enum).
 */
public enum TrafficSignal
{
  RED,
  YELLOW,
  GREEN;
}
