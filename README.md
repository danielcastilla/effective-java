### Static Factory Method

En lugar de utilizar un constructor público lo que haremos será crear un método estático que nos devolverá una estancia de la clase.

Ventajas:

- A diferencia de los constructores, los métodos tienen nombre. Si el nombre de los parámetros no es los suficientemente descriptivo el nombre del método ayudará a que el código sea mas fácil de leer

- Otra diferencia respecto a los constructores es que no es necesario crear un nuevo objeto cada vez que es invocado 

- Otra importante deiferencia a los constructores es que pueden devolver un subtipo del tipo de retorno

- Un mismo método puede devolver distintos valores en función de los parámetros de entrada

# effective-java
