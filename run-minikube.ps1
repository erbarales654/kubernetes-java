minikube docker-env --shell powershell | Invoke-Expression
docker build -t java-app:dev-local-minikube .
# Antes de desplegar ver readme para montar directorio de data
.\run-k8s.ps1