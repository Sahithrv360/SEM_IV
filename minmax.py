def minmax(a,l,h):
    if l == h :
        return a[l],a[h]
    elif l == h-1:
        return min(a[l],a[h]),max(a[l],a[h])
    else :
        m = (h+l)//2
        min1,max1 = minmax(a,l,m)
        min2,max2 = minmax(a,m+1,h)

        return min(min1,min2),max(max1,max2)
a = [5,0,4,2,7,1]
Min,Max = minmax(a,0,len(a)-1)
print(Min)
print(Max)  