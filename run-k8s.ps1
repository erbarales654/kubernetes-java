minikube docker-env --shell powershell | Invoke-Expression
docker build -t java-app:dev-local-minikube .
kubectl apply -f kubernetes\secret.yml
kubectl apply -f kubernetes\configmap.yml
#Ver readme para montar directorio antes del deployment
kubectl apply -f kubernetes\deploy.yml
kubectl apply -f kubernetes\service.yml
kubectl port-forward service/my-java-service 8080:8080