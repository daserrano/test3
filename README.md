# TEST3

## Compilación proyecto

Es necesario ejecutar el siguiente comando.

```
mvn package
```

En el ``target``, se encontrará el jar generado ```test3-1.0-SNAPSHOT.jar```



## Posibles mejoras

- Se ha realizado una mejora con el uso de lambdas.

```
res = Stream.of(BrowserManagerEnum.values())
                .filter(brow -> brow.browserName.equals(lBrowserName))
                .findAny()
                .orElse(NONE);
```

- Introducir código en una clase auxiliar para realizar lógica común.
Como ```WebDriverUtil```.

- Actualizar dependencias (se ha actualizado a ``Java8`` para uso de lambdas) pero quedaría
pendiente actualizar a ``JUnit5`` o ``WebDriverManager``

- Crear un fichero properties que contenga valores que no haya que insertar en código, como los ejecutables de los drivers, por ejemplo.

- Dividir los tests por browser para tener un código mucho más manejable (como se ha hecho en el ejercicio).