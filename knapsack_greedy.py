def fractional_knapsack(a,c,n):
    a.sort(key=lambda x:x[0]/x[1],reverse = True)
    print(a)
    mp = 0
    pl = []
    for i in range(len(a)):
        if c > 0 and a[i][1] <= c:
            mp += a[i][0]
            c = c - a[i][1]
            pl.append(a[i][0])
            continue
        if a[i][1] > c:
            mp += (a[i][0] * c )/a[i][1]
            pl.append((a[i][0] * c )/a[i][1])
            break
    print(pl)
    return mp
    
n = int(input('Enter number of elements : '))
a = []*n
c = int(input('Enter max capacity : '))
if c <= 0:
    exit()
print('Enter profit , capacity : by p,c')
for k in range(n):
    i = int(input(f'Enter profit {k+1} : '))
    j = int(input(f'Enter weight {k+1} : '))
    a.append([i,j])
# Pr = [10, 5, 15, 7, 6, 18, 3]
# Wt = [2, 3, 5, 7, 1, 4, 1]

# a = list(zip(Pr,Wt))
# c,n = 15,3
mp = fractional_knapsack(a,c,n)
print(mp)
