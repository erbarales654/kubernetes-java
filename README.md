# kubernetes-java
Pruebas realizadas utilizando
* Gradle 7.2
* JDK 11.0.2
* Rancher Desktop 0.6.0
  * kim v0.1.0-beta.6
  * Kubernetes Server v1.21.5
* Minikube v1.23.2
  * Docker Engine 20.10.8
  * Kubernetes Server v1.22.2
* Docker CLI 19.03.12

## Compilar
Ejecutar el siguiente comando
> .\run.ps1

Al terminar de compilar se puede ver el resultado de las pruebas unitarias
> build/reports/tests/test/index.html

## Kubernetes
Cada solución requiere ejecutar diferentes comandos, por lo que se necesitan permisos diferentes para cada uno.

### Docker Desktop
El comando docker requiere pertenencia a grupo
> Add-LocalGroupMember -Group "docker-users" -Member desktop-6e91gn5\eddyb

Ejecutar este script para compilar y levantar todo el stack en clúster local
> .\run-docker-desktop.ps1

### Minikube
El comando minikube requiere permisos de administración de Hyper V
> Add-LocalGroupMember -Group "Hyper-V Administrators" -Member desktop-6e91gn5\eddyb

Montar directorio para datos persistentes
> minikube mount ./test-data:/test-data

Ejecutar este script para compilar y levantar todo el stack en clúster local
> .\run-minikube.ps1

### APP funcionando
Probar en el navegador ingresando al siguiente enlace
http://localhost:8080/greeting?name=Eddy