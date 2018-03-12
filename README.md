# ObjectiveProgrammingLab3
Operatory, rekurencja, typ łańcuchowy

[1 Operatory](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab3/blob/master/README.md#1-operatory-%C5%82a%C5%84cuchowe)

[1 Typ łańcuchowy](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab3/blob/master/README.md#2-typ-%C5%82a%C5%84cuchowy)

[3 Rekursja](https://github.com/UniversityOfRzeszow/ObjectiveProgrammingLab3/blob/master/README.md#3-rekursja-rekurencja)


# 1 Operatory łańcuchowe

## Zadania 
### 1.1 Co zwróci poniższy program. Uzasadnij odpowiedź.

```java
public static void main(String[] arg){
	double a=12.12;

	System.out.println(a--);
	System.out.println(a++);
	System.out.println(--a);
	System.out.println(++a);
  }
} 
```

### 1.2 Napisz program demonstrujący działanie operatorów logicznych koniunkcji `&&` i alternatywy `||`. Użyj w tym celu konstrukcji warunkowej `if`.

### 1.3 Czym różnią się operatory:

*	`&&` od `&`
*	`|` od `|`

Napisz programy pokazujące różnice w ich działaniu.

### 1.4 Przestudiuj następujący artykuł: http://jlaskowski.blogspot.com/2012/01/o-operatorach-przesuniec-w-javieprawie.html. Następnie napisz programy demonstrujące działanie operatorów:

* w lewo ze znakiem `<<`
* w prawo ze znakiem `>>` 
* w prawo bez znaku `>>>` 

### 1.5 Dany jest fragment kodu:

```java
int a = 17;
double b = 4.0;
a += b; // ?
a -= b; // ?
a *= b; // ?
a /= b; // ?
a %= b; // ?
```

Jakie działania arytmetyczne reprezentują wyrażenia w kodzie i jakie wyniki zwrócą?

### 1.6 Dany jest fragment kodu:

```java
int a = 5;
int b = 3;
int c = a+b++;
int d =(a++)+b;
```
W jakiej kolejności będą wykonywana działania podczas wyliczania wartości zmiennych c i d? 
Jakie wartości zostaną wyliczone? 

### 1.7 Jakimi operatorami w Javie definiuje się operacje logiczne `NOT` i `XOR`? Utwórz odpowiednie programy demonstrujące działanie dla tych bramek logicznych.

## 1.8 Utwórz program wykorzystujący działanie operatora przeciwnego do operatora porównania `==`.

# 2 Typ łańcuchowy

## Zadania
### 2.1 Zapoznaj się z dokumkentacją klasy `String`: http://docs.oracle.com/javase/6/docs/api/java/lang/String.html. Przetestuj działanie poniższego programu:

```java

public class StringExample
{
   public static void main( String args[] )
   {
      String s1 = new String( "Happy " );
      String s2 = new String( "Birthday" );

      System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
      System.out.printf( 
         "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
      System.out.printf( "s1 after concatenation = %s\n", s1 );
   } // end main
} 
```

### 2.2 Opisz słownie działanie następujących metod klasy String oraz utwórz proste aplikacje w języku Java pokazujące zasadę działania tych metod – jako wzór patrz program powyżej. Wyniki działania wypisz na konsoli.

* `char[] toCharArray()`
* `byte[] getBytes()`
* `boolean equals(String str)`
* `boolean equalsIgnoreCase(String str)`
* `int campareTo(String str)`
* `int campareToIgnoreCase(String str)`
* `int indexOf(int i)`
* `int indexOf(String str)`
* `int lastIndexOf(int i)`
* `int lastIndexOf(String str)`
* `String substring(int startString)`
* `String substring(int startString, int stopString)`
* `String replace(char orginal, char zamiennik)`
* `String trim()`
* `String toLowerCase()`
* `String toUpperCase()`
* `String[] split(String regex, int limit)`
* `String[] split(String regex)`

# 3 Rekursja (rekurencja)


## Zadania

### 3.1 Przetestuj działanie poniższego programu:

```java
import java.util.*; 
public class Silnia { 

// metoda silnia zwraca silnię z liczby przekazanej jako parametr
// obliczenie silni odbywa się za pomocą rekurencji
public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
if(wartosc == 0) return 1;
else return wartosc * silnia(wartosc - 1);
}
 
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Podaj liczbę: " ); 
// pobieramy od użytkownika liczbę
int liczba = sc.nextInt(); 
// wyświetlamy na ekranie obliczoną silnię
System.out.println(liczba + "! = " + silnia(liczba));
 }
}
```

Po uruchomieniu aplikacji:

```java
Podaj liczbę: 5
5! = 120
```

Analiza działania:
Podając na wejściu liczbę 5 wywołamy metodę silnia z wartością pięć. Metoda zwróci nam wartość parametru pomnożoną ponowne wywołanie metody silnia z parametrem o 1 mniejszym itd. Przebieg działania metody będzie wyglądał tak jak poniżej: 

```
silnia(5)
    |
    5 * silnia(4)
            |
            4 * silnia(3)
                    |
                    3 * silnia(2)
                            |
                            2 * silnia(1)
                                    1 * silnia(0)
                                            |
                                            1
```

Razem dostaniemy: `5 * 4 * 3 * 2 * 1 * 1 = 120`

### 3.2 Utwórz program obliczający silnie bez użycia rekurencji. Do wykonania działania użyj dowolnej pętli.

### 3.3 Zaimplementuj algorytm potęgowania w dwóch wersjach (dwie osobne metody – funkcje): 

* rekurencyjna
* iteracyjna 

W celu wykonania zadania zapoznaj się z następującym materiałem: http://pl.wikipedia.org/wiki/Algorytm_szybkiego_pot%C4%99gowania.

### 3.4 Zaimplementuj algorytm obliczający wartość ciągu Fibonacciego.

W celu wykonania zadania zapoznaj się z następującym materiałem: http://pl.wikipedia.org/wiki/Ci%C4%85g_Fibonacciego.


### 3.5 (fakultatywne) Napisz algorytm realizujący zagadnienie wież Hanoi. 

W celu wykonania zadania zapoznaj się z następującym materiałem: http://pl.wikipedia.org/wiki/Wie%C5%BCe_Hanoi.

