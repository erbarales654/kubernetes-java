# kubernetes-java
Pruebas realizadas utilizando
* Gradle 7.2
* JDK 11.0.2
* Docker Desktop 4.1.1
  * Docker Engine 20.10.8
  * Kubernetes Server v1.21.5

## Compilar
Ejecutar el siguiente comando
> .\run.ps1

Al terminar de compilar se puede ver el resultado de las pruebas unitarias
> build/reports/tests/test/index.html

## Kubernetes
Ejecutar este script para compilar y levantar todo el stack en clúster local
> .\run-k8s.ps1

Probar en el navegador
http://localhost:8080/greeting?name=Eddy