// Erro 1
public class Erros {
    public static void main(String[] args) {

        System.out.println("Ola, mundo!.")
  }

}

/* 
Erros.java:6: error: ';' expected
        System.out.println("Ola, mundo!.")
                                          ^
1 error
*/

// ------------------------------------------------------------------------

// Erro 2
public class Erros {
    public static void main(String[] args) {

        System.out.printin("Ola, mundo!.");
  }

}

/* 
Erros.java:6: error: cannot find symbol
        System.out.printin("Ola, mundo!.");
                  ^
  symbol:   method printin(String)
  location: variable out of type PrintStream
1 error
*/


// ------------------------------------------------------------------------

// Erro 3
public class Erros {
    public static void main(String[] args) {

        System.out.println("Ola, mundo!.");
  

}

/* 
Erros.java:9: error: reached end of file while parsing
}
 ^
1 error
*/

