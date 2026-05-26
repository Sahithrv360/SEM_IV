str1 = input('Enter string 1 : ')
str2 = input('Enter string 2 : ')
r,s = len(str1),len(str2)
if r<s:
    print("ERROR!! String 1 < String 2")
    exit()
V = [[0 for _ in range(r+1)]for _ in range(s+1)]
print(V)
for i in range(1,s+1):
    for j in range(1,r+1):
        # if i==0 or j==0 :
        #     V[i][j] = 0
        if str1[j-1] == str2[i-1]:
            V[i][j] = 1 + V[i-1][j-1]
        else:
            V[i][j] = max(V[i-1][j],V[i][j-1])
print(V[s][r])
str3 = ""
l=V[s][r]
i,j = s,r
while(l!=0):
    if V[i][j] == V[i][j-1]:
        j-=1
    elif V[i][j] == V[i-1][j]:
        i-=1
    else :
        str3 += str1[j-1]
        l-=1
        i-=1
        j-=1
print(str3)