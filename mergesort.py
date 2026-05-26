def merge(a,l,m,h):
    n1,n2 = m-l+1,h-m
    L,R = a[l:m+1],a[m+1:h+1]
    i,j,k = 0,0,l
    while(i<n1 and j<n2):
        if L[i]>= R[j]:
            a[k] = L[i]
            k,i = k+1,i+1
        else:
            a[k] = R[j]
            k,j = k+1,j+1
    while i<n1:
        a[k] = L[i]
        k,i = k+1,i+1
    while j<n2:
        a[k] = R[j]
        k,j = k+1,j+1
def mergesort(a,l,h):
    if l<h:
        m = l+(h-l)//2
        mergesort(a,l,m)
        mergesort(a,m+1,h)
        merge(a,l,m,h)

a = [2,4,1,0,3,23]
mergesort(a,0,5)
print(a)
