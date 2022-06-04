# jakarta-batch-processing
Jakarta Batch Processing

### Compilar

``` 
mvn clean install && docker build -t jakarta-batch .
``` 

### Ejecutar

```
docker run -p 8080:8080 -p 4848:4848 jakarta-batch 
```
