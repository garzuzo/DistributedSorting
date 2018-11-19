Distributed Sorting
Software Architecture course

Author:
Sandra Niño A.
Johnatan Garzón M.



Tarea 4: (SCA refinamiento diseño - Sorting Distribuido)
Sorting Distribuido

En los mismos grupos de la tarea anterior de FraSCAti, deben evolucionar su diseño de monolítico a distribuido:

- En la versión anterior, tenían un "cliente" que leía el archivo e invocaba al sorter. Este "cliente" pueden modificarlo o eliminarlo.
- El componente sorter deben separarlo de modo que el componente del trabajo más pesado se pueda distribuir (e.g., sorter y merger).
- Obviamente, la estrategia que sigue el sorter NO puede seguir siendo burbuja, y quicksort tiene sus limitaciones para distribuirlo (¿por qué?). Piensen en otras opciones como shell-sort o merge-sort.
- quicksort puede usarse si el número de elementos a ordenar es menor a algún número, por ejemplo, 200,000. Si son más, hay que usar el sorter distribuido
- Piensen bien qué estrategia/estilo usar para los sorter: pipe-line, capas, blackboard. Igualmente, la estrategia de procesamiento y memoria.



Para medir la aceleración de la distribución, deben hacer varios experimentos:

La ejecución, además de hacerla en 1 máquina, deben hacerla distribuida en 2 y 6 máquinas. Estas se denominan configuraciones.
En una máquina, con un componente sorter. En dos máquinas, con 2 componentes sorter en cada una (4 en total). En seis máquinas, también con dos componentes sorter en cada una (12 en total). Es decir, en total cada grupo debe hacer 3 x 5 = 15 configuraciones y 15 ejecuciones.
En cada configuración, deben ejecutar el sorter para 5 arreglos de datos.
Los tamaños de los arreglos a ordenar dependen de los límites que la solución monolítica del grupo sea capaz de ordenar. Un criterio a tener en cuenta: dado el valor que corresponde al límite superior de la tarea monolítica, el valor del límite inferior será dos tamaños antes. Una vez definido el tamaño inicial, se deberá elegir 5 valores sumando incrementos que completen todo el rango (i.e., los 5 tamaños de arreglos). 
Por ejemplo, si en la ejecución monolítica se tiene como tamaño máximo de ordenamiento 5m (1m = 1 millón), los tamaños de los arreglos a ordenar podrían ser 1m, 3m, 5m, 7m, 9m de datos (1m = 1 millón).
Es decir, cada grupo debe escoger los valores para las ejecuciones, pero éstas deben ser EXIGENTES sobre su solución, para evaluar qué tan bueno es la mejora en el performance cuando se distribuye. Obviamente, un buen diseño ejecutado en forma escalable y bien distribuida debe tener un mucho mejor performance que su ejecución monolítica.


Con lo anterior, deben entregar un .zip con los siguientes folders:

./dep: Diagrama de deployment de la solución, con cuatro sorters distribuidos en dos nodos de procesamiento (dos componentes sorter en cada una).
./src: código fuente de los proyectos en la estructura definida por convención.
./README con instrucciones de compilación y ejecución, y los nombres de los integrantes.
./doc: Informe en word incluyendo: (a) excel con la tabla de valores de tiempos vs. tamaños, y respectiva gráfica XY comparativa de las 3 x 5 ejecuciones; (b) un análisis del resultado comparativo de esas ejecuciones. 

