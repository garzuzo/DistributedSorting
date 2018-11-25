============================================================================
Sorting Distribuido: MergeSort

Authors: Sandra Nino y Johnatan Garzón 
============================================================================

Compilacion y ejecucion con script de FraSCAti:
-------------------------------------------------------------
  1)  Si la ejecucion es monolitico: 
      1.1) Se debe compilar el mergeSort1 que esta en la carpeta Sorters/MergeSort1, luego
	   compilar el controller que esta en la ruta CentralNode/OneNode/Controller,
	   por ultimo se debe compilar el client que esta en la ruta CentralNode/OneNode/Client.
	   Para todo lo anterior se utiliza el siguiente comando:
	   frascati compile src <nombre-jar>

      1.2) Se debe ubicar en la carpeta Sorters/MergeSort1 y ejecutar el mergeSort1 con el siguiente comando:
	   frascati run mergeSort1 -libpath <nombre-jar del paso 1.1>
      
      1.3) Se debe ubicar en la carpeta CentralNode/OneNode/Controller y ejecutar el controller con 
	   el siguiente comando:
	   frascati run controllerOneNode -libpath <nombre-jar del paso 1.1>

      1.4) Se debe ubicar en la carpeta CentralNode/OneNode/Client y ejecutar el cliente con 
	   el siguiente comando:
	   frascati run client-onenode -libpath <nombre-jar del paso 1.1> -s r -m run

  2) Si la ejecucion es de 2 nodos + 1 nodo central
      2.1) Se debe compilar el mergeSort1 hasta mergeSort4 que esta en la carpeta 
           Sorters/MergeSort1 hasta Sorters/MergeSort4 respectivamente. Luego
	   compilar el controller que esta en la ruta CentralNode/TwoNodes/Controller, además
	   compilar el merge que esta en la ruta CentralNode/TwoNodes/Merge, por ultimo se debe
           compilar el client que esta en la ruta CentralNode/TwoNodes/Client.
	   Para todo lo anterior se utiliza el siguiente comando:
	   frascati compile src <nombre-jar>

      2.2) Se debe configurar la ip del computador donde se vaya a ejecutar cada mergeSort# en el composite del 
	   mergeSort1 hasta el composite del mergeSort4. Cada mergeSort# se ejecuta con el siguiente comando:
	   frascati run mergeSort# -libpath <nombre-jar del paso 2.1>
      
      2.3) Se debe ubicar en la carpeta CentralNode/TwoNodes/Merge y ejecutar el merge con 
	   el siguiente comando:
	   frascati run mergeC -libpath <nombre-jar del paso 2.1>

      2.4) Se debe ubicar en la carpeta CentralNode/TwoNodes/Controller y ejecutar el controller con 
	   el siguiente comando:
	   frascati run controllerTwoNodes -libpath <nombre-jar del paso 2.1>

      2.5) Se debe ubicar en la carpeta CentralNode/TwoNodes/Client y ejecutar el cliente con 
	   el siguiente comando:
	   frascati run client-twonodes -libpath <nombre-jar del paso 2.1> -s r -m run

   3) Si la ejecucion es de 6 nodos + 1 nodo central
      3.1) Se debe compilar el mergeSort1 hasta mergeSort12 que esta en la carpeta 
           Sorters/MergeSort1 hasta Sorters/MergeSort12 respectivamente. Luego
	   compilar el controller que esta en la ruta CentralNode/SixNodes/Controller, además
	   compilar el merge que esta en la ruta CentralNode/SixNodes/Merge, por ultimo se debe
           compilar el client que esta en la ruta CentralNode/SixNodes/Client.
	   Para todo lo anterior se utiliza el siguiente comando:
	   frascati compile src <nombre-jar>

      3.2) Se debe configurar la ip del computador donde se vaya a ejecutar cada mergeSort# en el composite del 
	   mergeSort1 hasta el composite del mergeSort12. Cada mergeSort# se ejecuta con el siguiente comando:
	   frascati run mergeSort# -libpath <nombre-jar del paso 3.1>
      
      3.3) Se debe ubicar en la carpeta CentralNode/SixNodes/Merge y ejecutar el merge con 
	   el siguiente comando:
	   frascati run mergeC -libpath <nombre-jar del paso 3.1>

      3.4) Se debe ubicar en la carpeta CentralNode/SixNodes/Controller y ejecutar el controller con 
	   el siguiente comando:
	   frascati run controllerSixNodes -libpath <nombre-jar del paso 3.1>

      3.5) Se debe ubicar en la carpeta CentralNode/SixNodes/Client y ejecutar el cliente con 
	   el siguiente comando:
	   frascati run client-sixnodes -libpath <nombre-jar del paso 3.1> -s r -m run





