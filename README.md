ssh-keygen -t rsa -f ~/.ssh/aguinaldoa80 -C aguinaldoa80 -b 2048
kops create cluster simple.k8s.local --zones us-west4-b --node-count=3 --master-count 1 --state $KOPS_STATE_STORE --project=$PROJECT
kops update cluster --name simple.k8s.local --yes --admin
kops delete cluster --name simple.k8s.local --yes
kops get instancegroup --state $KOPS_STATE_STORE --name simple.k8s.local
kops get cluster --state $KOPS_STATE_STORE simple.k8s.local -oyaml
kubectl run hey  --image helo-world
kubectl get pod
kubectl delete pod hey