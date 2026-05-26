def kanpsack_dp(a,n,md):
    a.sort(key=lambda x: x[1])
    print(a)
    V = [[0 for i in range(md+1)]for i in range(n+1)]
    print("Table : \n")
    for i in range(1,n+1):
        pr,wt = a[i-1]
        for w in range(1,md+1):
            # if i-1 == 0 or w-1 == 0:
            #     V[i][w] = 0
            if wt <= w:
                V[i][w] = max(pr+V[i-1][w-wt],V[i-1][w])
            else :
                V[i][w] = V[i-1][w]
        print(f"{V[i]}")
    w=md
    k=[0]*n
    for i in range(n,-1,-1):
        if V[i][w] != V[i-1][w]:
            k[i-1] = 1
            w-= a[i-1][1]
    print(k)
    return V[n][md]
    
pr = [100, 19, 24, 25, 15]
wt = [2, 3, 4, 1, 5]
a = []
n,md = 5,8
print('Enter in form of profit,deadline ...')
for i in range(n):
    a.append([pr[i],wt[i]])

print(kanpsack_dp(a,n,md))