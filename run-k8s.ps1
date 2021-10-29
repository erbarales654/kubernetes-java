kubectl apply -f kubernetes\secret.yml
kubectl apply -f kubernetes\configmap.yml
kubectl apply -f kubernetes\service.yml
kubectl apply -f kubernetes\deploy.yml
kubectl port-forward service/my-java-service 8080:8080