Clases:

1. Calculadora:
    1. Representa la parte del cálculo basico del problema
    2. Ayuda a la segunda clase a calcular cosas que ella no puede
2. CarroCompra:
    1. Representa al carro el cual se llenara
    2. luego imprimirá el total a pagar

Atributos:

1. Clase Calculadora:
    1. n1: primer número que se va a utilizar en los calculos
    2. n2: segundo número que se va a utilizar en los calculos
2. Clase CarroCompra:
    1. productos: matriz doble que tiene enlistada la cantidad y precio de los objetos

Métodos:

1. Clase Calculadora:
    1. Constructor vació: Si no se pasan parámetros, n1 y n2 serán 0.
    2. Constructor 2 variables: Se guardan los datos de los parámetros que se entregan al crear el objeto
    3. Sumar: Retorna la suma de n1 y n2
    4. Multiplicar: Retorna la multiplicación de n1 y n2
    5. SetN1: le da valor al atributo n1
    6. SetN2: le da valor al atributo n2
2. Clase CarroCompra:
    1. Constructor vació: llena el atributo productos gracias a un for
    2. CalcularTotal: hace la suma recursiva de los productos según la cantidad de estos gracias a un for, se llama al método Subtotal para esto, retornando el total
    3. Subtotal: Crea un objeto de tipo Calculadora y lo utiliza para multiplicar 2 números, la cantidad y precio de un producto, luego retorna el resultado
    4. MostrarTotal: imprime en la consola el total de la suma de todos los productos y sus cantidades, pidiéndole el resultado al método: CalcularTotal
    